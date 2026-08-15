
/*
 * Catalogs_product_group_pricing_currency_criteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Catalogs_product_group_pricing_currency_criteria_H_
#define TINY_CPP_CLIENT_Catalogs_product_group_pricing_currency_criteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NonNullableCatalogsCurrency.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_product_group_pricing_currency_criteria{
public:

    /*! \brief Constructor.
	 */
    Catalogs_product_group_pricing_currency_criteria();
    Catalogs_product_group_pricing_currency_criteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalogs_product_group_pricing_currency_criteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	NonNullableCatalogsCurrency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(NonNullableCatalogsCurrency  currency);
	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	std::string getROperator();

	/*! \brief Set 
	 */
	void setROperator(std::string  r_operator);
	/*! \brief Get 
	 */
	long getValue();

	/*! \brief Set 
	 */
	void setValue(long  value);


    private:
    NonNullableCatalogsCurrency currency;
    bool negated{};
    std::string r_operator{};
    long value{};
};
}

#endif /* TINY_CPP_CLIENT_Catalogs_product_group_pricing_currency_criteria_H_ */
