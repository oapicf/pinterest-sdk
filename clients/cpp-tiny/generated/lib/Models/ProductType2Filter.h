
/*
 * ProductType2Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductType2Filter_H_
#define TINY_CPP_CLIENT_ProductType2Filter_H_


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

class ProductType2Filter{
public:

    /*! \brief Constructor.
	 */
    ProductType2Filter();
    ProductType2Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductType2Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_2);


    private:
    CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_2;
};
}

#endif /* TINY_CPP_CLIENT_ProductType2Filter_H_ */
