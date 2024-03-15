/*
 * PriceFilter.h
 *
 * 
 */

#ifndef _PriceFilter_H_
#define _PriceFilter_H_


#include <string>
#include "Catalogs_product_group_pricing_currency_criteria.h"
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

class PriceFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceFilter();
	PriceFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Catalogs_product_group_pricing_currency_criteria getPRICE();

	/*! \brief Set 
	 */
	void setPRICE(Catalogs_product_group_pricing_currency_criteria  pRICE);

private:
	Catalogs_product_group_pricing_currency_criteria pRICE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceFilter_H_ */
