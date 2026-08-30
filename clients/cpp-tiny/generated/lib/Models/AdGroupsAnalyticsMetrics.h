
/*
 * AdGroupsAnalyticsMetrics.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupsAnalyticsMetrics_H_
#define TINY_CPP_CLIENT_AdGroupsAnalyticsMetrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupsAnalyticsMetrics{
public:

    /*! \brief Constructor.
	 */
    AdGroupsAnalyticsMetrics();
    AdGroupsAnalyticsMetrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupsAnalyticsMetrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
	 */
	std::string getADGROUPID();

	/*! \brief Set The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
	 */
	void setADGROUPID(std::string aD_GROUP_ID);
	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date dATE);


    private:
    std::string aD_GROUP_ID{};
    Date dATE;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupsAnalyticsMetrics_H_ */
