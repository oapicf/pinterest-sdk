
/*
 * CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupMultiplePinterestProductCategoryCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupMultiplePinterestProductCategoryCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductCategoryEnum.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupMultiplePinterestProductCategoryCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupMultiplePinterestProductCategoryCriteria();
    CatalogsProductGroupMultiplePinterestProductCategoryCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupMultiplePinterestProductCategoryCriteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool negated);
	/*! \brief Get 
	 */
	std::list<ProductCategoryEnum> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list<ProductCategoryEnum> values);


    private:
    bool negated{};
    std::list<ProductCategoryEnum> values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupMultiplePinterestProductCategoryCriteria_H_ */
