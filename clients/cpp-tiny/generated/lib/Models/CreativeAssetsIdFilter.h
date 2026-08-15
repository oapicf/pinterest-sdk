
/*
 * CreativeAssetsIdFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreativeAssetsIdFilter_H_
#define TINY_CPP_CLIENT_CreativeAssetsIdFilter_H_


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

class CreativeAssetsIdFilter{
public:

    /*! \brief Constructor.
	 */
    CreativeAssetsIdFilter();
    CreativeAssetsIdFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreativeAssetsIdFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID();

	/*! \brief Set 
	 */
	void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID);


    private:
    CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID;
};
}

#endif /* TINY_CPP_CLIENT_CreativeAssetsIdFilter_H_ */
