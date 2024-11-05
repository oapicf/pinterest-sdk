package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetPartnerAssetsResponse;

@Canonical
class BusinessPartnerAssetAccessGet200Response {
    /* List assets on which you granted access to your partner or assets on which your partner has granted you access. */
    List<GetPartnerAssetsResponse> items = new ArrayList<>()
    
    String bookmark
}
