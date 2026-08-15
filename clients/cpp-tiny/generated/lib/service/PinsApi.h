#ifndef TINY_CPP_CLIENT_PinsApi_H_
#define TINY_CPP_CLIENT_PinsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreativeType.h"
#include "Date.h"
#include "Error.h"
#include <map>
#include "Pin.h"
#include "PinAnalyticsMetricsResponse.h"
#include "PinCreate.h"
#include "PinUpdate.h"
#include "Pins_list_200_response.h"
#include "Pins_save_request.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class PinsApi : public Service {
public:
    PinsApi() = default;

    virtual ~PinsApi() = default;

    /**
    * Get multiple Pin analytics.
    *
    * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    * \param pinIds List of Pin IDs. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param metricTypes Pin metric types to get data for. *Required*
    * \param appTypes Apps or devices to get data for, default is all.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                String
        >
    multiPins_analytics(
            std::list<std::string> pinIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> metricTypes
            
            , 
            
            std::string appTypes
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get Pin analytics.
    *
    * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    * \param pinId Unique identifier of a Pin. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param metricTypes Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>. *Required*
    * \param appTypes Apps or devices to get data for, default is all.
    * \param splitField How to split the data into groups. Not including this param means data won't be split.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                String
        >
    pins_analytics(
            
            std::string pinId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> metricTypes
            
            , 
            
            std::string appTypes
            , 
            
            std::string splitField
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create Pin.
    *
    *   Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
    * \param pinCreate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Pin
        >
    pins_create(
            
            PinCreate pinCreate
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete Pin.
    *
    *    Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
    * \param pinId  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
            String
        >
    pins_delete(
            
            std::string pinId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get Pin.
    *
    *    Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
    * \param pinId  *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    */
    Response<
                Pin
        >
    pins_get(
            
            std::string pinId
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
    );
    /**
    * List Pins.
    *
    *      Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
    * \param pinFilter The filter to apply to the pins
    * \param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    * \param includeProtectedPins Whether to include protected pins in the results
    * \param pinType The type of pins to return, currently only enabled for private pins
    * \param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Pins_list_200_response
        >
    pins_list(
            
            std::string pinFilter
            , 
            
            bool pinMetrics
            , 
            
            bool includeProtectedPins
            , 
            
            std::string pinType
            , 
            std::list<CreativeType> creativeTypes
            
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Save Pin.
    *
    * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
    * \param pinId Unique identifier of a Pin. *Required*
    * \param pinsSaveRequest Request object used to save an existing pin *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Pin
        >
    pins_save(
            
            std::string pinId
            , 
            
            Pins_save_request pinsSaveRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * Update Pin.
    *
    * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * \param pinId  *Required*
    * \param pinUpdate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Pin
        >
    pins_update(
            
            std::string pinId
            , 
            
            PinUpdate pinUpdate
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_PinsApi_H_ */