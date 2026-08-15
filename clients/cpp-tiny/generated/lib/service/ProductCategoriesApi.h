#ifndef TINY_CPP_CLIENT_ProductCategoriesApi_H_
#define TINY_CPP_CLIENT_ProductCategoriesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

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
#include "VerticalProductCategory.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ProductCategoriesApi : public Service {
public:
    ProductCategoriesApi() = default;

    virtual ~ProductCategoriesApi() = default;

    /**
    * Get featured topics.
    *
    *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
    * \param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
    * \param interest Interest to filter by
    */
    Response<
                    std::list<FeaturedTrend>
        >
    trendsFeaturedTopics_list(
            
            ProductCategoryRegion region
            , 
            
            InterestsEnum interest
            
    );
    /**
    * Get product category details.
    *
    *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
    * \param productCategories List of product categories *Required*
    * \param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
    * \param lookbackWindow    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
    * \param engagementType      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
    */
    Response<
                    std::list<ProductCategoryDetails>
        >
    trendsProductCategoriesDetails_list(
            std::list<ProductCategoryEnum> productCategories
            
            , 
            
            ProductCategoryRegion region
            , 
            
            ProductCategoryDetailLookbackWindow lookbackWindow
            , 
            
            ProductCategoriesEngagementType engagementType
            
    );
    /**
    * Get a list of growing Shopping Product Categories.
    *
    *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
    * \param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada *Required*
    * \param verticals List of verticals to filter by
    * \param ages Age to filter by. If not provided, the results will be filtered by all ages.
    * \param genders Gender to filter by, If not provided, the results will be filtered by all genders.
    * \param engagementType      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
    */
    Response<
                    std::list<TrendingProductCategory>
        >
    trendsProductCategoriesTrending_list(
            
            ProductCategoryRegion region
            , 
            std::list<VerticalProductCategory> verticals
            
            , 
            std::list<AgeTrendsBucket> ages
            
            , 
            std::list<GenderBucket> genders
            
            , 
            
            ProductCategoriesEngagementType engagementType
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ProductCategoriesApi_H_ */