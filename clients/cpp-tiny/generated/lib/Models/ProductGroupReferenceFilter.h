
/*
 * ProductGroupReferenceFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductGroupReferenceFilter_H_
#define TINY_CPP_CLIENT_ProductGroupReferenceFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupReferenceFilter{
public:

    /*! \brief Constructor.
	 */
    ProductGroupReferenceFilter();
    ProductGroupReferenceFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupReferenceFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP();

	/*! \brief Set 
	 */
	void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria  pRODUCT_GROUP);


    private:
    CatalogsProductGroupMultipleStringCriteria pRODUCT_GROUP;
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupReferenceFilter_H_ */
