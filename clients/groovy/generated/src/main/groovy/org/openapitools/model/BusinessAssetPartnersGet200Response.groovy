package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserSingleAssetBinding;

@Canonical
class BusinessAssetPartnersGet200Response {
    /* List of partners with permissions to the asset. */
    List<UserSingleAssetBinding> items = new ArrayList<>()
    
    String bookmark
}
