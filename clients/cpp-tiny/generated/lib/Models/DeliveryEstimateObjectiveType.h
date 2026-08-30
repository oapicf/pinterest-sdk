
/*
 * DeliveryEstimateObjectiveType.h
 *
 * Objective type for delivery estimates.
 */

#ifndef TINY_CPP_CLIENT_DeliveryEstimateObjectiveType_H_
#define TINY_CPP_CLIENT_DeliveryEstimateObjectiveType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Objective type for delivery estimates.
 *
 *  \ingroup Models
 *
 */

class DeliveryEstimateObjectiveType{
public:

    /*! \brief Constructor.
	 */
    DeliveryEstimateObjectiveType();
    DeliveryEstimateObjectiveType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeliveryEstimateObjectiveType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_DeliveryEstimateObjectiveType_H_ */
