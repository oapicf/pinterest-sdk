#ifndef _AdsManager_H_
#define _AdsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdArrayResponse.h"
#include "AdCreateRequest_inner.h"
#include "AdPreviewRequest.h"
#include "AdPreviewURLResponse.h"
#include "AdResponse.h"
#include "AdUpdateRequest_inner.h"
#include "Ads_list_200_response.h"
#include "Error.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Ads Ads
 * \ingroup Operations
 *  @{
 */
class AdsManager {
public:
	AdsManager();
	virtual ~AdsManager();

/*! \brief Create ad preview with pin or image. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adPreviewRequest Create ad preview with pin or image. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adPreviewsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdPreviewRequest> adPreviewRequest, 
	void(* handler)(AdPreviewURLResponse, Error, void* )
	, void* userData);

/*! \brief Create ad preview with pin or image. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adPreviewRequest Create ad preview with pin or image. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adPreviewsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdPreviewRequest> adPreviewRequest, 
	void(* handler)(AdPreviewURLResponse, Error, void* )
	, void* userData);


/*! \brief Create ads. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adCreateRequestInner List of ads to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreateSync(char * accessToken,
	std::string adAccountId, std::list<AdCreateRequest_inner> adCreateRequestInner, 
	void(* handler)(AdArrayResponse, Error, void* )
	, void* userData);

/*! \brief Create ads. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adCreateRequestInner List of ads to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<AdCreateRequest_inner> adCreateRequestInner, 
	void(* handler)(AdArrayResponse, Error, void* )
	, void* userData);


/*! \brief Get ad. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adId Unique identifier of an ad. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsGetSync(char * accessToken,
	std::string adAccountId, std::string adId, 
	void(* handler)(AdResponse, Error, void* )
	, void* userData);

/*! \brief Get ad. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adId Unique identifier of an ad. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsGetAsync(char * accessToken,
	std::string adAccountId, std::string adId, 
	void(* handler)(AdResponse, Error, void* )
	, void* userData);


/*! \brief List ads. *Synchronous*
 *
 * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param adGroupIds List of Ad group Ids to use to filter the results.
 * \param adIds List of Ad Ids to use to filter the results.
 * \param entityStatuses Entity status
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> adIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Ads_list_200_response, Error, void* )
	, void* userData);

/*! \brief List ads. *Asynchronous*
 *
 * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param adGroupIds List of Ad group Ids to use to filter the results.
 * \param adIds List of Ad Ids to use to filter the results.
 * \param entityStatuses Entity status
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> adIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Ads_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update ads. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple existing ads
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adUpdateRequestInner List of ads to update, size limit [1, 30] *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<AdUpdateRequest_inner> adUpdateRequestInner, 
	void(* handler)(AdArrayResponse, Error, void* )
	, void* userData);

/*! \brief Update ads. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple existing ads
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adUpdateRequestInner List of ads to update, size limit [1, 30] *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<AdUpdateRequest_inner> adUpdateRequestInner, 
	void(* handler)(AdArrayResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* AdsManager_H_ */
