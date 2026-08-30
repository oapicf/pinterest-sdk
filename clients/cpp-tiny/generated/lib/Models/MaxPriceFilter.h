
/*
 * MaxPriceFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MaxPriceFilter_H_
#define TINY_CPP_CLIENT_MaxPriceFilter_H_


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

class MaxPriceFilter{
public:

    /*! \brief Constructor.
	 */
    MaxPriceFilter();
    MaxPriceFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MaxPriceFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupPricingCriteria getMAXPRICE();

	/*! \brief Set 
	 */
	void setMAXPRICE(CatalogsProductGroupPricingCriteria mAX_PRICE);


    private:
    CatalogsProductGroupPricingCriteria mAX_PRICE;
};
}

#endif /* TINY_CPP_CLIENT_MaxPriceFilter_H_ */
