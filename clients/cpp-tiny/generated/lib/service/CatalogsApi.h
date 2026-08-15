#ifndef TINY_CPP_CLIENT_CatalogsApi_H_
#define TINY_CPP_CLIENT_CatalogsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Catalog.h"
#include "CatalogsAvailableFilterValues.h"
#include "CatalogsCreateRequest.h"
#include "CatalogsLocale.h"
#include "Catalogs_list_200_response.h"
#include "Country.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogsApi : public Service {
public:
    CatalogsApi() = default;

    virtual ~CatalogsApi() = default;

    /**
    * List available filter values.
    *
    * Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - <code>country</code>, <code>language</code>, and <code>feed_id</code> are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param catalogId Filter entities for a given catalog_id. *Required*
    * \param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
    * \param country Country for the Catalogs Items
    * \param language Language for the Catalogs Items
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsAvailableFilterValues
        >
    catalogs_availableFilterValues(
            
            std::string catalogId
            , 
            
            std::string feedId
            , 
            
            Country country
            , 
            
            CatalogsLocale language
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create catalog.
    *
    * Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param catalogsCreateRequest Request object used to created a feed. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Catalog
        >
    catalogs_create(
            
            CatalogsCreateRequest catalogsCreateRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * List catalogs.
    *
    * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Catalogs_list_200_response
        >
    catalogs_list(
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogsApi_H_ */