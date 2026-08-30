
/*
 * PublicTargetingType.h
 *
 * Public ad targeting type with external names
 */

#ifndef TINY_CPP_CLIENT_PublicTargetingType_H_
#define TINY_CPP_CLIENT_PublicTargetingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Public ad targeting type with external names
 *
 *  \ingroup Models
 *
 */

class PublicTargetingType{
public:

    /*! \brief Constructor.
	 */
    PublicTargetingType();
    PublicTargetingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PublicTargetingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PublicTargetingType_H_ */
