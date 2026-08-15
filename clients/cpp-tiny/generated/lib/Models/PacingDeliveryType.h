
/*
 * PacingDeliveryType.h
 *
 * Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 */

#ifndef TINY_CPP_CLIENT_PacingDeliveryType_H_
#define TINY_CPP_CLIENT_PacingDeliveryType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 *
 *  \ingroup Models
 *
 */

class PacingDeliveryType{
public:

    /*! \brief Constructor.
	 */
    PacingDeliveryType();
    PacingDeliveryType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PacingDeliveryType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PacingDeliveryType_H_ */
