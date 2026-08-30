
/*
 * AdGroupDeliveryEstimatesKeywordsItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupDeliveryEstimatesKeywordsItems_H_
#define TINY_CPP_CLIENT_AdGroupDeliveryEstimatesKeywordsItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NullalbleMatchType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupDeliveryEstimatesKeywordsItems{
public:

    /*! \brief Constructor.
	 */
    AdGroupDeliveryEstimatesKeywordsItems();
    AdGroupDeliveryEstimatesKeywordsItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupDeliveryEstimatesKeywordsItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	NullalbleMatchType getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(NullalbleMatchType match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string value);


    private:
    NullalbleMatchType match_type;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_AdGroupDeliveryEstimatesKeywordsItems_H_ */
