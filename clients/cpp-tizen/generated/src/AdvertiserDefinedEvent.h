/*
 * AdvertiserDefinedEvent.h
 *
 * 
 */

#ifndef _AdvertiserDefinedEvent_H_
#define _AdvertiserDefinedEvent_H_


#include <string>
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

class AdvertiserDefinedEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvertiserDefinedEvent();
	AdvertiserDefinedEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvertiserDefinedEvent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get raw string name of the event, usually logged as raw_event_name in our dataset
	 */
	std::string getName();

	/*! \brief Set raw string name of the event, usually logged as raw_event_name in our dataset
	 */
	void setName(std::string  name);
	/*! \brief Get standard type mapped to ADE for optimization
	 */
	std::string getMappedConversionType();

	/*! \brief Set standard type mapped to ADE for optimization
	 */
	void setMappedConversionType(std::string  mapped_conversion_type);

private:
	std::string name;
	std::string mapped_conversion_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEvent_H_ */
