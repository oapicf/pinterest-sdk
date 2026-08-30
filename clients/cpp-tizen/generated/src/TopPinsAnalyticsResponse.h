/*
 * TopPinsAnalyticsResponse.h
 *
 * 
 */

#ifndef _TopPinsAnalyticsResponse_H_
#define _TopPinsAnalyticsResponse_H_


#include <string>
#include "TopPinsAnalyticsResponseDateAvailability.h"
#include "TopPinsAnalyticsResponsePinsItems.h"
#include "TopPinsSortBy.h"
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

class TopPinsAnalyticsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	TopPinsAnalyticsResponse();
	TopPinsAnalyticsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopPinsAnalyticsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TopPinsAnalyticsResponseDateAvailability getDateAvailability();

	/*! \brief Set 
	 */
	void setDateAvailability(TopPinsAnalyticsResponseDateAvailability  date_availability);
	/*! \brief Get 
	 */
	std::list<TopPinsAnalyticsResponsePinsItems> getPins();

	/*! \brief Set 
	 */
	void setPins(std::list <TopPinsAnalyticsResponsePinsItems> pins);
	/*! \brief Get 
	 */
	TopPinsSortBy getSortBy();

	/*! \brief Set 
	 */
	void setSortBy(TopPinsSortBy  sort_by);

private:
	TopPinsAnalyticsResponseDateAvailability date_availability;
	std::list <TopPinsAnalyticsResponsePinsItems>pins;
	TopPinsSortBy sort_by;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopPinsAnalyticsResponse_H_ */
