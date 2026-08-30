
/*
 * GoogleProductCategory5Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GoogleProductCategory5Filter_H_
#define TINY_CPP_CLIENT_GoogleProductCategory5Filter_H_


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

class GoogleProductCategory5Filter{
public:

    /*! \brief Constructor.
	 */
    GoogleProductCategory5Filter();
    GoogleProductCategory5Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoogleProductCategory5Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5);


    private:
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5;
};
}

#endif /* TINY_CPP_CLIENT_GoogleProductCategory5Filter_H_ */
