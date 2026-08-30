
/*
 * PermissionsWithOwner.h
 *
 * Permission levels including the OWNER role.
 */

#ifndef TINY_CPP_CLIENT_PermissionsWithOwner_H_
#define TINY_CPP_CLIENT_PermissionsWithOwner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Permission levels including the OWNER role.
 *
 *  \ingroup Models
 *
 */

class PermissionsWithOwner{
public:

    /*! \brief Constructor.
	 */
    PermissionsWithOwner();
    PermissionsWithOwner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PermissionsWithOwner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PermissionsWithOwner_H_ */
