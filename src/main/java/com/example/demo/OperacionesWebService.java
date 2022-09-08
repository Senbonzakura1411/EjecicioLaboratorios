package com.example.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class OperacionesWebService {

    @WebMethod(operationName = "Suma")
    public String suma (@WebParam(name = "numero1") double num1, @WebParam(name = "numero2") double num2)
    {
        double total = num1 + num2;
        return "Resultado: " + total;
    }

    @WebMethod(operationName = "Resta")
    public String resta (@WebParam(name = "numero1") double num1, @WebParam(name = "numero2") double num2)
    {
        double total = num1 - num2;
        return "Resultado: " + total;
    }

    @WebMethod(operationName = "Multiplicacion")
    public String multiplicacion (@WebParam(name = "numero1") double num1, @WebParam(name = "numero2") double num2)
    {
        double total = num1 * num2;
        return "Resultado: " + total;
    }

    @WebMethod(operationName = "Division")
    public String division (@WebParam(name = "numero1") double num1, @WebParam(name = "numero2") double num2)
    {
        double total = num1 / num2;
        return "Resultado: " + total;
    }
}

