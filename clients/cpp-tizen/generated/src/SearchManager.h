#ifndef _SearchManager_H_
#define _SearchManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "Pins_list_200_response.h"
#include "Search_partner_pins_200_response.h"
#include "Search_user_boards_get_200_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Search Search
 * \ingroup Operations
 *  @{
 */
class SearchManager {
public:
	SearchManager();
	virtual ~SearchManager();

/*! \brief Search pins by a given search term. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
 * \param term Search term to look up pins. *Required*
 * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param locale Search locale.
 * \param limit Max search result size
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool searchPartnerPinsSync(char * accessToken,
	std::string term, std::string countryCode, std::string bookmark, std::string locale, int limit, 
	void(* handler)(Search_partner_pins_200_response, Error, void* )
	, void* userData);

/*! \brief Search pins by a given search term. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
 * \param term Search term to look up pins. *Required*
 * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param locale Search locale.
 * \param limit Max search result size
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool searchPartnerPinsAsync(char * accessToken,
	std::string term, std::string countryCode, std::string bookmark, std::string locale, int limit, 
	void(* handler)(Search_partner_pins_200_response, Error, void* )
	, void* userData);


/*! \brief Search user's boards. *Synchronous*
 *
 * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param query Search query. Can contain pin description keywords or comma-separated pin IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool searchUserBoardsGetSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string query, 
	void(* handler)(Search_user_boards_get_200_response, Error, void* )
	, void* userData);

/*! \brief Search user's boards. *Asynchronous*
 *
 * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param query Search query. Can contain pin description keywords or comma-separated pin IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool searchUserBoardsGetAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string query, 
	void(* handler)(Search_user_boards_get_200_response, Error, void* )
	, void* userData);


/*! \brief Search user's Pins. *Synchronous*
 *
 * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
 * \param query Search query. Can contain pin description keywords or comma-separated pin IDs. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool searchUserPinsListSync(char * accessToken,
	std::string query, std::string adAccountId, std::string bookmark, 
	void(* handler)(Pins_list_200_response, Error, void* )
	, void* userData);

/*! \brief Search user's Pins. *Asynchronous*
 *
 * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
 * \param query Search query. Can contain pin description keywords or comma-separated pin IDs. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool searchUserPinsListAsync(char * accessToken,
	std::string query, std::string adAccountId, std::string bookmark, 
	void(* handler)(Pins_list_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* SearchManager_H_ */
