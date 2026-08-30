
/*
 * PinAnalyticsMetricsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PinAnalyticsMetricsResponse_H_
#define TINY_CPP_CLIENT_PinAnalyticsMetricsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PinAnalyticsDailyMetrics.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PinAnalyticsMetricsResponse{
public:

    /*! \brief Constructor.
	 */
    PinAnalyticsMetricsResponse();
    PinAnalyticsMetricsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinAnalyticsMetricsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array with the requested daily metric records
	 */
	std::list<PinAnalyticsDailyMetrics> getDailyMetrics();

	/*! \brief Set Array with the requested daily metric records
	 */
	void setDailyMetrics(std::list<PinAnalyticsDailyMetrics> daily_metrics);
	/*! \brief Get The lifetime metric name and value.
	 */
	std::map<std::string, int> getLifetimeMetrics();

	/*! \brief Set The lifetime metric name and value.
	 */
	void setLifetimeMetrics(std::map<std::string, int> lifetime_metrics);
	/*! \brief Get The metric name and value over the requested period for each requested metric
	 */
	std::map<std::string, long> getSummaryMetrics();

	/*! \brief Set The metric name and value over the requested period for each requested metric
	 */
	void setSummaryMetrics(std::map<std::string, long> summary_metrics);


    private:
    std::list<PinAnalyticsDailyMetrics> daily_metrics;
    std::map<std::string, int> lifetime_metrics;
    std::map<std::string, long> summary_metrics;
};
}

#endif /* TINY_CPP_CLIENT_PinAnalyticsMetricsResponse_H_ */
