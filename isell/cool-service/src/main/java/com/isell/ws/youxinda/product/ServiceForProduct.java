package com.isell.ws.youxinda.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.isell.ws.youxinda.product.ErrorType;
import com.isell.ws.youxinda.product.HeaderRequest;
import com.isell.ws.youxinda.product.InventoryRow;
import com.isell.ws.youxinda.product.ProductData;
import com.isell.ws.youxinda.product.ProductInfo;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ServiceForProduct", targetNamespace = "http://www.example.org/ServiceForProduct/")
public interface ServiceForProduct {

	/**
	 * 
	 * @param message
	 * @param error
	 * @param headerRequest
	 * @param productInfo
	 * @param ask
	 */
	@WebMethod(action = "http://www.example.org/ServiceForProduct/createProduct")
	@RequestWrapper(localName = "createProduct", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.CreateProduct")
	@ResponseWrapper(localName = "createProductResponse", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.CreateProductResponse")
	public void createProduct(
			@WebParam(name = "HeaderRequest", targetNamespace = "") HeaderRequest headerRequest,
			@WebParam(name = "ProductInfo", targetNamespace = "") ProductInfo productInfo,
			@WebParam(name = "ask", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> ask,
			@WebParam(name = "message", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> message,
			@WebParam(name = "error", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<ErrorType>> error);

	/**
	 * 
	 * @param message
	 * @param error
	 * @param headerRequest
	 * @param productInfo
	 * @param ask
	 */
	@WebMethod(action = "http://www.example.org/ServiceForProduct/createProductAndConfirm")
	@RequestWrapper(localName = "createProductAndConfirm", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.CreateProductAndConfirm")
	@ResponseWrapper(localName = "createProductAndConfirmResponse", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.CreateProductAndConfirmResponse")
	public void createProductAndConfirm(
			@WebParam(name = "HeaderRequest", targetNamespace = "") HeaderRequest headerRequest,
			@WebParam(name = "ProductInfo", targetNamespace = "") ProductInfo productInfo,
			@WebParam(name = "ask", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> ask,
			@WebParam(name = "message", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> message,
			@WebParam(name = "error", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<ErrorType>> error);

	/**
	 * 
	 * @param message
	 * @param skuNo
	 * @param data
	 * @param headerRequest
	 * @param ask
	 */
	@WebMethod(action = "http://www.example.org/ServiceForProduct/getStock")
	@RequestWrapper(localName = "getStock", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.GetStock")
	@ResponseWrapper(localName = "getStockResponse", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.GetStockResponse")
	public void getStock(
			@WebParam(name = "HeaderRequest", targetNamespace = "") HeaderRequest headerRequest,
			@WebParam(name = "skuNo", targetNamespace = "") String skuNo,
			@WebParam(name = "ask", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> ask,
			@WebParam(name = "message", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> message,
			@WebParam(name = "data", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<InventoryRow>> data);

	/**
	 * 
	 * @param message
	 * @param skuNoArr
	 * @param error
	 * @param data
	 * @param headerRequest
	 * @param ask
	 */
	@WebMethod(action = "http://www.example.org/ServiceForProduct/getBatchStock")
	@RequestWrapper(localName = "getBatchStock", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.GetBatchStock")
	@ResponseWrapper(localName = "getBatchStockResponse", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.GetBatchStockResponse")
	public void getBatchStock(
			@WebParam(name = "HeaderRequest", targetNamespace = "") HeaderRequest headerRequest,
			@WebParam(name = "skuNoArr", targetNamespace = "") List<String> skuNoArr,
			@WebParam(name = "ask", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> ask,
			@WebParam(name = "message", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> message,
			@WebParam(name = "error", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<String>> error,
			@WebParam(name = "data", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<InventoryRow>> data);

	/**
	 * 
	 * @param error
	 * @param productSku
	 * @param data
	 * @param headerRequest
	 * @param ask
	 */
	@WebMethod(action = "http://www.example.org/ServiceForProduct/getProduct")
	@RequestWrapper(localName = "getProduct", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.GetProduct")
	@ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://www.example.org/ServiceForProduct/", className = "com.isell.ws.youxinda.product.GetProductResponse")
	public void getProduct(
			@WebParam(name = "HeaderRequest", targetNamespace = "") HeaderRequest headerRequest,
			@WebParam(name = "productSku", targetNamespace = "") String productSku,
			@WebParam(name = "ask", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<String> ask,
			@WebParam(name = "data", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<ProductData>> data,
			@WebParam(name = "error", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<List<ErrorType>> error);

}
