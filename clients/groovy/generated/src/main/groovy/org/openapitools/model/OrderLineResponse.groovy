package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineError;

@Canonical
class OrderLineResponse {
    /* Error list if update(s) fail. */
    List<OrderLineError> errors
    /* Order Line object array. */
    List<OrderLine> orderLine
}
