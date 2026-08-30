/*
 * AdvertiserDefinedEvent.h
 *
 * Advertiser defined event
 */

#ifndef _AdvertiserDefinedEvent_H_
#define _AdvertiserDefinedEvent_H_


#include <string>
#include "ConversionTagTypeOptimal.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Advertiser defined event
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

	/*! \brief Get Standard type mapped to ADE for optimization
	 */
	ConversionTagTypeOptimal getMappedConversionType();

	/*! \brief Set Standard type mapped to ADE for optimization
	 */
	void setMappedConversionType(ConversionTagTypeOptimal  mapped_conversion_type);
	/*! \brief Get Raw string name of the event, usually logged as raw_event_name in our dataset
	 */
	std::string getName();

	/*! \brief Set Raw string name of the event, usually logged as raw_event_name in our dataset
	 */
	void setName(std::string  name);

private:
	ConversionTagTypeOptimal mapped_conversion_type;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEvent_H_ */
