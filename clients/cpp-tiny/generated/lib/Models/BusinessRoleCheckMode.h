
/*
 * BusinessRoleCheckMode.h
 *
 * Specifies if the partner is internal or external.
 */

#ifndef TINY_CPP_CLIENT_BusinessRoleCheckMode_H_
#define TINY_CPP_CLIENT_BusinessRoleCheckMode_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Specifies if the partner is internal or external.
 *
 *  \ingroup Models
 *
 */

class BusinessRoleCheckMode{
public:

    /*! \brief Constructor.
	 */
    BusinessRoleCheckMode();
    BusinessRoleCheckMode(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessRoleCheckMode();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessRoleCheckMode_H_ */
