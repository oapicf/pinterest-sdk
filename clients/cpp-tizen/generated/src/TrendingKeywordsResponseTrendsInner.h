/*
 * TrendingKeywordsResponse_trends_inner.h
 *
 * 
 */

#ifndef _TrendingKeywordsResponse_trends_inner_H_
#define _TrendingKeywordsResponse_trends_inner_H_


#include <string>
#include "TrendingKeywordsResponse_trends_inner_time_series.h"
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

class TrendingKeywordsResponse_trends_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeywordsResponse_trends_inner();
	TrendingKeywordsResponse_trends_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeywordsResponse_trends_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The keyword that is trending.
	 */
	std::string getKeyword();

	/*! \brief Set The keyword that is trending.
	 */
	void setKeyword(std::string  keyword);
	/*! \brief Get The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	 */
	int getPctGrowthWow();

	/*! \brief Set The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	 */
	void setPctGrowthWow(int  pct_growth_wow);
	/*! \brief Get The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	 */
	int getPctGrowthMom();

	/*! \brief Set The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	 */
	void setPctGrowthMom(int  pct_growth_mom);
	/*! \brief Get The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	 */
	int getPctGrowthYoy();

	/*! \brief Set The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	 */
	void setPctGrowthYoy(int  pct_growth_yoy);
	/*! \brief Get 
	 */
	TrendingKeywordsResponse_trends_inner_time_series getTimeSeries();

	/*! \brief Set 
	 */
	void setTimeSeries(TrendingKeywordsResponse_trends_inner_time_series  time_series);

private:
	std::string keyword;
	int pct_growth_wow;
	int pct_growth_mom;
	int pct_growth_yoy;
	TrendingKeywordsResponse_trends_inner_time_series time_series;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeywordsResponse_trends_inner_H_ */
