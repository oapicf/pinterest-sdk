
/*
 * AdvertiserDefinedEventInput.h
 *
 * Advertiser defined event input for create/update operations
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEventInput_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEventInput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvertiserDefinedEventMappingType.h"

namespace Tiny {


/*! \brief Advertiser defined event input for create/update operations
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventInput{
public:

    /*! \brief Constructor.
	 */
    AdvertiserDefinedEventInput();
    AdvertiserDefinedEventInput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvertiserDefinedEventInput();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Pinterest standard event type to map this custom event to for campaign optimization and reporting
	 */
	AdvertiserDefinedEventMappingType getMappedConversionType();

	/*! \brief Set Pinterest standard event type to map this custom event to for campaign optimization and reporting
	 */
	void setMappedConversionType(AdvertiserDefinedEventMappingType mapped_conversion_type);
	/*! \brief Get Raw string name of the event
	 */
	std::string getName();

	/*! \brief Set Raw string name of the event
	 */
	void setName(std::string name);


    private:
    AdvertiserDefinedEventMappingType mapped_conversion_type;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEventInput_H_ */
