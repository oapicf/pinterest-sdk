package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NullableCatalogsItemFieldType;

@Canonical
class CatalogsItemValidationDetails {
    
    NullableCatalogsItemFieldType attributeName
    /* Provided value that caused the validation issue. */
    String providedValue
}
