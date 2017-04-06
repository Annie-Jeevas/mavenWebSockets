/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websockets.whiteboard;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 *
 * @author Анюта
 */
public class FigureEncoder implements Encoder.Text<Figure> {

    @Override
    public String encode(Figure arg0) throws EncodeException {
        return arg0.getJson().toString();
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
