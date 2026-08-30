package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LeadForm;
import org.openapitools.model.PinterestLibBatchItemException;

@Canonical
class LeadFormsCreate200ResponseItemsInner {
    
    LeadForm data
    
    List<PinterestLibBatchItemException> exceptions = new ArrayList<>()
}
