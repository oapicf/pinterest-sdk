
/*
 * GoogleProductCategory6Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GoogleProductCategory6Filter_H_
#define TINY_CPP_CLIENT_GoogleProductCategory6Filter_H_


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

class GoogleProductCategory6Filter{
public:

    /*! \brief Constructor.
	 */
    GoogleProductCategory6Filter();
    GoogleProductCategory6Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoogleProductCategory6Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6);


    private:
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6;
};
}

#endif /* TINY_CPP_CLIENT_GoogleProductCategory6Filter_H_ */
