/*
 * PinAnalyticsMetricsResponse_daily_metrics_inner.h
 *
 * 
 */

#ifndef _PinAnalyticsMetricsResponse_daily_metrics_inner_H_
#define _PinAnalyticsMetricsResponse_daily_metrics_inner_H_


#include <string>
#include "DataStatus.h"
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

class PinAnalyticsMetricsResponse_daily_metrics_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PinAnalyticsMetricsResponse_daily_metrics_inner();
	PinAnalyticsMetricsResponse_daily_metrics_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinAnalyticsMetricsResponse_daily_metrics_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	DataStatus getDataStatus();

	/*! \brief Set 
	 */
	void setDataStatus(DataStatus  data_status);
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
	DataStatus data_status;
	std::string date;
	std::map <std::string, std::string>metrics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinAnalyticsMetricsResponse_daily_metrics_inner_H_ */
