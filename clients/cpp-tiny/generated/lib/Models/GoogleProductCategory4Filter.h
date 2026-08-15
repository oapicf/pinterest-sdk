
/*
 * GoogleProductCategory4Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GoogleProductCategory4Filter_H_
#define TINY_CPP_CLIENT_GoogleProductCategory4Filter_H_


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

class GoogleProductCategory4Filter{
public:

    /*! \brief Constructor.
	 */
    GoogleProductCategory4Filter();
    GoogleProductCategory4Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoogleProductCategory4Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4);


    private:
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4;
};
}

#endif /* TINY_CPP_CLIENT_GoogleProductCategory4Filter_H_ */
