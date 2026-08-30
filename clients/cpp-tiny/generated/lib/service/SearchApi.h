#ifndef TINY_CPP_CLIENT_SearchApi_H_
#define TINY_CPP_CLIENT_SearchApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Boards_list_200_response.h"
#include "Pins_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Search_partner_pins_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class SearchApi : public Service {
public:
    SearchApi() = default;

    virtual ~SearchApi();

    /**
    * Search pins by a given search term.
    *
    * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
    * \param term Search term to look up pins. *Required*
    * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param locale Search locale.
    * \param limit Max search result size
    */
    Response<
                Search_partner_pins_200_response
        >
    searchPartnerPins(
            
            std::string term
            , 
            
            std::string countryCode
            , 
            
            std::string bookmark
            , 
            
            std::string locale
            , 
            
            int limit
            
    );
    /**
    * Search user's boards.
    *
    * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
    * \param adAccountId Unique identifier of an ad account.
    * \param query Search query. Can contain pin description keywords or comma-separated pin IDs.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Boards_list_200_response
        >
    searchUserBoards_get(
            
            std::string adAccountId
            , 
            
            std::string query
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Search user's Pins.
    *
    * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
    * \param query Search query. Can contain pin description keywords or comma-separated pin IDs. *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Pins_list_200_response
        >
    searchUserPins_list(
            
            std::string query
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_SearchApi_H_ */