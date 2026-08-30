
/*
 * MobileAppPlatform.h
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an &#x60;APP_INSTALL&#x60; campaign.
 */

#ifndef TINY_CPP_CLIENT_MobileAppPlatform_H_
#define TINY_CPP_CLIENT_MobileAppPlatform_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
 *
 *  \ingroup Models
 *
 */

class MobileAppPlatform{
public:

    /*! \brief Constructor.
	 */
    MobileAppPlatform();
    MobileAppPlatform(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MobileAppPlatform();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MobileAppPlatform_H_ */
