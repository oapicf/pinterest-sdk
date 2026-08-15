
/*
 * AdvertiserDefinedEvent.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEvent_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
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
    std::string name{};
    std::string mapped_conversion_type{};
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEvent_H_ */
