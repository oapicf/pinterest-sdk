#import <Foundation/Foundation.h>
#import "OAIError.h"
#import "OAIGranularity.h"
#import "OAIProductGroupAnalyticsResponseInner.h"
#import "OAIProductGroupPromotionCreateRequest.h"
#import "OAIProductGroupPromotionResponse.h"
#import "OAIProductGroupPromotionUpdateRequest.h"
#import "OAIProductGroupPromotionsList200Response.h"
#import "OAIApi.h"

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



@interface OAIProductGroupPromotionsApi: NSObject <OAIApi>

extern NSString* kOAIProductGroupPromotionsApiErrorDomain;
extern NSInteger kOAIProductGroupPromotionsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Create product group promotions
/// Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
///
/// @param adAccountId Unique identifier of an ad account.
/// @param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30].
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIProductGroupPromotionResponse*
-(NSURLSessionTask*) productGroupPromotionsCreateWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionCreateRequest: (OAIProductGroupPromotionCreateRequest*) productGroupPromotionCreateRequest
    completionHandler: (void (^)(OAIProductGroupPromotionResponse* output, NSError* error)) handler;


/// Get a product group promotion by id
/// Get a product group promotion by id
///
/// @param adAccountId Unique identifier of an ad account.
/// @param productGroupPromotionId Unique identifier of a product group promotion
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIProductGroupPromotionResponse*
-(NSURLSessionTask*) productGroupPromotionsGetWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionId: (NSString*) productGroupPromotionId
    completionHandler: (void (^)(OAIProductGroupPromotionResponse* output, NSError* error)) handler;


/// Get product group promotions
/// List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
///
/// @param adAccountId Unique identifier of an ad account.
/// @param productGroupPromotionIds List of Product group promotion Ids. (optional)
/// @param entityStatuses Entity status (optional)
/// @param adGroupId Ad group Id. (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIProductGroupPromotionsList200Response*
-(NSURLSessionTask*) productGroupPromotionsListWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionIds: (NSArray<NSString*>*) productGroupPromotionIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    adGroupId: (NSString*) adGroupId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIProductGroupPromotionsList200Response* output, NSError* error)) handler;


/// Update product group promotions
/// Update multiple existing Product Group Promotions (by product_group_id)
///
/// @param adAccountId Unique identifier of an ad account.
/// @param productGroupPromotionUpdateRequest Parameters to update Product group promotions
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIProductGroupPromotionResponse*
-(NSURLSessionTask*) productGroupPromotionsUpdateWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionUpdateRequest: (OAIProductGroupPromotionUpdateRequest*) productGroupPromotionUpdateRequest
    completionHandler: (void (^)(OAIProductGroupPromotionResponse* output, NSError* error)) handler;


/// Get product group analytics
/// Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
///
/// @param adAccountId Unique identifier of an ad account.
/// @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
/// @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
/// @param productGroupIds List of Product group Ids to use to filter the results.
/// @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
/// @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
/// @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional) (default to @30)
/// @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional) (default to @30)
/// @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional) (default to @1)
/// @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid ad account ads analytics parameters.",
///  code:0 message:"Unexpected error"
///
/// @return NSArray<OAIProductGroupAnalyticsResponseInner>*
-(NSURLSessionTask*) productGroupsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    productGroupIds: (NSArray<NSString*>*) productGroupIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    completionHandler: (void (^)(NSArray<OAIProductGroupAnalyticsResponseInner>* output, NSError* error)) handler;



@end
