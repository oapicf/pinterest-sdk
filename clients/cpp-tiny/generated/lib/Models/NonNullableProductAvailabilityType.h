
/*
 * NonNullableProductAvailabilityType.h
 *
 * Product availability.
 */

#ifndef TINY_CPP_CLIENT_NonNullableProductAvailabilityType_H_
#define TINY_CPP_CLIENT_NonNullableProductAvailabilityType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product availability.
 *
 *  \ingroup Models
 *
 */

class NonNullableProductAvailabilityType{
public:

    /*! \brief Constructor.
	 */
    NonNullableProductAvailabilityType();
    NonNullableProductAvailabilityType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NonNullableProductAvailabilityType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NonNullableProductAvailabilityType_H_ */
