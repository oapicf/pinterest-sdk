#ifndef _CatalogsManager_H_
#define _CatalogsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Catalog.h"
#include "CatalogCreate.h"
#include "CatalogsAvailableFilterValues.h"
#include "CatalogsLocale.h"
#include "Catalogs_list_200_response.h"
#include "Country.h"
#include "Pinterest.Lib.Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Catalogs Catalogs
 * \ingroup Operations
 *  @{
 */
class CatalogsManager {
public:
	CatalogsManager();
	virtual ~CatalogsManager();

/*! \brief List available filter values. *Synchronous*
 *
 * Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Filter entities for a given catalog_id. *Required*
 * \param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
 * \param country Country for the Catalogs Items
 * \param language Language for the Catalogs Items
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsAvailableFilterValuesSync(char * accessToken,
	std::string catalogId, std::string feedId, Country country, CatalogsLocale language, std::string adAccountId, 
	void(* handler)(CatalogsAvailableFilterValues, Error, void* )
	, void* userData);

/*! \brief List available filter values. *Asynchronous*
 *
 * Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Filter entities for a given catalog_id. *Required*
 * \param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
 * \param country Country for the Catalogs Items
 * \param language Language for the Catalogs Items
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsAvailableFilterValuesAsync(char * accessToken,
	std::string catalogId, std::string feedId, Country country, CatalogsLocale language, std::string adAccountId, 
	void(* handler)(CatalogsAvailableFilterValues, Error, void* )
	, void* userData);


/*! \brief Create catalog. *Synchronous*
 *
 * Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
 * \param catalogCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsCreateSync(char * accessToken,
	std::shared_ptr<CatalogCreate> catalogCreate, std::string adAccountId, 
	void(* handler)(Catalog, Error, void* )
	, void* userData);

/*! \brief Create catalog. *Asynchronous*
 *
 * Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
 * \param catalogCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogCreate> catalogCreate, std::string adAccountId, 
	void(* handler)(Catalog, Error, void* )
	, void* userData);


/*! \brief List catalogs. *Synchronous*
 *
 * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_list_200_response, Error, void* )
	, void* userData);

/*! \brief List catalogs. *Asynchronous*
 *
 * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_list_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CatalogsManager_H_ */
