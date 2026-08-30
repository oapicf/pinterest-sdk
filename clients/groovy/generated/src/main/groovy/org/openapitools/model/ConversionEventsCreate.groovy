package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConversionEventsDataItems;

@Canonical
class ConversionEventsCreate {
    /* A list of events (one or more) encapsulated by a data object. */
    List<ConversionEventsDataItems> data = new ArrayList<>()
}
