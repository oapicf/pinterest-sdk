package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BrandAccountsCreate200Response
import org.openapitools.model.BrandAccountsCreateRequest
import org.openapitools.model.BrandAccountsUpdateRequest
import org.openapitools.model.DeletePartnersRequest
import org.openapitools.model.DeletePartnersResponse
import org.openapitools.model.DeletedMembersResponse
import org.openapitools.model.Error
import org.openapitools.model.GetBusinessEmployers200Response
import org.openapitools.model.GetBusinessMembers200Response
import org.openapitools.model.GetBusinessPartners200Response
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.MembersToDeleteBody
import org.openapitools.model.PartnerType
import org.openapitools.model.SystemUserUpdateRequest
import org.openapitools.model.UpdateMemberBusinessRoleBody
import org.openapitools.model.UpdateMemberResultsResponseArray

class BusinessAccessRelationshipsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def brandAccountsCreate ( String businessHierarchyId, BrandAccountsCreateRequest brandAccountsCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/business_access/business_hierarchy/${business_hierarchy_id}/brand_accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessHierarchyId == null) {
            throw new RuntimeException("missing required params businessHierarchyId")
        }
        // verify required params are set
        if (brandAccountsCreateRequest == null) {
            throw new RuntimeException("missing required params brandAccountsCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = brandAccountsCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    BrandAccountsCreate200Response.class )

    }

    def brandAccountsUpdate ( String businessHierarchyId, String brandAccountId, BrandAccountsUpdateRequest brandAccountsUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/business_access/business_hierarchy/${business_hierarchy_id}/brand_accounts/${brand_account_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessHierarchyId == null) {
            throw new RuntimeException("missing required params businessHierarchyId")
        }
        // verify required params are set
        if (brandAccountId == null) {
            throw new RuntimeException("missing required params brandAccountId")
        }
        // verify required params are set
        if (brandAccountsUpdateRequest == null) {
            throw new RuntimeException("missing required params brandAccountsUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = brandAccountsUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    BrandAccountsCreate200Response.class )

    }

    def deleteBusinessMembership ( String businessId, MembersToDeleteBody membersToDeleteBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (membersToDeleteBody == null) {
            throw new RuntimeException("missing required params membersToDeleteBody")
        }



        contentType = 'application/json';
        bodyParams = membersToDeleteBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeletedMembersResponse.class )

    }

    def deleteBusinessPartners ( String businessId, DeletePartnersRequest deletePartnersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deletePartnersRequest == null) {
            throw new RuntimeException("missing required params deletePartnersRequest")
        }



        contentType = 'application/json';
        bodyParams = deletePartnersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeletePartnersResponse.class )

    }

    def getBusinessEmployers ( Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/employers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetBusinessEmployers200Response.class )

    }

    def getBusinessMembers ( String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (fetchSystemUsers != null) {
            queryParams.put("fetch_system_users", fetchSystemUsers)
        }
        if (assetsSummary != null) {
            queryParams.put("assets_summary", assetsSummary)
        }
        if (businessRoles != null) {
            queryParams.put("business_roles", businessRoles)
        }
        if (memberIds != null) {
            queryParams.put("member_ids", memberIds)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetBusinessMembers200Response.class )

    }

    def getBusinessPartners ( String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (assetsSummary != null) {
            queryParams.put("assets_summary", assetsSummary)
        }
        if (partnerType != null) {
            queryParams.put("partner_type", partnerType)
        }
        if (partnerIds != null) {
            queryParams.put("partner_ids", partnerIds)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetBusinessPartners200Response.class )

    }

    def systemUserUpdate ( String businessId, String systemUserId, SystemUserUpdateRequest systemUserUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/system_users/${system_user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (systemUserId == null) {
            throw new RuntimeException("missing required params systemUserId")
        }
        // verify required params are set
        if (systemUserUpdateRequest == null) {
            throw new RuntimeException("missing required params systemUserUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = systemUserUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    null )

    }

    def updateBusinessMemberships ( String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (updateMemberBusinessRoleBody == null) {
            throw new RuntimeException("missing required params updateMemberBusinessRoleBody")
        }



        contentType = 'application/json';
        bodyParams = updateMemberBusinessRoleBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    UpdateMemberResultsResponseArray.class )

    }

}
