
package com.myservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyCalculatorService", targetNamespace = "http://myservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyCalculatorService {


    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplication", targetNamespace = "http://myservice.com/", className = "com.myservice.Multiplication")
    @ResponseWrapper(localName = "multiplicationResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.MultiplicationResponse")
    @Action(input = "http://myservice.com/MyCalculatorService/multiplicationRequest", output = "http://myservice.com/MyCalculatorService/multiplicationResponse")
    public double multiplication(
        @WebParam(name = "num1", targetNamespace = "")
        double num1,
        @WebParam(name = "num2", targetNamespace = "")
        double num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtraction", targetNamespace = "http://myservice.com/", className = "com.myservice.Subtraction")
    @ResponseWrapper(localName = "subtractionResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.SubtractionResponse")
    @Action(input = "http://myservice.com/MyCalculatorService/subtractionRequest", output = "http://myservice.com/MyCalculatorService/subtractionResponse")
    public double subtraction(
        @WebParam(name = "num1", targetNamespace = "")
        double num1,
        @WebParam(name = "num2", targetNamespace = "")
        double num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://myservice.com/", className = "com.myservice.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.DivisionResponse")
    @Action(input = "http://myservice.com/MyCalculatorService/divisionRequest", output = "http://myservice.com/MyCalculatorService/divisionResponse")
    public double division(
        @WebParam(name = "num1", targetNamespace = "")
        double num1,
        @WebParam(name = "num2", targetNamespace = "")
        double num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addition", targetNamespace = "http://myservice.com/", className = "com.myservice.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.AdditionResponse")
    @Action(input = "http://myservice.com/MyCalculatorService/additionRequest", output = "http://myservice.com/MyCalculatorService/additionResponse")
    public double addition(
        @WebParam(name = "num1", targetNamespace = "")
        double num1,
        @WebParam(name = "num2", targetNamespace = "")
        double num2);

}