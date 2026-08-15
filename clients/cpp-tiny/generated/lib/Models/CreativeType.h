
/*
 * CreativeType.h
 *
 * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */

#ifndef TINY_CPP_CLIENT_CreativeType_H_
#define TINY_CPP_CLIENT_CreativeType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 *
 *  \ingroup Models
 *
 */

class CreativeType{
public:

    /*! \brief Constructor.
	 */
    CreativeType();
    CreativeType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreativeType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreativeType_H_ */
