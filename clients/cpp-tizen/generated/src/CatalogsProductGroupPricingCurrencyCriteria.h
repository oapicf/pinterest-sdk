/*
 * Catalogs_product_group_pricing_currency_criteria.h
 *
 * 
 */

#ifndef _Catalogs_product_group_pricing_currency_criteria_H_
#define _Catalogs_product_group_pricing_currency_criteria_H_


#include <string>
#include "NonNullableCatalogsCurrency.h"
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

class Catalogs_product_group_pricing_currency_criteria : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalogs_product_group_pricing_currency_criteria();
	Catalogs_product_group_pricing_currency_criteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalogs_product_group_pricing_currency_criteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getROperator();

	/*! \brief Set 
	 */
	void setROperator(std::string  r_operator);
	/*! \brief Get 
	 */
	long long getValue();

	/*! \brief Set 
	 */
	void setValue(long long  value);
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

private:
	std::string r_operator;
	long long value;
	NonNullableCatalogsCurrency currency;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalogs_product_group_pricing_currency_criteria_H_ */
