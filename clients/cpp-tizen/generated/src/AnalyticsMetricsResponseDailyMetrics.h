/*
 * AnalyticsMetricsResponse_daily_metrics.h
 *
 * 
 */

#ifndef _AnalyticsMetricsResponse_daily_metrics_H_
#define _AnalyticsMetricsResponse_daily_metrics_H_


#include <string>
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

class AnalyticsMetricsResponse_daily_metrics : public Object {
public:
	/*! \brief Constructor.
	 */
	AnalyticsMetricsResponse_daily_metrics();
	AnalyticsMetricsResponse_daily_metrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AnalyticsMetricsResponse_daily_metrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Metrics availablity, e.g., \"READY\".
	 */
	std::string getDataStatus();

	/*! \brief Set Metrics availablity, e.g., \"READY\".
	 */
	void setDataStatus(std::string  data_status);
	/*! \brief Get Metrics date (UTC): YYYY-MM-DD.
	 */
	std::string getDate();

	/*! \brief Set Metrics date (UTC): YYYY-MM-DD.
	 */
	void setDate(std::string  date);
	/*! \brief Get The metric name and daily value for each requested metric
	 */
	std::map<std::string, std::string> getMetrics();

	/*! \brief Set The metric name and daily value for each requested metric
	 */
	void setMetrics(std::map <std::string, std::string> metrics);

private:
	std::string data_status;
	std::string date;
	std::map <std::string, std::string>metrics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AnalyticsMetricsResponse_daily_metrics_H_ */
