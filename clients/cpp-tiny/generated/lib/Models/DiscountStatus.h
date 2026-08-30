
/*
 * DiscountStatus.h
 *
 * Discount status based on the current time and start and end time of discount
 */

#ifndef TINY_CPP_CLIENT_DiscountStatus_H_
#define TINY_CPP_CLIENT_DiscountStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Discount status based on the current time and start and end time of discount
 *
 *  \ingroup Models
 *
 */

class DiscountStatus{
public:

    /*! \brief Constructor.
	 */
    DiscountStatus();
    DiscountStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DiscountStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_DiscountStatus_H_ */
