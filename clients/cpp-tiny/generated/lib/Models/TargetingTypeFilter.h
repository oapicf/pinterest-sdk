
/*
 * TargetingTypeFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingTypeFilter_H_
#define TINY_CPP_CLIENT_TargetingTypeFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingTypeFilter{
public:

    /*! \brief Constructor.
	 */
    TargetingTypeFilter();
    TargetingTypeFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTypeFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	 */
	std::list<std::string> getTargetingTypes();

	/*! \brief Set List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	 */
	void setTargetingTypes(std::list <std::string> targeting_types);


    private:
    std::list<std::string> targeting_types;
};
}

#endif /* TINY_CPP_CLIENT_TargetingTypeFilter_H_ */
