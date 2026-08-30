
/*
 * AdAccountEntityType.h
 *
 * Specify the entity type to get summary information
 */

#ifndef TINY_CPP_CLIENT_AdAccountEntityType_H_
#define TINY_CPP_CLIENT_AdAccountEntityType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Specify the entity type to get summary information
 *
 *  \ingroup Models
 *
 */

class AdAccountEntityType{
public:

    /*! \brief Constructor.
	 */
    AdAccountEntityType();
    AdAccountEntityType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountEntityType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdAccountEntityType_H_ */
