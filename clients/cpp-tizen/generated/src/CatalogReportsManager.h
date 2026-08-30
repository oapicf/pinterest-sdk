#ifndef _CatalogReportsManager_H_
#define _CatalogReportsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CatalogsCreateReportResponse.h"
#include "CatalogsReport.h"
#include "CatalogsReportParameters.h"
#include "CatalogsReportStatsParameters.h"
#include "Pinterest.Lib.Error.h"
#include "Reports_stats_200_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup CatalogReports CatalogReports
 * \ingroup Operations
 *  @{
 */
class CatalogReportsManager {
public:
	CatalogReportsManager();
	virtual ~CatalogReportsManager();

/*! \brief Build catalogs report. *Synchronous*
 *
 * Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
 * \param catalogsReportParameters  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reportsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsReportParameters> catalogsReportParameters, std::string adAccountId, 
	void(* handler)(CatalogsCreateReportResponse, Error, void* )
	, void* userData);

/*! \brief Build catalogs report. *Asynchronous*
 *
 * Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
 * \param catalogsReportParameters  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reportsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsReportParameters> catalogsReportParameters, std::string adAccountId, 
	void(* handler)(CatalogsCreateReportResponse, Error, void* )
	, void* userData);


/*! \brief Get catalogs report. *Synchronous*
 *
 * This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param token Token returned from the post request creation call *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reportsGetSync(char * accessToken,
	std::string token, std::string adAccountId, 
	void(* handler)(CatalogsReport, Error, void* )
	, void* userData);

/*! \brief Get catalogs report. *Asynchronous*
 *
 * This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param token Token returned from the post request creation call *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reportsGetAsync(char * accessToken,
	std::string token, std::string adAccountId, 
	void(* handler)(CatalogsReport, Error, void* )
	, void* userData);


/*! \brief List report stats. *Synchronous*
 *
 * List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param parameters Contains the parameters for report identification. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reportsStatsSync(char * accessToken,
	CatalogsReportStatsParameters parameters, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Reports_stats_200_response, Error, void* )
	, void* userData);

/*! \brief List report stats. *Asynchronous*
 *
 * List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param parameters Contains the parameters for report identification. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reportsStatsAsync(char * accessToken,
	CatalogsReportStatsParameters parameters, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Reports_stats_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CatalogReportsManager_H_ */
