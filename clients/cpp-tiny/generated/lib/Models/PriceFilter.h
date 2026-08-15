
/*
 * PriceFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PriceFilter_H_
#define TINY_CPP_CLIENT_PriceFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Catalogs_product_group_pricing_currency_criteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PriceFilter{
public:

    /*! \brief Constructor.
	 */
    PriceFilter();
    PriceFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Catalogs_product_group_pricing_currency_criteria getPRICE();

	/*! \brief Set 
	 */
	void setPRICE(Catalogs_product_group_pricing_currency_criteria  pRICE);


    private:
    Catalogs_product_group_pricing_currency_criteria pRICE;
};
}

#endif /* TINY_CPP_CLIENT_PriceFilter_H_ */
