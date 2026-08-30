
/*
 * NetworkType.h
 *
 * Type of network connection.
 */

#ifndef TINY_CPP_CLIENT_NetworkType_H_
#define TINY_CPP_CLIENT_NetworkType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of network connection.
 *
 *  \ingroup Models
 *
 */

class NetworkType{
public:

    /*! \brief Constructor.
	 */
    NetworkType();
    NetworkType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NetworkType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NetworkType_H_ */
