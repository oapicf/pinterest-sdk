
/*
 * OsFamily.h
 *
 * Operating system family.
 */

#ifndef TINY_CPP_CLIENT_OsFamily_H_
#define TINY_CPP_CLIENT_OsFamily_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Operating system family.
 *
 *  \ingroup Models
 *
 */

class OsFamily{
public:

    /*! \brief Constructor.
	 */
    OsFamily();
    OsFamily(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OsFamily();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OsFamily_H_ */
