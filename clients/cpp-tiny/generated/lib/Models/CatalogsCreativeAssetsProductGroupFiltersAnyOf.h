
/*
 * CatalogsCreativeAssetsProductGroupFiltersAnyOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFiltersAnyOf_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFiltersAnyOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupFiltersAnyOf{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroupFiltersAnyOf();
    CatalogsCreativeAssetsProductGroupFiltersAnyOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroupFiltersAnyOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> any_of);


    private:
    std::list<CatalogsCreativeAssetsProductGroupFilterKeys> any_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFiltersAnyOf_H_ */
