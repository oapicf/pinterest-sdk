
/*
 * ProductType0Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductType0Filter_H_
#define TINY_CPP_CLIENT_ProductType0Filter_H_


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

class ProductType0Filter{
public:

    /*! \brief Constructor.
	 */
    ProductType0Filter();
    ProductType0Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductType0Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_0);


    private:
    CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_0;
};
}

#endif /* TINY_CPP_CLIENT_ProductType0Filter_H_ */
