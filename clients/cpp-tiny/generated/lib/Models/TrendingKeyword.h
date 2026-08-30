
/*
 * TrendingKeyword.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TrendingKeyword_H_
#define TINY_CPP_CLIENT_TrendingKeyword_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PredictedTimeSeries.h"
#include "TimeSeries.h"
#include "TrendingKeywordDemographics.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TrendingKeyword{
public:

    /*! \brief Constructor.
	 */
    TrendingKeyword();
    TrendingKeyword(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingKeyword();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TrendingKeywordDemographics getDemographics();

	/*! \brief Set 
	 */
	void setDemographics(TrendingKeywordDemographics demographics);
	/*! \brief Get Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
	 */
	bool isHasPrediction();

	/*! \brief Set Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
	 */
	void setHasPrediction(bool has_prediction);
	/*! \brief Get The keyword that is trending.
	 */
	std::string getKeyword();

	/*! \brief Set The keyword that is trending.
	 */
	void setKeyword(std::string keyword);
	/*! \brief Get The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	 */
	int getPctGrowthMom();

	/*! \brief Set The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	 */
	void setPctGrowthMom(int pct_growth_mom);
	/*! \brief Get The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	 */
	int getPctGrowthWow();

	/*! \brief Set The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	 */
	void setPctGrowthWow(int pct_growth_wow);
	/*! \brief Get The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	 */
	int getPctGrowthYoy();

	/*! \brief Set The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	 */
	void setPctGrowthYoy(int pct_growth_yoy);
	/*! \brief Get A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
	 */
	PredictedTimeSeries&lt;std::string, int&gt; getPredictedTimeSeries();

	/*! \brief Set A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
	 */
	void setPredictedTimeSeries(PredictedTimeSeries&lt;std::string, int&gt; predicted_time_series);
	/*! \brief Get A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
	 */
	TimeSeries&lt;std::string, int&gt; getTimeSeries();

	/*! \brief Set A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
	 */
	void setTimeSeries(TimeSeries&lt;std::string, int&gt; time_series);


    private:
    TrendingKeywordDemographics demographics;
    bool has_prediction{};
    std::string keyword{};
    int pct_growth_mom{};
    int pct_growth_wow{};
    int pct_growth_yoy{};
    PredictedTimeSeries&lt;std::string, int&gt; predicted_time_series;
    TimeSeries&lt;std::string, int&gt; time_series;
};
}

#endif /* TINY_CPP_CLIENT_TrendingKeyword_H_ */
