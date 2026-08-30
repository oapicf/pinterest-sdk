/*
 * Advertiser_defined_events_get_200_response.h
 *
 * 
 */

#ifndef _Advertiser_defined_events_get_200_response_H_
#define _Advertiser_defined_events_get_200_response_H_


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

class Advertiser_defined_events_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Advertiser_defined_events_get_200_response();
	Advertiser_defined_events_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Advertiser_defined_events_get_200_response();

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

#endif /* _Advertiser_defined_events_get_200_response_H_ */
