
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
#include "PinAnalyticsMetricsResponse_daily_metrics_inner.h"
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
	std::list<PinAnalyticsMetricsResponse_daily_metrics_inner> getDailyMetrics();

	/*! \brief Set Array with the requested daily metric records
	 */
	void setDailyMetrics(std::list <PinAnalyticsMetricsResponse_daily_metrics_inner> daily_metrics);
	/*! \brief Get The lifetime metric name and value.
	 */
	Map<std::string, std::string> getLifetimeMetrics();

	/*! \brief Set The lifetime metric name and value.
	 */
	void setLifetimeMetrics(Map <std::string, std::string> lifetime_metrics);
	/*! \brief Get The metric name and value over the requested period for each requested metric
	 */
	Map<std::string, std::string> getSummaryMetrics();

	/*! \brief Set The metric name and value over the requested period for each requested metric
	 */
	void setSummaryMetrics(Map <std::string, std::string> summary_metrics);


    private:
    std::list<PinAnalyticsMetricsResponse_daily_metrics_inner> daily_metrics;
    Map<std::string, std::string> lifetime_metrics;
    Map<std::string, std::string> summary_metrics;
};
}

#endif /* TINY_CPP_CLIENT_PinAnalyticsMetricsResponse_H_ */
