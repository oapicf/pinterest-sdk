package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BrandAccount
import org.openapitools.model.BrandAccountCreate
import org.openapitools.model.BrandAccountUpdate
import org.openapitools.model.BusinessMembershipMember
import org.openapitools.model.DeleteBusinessMembership200Response
import org.openapitools.model.DeleteBusinessMembershipBody
import org.openapitools.model.DeleteBusinessPartners
import org.openapitools.model.DeleteBusinessPartnersDelete
import org.openapitools.model.GetBusinessEmployers200Response
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.PartnerType
import org.openapitools.model.PinterestLibError
import org.openapitools.model.SystemUserUpdateWithRequiredBody
import org.openapitools.model.UpdateBusinessMembershipsResponse

class BusinessAccessRelationshipsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def brandAccountsCreate ( String businessHierarchyId, BrandAccountCreate brandAccountCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/business_access/business_hierarchy/${business_hierarchy_id}/brand_accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessHierarchyId == null) {
            throw new RuntimeException("missing required params businessHierarchyId")
        }
        // verify required params are set
        if (brandAccountCreate == null) {
            throw new RuntimeException("missing required params brandAccountCreate")
        }



        contentType = 'application/json';
        bodyParams = brandAccountCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    BrandAccount.class )

    }

    def brandAccountsUpdate ( String brandAccountId, String businessHierarchyId, BrandAccountUpdate brandAccountUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/business_access/business_hierarchy/${business_hierarchy_id}/brand_accounts/${brand_account_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (brandAccountId == null) {
            throw new RuntimeException("missing required params brandAccountId")
        }
        // verify required params are set
        if (businessHierarchyId == null) {
            throw new RuntimeException("missing required params businessHierarchyId")
        }
        // verify required params are set
        if (brandAccountUpdate == null) {
            throw new RuntimeException("missing required params brandAccountUpdate")
        }



        contentType = 'application/json';
        bodyParams = brandAccountUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    BrandAccount.class )

    }

    def deleteBusinessMembership ( String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deleteBusinessMembershipBody == null) {
            throw new RuntimeException("missing required params deleteBusinessMembershipBody")
        }



        contentType = 'application/json';
        bodyParams = deleteBusinessMembershipBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    DeleteBusinessMembership200Response.class )

    }

    def deleteBusinessPartners ( String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deleteBusinessPartnersDelete == null) {
            throw new RuntimeException("missing required params deleteBusinessPartnersDelete")
        }



        contentType = 'application/json';
        bodyParams = deleteBusinessPartnersDelete


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    DeleteBusinessPartners.class )

    }

    def getBusinessEmployers ( Boolean assetsSummary, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/employers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (assetsSummary != null) {
            queryParams.put("assets_summary", assetsSummary)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GetBusinessEmployers200Response.class )

    }

    def getBusinessMembers ( String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GetBusinessEmployers200Response.class )

    }

    def getBusinessPartners ( String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Boolean sortAscending, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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
        if (sortAscending != null) {
            queryParams.put("sort_ascending", sortAscending)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GetBusinessEmployers200Response.class )

    }

    def systemUserUpdate ( String businessId, String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/system_users/${system_user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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
        if (systemUserUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params systemUserUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = systemUserUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    null )

    }

    def updateBusinessMemberships ( String businessId, List<BusinessMembershipMember> businessMembershipMember, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (businessMembershipMember == null) {
            throw new RuntimeException("missing required params businessMembershipMember")
        }



        contentType = 'application/json';
        bodyParams = businessMembershipMember


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    UpdateBusinessMembershipsResponse.class )

    }

}
