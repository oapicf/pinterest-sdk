
/*
 * AnalyticsMetricsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AnalyticsMetricsResponse_H_
#define TINY_CPP_CLIENT_AnalyticsMetricsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnalyticsDailyMetrics.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AnalyticsMetricsResponse{
public:

    /*! \brief Constructor.
	 */
    AnalyticsMetricsResponse();
    AnalyticsMetricsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AnalyticsMetricsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array with the requested daily metric records
	 */
	std::list<AnalyticsDailyMetrics> getDailyMetrics();

	/*! \brief Set Array with the requested daily metric records
	 */
	void setDailyMetrics(std::list <AnalyticsDailyMetrics> daily_metrics);
	/*! \brief Get The metric name and value over the requested period for each requested metric
	 */
	Map<std::string, std::string> getSummaryMetrics();

	/*! \brief Set The metric name and value over the requested period for each requested metric
	 */
	void setSummaryMetrics(Map <std::string, std::string> summary_metrics);


    private:
    std::list<AnalyticsDailyMetrics> daily_metrics;
    Map<std::string, std::string> summary_metrics;
};
}

#endif /* TINY_CPP_CLIENT_AnalyticsMetricsResponse_H_ */
