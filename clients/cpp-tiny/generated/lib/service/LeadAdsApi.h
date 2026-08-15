#ifndef TINY_CPP_CLIENT_LeadAdsApi_H_
#define TINY_CPP_CLIENT_LeadAdsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Ad_accounts_subscriptions_get_list_200_response.h"
#include "LeadSubscription.h"
#include "LeadSubscriptionPostParamsCreate.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LeadAdsApi : public Service {
public:
    LeadAdsApi() = default;

    virtual ~LeadAdsApi() = default;

    /**
    * Delete lead ads subscription.
    *
    * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param subscriptionId Unique identifier of a subscription. *Required*
    */
    Response<
            String
        >
    adAccountsSubscriptions_delById(
            
            std::string adAccountId
            , 
            
            std::string subscriptionId
            
    );
    /**
    * Get lead ads subscription by ID.
    *
    * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param subscriptionId Unique identifier of a subscription. *Required*
    */
    Response<
                LeadSubscription
        >
    adAccountsSubscriptions_getById(
            
            std::string adAccountId
            , 
            
            std::string subscriptionId
            
    );
    /**
    * Get lead ads subscriptions.
    *
    * Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Ad_accounts_subscriptions_get_list_200_response
        >
    adAccountsSubscriptions_getList(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Create lead ads subscription.
    *
    * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadSubscriptionPostParamsCreate  *Required*
    */
    Response<
                LeadSubscription
        >
    adAccountsSubscriptions_post(
            
            std::string adAccountId
            , 
            
            LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_LeadAdsApi_H_ */