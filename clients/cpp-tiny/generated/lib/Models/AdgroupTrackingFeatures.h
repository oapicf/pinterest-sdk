
/*
 * AdgroupTrackingFeatures.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdgroupTrackingFeatures_H_
#define TINY_CPP_CLIENT_AdgroupTrackingFeatures_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdgroupTrackingFeatureType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdgroupTrackingFeatures{
public:

    /*! \brief Constructor.
	 */
    AdgroupTrackingFeatures();
    AdgroupTrackingFeatures(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdgroupTrackingFeatures();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Tracking features. To clear this field, set to null.
	 */
	std::list<AdgroupTrackingFeatureType> getEnabled();

	/*! \brief Set Tracking features. To clear this field, set to null.
	 */
	void setEnabled(std::list<AdgroupTrackingFeatureType> enabled);


    private:
    std::list<AdgroupTrackingFeatureType> enabled;
};
}

#endif /* TINY_CPP_CLIENT_AdgroupTrackingFeatures_H_ */
