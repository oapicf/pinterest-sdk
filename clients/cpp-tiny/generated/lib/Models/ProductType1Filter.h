
/*
 * ProductType1Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductType1Filter_H_
#define TINY_CPP_CLIENT_ProductType1Filter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleStringListCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductType1Filter{
public:

    /*! \brief Constructor.
	 */
    ProductType1Filter();
    ProductType1Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductType1Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_1);


    private:
    CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_1;
};
}

#endif /* TINY_CPP_CLIENT_ProductType1Filter_H_ */
