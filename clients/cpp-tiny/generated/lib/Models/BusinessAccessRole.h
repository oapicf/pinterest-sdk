
/*
 * BusinessAccessRole.h
 *
 * Permission role for business access.
 */

#ifndef TINY_CPP_CLIENT_BusinessAccessRole_H_
#define TINY_CPP_CLIENT_BusinessAccessRole_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Permission role for business access.
 *
 *  \ingroup Models
 *
 */

class BusinessAccessRole{
public:

    /*! \brief Constructor.
	 */
    BusinessAccessRole();
    BusinessAccessRole(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessAccessRole();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessAccessRole_H_ */
