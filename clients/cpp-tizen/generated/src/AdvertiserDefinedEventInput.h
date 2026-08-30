/*
 * AdvertiserDefinedEventInput.h
 *
 * Advertiser defined event input for create/update operations
 */

#ifndef _AdvertiserDefinedEventInput_H_
#define _AdvertiserDefinedEventInput_H_


#include <string>
#include "AdvertiserDefinedEventMappingType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Advertiser defined event input for create/update operations
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventInput : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvertiserDefinedEventInput();
	AdvertiserDefinedEventInput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvertiserDefinedEventInput();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pinterest standard event type to map this custom event to for campaign optimization and reporting
	 */
	AdvertiserDefinedEventMappingType getMappedConversionType();

	/*! \brief Set Pinterest standard event type to map this custom event to for campaign optimization and reporting
	 */
	void setMappedConversionType(AdvertiserDefinedEventMappingType  mapped_conversion_type);
	/*! \brief Get Raw string name of the event
	 */
	std::string getName();

	/*! \brief Set Raw string name of the event
	 */
	void setName(std::string  name);

private:
	AdvertiserDefinedEventMappingType mapped_conversion_type;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEventInput_H_ */
