
/*
 * PinterestProductCategoriesFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PinterestProductCategoriesFilter_H_
#define TINY_CPP_CLIENT_PinterestProductCategoriesFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PinterestProductCategoriesFilter{
public:

    /*! \brief Constructor.
	 */
    PinterestProductCategoriesFilter();
    PinterestProductCategoriesFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinterestProductCategoriesFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES();

	/*! \brief Set 
	 */
	void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria pINTEREST_PRODUCT_CATEGORIES);


    private:
    CatalogsProductGroupMultiplePinterestProductCategoryCriteria pINTEREST_PRODUCT_CATEGORIES;
};
}

#endif /* TINY_CPP_CLIENT_PinterestProductCategoriesFilter_H_ */
