/*
 * MinPriceFilter.h
 *
 * 
 */

#ifndef _MinPriceFilter_H_
#define _MinPriceFilter_H_


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

class MinPriceFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	MinPriceFilter();
	MinPriceFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MinPriceFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupPricingCriteria getMINPRICE();

	/*! \brief Set 
	 */
	void setMINPRICE(CatalogsProductGroupPricingCriteria  mIN_PRICE);

private:
	CatalogsProductGroupPricingCriteria mIN_PRICE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MinPriceFilter_H_ */
