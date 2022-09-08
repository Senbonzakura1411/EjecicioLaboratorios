package com.example.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class ConversorWebService {

    @WebMethod(operationName = "FToC")
    public String fahrenheitToCentigrade (@WebParam(name = "gradosFahrenheit") double grados)
    {
        double resultado = (grados - 32) * 5/9;

        return "Total en Centigrados " + resultado;
    }

    @WebMethod(operationName = "CToF")
    public String centigradeToFahrenheit (@WebParam(name = "gradosCelsius") double grados)
    {
        double resultado = (grados * 9/5) + 32;

        return "Total en Fahrenheit " + resultado;
    }


}
