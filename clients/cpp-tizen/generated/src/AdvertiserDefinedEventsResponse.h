/*
 * AdvertiserDefinedEventsResponse.h
 *
 * 
 */

#ifndef _AdvertiserDefinedEventsResponse_H_
#define _AdvertiserDefinedEventsResponse_H_


#include <string>
#include "AdvertiserDefinedEvent.h"
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

class AdvertiserDefinedEventsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvertiserDefinedEventsResponse();
	AdvertiserDefinedEventsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvertiserDefinedEventsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdvertiserDefinedEvent> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdvertiserDefinedEvent> items);

private:
	std::list <AdvertiserDefinedEvent>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEventsResponse_H_ */
