
/*
 * AudienceOwnershipType.h
 *
 * Filter audiences by ownership type.
 */

#ifndef TINY_CPP_CLIENT_AudienceOwnershipType_H_
#define TINY_CPP_CLIENT_AudienceOwnershipType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Filter audiences by ownership type.
 *
 *  \ingroup Models
 *
 */

class AudienceOwnershipType{
public:

    /*! \brief Constructor.
	 */
    AudienceOwnershipType();
    AudienceOwnershipType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceOwnershipType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudienceOwnershipType_H_ */
