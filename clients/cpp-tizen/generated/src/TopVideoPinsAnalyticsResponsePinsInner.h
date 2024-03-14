/*
 * TopVideoPinsAnalyticsResponse_pins_inner.h
 *
 * Array with metrics, status, and pin id for the requested metric
 */

#ifndef _TopVideoPinsAnalyticsResponse_pins_inner_H_
#define _TopVideoPinsAnalyticsResponse_pins_inner_H_


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


/*! \brief Array with metrics, status, and pin id for the requested metric
 *
 *  \ingroup Models
 *
 */

class TopVideoPinsAnalyticsResponse_pins_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	TopVideoPinsAnalyticsResponse_pins_inner();
	TopVideoPinsAnalyticsResponse_pins_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopVideoPinsAnalyticsResponse_pins_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The metric name and daily value for each requested metric
	 */
	std::map<std::string, std::string> getMetrics();

	/*! \brief Set The metric name and daily value for each requested metric
	 */
	void setMetrics(std::map <std::string, std::string> metrics);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getDataStatus();

	/*! \brief Set 
	 */
	void setDataStatus(std::map <std::string, std::string> data_status);
	/*! \brief Get The pin id
	 */
	std::string getPinId();

	/*! \brief Set The pin id
	 */
	void setPinId(std::string  pin_id);

private:
	std::map <std::string, std::string>metrics;
	std::map <std::string, std::string>data_status;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopVideoPinsAnalyticsResponse_pins_inner_H_ */
