
/*
 * GoogleProductCategory0Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GoogleProductCategory0Filter_H_
#define TINY_CPP_CLIENT_GoogleProductCategory0Filter_H_


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

class GoogleProductCategory0Filter{
public:

    /*! \brief Constructor.
	 */
    GoogleProductCategory0Filter();
    GoogleProductCategory0Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoogleProductCategory0Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0);


    private:
    CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0;
};
}

#endif /* TINY_CPP_CLIENT_GoogleProductCategory0Filter_H_ */
