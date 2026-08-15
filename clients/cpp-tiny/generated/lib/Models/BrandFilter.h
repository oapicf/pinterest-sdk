
/*
 * BrandFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BrandFilter_H_
#define TINY_CPP_CLIENT_BrandFilter_H_


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

class BrandFilter{
public:

    /*! \brief Constructor.
	 */
    BrandFilter();
    BrandFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BrandFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getBRAND();

	/*! \brief Set 
	 */
	void setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND);


    private:
    CatalogsProductGroupMultipleStringCriteria bRAND;
};
}

#endif /* TINY_CPP_CLIENT_BrandFilter_H_ */
