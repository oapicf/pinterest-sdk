/*
 * AdPinAnalytics.h
 *
 * 
 */

#ifndef _AdPinAnalytics_H_
#define _AdPinAnalytics_H_


#include <string>
#include "AnyType.h"
#include "Date.h"
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

class AdPinAnalytics : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPinAnalytics();
	AdPinAnalytics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPinAnalytics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);
	/*! \brief Get The ID of the pin that the metric belongs to.
	 */
	std::string getPINID();

	/*! \brief Set The ID of the pin that the metric belongs to.
	 */
	void setPINID(std::string  pIN_ID);

private:
	Date dATE;
	std::string pIN_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPinAnalytics_H_ */
