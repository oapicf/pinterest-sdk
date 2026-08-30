/*
 * PriceFilterPrice.h
 *
 * 
 */

#ifndef _PriceFilterPrice_H_
#define _PriceFilterPrice_H_


#include <string>
#include "NonNullableCatalogsCurrency.h"
#include "NumericFilterOperatorType.h"
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

class PriceFilterPrice : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceFilterPrice();
	PriceFilterPrice(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceFilterPrice();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	NonNullableCatalogsCurrency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(NonNullableCatalogsCurrency  currency);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	NumericFilterOperatorType getROperator();

	/*! \brief Set 
	 */
	void setROperator(NumericFilterOperatorType  r_operator);
	/*! \brief Get 
	 */
	long long getValue();

	/*! \brief Set 
	 */
	void setValue(long long  value);

private:
	NonNullableCatalogsCurrency currency;
	bool negated;
	NumericFilterOperatorType r_operator;
	long long value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceFilterPrice_H_ */
