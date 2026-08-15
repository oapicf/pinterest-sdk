
/*
 * ProductCategoryDetails.h
 *
 * Product category details
 */

#ifndef TINY_CPP_CLIENT_ProductCategoryDetails_H_
#define TINY_CPP_CLIENT_ProductCategoryDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductCategoriesDemographic.h"
#include "ProductCategoriesMetricsHighlights.h"
#include "ProductCategoryEnum.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief Product category details
 *
 *  \ingroup Models
 *
 */

class ProductCategoryDetails{
public:

    /*! \brief Constructor.
	 */
    ProductCategoryDetails();
    ProductCategoryDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductCategoryDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ProductCategoriesDemographic getDemographics();

	/*! \brief Set 
	 */
	void setDemographics(ProductCategoriesDemographic  demographics);
	/*! \brief Get      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
	 */
	bool isHasPrediction();

	/*! \brief Set      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
	 */
	void setHasPrediction(bool  has_prediction);
	/*! \brief Get 
	 */
	ProductCategoriesMetricsHighlights getMetricsHighlights();

	/*! \brief Set 
	 */
	void setMetricsHighlights(ProductCategoriesMetricsHighlights  metrics_highlights);
	/*! \brief Get      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
	 */
	Map<std::string, std::string> getPredictedTimeSeries();

	/*! \brief Set      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
	 */
	void setPredictedTimeSeries(Map <std::string, std::string> predicted_time_series);
	/*! \brief Get 
	 */
	ProductCategoryEnum getProductCategory();

	/*! \brief Set 
	 */
	void setProductCategory(ProductCategoryEnum  product_category);
	/*! \brief Get Related search terms for this product category
	 */
	std::list<std::string> getRelatedSearches();

	/*! \brief Set Related search terms for this product category
	 */
	void setRelatedSearches(std::list <std::string> related_searches);
	/*! \brief Get Time series data showing trend values over time, indexed between 0 and 100
	 */
	Map<std::string, std::string> getTimeSeries();

	/*! \brief Set Time series data showing trend values over time, indexed between 0 and 100
	 */
	void setTimeSeries(Map <std::string, std::string> time_series);


    private:
    ProductCategoriesDemographic demographics;
    bool has_prediction{};
    ProductCategoriesMetricsHighlights metrics_highlights;
    Map<std::string, std::string> predicted_time_series;
    ProductCategoryEnum product_category;
    std::list<std::string> related_searches;
    Map<std::string, std::string> time_series;
};
}

#endif /* TINY_CPP_CLIENT_ProductCategoryDetails_H_ */
