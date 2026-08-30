/*
 * PinAnalyticsDailyMetrics.h
 *
 * 
 */

#ifndef _PinAnalyticsDailyMetrics_H_
#define _PinAnalyticsDailyMetrics_H_


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

class PinAnalyticsDailyMetrics : public Object {
public:
	/*! \brief Constructor.
	 */
	PinAnalyticsDailyMetrics();
	PinAnalyticsDailyMetrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinAnalyticsDailyMetrics();

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
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getMetrics();

	/*! \brief Set 
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

#endif /* _PinAnalyticsDailyMetrics_H_ */
