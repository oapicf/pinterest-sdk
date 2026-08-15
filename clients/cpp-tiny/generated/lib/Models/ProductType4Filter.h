
/*
 * ProductType4Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductType4Filter_H_
#define TINY_CPP_CLIENT_ProductType4Filter_H_


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

class ProductType4Filter{
public:

    /*! \brief Constructor.
	 */
    ProductType4Filter();
    ProductType4Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductType4Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_4);


    private:
    CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_4;
};
}

#endif /* TINY_CPP_CLIENT_ProductType4Filter_H_ */
