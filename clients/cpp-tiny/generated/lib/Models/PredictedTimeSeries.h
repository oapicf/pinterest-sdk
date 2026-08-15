
/*
 * PredictedTimeSeries.h
 *
 * A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.&lt;br /&gt; **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.
 */

#ifndef TINY_CPP_CLIENT_PredictedTimeSeries_H_
#define TINY_CPP_CLIENT_PredictedTimeSeries_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.<br /> These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.<br /> **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
 *
 *  \ingroup Models
 *
 */

class PredictedTimeSeries{
public:

    /*! \brief Constructor.
	 */
    PredictedTimeSeries();
    PredictedTimeSeries(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PredictedTimeSeries();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Date getDate();

	/*! \brief Set 
	 */
	void setDate(Date  date);


    private:
    Date date;
};
}

#endif /* TINY_CPP_CLIENT_PredictedTimeSeries_H_ */
