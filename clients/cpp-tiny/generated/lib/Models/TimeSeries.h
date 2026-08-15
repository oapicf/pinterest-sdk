
/*
 * TimeSeries.h
 *
 * A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
 */

#ifndef TINY_CPP_CLIENT_TimeSeries_H_
#define TINY_CPP_CLIENT_TimeSeries_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
 *
 *  \ingroup Models
 *
 */

class TimeSeries{
public:

    /*! \brief Constructor.
	 */
    TimeSeries();
    TimeSeries(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TimeSeries();


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

#endif /* TINY_CPP_CLIENT_TimeSeries_H_ */
