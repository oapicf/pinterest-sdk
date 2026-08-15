
/*
 * AdsAnalyticsAdGroupTargetingType.h
 *
 * Reporting targeting type for ad groups
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsAdGroupTargetingType_H_
#define TINY_CPP_CLIENT_AdsAnalyticsAdGroupTargetingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting targeting type for ad groups
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsAdGroupTargetingType{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsAdGroupTargetingType();
    AdsAnalyticsAdGroupTargetingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsAdGroupTargetingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsAdGroupTargetingType_H_ */
