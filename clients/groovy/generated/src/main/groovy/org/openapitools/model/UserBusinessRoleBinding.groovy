package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;
import org.openapitools.model.BusinessMemberAssetsSummary;

@Canonical
class UserBusinessRoleBinding {
    
    BusinessMemberAssetsSummary assetsSummary
    /* The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
    List<String> businessRoles = new ArrayList<>()
    /* Metadata for the business that created the business relationship. */
    BusinessAccessUserSummary createdByBusiness
    /* Metadata for the user that created the business relationship. */
    BusinessAccessUserSummary createdByUser
    /* The time the business relationship was created. Returned in milliseconds. */
    Integer createdTime
    /* Unique identifier of the business member/business partner/employer. */
    String id
    /* This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. */
    Boolean isSharedPartner
    /* Metadata for the business member/business partner/employer. */
    BusinessAccessUserSummary user
}
