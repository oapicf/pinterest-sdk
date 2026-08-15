
/*
 * GoogleProductCategory1Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GoogleProductCategory1Filter_H_
#define TINY_CPP_CLIENT_GoogleProductCategory1Filter_H_


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

class GoogleProductCategory1Filter{
public:

    /*! \brief Constructor.
	 */
    GoogleProductCategory1Filter();
    GoogleProductCategory1Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoogleProductCategory1Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1);


    private:
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1;
};
}

#endif /* TINY_CPP_CLIENT_GoogleProductCategory1Filter_H_ */
