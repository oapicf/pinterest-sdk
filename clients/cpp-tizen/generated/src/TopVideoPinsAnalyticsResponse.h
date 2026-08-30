/*
 * TopVideoPinsAnalyticsResponse.h
 *
 * 
 */

#ifndef _TopVideoPinsAnalyticsResponse_H_
#define _TopVideoPinsAnalyticsResponse_H_


#include <string>
#include "TopVideoPinsAnalyticsResponseDateAvailability.h"
#include "TopVideoPinsAnalyticsResponsePinsItems.h"
#include "TopVideoPinsSortBy.h"
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
	TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability();

	/*! \brief Set 
	 */
	void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability  date_availability);
	/*! \brief Get 
	 */
	std::list<TopVideoPinsAnalyticsResponsePinsItems> getPins();

	/*! \brief Set 
	 */
	void setPins(std::list <TopVideoPinsAnalyticsResponsePinsItems> pins);
	/*! \brief Get 
	 */
	TopVideoPinsSortBy getSortBy();

	/*! \brief Set 
	 */
	void setSortBy(TopVideoPinsSortBy  sort_by);

private:
	TopVideoPinsAnalyticsResponseDateAvailability date_availability;
	std::list <TopVideoPinsAnalyticsResponsePinsItems>pins;
	TopVideoPinsSortBy sort_by;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopVideoPinsAnalyticsResponse_H_ */
