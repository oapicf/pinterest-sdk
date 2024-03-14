/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIAdsApi.h"

#include "OpenAPIAdArrayResponse.h"
#include "OpenAPIAdCreateRequest.h"
#include "OpenAPIAdPreviewRequest.h"
#include "OpenAPIAdPreviewURLResponse.h"
#include "OpenAPIAdResponse.h"
#include "OpenAPIAdUpdateRequest.h"
#include "OpenAPIAdsAnalyticsResponseInner.h"
#include "OpenAPIAdsAnalyticsTargetingType.h"
#include "OpenAPIAdsList200Response.h"
#include "OpenAPIConversionReportAttributionType.h"
#include "OpenAPIError.h"
#include "OpenAPIGranularity.h"
#include "OpenAPIMetricsResponse.h"

namespace OpenAPI
{

/* Create ad preview with pin or image
 *
 * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
*/
class OPENAPI_API OpenAPIAdsApi::AdPreviewsCreateRequest : public Request
{
public:
    virtual ~AdPreviewsCreateRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* Create ad preview with pin or image. */
	OpenAPIAdPreviewRequest OpenAPIAdPreviewRequest;
};

class OPENAPI_API OpenAPIAdsApi::AdPreviewsCreateResponse : public Response
{
public:
    virtual ~AdPreviewsCreateResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAdPreviewURLResponse Content;
};

/* Get targeting analytics for ads
 *
 * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
*/
class OPENAPI_API OpenAPIAdsApi::AdTargetingAnalyticsGetRequest : public Request
{
public:
    virtual ~AdTargetingAnalyticsGetRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* List of Ad Ids to use to filter the results. */
	TArray<FString> AdIds;
	/* Metric report start date (UTC). Format: YYYY-MM-DD */
	FDateTime StartDate;
	/* Metric report end date (UTC). Format: YYYY-MM-DD */
	FDateTime EndDate;
	/* Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. */
	TArray<OpenAPIAdsAnalyticsTargetingType> TargetingTypes;
	enum class ColumnsEnum
	{
		AdvertiserId,
		PinPromotionId,
		AdAccountId,
		AdGroupEntityStatus,
		AdGroupId,
		AdId,
		CampaignDailySpendCap,
		CampaignEntityStatus,
		CampaignId,
		CampaignLifetimeSpendCap,
		CampaignName,
		CheckoutRoas,
		CLICKTHROUGH1,
		CLICKTHROUGH1GROSS,
		CLICKTHROUGH2,
		CpcInMicroDollar,
		CpmInDollar,
		CpmInMicroDollar,
		Ctr,
		CTR2,
		EcpcvInDollar,
		ECPCVP95INDOLLAR,
		EcpcInDollar,
		EcpcInMicroDollar,
		EcpeInDollar,
		EcpmInMicroDollar,
		EcpvInDollar,
		Ectr,
		EengagementRate,
		ENGAGEMENT1,
		ENGAGEMENT2,
		EngagementRate,
		IDEAPINPRODUCTTAGVISIT1,
		IDEAPINPRODUCTTAGVISIT2,
		IMPRESSION1,
		IMPRESSION1GROSS,
		IMPRESSION2,
		InappCheckoutCostPerAction,
		OUTBOUNDCLICK1,
		OUTBOUNDCLICK2,
		PageVisitCostPerAction,
		PageVisitRoas,
		PaidImpression,
		PinId,
		REPIN1,
		REPIN2,
		RepinRate,
		SpendInDollar,
		SpendInMicroDollar,
		TotalCheckout,
		TotalCheckoutValueInMicroDollar,
		TotalClickthrough,
		TotalClickAddToCart,
		TotalClickCheckout,
		TotalClickCheckoutValueInMicroDollar,
		TotalClickLead,
		TotalClickSignup,
		TotalClickSignupValueInMicroDollar,
		TotalConversions,
		TotalCustom,
		TotalEngagement,
		TotalEngagementCheckout,
		TotalEngagementCheckoutValueInMicroDollar,
		TotalEngagementLead,
		TotalEngagementSignup,
		TotalEngagementSignupValueInMicroDollar,
		TotalIdeaPinProductTagVisit,
		TotalImpressionFrequency,
		TotalImpressionUser,
		TotalLead,
		TotalOfflineCheckout,
		TotalPageVisit,
		TotalRepinRate,
		TotalSignup,
		TotalSignupValueInMicroDollar,
		TOTALVIDEO3SECVIEWS,
		TotalVideoAvgWatchtimeInSecond,
		TotalVideoMrcViews,
		TOTALVIDEOP0COMBINED,
		TOTALVIDEOP100COMPLETE,
		TOTALVIDEOP25COMBINED,
		TOTALVIDEOP50COMBINED,
		TOTALVIDEOP75COMBINED,
		TOTALVIDEOP95COMBINED,
		TotalViewAddToCart,
		TotalViewCheckout,
		TotalViewCheckoutValueInMicroDollar,
		TotalViewLead,
		TotalViewSignup,
		TotalViewSignupValueInMicroDollar,
		TotalWebCheckout,
		TotalWebCheckoutValueInMicroDollar,
		TotalWebClickCheckout,
		TotalWebClickCheckoutValueInMicroDollar,
		TotalWebEngagementCheckout,
		TotalWebEngagementCheckoutValueInMicroDollar,
		TotalWebSessions,
		TotalWebViewCheckout,
		TotalWebViewCheckoutValueInMicroDollar,
		VIDEO3SECVIEWS2,
		VideoLength,
		VIDEOMRCVIEWS2,
		VIDEOP0COMBINED2,
		VIDEOP100COMPLETE2,
		VIDEOP25COMBINED2,
		VIDEOP50COMBINED2,
		VIDEOP75COMBINED2,
		VIDEOP95COMBINED2,
		WebCheckoutCostPerAction,
		WebCheckoutRoas,
		WEBSESSIONS1,
		WEBSESSIONS2,
  	};

	static FString EnumToString(const ColumnsEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ColumnsEnum& EnumValue);
	/* Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned */
	TArray<ColumnsEnum> Columns;
	/* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
	OpenAPIGranularity Granularity;
	enum class ClickWindowDaysEnum
	{
		_1,
		_7,
		_30,
		_60,
  	};

	static FString EnumToString(const ClickWindowDaysEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ClickWindowDaysEnum& EnumValue);
	/* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
	TOptional<ClickWindowDaysEnum> ClickWindowDays;
	enum class EngagementWindowDaysEnum
	{
		_1,
		_7,
		_30,
		_60,
  	};

	static FString EnumToString(const EngagementWindowDaysEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EngagementWindowDaysEnum& EnumValue);
	/* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
	TOptional<EngagementWindowDaysEnum> EngagementWindowDays;
	enum class ViewWindowDaysEnum
	{
		_1,
		_7,
		_30,
		_60,
  	};

	static FString EnumToString(const ViewWindowDaysEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ViewWindowDaysEnum& EnumValue);
	/* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
	TOptional<ViewWindowDaysEnum> ViewWindowDays;
	enum class ConversionReportTimeEnum
	{
		AdAction,
		Conversion,
  	};

	static FString EnumToString(const ConversionReportTimeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ConversionReportTimeEnum& EnumValue);
	/* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
	TOptional<ConversionReportTimeEnum> ConversionReportTime;
	/* List of types of attribution for the conversion report */
	TOptional<OpenAPIConversionReportAttributionType> AttributionTypes;
};

class OPENAPI_API OpenAPIAdsApi::AdTargetingAnalyticsGetResponse : public Response
{
public:
    virtual ~AdTargetingAnalyticsGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIMetricsResponse Content;
};

/* Get ad analytics
 *
 * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
*/
class OPENAPI_API OpenAPIAdsApi::AdsAnalyticsRequest : public Request
{
public:
    virtual ~AdsAnalyticsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* Metric report start date (UTC). Format: YYYY-MM-DD */
	FDateTime StartDate;
	/* Metric report end date (UTC). Format: YYYY-MM-DD */
	FDateTime EndDate;
	/* List of Ad Ids to use to filter the results. */
	TArray<FString> AdIds;
	enum class ColumnsEnum
	{
		AdvertiserId,
		PinPromotionId,
		AdAccountId,
		AdGroupEntityStatus,
		AdGroupId,
		AdId,
		CampaignDailySpendCap,
		CampaignEntityStatus,
		CampaignId,
		CampaignLifetimeSpendCap,
		CampaignName,
		CheckoutRoas,
		CLICKTHROUGH1,
		CLICKTHROUGH1GROSS,
		CLICKTHROUGH2,
		CpcInMicroDollar,
		CpmInDollar,
		CpmInMicroDollar,
		Ctr,
		CTR2,
		EcpcvInDollar,
		ECPCVP95INDOLLAR,
		EcpcInDollar,
		EcpcInMicroDollar,
		EcpeInDollar,
		EcpmInMicroDollar,
		EcpvInDollar,
		Ectr,
		EengagementRate,
		ENGAGEMENT1,
		ENGAGEMENT2,
		EngagementRate,
		IDEAPINPRODUCTTAGVISIT1,
		IDEAPINPRODUCTTAGVISIT2,
		IMPRESSION1,
		IMPRESSION1GROSS,
		IMPRESSION2,
		InappCheckoutCostPerAction,
		OUTBOUNDCLICK1,
		OUTBOUNDCLICK2,
		PageVisitCostPerAction,
		PageVisitRoas,
		PaidImpression,
		PinId,
		REPIN1,
		REPIN2,
		RepinRate,
		SpendInDollar,
		SpendInMicroDollar,
		TotalCheckout,
		TotalCheckoutValueInMicroDollar,
		TotalClickthrough,
		TotalClickAddToCart,
		TotalClickCheckout,
		TotalClickCheckoutValueInMicroDollar,
		TotalClickLead,
		TotalClickSignup,
		TotalClickSignupValueInMicroDollar,
		TotalConversions,
		TotalCustom,
		TotalEngagement,
		TotalEngagementCheckout,
		TotalEngagementCheckoutValueInMicroDollar,
		TotalEngagementLead,
		TotalEngagementSignup,
		TotalEngagementSignupValueInMicroDollar,
		TotalIdeaPinProductTagVisit,
		TotalImpressionFrequency,
		TotalImpressionUser,
		TotalLead,
		TotalOfflineCheckout,
		TotalPageVisit,
		TotalRepinRate,
		TotalSignup,
		TotalSignupValueInMicroDollar,
		TOTALVIDEO3SECVIEWS,
		TotalVideoAvgWatchtimeInSecond,
		TotalVideoMrcViews,
		TOTALVIDEOP0COMBINED,
		TOTALVIDEOP100COMPLETE,
		TOTALVIDEOP25COMBINED,
		TOTALVIDEOP50COMBINED,
		TOTALVIDEOP75COMBINED,
		TOTALVIDEOP95COMBINED,
		TotalViewAddToCart,
		TotalViewCheckout,
		TotalViewCheckoutValueInMicroDollar,
		TotalViewLead,
		TotalViewSignup,
		TotalViewSignupValueInMicroDollar,
		TotalWebCheckout,
		TotalWebCheckoutValueInMicroDollar,
		TotalWebClickCheckout,
		TotalWebClickCheckoutValueInMicroDollar,
		TotalWebEngagementCheckout,
		TotalWebEngagementCheckoutValueInMicroDollar,
		TotalWebSessions,
		TotalWebViewCheckout,
		TotalWebViewCheckoutValueInMicroDollar,
		VIDEO3SECVIEWS2,
		VideoLength,
		VIDEOMRCVIEWS2,
		VIDEOP0COMBINED2,
		VIDEOP100COMPLETE2,
		VIDEOP25COMBINED2,
		VIDEOP50COMBINED2,
		VIDEOP75COMBINED2,
		VIDEOP95COMBINED2,
		WebCheckoutCostPerAction,
		WebCheckoutRoas,
		WEBSESSIONS1,
		WEBSESSIONS2,
  	};

	static FString EnumToString(const ColumnsEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ColumnsEnum& EnumValue);
	/* Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned */
	TArray<ColumnsEnum> Columns;
	/* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
	OpenAPIGranularity Granularity;
	enum class ClickWindowDaysEnum
	{
		_1,
		_7,
		_30,
		_60,
  	};

	static FString EnumToString(const ClickWindowDaysEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ClickWindowDaysEnum& EnumValue);
	/* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
	TOptional<ClickWindowDaysEnum> ClickWindowDays;
	enum class EngagementWindowDaysEnum
	{
		_1,
		_7,
		_30,
		_60,
  	};

	static FString EnumToString(const EngagementWindowDaysEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EngagementWindowDaysEnum& EnumValue);
	/* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
	TOptional<EngagementWindowDaysEnum> EngagementWindowDays;
	enum class ViewWindowDaysEnum
	{
		_1,
		_7,
		_30,
		_60,
  	};

	static FString EnumToString(const ViewWindowDaysEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ViewWindowDaysEnum& EnumValue);
	/* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
	TOptional<ViewWindowDaysEnum> ViewWindowDays;
	enum class ConversionReportTimeEnum
	{
		AdAction,
		Conversion,
  	};

	static FString EnumToString(const ConversionReportTimeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ConversionReportTimeEnum& EnumValue);
	/* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
	TOptional<ConversionReportTimeEnum> ConversionReportTime;
};

class OPENAPI_API OpenAPIAdsApi::AdsAnalyticsResponse : public Response
{
public:
    virtual ~AdsAnalyticsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIAdsAnalyticsResponseInner> Content;
};

/* Create ads
 *
 * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
*/
class OPENAPI_API OpenAPIAdsApi::AdsCreateRequest : public Request
{
public:
    virtual ~AdsCreateRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* List of ads to create, size limit [1, 30]. */
	TArray<OpenAPIAdCreateRequest> OpenAPIAdCreateRequest;
};

class OPENAPI_API OpenAPIAdsApi::AdsCreateResponse : public Response
{
public:
    virtual ~AdsCreateResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAdArrayResponse Content;
};

/* Get ad
 *
 * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
*/
class OPENAPI_API OpenAPIAdsApi::AdsGetRequest : public Request
{
public:
    virtual ~AdsGetRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* Unique identifier of an ad. */
	FString AdId;
};

class OPENAPI_API OpenAPIAdsApi::AdsGetResponse : public Response
{
public:
    virtual ~AdsGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAdResponse Content;
};

/* List ads
 *
 * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
*/
class OPENAPI_API OpenAPIAdsApi::AdsListRequest : public Request
{
public:
    virtual ~AdsListRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* List of Campaign Ids to use to filter the results. */
	TOptional<TArray<FString>> CampaignIds;
	/* List of Ad group Ids to use to filter the results. */
	TOptional<TArray<FString>> AdGroupIds;
	/* List of Ad Ids to use to filter the results. */
	TOptional<TArray<FString>> AdIds;
	enum class EntityStatusesEnum
	{
		Active,
		Paused,
		Archived,
  	};

	static FString EnumToString(const EntityStatusesEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EntityStatusesEnum& EnumValue);
	/* Entity status */
	TOptional<TArray<EntityStatusesEnum>> EntityStatuses;
	/* Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. */
	TOptional<int32> PageSize;
	enum class OrderEnum
	{
		Ascending,
		Descending,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. */
	TOptional<OrderEnum> Order;
	/* Cursor used to fetch the next page of items */
	TOptional<FString> Bookmark;
};

class OPENAPI_API OpenAPIAdsApi::AdsListResponse : public Response
{
public:
    virtual ~AdsListResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAdsList200Response Content;
};

/* Update ads
 *
 * Update multiple existing ads
*/
class OPENAPI_API OpenAPIAdsApi::AdsUpdateRequest : public Request
{
public:
    virtual ~AdsUpdateRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Unique identifier of an ad account. */
	FString AdAccountId;
	/* List of ads to update, size limit [1, 30] */
	TArray<OpenAPIAdUpdateRequest> OpenAPIAdUpdateRequest;
};

class OPENAPI_API OpenAPIAdsApi::AdsUpdateResponse : public Response
{
public:
    virtual ~AdsUpdateResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAdArrayResponse Content;
};

}