#ifndef _PinsManager_H_
#define _PinsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AnalyticsMetricsResponse.h"
#include "Date.h"
#include "Error.h"
#include "Pin.h"
#include "Pins_save_request.h"
#include <list>
#include <map>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Pins Pins
 * \ingroup Operations
 *  @{
 */
class PinsManager {
public:
	PinsManager();
	virtual ~PinsManager();

/*! \brief Get Pin analytics. *Synchronous*
 *
 * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param metricTypes Pin metric types to get data for, default is all. *Required*
 * \param appTypes Apps or devices to get data for, default is all.
 * \param splitField How to split the data into groups. Not including this param means data won't be split.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsAnalyticsSync(char * accessToken,
	std::string pinId, Date startDate, Date endDate, std::list<std::string> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);

/*! \brief Get Pin analytics. *Asynchronous*
 *
 * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param metricTypes Pin metric types to get data for, default is all. *Required*
 * \param appTypes Apps or devices to get data for, default is all.
 * \param splitField How to split the data into groups. Not including this param means data won't be split.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsAnalyticsAsync(char * accessToken,
	std::string pinId, Date startDate, Date endDate, std::list<std::string> metricTypes, std::string appTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);


/*! \brief Create Pin. *Synchronous*
 *
 * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
 * \param pin Create a new Pin. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsCreateSync(char * accessToken,
	std::shared_ptr<Pin> pin, 
	void(* handler)(Pin, Error, void* )
	, void* userData);

/*! \brief Create Pin. *Asynchronous*
 *
 * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
 * \param pin Create a new Pin. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsCreateAsync(char * accessToken,
	std::shared_ptr<Pin> pin, 
	void(* handler)(Pin, Error, void* )
	, void* userData);


/*! \brief Delete Pin. *Synchronous*
 *
 * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsDeleteSync(char * accessToken,
	std::string pinId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Pin. *Asynchronous*
 *
 * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsDeleteAsync(char * accessToken,
	std::string pinId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get Pin. *Synchronous*
 *
 * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsGetSync(char * accessToken,
	std::string pinId, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData);

/*! \brief Get Pin. *Asynchronous*
 *
 * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsGetAsync(char * accessToken,
	std::string pinId, std::string adAccountId, 
	void(* handler)(Pin, Error, void* )
	, void* userData);


/*! \brief Save pin. *Synchronous*
 *
 * Save a pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param pinsSaveRequest Request object used to save an existing pin *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsSaveSync(char * accessToken,
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, 
	void(* handler)(Pin, Error, void* )
	, void* userData);

/*! \brief Save pin. *Asynchronous*
 *
 * Save a pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
 * \param pinId Unique identifier of a Pin. *Required*
 * \param pinsSaveRequest Request object used to save an existing pin *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinsSaveAsync(char * accessToken,
	std::string pinId, std::shared_ptr<Pins_save_request> pinsSaveRequest, 
	void(* handler)(Pin, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* PinsManager_H_ */
