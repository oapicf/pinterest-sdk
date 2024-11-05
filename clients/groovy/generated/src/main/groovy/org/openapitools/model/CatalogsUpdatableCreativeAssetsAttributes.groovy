package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CatalogsUpdatableCreativeAssetsAttributes {
    /* The name of the creative assets. */
    String title
    /* Brief description of the creative assets. */
    String description
    /* Link to the creative assets page. */
    String link
    /* IOS deep link to the creative assets page. */
    String iosDeepLink
    /* Link to the creative assets page. */
    String androidDeepLink
    /* The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. */
    String googleProductCategory
    /* Custom grouping of creative assets. */
    String customLabel0
    /* Custom grouping of creative assets. */
    String customLabel1
    /* Custom grouping of creative assets. */
    String customLabel2
    /* Custom grouping of creative assets. */
    String customLabel3
    /* Custom grouping of creative assets. */
    String customLabel4
    /* Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. */
    String visibility
}
