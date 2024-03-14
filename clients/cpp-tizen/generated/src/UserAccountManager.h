#ifndef _UserAccountManager_H_
#define _UserAccountManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Account.h"
#include "AnalyticsMetricsResponse.h"
#include "Date.h"
#include "Error.h"
#include "TopPinsAnalyticsResponse.h"
#include "TopVideoPinsAnalyticsResponse.h"
#include <list>
#include <map>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup UserAccount UserAccount
 * \ingroup Operations
 *  @{
 */
class UserAccountManager {
public:
	UserAccountManager();
	virtual ~UserAccountManager();

/*! \brief Get user account analytics. *Synchronous*
 *
 * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param fromClaimedContent Filter on Pins that match your claimed domain.
 * \param pinFormat Pin formats to get data for, default is all.
 * \param appTypes Apps or devices to get data for, default is all.
 * \param metricTypes Metric types to get data for, default is all. 
 * \param splitField How to split the data into groups. Not including this param means data won't be split.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsSync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);

/*! \brief Get user account analytics. *Asynchronous*
 *
 * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param fromClaimedContent Filter on Pins that match your claimed domain.
 * \param pinFormat Pin formats to get data for, default is all.
 * \param appTypes Apps or devices to get data for, default is all.
 * \param metricTypes Metric types to get data for, default is all. 
 * \param splitField How to split the data into groups. Not including this param means data won't be split.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsAsync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);


/*! \brief Get user account top pins analytics. *Synchronous*
 *
 * Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param sortBy Specify sorting order for metrics *Required*
 * \param fromClaimedContent Filter on Pins that match your claimed domain.
 * \param pinFormat Pin formats to get data for, default is all.
 * \param appTypes Apps or devices to get data for, default is all.
 * \param metricTypes Metric types to get data for, default is all. 
 * \param numOfPins Number of pins to include, default is 10. Max is 50.
 * \param createdInLastNDays Get metrics for pins created in the last \"n\" days.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData);

/*! \brief Get user account top pins analytics. *Asynchronous*
 *
 * Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param sortBy Specify sorting order for metrics *Required*
 * \param fromClaimedContent Filter on Pins that match your claimed domain.
 * \param pinFormat Pin formats to get data for, default is all.
 * \param appTypes Apps or devices to get data for, default is all.
 * \param metricTypes Metric types to get data for, default is all. 
 * \param numOfPins Number of pins to include, default is 10. Max is 50.
 * \param createdInLastNDays Get metrics for pins created in the last \"n\" days.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopPinsAsync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData);


/*! \brief Get user account top video pins analytics. *Synchronous*
 *
 * Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param sortBy Specify sorting order for video metrics *Required*
 * \param fromClaimedContent Filter on Pins that match your claimed domain.
 * \param pinFormat Pin formats to get data for, default is all.
 * \param appTypes Apps or devices to get data for, default is all.
 * \param metricTypes Metric types to get video data for, default is all. 
 * \param numOfPins Number of pins to include, default is 10. Max is 50.
 * \param createdInLastNDays Get metrics for pins created in the last \"n\" days.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopVideoPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData);

/*! \brief Get user account top video pins analytics. *Asynchronous*
 *
 * Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param sortBy Specify sorting order for video metrics *Required*
 * \param fromClaimedContent Filter on Pins that match your claimed domain.
 * \param pinFormat Pin formats to get data for, default is all.
 * \param appTypes Apps or devices to get data for, default is all.
 * \param metricTypes Metric types to get video data for, default is all. 
 * \param numOfPins Number of pins to include, default is 10. Max is 50.
 * \param createdInLastNDays Get metrics for pins created in the last \"n\" days.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopVideoPinsAsync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData);


/*! \brief Get user account. *Synchronous*
 *
 * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
	, void* userData);

/*! \brief Get user account. *Asynchronous*
 *
 * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* UserAccountManager_H_ */
