package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumericFilterOperatorType;

@Canonical
class CatalogsProductGroupUint32Criteria {
    
    Boolean negated
    
    NumericFilterOperatorType operator
    
    Integer value
}
