/*
 * AdGroupDeliveryEstimatesKeywordsItems.h
 *
 * 
 */

#ifndef _AdGroupDeliveryEstimatesKeywordsItems_H_
#define _AdGroupDeliveryEstimatesKeywordsItems_H_


#include <string>
#include "NullalbleMatchType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupDeliveryEstimatesKeywordsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupDeliveryEstimatesKeywordsItems();
	AdGroupDeliveryEstimatesKeywordsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupDeliveryEstimatesKeywordsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	NullalbleMatchType getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(NullalbleMatchType  match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string  value);

private:
	NullalbleMatchType match_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupDeliveryEstimatesKeywordsItems_H_ */
