/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * AdvancedAuctionApi.h
 *
 * 
 */

#ifndef AdvancedAuctionApi_H_
#define AdvancedAuctionApi_H_


#include "ApiBase.h"

#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "AdvancedAuctionItems.h"
#include "AdvancedAuctionItemsGetRequest.h"
#include "AdvancedAuctionItemsSubmitRequest.h"
#include "AdvancedAuctionProcessedItems.h"
#include "Error.h"
#include <string>

namespace org::openapitools::server::api
{

class  AdvancedAuctionApi : public ApiBase {
public:
    explicit AdvancedAuctionApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~AdvancedAuctionApi() override = default;
    void init() override;

    static const std::string base;

private:
    void setupRoutes();

    void advanced_auction_items_get_post_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void advanced_auction_items_submit_post_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void advanced_auction_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Get item bid options (POST)
    /// </summary>
    /// <remarks>
    /// Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
    /// </remarks>
    /// <param name="advancedAuctionItemsGetRequest">Request object used to get bid options values for a batch of retail catalog items</param>
    /// <param name="adAccountId">Unique identifier of an ad account. (optional, default to &quot;&quot;)</param>
    virtual void advanced_auction_items_get_post(const org::openapitools::server::model::AdvancedAuctionItemsGetRequest &advancedAuctionItemsGetRequest, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Operate on item level bid options
    /// </summary>
    /// <remarks>
    /// This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
    /// </remarks>
    /// <param name="advancedAuctionItemsSubmitRequest">Request object used to upsert or delete bid options for a batch of retail catalog items</param>
    /// <param name="adAccountId">Unique identifier of an ad account. (optional, default to &quot;&quot;)</param>
    virtual void advanced_auction_items_submit_post(const org::openapitools::server::model::AdvancedAuctionItemsSubmitRequest &advancedAuctionItemsSubmitRequest, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* AdvancedAuctionApi_H_ */

