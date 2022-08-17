/*
 * TopVideoPinsAnalyticsResponse.h
 *
 * 
 */

#ifndef _TopVideoPinsAnalyticsResponse_H_
#define _TopVideoPinsAnalyticsResponse_H_


#include <string>
#include "TopPinsAnalyticsResponse_date_availability.h"
#include "TopVideoPinsAnalyticsResponse_pins_inner.h"
#include <list>
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

class TopVideoPinsAnalyticsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	TopVideoPinsAnalyticsResponse();
	TopVideoPinsAnalyticsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopVideoPinsAnalyticsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TopPinsAnalyticsResponse_date_availability getDateAvailability();

	/*! \brief Set 
	 */
	void setDateAvailability(TopPinsAnalyticsResponse_date_availability  date_availability);
	/*! \brief Get 
	 */
	std::list<TopVideoPinsAnalyticsResponse_pins_inner> getPins();

	/*! \brief Set 
	 */
	void setPins(std::list <TopVideoPinsAnalyticsResponse_pins_inner> pins);
	/*! \brief Get 
	 */
	std::string getSortBy();

	/*! \brief Set 
	 */
	void setSortBy(std::string  sort_by);

private:
	TopPinsAnalyticsResponse_date_availability date_availability;
	std::list <TopVideoPinsAnalyticsResponse_pins_inner>pins;
	std::string sort_by;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopVideoPinsAnalyticsResponse_H_ */
