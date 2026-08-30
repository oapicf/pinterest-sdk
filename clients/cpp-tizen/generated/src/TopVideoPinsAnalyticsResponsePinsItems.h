/*
 * TopVideoPinsAnalyticsResponsePinsItems.h
 *
 * Array with metrics, status, and pin id for the requested metric
 */

#ifndef _TopVideoPinsAnalyticsResponsePinsItems_H_
#define _TopVideoPinsAnalyticsResponsePinsItems_H_


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

class TopVideoPinsAnalyticsResponsePinsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	TopVideoPinsAnalyticsResponsePinsItems();
	TopVideoPinsAnalyticsResponsePinsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopVideoPinsAnalyticsResponsePinsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getDataStatus();

	/*! \brief Set 
	 */
	void setDataStatus(std::map <std::string, std::string> data_status);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getMetrics();

	/*! \brief Set 
	 */
	void setMetrics(std::map <std::string, std::string> metrics);
	/*! \brief Get The pin id
	 */
	std::string getPinId();

	/*! \brief Set The pin id
	 */
	void setPinId(std::string  pin_id);

private:
	std::map <std::string, std::string>data_status;
	std::map <std::string, std::string>metrics;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopVideoPinsAnalyticsResponsePinsItems_H_ */
