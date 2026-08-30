
/*
 * AdsAnalyticsAccountTargetingType.h
 *
 * Reporting targeting type
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsAccountTargetingType_H_
#define TINY_CPP_CLIENT_AdsAnalyticsAccountTargetingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting targeting type
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsAccountTargetingType{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsAccountTargetingType();
    AdsAnalyticsAccountTargetingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsAccountTargetingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsAccountTargetingType_H_ */
