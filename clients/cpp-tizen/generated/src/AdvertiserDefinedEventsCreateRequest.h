/*
 * AdvertiserDefinedEventsCreateRequest.h
 *
 * Request body for creating or updating advertiser defined events
 */

#ifndef _AdvertiserDefinedEventsCreateRequest_H_
#define _AdvertiserDefinedEventsCreateRequest_H_


#include <string>
#include "AdvertiserDefinedEventInput.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request body for creating or updating advertiser defined events
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventsCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvertiserDefinedEventsCreateRequest();
	AdvertiserDefinedEventsCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvertiserDefinedEventsCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of advertiser defined events to create or update
	 */
	std::list<AdvertiserDefinedEventInput> getItems();

	/*! \brief Set List of advertiser defined events to create or update
	 */
	void setItems(std::list <AdvertiserDefinedEventInput> items);

private:
	std::list <AdvertiserDefinedEventInput>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEventsCreateRequest_H_ */
