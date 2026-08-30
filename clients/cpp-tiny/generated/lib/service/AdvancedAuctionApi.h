#ifndef TINY_CPP_CLIENT_AdvancedAuctionApi_H_
#define TINY_CPP_CLIENT_AdvancedAuctionApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdvancedAuctionItems.h"
#include "AdvancedAuctionItemsGetRequest.h"
#include "AdvancedAuctionItemsSubmitRequest.h"
#include "AdvancedAuctionProcessedItems.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AdvancedAuctionApi : public Service {
public:
    AdvancedAuctionApi() = default;

    virtual ~AdvancedAuctionApi();

    /**
    * Get item bid options (POST).
    *
    * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
    * \param advancedAuctionItemsGetRequest  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                AdvancedAuctionItems
        >
    advancedAuctionItemsGet_post(
            
            AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * Operate on item level bid options.
    *
    * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
    * \param advancedAuctionItemsSubmitRequest  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                AdvancedAuctionProcessedItems
        >
    advancedAuctionItemsSubmit_post(
            
            AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AdvancedAuctionApi_H_ */