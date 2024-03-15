/*
 * TrendingKeywordsResponse_trends_inner_time_series.h
 *
 * A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
 */

#ifndef _TrendingKeywordsResponse_trends_inner_time_series_H_
#define _TrendingKeywordsResponse_trends_inner_time_series_H_


#include <string>
#include "Date.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
 *
 *  \ingroup Models
 *
 */

class TrendingKeywordsResponse_trends_inner_time_series : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeywordsResponse_trends_inner_time_series();
	TrendingKeywordsResponse_trends_inner_time_series(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeywordsResponse_trends_inner_time_series();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Date getDate();

	/*! \brief Set 
	 */
	void setDate(Date  date);

private:
	Date date;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeywordsResponse_trends_inner_time_series_H_ */
