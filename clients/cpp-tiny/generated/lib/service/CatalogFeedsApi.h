#ifndef TINY_CPP_CLIENT_CatalogFeedsApi_H_
#define TINY_CPP_CLIENT_CatalogFeedsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CatalogsFeed.h"
#include "CatalogsFeedIngestion.h"
#include "CatalogsItemValidationIssue.h"
#include "Error.h"
#include "Feed_processing_results_list_200_response.h"
#include "Feeds_create_request.h"
#include "Feeds_list_200_response.h"
#include "Feeds_update_request.h"
#include "Items_issues_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogFeedsApi : public Service {
public:
    CatalogFeedsApi() = default;

    virtual ~CatalogFeedsApi() = default;

    /**
    * List feed processing results.
    *
    * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param feedId Unique identifier of a feed *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Feed_processing_results_list_200_response
        >
    feedProcessingResults_list(
            
            std::string feedId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create feed.
    *
    * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param feedsCreateRequest Request object used to created a feed. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsFeed
        >
    feeds_create(
            
            Feeds_create_request feedsCreateRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete feed.
    *
    * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.
    * \param feedId Unique identifier of a feed *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
            String
        >
    feeds_delete(
            
            std::string feedId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get feed.
    *
    * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.
    * \param feedId Unique identifier of a feed *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsFeed
        >
    feeds_get(
            
            std::string feedId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Ingest feed items.
    *
    * Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param feedId Unique identifier of a feed *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsFeedIngestion
        >
    feeds_ingest(
            
            std::string feedId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List feeds.
    *
    * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Feeds_list_200_response
        >
    feeds_list(
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string catalogId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Update feed.
    *
    * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param feedId Unique identifier of a feed *Required*
    * \param feedsUpdateRequest Request object used to update a feed. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsFeed
        >
    feeds_update(
            
            std::string feedId
            , 
            
            Feeds_update_request feedsUpdateRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * List item issues.
    *
    * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
    * \param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Items_issues_list_200_response
        >
    itemsIssues_list(
            
            std::string processingResultId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            std::list<int> itemNumbers
            
            , 
            
            CatalogsItemValidationIssue itemValidationIssue
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogFeedsApi_H_ */