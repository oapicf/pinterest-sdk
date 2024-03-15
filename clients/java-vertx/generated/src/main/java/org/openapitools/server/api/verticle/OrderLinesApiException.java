package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OrderLine;
import org.openapitools.server.api.model.OrderLinesList200Response;

public final class OrderLinesApiException extends MainApiException {
    public OrderLinesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OrderLinesApiException OrderLines_orderLinesGet_200_Exception = new OrderLinesApiException(200, "Success");
    public static final OrderLinesApiException OrderLines_orderLinesList_200_Exception = new OrderLinesApiException(200, "Success");
    

}