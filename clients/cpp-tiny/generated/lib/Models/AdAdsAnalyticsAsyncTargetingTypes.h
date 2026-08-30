
/*
 * AdAdsAnalyticsAsyncTargetingTypes.h
 *
 * Reporting targeting type
 */

#ifndef TINY_CPP_CLIENT_AdAdsAnalyticsAsyncTargetingTypes_H_
#define TINY_CPP_CLIENT_AdAdsAnalyticsAsyncTargetingTypes_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting targeting type
 *
 *  \ingroup Models
 *
 */

class AdAdsAnalyticsAsyncTargetingTypes{
public:

    /*! \brief Constructor.
	 */
    AdAdsAnalyticsAsyncTargetingTypes();
    AdAdsAnalyticsAsyncTargetingTypes(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAdsAnalyticsAsyncTargetingTypes();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdAdsAnalyticsAsyncTargetingTypes_H_ */
