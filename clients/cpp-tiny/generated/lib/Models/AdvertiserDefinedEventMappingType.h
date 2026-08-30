
/*
 * AdvertiserDefinedEventMappingType.h
 *
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEventMappingType_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEventMappingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventMappingType{
public:

    /*! \brief Constructor.
	 */
    AdvertiserDefinedEventMappingType();
    AdvertiserDefinedEventMappingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvertiserDefinedEventMappingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEventMappingType_H_ */
