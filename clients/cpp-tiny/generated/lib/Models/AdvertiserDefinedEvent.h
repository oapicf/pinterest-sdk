
/*
 * AdvertiserDefinedEvent.h
 *
 * Advertiser defined event
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEvent_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionTagTypeOptimal.h"

namespace Tiny {


/*! \brief Advertiser defined event
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEvent{
public:

    /*! \brief Constructor.
	 */
    AdvertiserDefinedEvent();
    AdvertiserDefinedEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvertiserDefinedEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Standard type mapped to ADE for optimization
	 */
	ConversionTagTypeOptimal getMappedConversionType();

	/*! \brief Set Standard type mapped to ADE for optimization
	 */
	void setMappedConversionType(ConversionTagTypeOptimal mapped_conversion_type);
	/*! \brief Get Raw string name of the event, usually logged as raw_event_name in our dataset
	 */
	std::string getName();

	/*! \brief Set Raw string name of the event, usually logged as raw_event_name in our dataset
	 */
	void setName(std::string name);


    private:
    ConversionTagTypeOptimal mapped_conversion_type;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEvent_H_ */
