/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websockets.whiteboard;

import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 *
 * @author Анюта
 */
public class FigureDecoder implements Decoder.Text<Figure> {

    @Override
    public Figure decode(String arg0) throws DecodeException {
        JsonObject json = Json.createReader(new StringReader(arg0)).readObject();
        return new Figure(json);
    }

    @Override
    public boolean willDecode(String arg0) {
        try{
            Json.createReader(new StringReader((arg0))).readObject();
            return true;
        }
        catch (JsonException je){
            je.printStackTrace();
            return false;
        }
    }

    @Override
    public void init(EndpointConfig config) {
        System.out.println("init");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    
    
}
