
/*
 * AppsflyerPlatform.h
 *
 * Platform options for AppsFlyer audience
 */

#ifndef TINY_CPP_CLIENT_AppsflyerPlatform_H_
#define TINY_CPP_CLIENT_AppsflyerPlatform_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Platform options for AppsFlyer audience
 *
 *  \ingroup Models
 *
 */

class AppsflyerPlatform{
public:

    /*! \brief Constructor.
	 */
    AppsflyerPlatform();
    AppsflyerPlatform(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AppsflyerPlatform();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AppsflyerPlatform_H_ */
