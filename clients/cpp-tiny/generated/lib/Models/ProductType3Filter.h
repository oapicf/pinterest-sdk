
/*
 * ProductType3Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductType3Filter_H_
#define TINY_CPP_CLIENT_ProductType3Filter_H_


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

class ProductType3Filter{
public:

    /*! \brief Constructor.
	 */
    ProductType3Filter();
    ProductType3Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductType3Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_3);


    private:
    CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_3;
};
}

#endif /* TINY_CPP_CLIENT_ProductType3Filter_H_ */
