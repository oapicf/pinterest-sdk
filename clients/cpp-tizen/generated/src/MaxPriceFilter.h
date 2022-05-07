/*
 * MaxPriceFilter.h
 *
 * 
 */

#ifndef _MaxPriceFilter_H_
#define _MaxPriceFilter_H_


#include <string>
#include "CatalogsProductGroupPricingCriteria.h"
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

class MaxPriceFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	MaxPriceFilter();
	MaxPriceFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MaxPriceFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupPricingCriteria getMAXPRICE();

	/*! \brief Set 
	 */
	void setMAXPRICE(CatalogsProductGroupPricingCriteria  mAX_PRICE);

private:
	CatalogsProductGroupPricingCriteria mAX_PRICE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MaxPriceFilter_H_ */
