
/*
 * MinPriceFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MinPriceFilter_H_
#define TINY_CPP_CLIENT_MinPriceFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupPricingCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MinPriceFilter{
public:

    /*! \brief Constructor.
	 */
    MinPriceFilter();
    MinPriceFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MinPriceFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupPricingCriteria getMINPRICE();

	/*! \brief Set 
	 */
	void setMINPRICE(CatalogsProductGroupPricingCriteria mIN_PRICE);


    private:
    CatalogsProductGroupPricingCriteria mIN_PRICE;
};
}

#endif /* TINY_CPP_CLIENT_MinPriceFilter_H_ */
