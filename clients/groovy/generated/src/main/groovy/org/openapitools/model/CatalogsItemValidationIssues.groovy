package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemValidationErrors;
import org.openapitools.model.CatalogsItemValidationWarnings;

@Canonical
class CatalogsItemValidationIssues {
    /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */
    Integer itemNumber
    /* The merchant-created unique ID that represents the product. */
    String itemId
    
    CatalogsItemValidationErrors errors
    
    CatalogsItemValidationWarnings warnings
}
