
/*
 * GoogleProductCategory2Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GoogleProductCategory2Filter_H_
#define TINY_CPP_CLIENT_GoogleProductCategory2Filter_H_


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

class GoogleProductCategory2Filter{
public:

    /*! \brief Constructor.
	 */
    GoogleProductCategory2Filter();
    GoogleProductCategory2Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoogleProductCategory2Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2);


    private:
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2;
};
}

#endif /* TINY_CPP_CLIENT_GoogleProductCategory2Filter_H_ */
