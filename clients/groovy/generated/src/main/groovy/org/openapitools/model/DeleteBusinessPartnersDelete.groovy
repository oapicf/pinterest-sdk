package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullablePartnerType;

@Canonical
class DeleteBusinessPartnersDelete {
    /* A list of partner ids to be deleted */
    List<String> partnerIds = new ArrayList<>()
    
    NullablePartnerType partnerType
}
