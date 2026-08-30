#ifndef TINY_CPP_CLIENT_CatalogProductGroupsApi_H_
#define TINY_CPP_CLIENT_CatalogProductGroupsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CatalogsListProductsByFilterRequest.h"
#include "CatalogsProductGroupProductCountsVertical.h"
#include "CatalogsProductGroupsCreateManyRequestItems.h"
#include "CatalogsProductGroupsCreateRequestSchema.h"
#include "CatalogsProductGroupsUpdateRequestSchema.h"
#include "CatalogsVerticalProductGroup.h"
#include "Catalogs_product_group_pins_list_200_response.h"
#include "Catalogs_product_groups_list_200_response.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogProductGroupsApi : public Service {
public:
    CatalogProductGroupsApi() = default;

    virtual ~CatalogProductGroupsApi();

    /**
    * List products by product group.
    *
    * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param productGroupId Unique identifier of a product group *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Catalogs_product_group_pins_list_200_response
        >
    catalogsProductGroupPins_list(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Create product group.
    *
    * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param catalogsProductGroupsCreateRequestSchema  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsVerticalProductGroup
        >
    catalogsProductGroups_create(
            
            CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create product groups.
    *
    * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param catalogsProductGroupsCreateManyRequestItems  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                    std::list<std::string>
        >
    catalogsProductGroups_createMany(
            std::list<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete product group.
    *
    * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param productGroupId Unique identifier of a product group *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsVerticalProductGroup
        >
    catalogsProductGroups_delete(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete product groups.
    *
    * Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
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
    * Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
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
    * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param id Comma-separated list of product group ids
    * \param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
    * \param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get product counts.
    *
    * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
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
    * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param productGroupId Unique identifier of a product group *Required*
    * \param catalogsProductGroupsUpdateRequestSchema  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsVerticalProductGroup
        >
    catalogsProductGroups_update(
            
            std::string productGroupId
            , 
            
            CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema
            , 
            
            std::string adAccountId
            
    );
    /**
    * List products by filter.
    *
    * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogsListProductsByFilterRequest  *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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