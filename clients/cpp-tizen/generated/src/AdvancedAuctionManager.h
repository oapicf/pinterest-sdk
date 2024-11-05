#ifndef _AdvancedAuctionManager_H_
#define _AdvancedAuctionManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdvancedAuctionItems.h"
#include "AdvancedAuctionItemsGetRequest.h"
#include "AdvancedAuctionItemsSubmitRequest.h"
#include "AdvancedAuctionProcessedItems.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup AdvancedAuction AdvancedAuction
 * \ingroup Operations
 *  @{
 */
class AdvancedAuctionManager {
public:
	AdvancedAuctionManager();
	virtual ~AdvancedAuctionManager();

/*! \brief Get item bid options (POST). *Synchronous*
 *
 * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
 * \param advancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advancedAuctionItemsGetPostSync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsGetRequest> advancedAuctionItemsGetRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionItems, Error, void* )
	, void* userData);

/*! \brief Get item bid options (POST). *Asynchronous*
 *
 * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
 * \param advancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advancedAuctionItemsGetPostAsync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsGetRequest> advancedAuctionItemsGetRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionItems, Error, void* )
	, void* userData);


/*! \brief Operate on item level bid options. *Synchronous*
 *
 * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
 * \param advancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advancedAuctionItemsSubmitPostSync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsSubmitRequest> advancedAuctionItemsSubmitRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionProcessedItems, Error, void* )
	, void* userData);

/*! \brief Operate on item level bid options. *Asynchronous*
 *
 * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
 * \param advancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advancedAuctionItemsSubmitPostAsync(char * accessToken,
	std::shared_ptr<AdvancedAuctionItemsSubmitRequest> advancedAuctionItemsSubmitRequest, std::string adAccountId, 
	void(* handler)(AdvancedAuctionProcessedItems, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* AdvancedAuctionManager_H_ */
