#ifndef TINY_CPP_CLIENT_CatalogProductGroupsApi_H_
#define TINY_CPP_CLIENT_CatalogProductGroupsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CatalogsListProductsByFilterRequest.h"
#include "CatalogsProductGroupProductCountsVertical.h"
#include "CatalogsVerticalProductGroup.h"
#include "Catalogs_product_group_pins_list_200_response.h"
#include "Catalogs_product_groups_list_200_response.h"
#include "Catalogs_product_groups_update_request.h"
#include "Error.h"
#include "Multiple_product_groups_inner.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogProductGroupsApi : public Service {
public:
    CatalogProductGroupsApi() = default;

    virtual ~CatalogProductGroupsApi() = default;

    /**
    * List products by product group.
    *
    * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param productGroupId Unique identifier of a product group *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param adAccountId Unique identifier of an ad account.
    * \param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    */
    Response<
                Catalogs_product_group_pins_list_200_response
        >
    catalogsProductGroupPins_list(
            
            std::string productGroupId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
    );
    /**
    * Create product group.
    *
    * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param multipleProductGroupsInner Request object used to create a single catalogs product groups. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsVerticalProductGroup
        >
    catalogsProductGroups_create(
            
            Multiple_product_groups_inner multipleProductGroupsInner
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create product groups.
    *
    * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param multipleProductGroupsInner Request object used to create one or more catalogs product groups. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                    std::list<std::string>
        >
    catalogsProductGroups_createMany(
            std::list<Multiple_product_groups_inner> multipleProductGroupsInner
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete product group.
    *
    * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param productGroupId Unique identifier of a product group *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
            String
        >
    catalogsProductGroups_delete(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete product groups.
    *
    * Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param id Comma-separated list of product group ids *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
            String
        >
    catalogsProductGroups_deleteMany(
            std::list<int> id
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get product group.
    *
    * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param productGroupId Unique identifier of a product group *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsVerticalProductGroup
        >
    catalogsProductGroups_get(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List product groups.
    *
    * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param id Comma-separated list of product group ids
    * \param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
    * \param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Catalogs_product_groups_list_200_response
        >
    catalogsProductGroups_list(
            std::list<int> id
            
            , 
            
            std::string feedId
            , 
            
            std::string catalogId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get product counts.
    *
    * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param productGroupId Unique identifier of a product group *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsProductGroupProductCountsVertical
        >
    catalogsProductGroups_productCountsGet(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Update single product group.
    *
    * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param productGroupId Unique identifier of a product group *Required*
    * \param catalogsProductGroupsUpdateRequest Request object used to Update a catalogs product group. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsVerticalProductGroup
        >
    catalogsProductGroups_update(
            
            std::string productGroupId
            , 
            
            Catalogs_product_groups_update_request catalogsProductGroupsUpdateRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * List products by filter.
    *
    * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param adAccountId Unique identifier of an ad account.
    * \param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    */
    Response<
                Catalogs_product_group_pins_list_200_response
        >
    productsByProductGroupFilter_list(
            
            CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogProductGroupsApi_H_ */