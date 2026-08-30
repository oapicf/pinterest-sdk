/*
 * AdvertiserDefinedEventMappingType.h
 *
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 */

#ifndef _AdvertiserDefinedEventMappingType_H_
#define _AdvertiserDefinedEventMappingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventMappingType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvertiserDefinedEventMappingType();
	AdvertiserDefinedEventMappingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvertiserDefinedEventMappingType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEventMappingType_H_ */
