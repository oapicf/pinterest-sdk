/*
 * AnalyticsMetricsResponse.h
 *
 * 
 */

#ifndef _AnalyticsMetricsResponse_H_
#define _AnalyticsMetricsResponse_H_


#include <string>
#include "AnalyticsMetricsResponse_daily_metrics_inner.h"
#include <list>
#include <map>
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

class AnalyticsMetricsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AnalyticsMetricsResponse();
	AnalyticsMetricsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AnalyticsMetricsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array with the requested daily metric records
	 */
	std::list<AnalyticsMetricsResponse_daily_metrics_inner> getDailyMetrics();

	/*! \brief Set Array with the requested daily metric records
	 */
	void setDailyMetrics(std::list <AnalyticsMetricsResponse_daily_metrics_inner> daily_metrics);
	/*! \brief Get The metric name and value over the requested period for each requested metric
	 */
	std::map<std::string, std::string> getSummaryMetrics();

	/*! \brief Set The metric name and value over the requested period for each requested metric
	 */
	void setSummaryMetrics(std::map <std::string, std::string> summary_metrics);

private:
	std::list <AnalyticsMetricsResponse_daily_metrics_inner>daily_metrics;
	std::map <std::string, std::string>summary_metrics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AnalyticsMetricsResponse_H_ */
