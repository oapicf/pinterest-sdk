
/*
 * AdsAnalyticsAdTargetingType.h
 *
 * Reporting targeting type for ads
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsAdTargetingType_H_
#define TINY_CPP_CLIENT_AdsAnalyticsAdTargetingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting targeting type for ads
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsAdTargetingType{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsAdTargetingType();
    AdsAnalyticsAdTargetingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsAdTargetingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsAdTargetingType_H_ */
