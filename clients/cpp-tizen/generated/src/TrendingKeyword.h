/*
 * TrendingKeyword.h
 *
 * 
 */

#ifndef _TrendingKeyword_H_
#define _TrendingKeyword_H_


#include <string>
#include "PredictedTimeSeries.h"
#include "TimeSeries.h"
#include "TrendingKeyword_demographics.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TrendingKeyword : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeyword();
	TrendingKeyword(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeyword();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TrendingKeyword_demographics getDemographics();

	/*! \brief Set 
	 */
	void setDemographics(TrendingKeyword_demographics  demographics);
	/*! \brief Get Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
	 */
	bool getHasPrediction();

	/*! \brief Set Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
	 */
	void setHasPrediction(bool  has_prediction);
	/*! \brief Get The keyword that is trending.
	 */
	std::string getKeyword();

	/*! \brief Set The keyword that is trending.
	 */
	void setKeyword(std::string  keyword);
	/*! \brief Get The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	 */
	int getPctGrowthMom();

	/*! \brief Set The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	 */
	void setPctGrowthMom(int  pct_growth_mom);
	/*! \brief Get The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	 */
	int getPctGrowthWow();

	/*! \brief Set The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	 */
	void setPctGrowthWow(int  pct_growth_wow);
	/*! \brief Get The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	 */
	int getPctGrowthYoy();

	/*! \brief Set The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	 */
	void setPctGrowthYoy(int  pct_growth_yoy);
	/*! \brief Get 
	 */
	PredictedTimeSeries getPredictedTimeSeries();

	/*! \brief Set 
	 */
	void setPredictedTimeSeries(PredictedTimeSeries  predicted_time_series);
	/*! \brief Get 
	 */
	TimeSeries getTimeSeries();

	/*! \brief Set 
	 */
	void setTimeSeries(TimeSeries  time_series);

private:
	TrendingKeyword_demographics demographics;
	bool has_prediction;
	std::string keyword;
	int pct_growth_mom;
	int pct_growth_wow;
	int pct_growth_yoy;
	PredictedTimeSeries predicted_time_series;
	TimeSeries time_series;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeyword_H_ */
