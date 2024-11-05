#ifndef _ProductGroupPromotionsManager_H_
#define _ProductGroupPromotionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Date.h"
#include "Error.h"
#include "Granularity.h"
#include "ProductGroupAnalyticsResponse_inner.h"
#include "ProductGroupPromotionCreateRequest.h"
#include "ProductGroupPromotionResponse.h"
#include "ProductGroupPromotionUpdateRequest.h"
#include "Product_group_promotions_list_200_response.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ProductGroupPromotions ProductGroupPromotions
 * \ingroup Operations
 *  @{
 */
class ProductGroupPromotionsManager {
public:
	ProductGroupPromotionsManager();
	virtual ~ProductGroupPromotionsManager();

/*! \brief Create product group promotions. *Synchronous*
 *
 * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData);

/*! \brief Create product group promotions. *Asynchronous*
 *
 * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData);


/*! \brief Get a product group promotion by id. *Synchronous*
 *
 * Get a product group promotion by id
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionId Unique identifier of a product group promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsGetSync(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData);

/*! \brief Get a product group promotion by id. *Asynchronous*
 *
 * Get a product group promotion by id
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionId Unique identifier of a product group promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsGetAsync(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData);


/*! \brief Get product group promotions. *Synchronous*
 *
 * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionIds List of Product group promotion Ids.
 * \param entityStatuses Entity status
 * \param adGroupId Ad group Id.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> productGroupPromotionIds, std::list<std::string> entityStatuses, std::string adGroupId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Product_group_promotions_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get product group promotions. *Asynchronous*
 *
 * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionIds List of Product group promotion Ids.
 * \param entityStatuses Entity status
 * \param adGroupId Ad group Id.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> productGroupPromotionIds, std::list<std::string> entityStatuses, std::string adGroupId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Product_group_promotions_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update product group promotions. *Synchronous*
 *
 * Update multiple existing Product Group Promotions (by product_group_id)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionUpdateRequest Parameters to update Product group promotions *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData);

/*! \brief Update product group promotions. *Asynchronous*
 *
 * Update multiple existing Product Group Promotions (by product_group_id)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionUpdateRequest Parameters to update Product group promotions *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(ProductGroupPromotionResponse, Error, void* )
	, void* userData);


/*! \brief Get product group analytics. *Synchronous*
 *
 * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
 * \param productGroupIds List of Product group Ids to use to filter the results. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
 * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )
	, void* userData);

/*! \brief Get product group analytics. *Asynchronous*
 *
 * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
 * \param productGroupIds List of Product group Ids to use to filter the results. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
 * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> productGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<ProductGroupAnalyticsResponse_inner>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ProductGroupPromotionsManager_H_ */
