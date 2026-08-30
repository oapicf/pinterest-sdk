
/*
 * PriceFilterPrice.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PriceFilterPrice_H_
#define TINY_CPP_CLIENT_PriceFilterPrice_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NonNullableCatalogsCurrency.h"
#include "NumericFilterOperatorType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PriceFilterPrice{
public:

    /*! \brief Constructor.
	 */
    PriceFilterPrice();
    PriceFilterPrice(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceFilterPrice();


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
	void setCurrency(NonNullableCatalogsCurrency currency);
	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool negated);
	/*! \brief Get 
	 */
	NumericFilterOperatorType getROperator();

	/*! \brief Set 
	 */
	void setROperator(NumericFilterOperatorType r_operator);
	/*! \brief Get 
	 */
	long getValue();

	/*! \brief Set 
	 */
	void setValue(long value);


    private:
    NonNullableCatalogsCurrency currency;
    bool negated{};
    NumericFilterOperatorType r_operator;
    long value{};
};
}

#endif /* TINY_CPP_CLIENT_PriceFilterPrice_H_ */
