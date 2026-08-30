
/*
 * ProductAvailability.h
 *
 * Product availability.
 */

#ifndef TINY_CPP_CLIENT_ProductAvailability_H_
#define TINY_CPP_CLIENT_ProductAvailability_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product availability.
 *
 *  \ingroup Models
 *
 */

class ProductAvailability{
public:

    /*! \brief Constructor.
	 */
    ProductAvailability();
    ProductAvailability(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductAvailability();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ProductAvailability_H_ */
