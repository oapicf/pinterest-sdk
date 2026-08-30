#ifndef _TrendsManager_H_
#define _TrendsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AgeTrendsBucket.h"
#include "FeaturedTrend.h"
#include "GenderBucket.h"
#include "InterestsEnum.h"
#include "Pinterest.Lib.Error.h"
#include "ProductCategoriesEngagementType.h"
#include "ProductCategoryDetailLookbackWindow.h"
#include "ProductCategoryDetails.h"
#include "ProductCategoryEnum.h"
#include "ProductCategoryRegion.h"
#include "TrendingProductCategory.h"
#include "TrendsEditorial.h"
#include "VerticalProductCategory.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Trends Trends
 * \ingroup Operations
 *  @{
 */
class TrendsManager {
public:
	TrendsManager();
	virtual ~TrendsManager();

/*! \brief Returns editorial articles for a given region. *Synchronous*
 *
 *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsEditorialArticlesListSync(char * accessToken,
	ProductCategoryRegion region, 
	void(* handler)(std::list<TrendsEditorial>, Error, void* )
	, void* userData);

/*! \brief Returns editorial articles for a given region. *Asynchronous*
 *
 *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsEditorialArticlesListAsync(char * accessToken,
	ProductCategoryRegion region, 
	void(* handler)(std::list<TrendsEditorial>, Error, void* )
	, void* userData);


/*! \brief Get featured topics. *Synchronous*
 *
 *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param interest Interest to filter by
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsFeaturedTopicsListSync(char * accessToken,
	ProductCategoryRegion region, InterestsEnum interest, 
	void(* handler)(std::list<FeaturedTrend>, Error, void* )
	, void* userData);

/*! \brief Get featured topics. *Asynchronous*
 *
 *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param interest Interest to filter by
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsFeaturedTopicsListAsync(char * accessToken,
	ProductCategoryRegion region, InterestsEnum interest, 
	void(* handler)(std::list<FeaturedTrend>, Error, void* )
	, void* userData);


/*! \brief Get product category details. *Synchronous*
 *
 *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
 * \param productCategories List of product categories *Required*
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param lookbackWindow   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
 * \param engagementType     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsProductCategoriesDetailsListSync(char * accessToken,
	std::list<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<ProductCategoryDetails>, Error, void* )
	, void* userData);

/*! \brief Get product category details. *Asynchronous*
 *
 *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
 * \param productCategories List of product categories *Required*
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param lookbackWindow   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
 * \param engagementType     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsProductCategoriesDetailsListAsync(char * accessToken,
	std::list<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<ProductCategoryDetails>, Error, void* )
	, void* userData);


/*! \brief Get a list of growing Shopping Product Categories. *Synchronous*
 *
 *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param verticals List of verticals to filter by
 * \param ages Age to filter by. If not provided, the results will be filtered by all ages.
 * \param genders Gender to filter by, If not provided, the results will be filtered by all genders.
 * \param engagementType     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsProductCategoriesTrendingListSync(char * accessToken,
	ProductCategoryRegion region, std::list<VerticalProductCategory> verticals, std::list<AgeTrendsBucket> ages, std::list<GenderBucket> genders, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<TrendingProductCategory>, Error, void* )
	, void* userData);

/*! \brief Get a list of growing Shopping Product Categories. *Asynchronous*
 *
 *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
 * \param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
 * \param verticals List of verticals to filter by
 * \param ages Age to filter by. If not provided, the results will be filtered by all ages.
 * \param genders Gender to filter by, If not provided, the results will be filtered by all genders.
 * \param engagementType     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool trendsProductCategoriesTrendingListAsync(char * accessToken,
	ProductCategoryRegion region, std::list<VerticalProductCategory> verticals, std::list<AgeTrendsBucket> ages, std::list<GenderBucket> genders, ProductCategoriesEngagementType engagementType, 
	void(* handler)(std::list<TrendingProductCategory>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* TrendsManager_H_ */
