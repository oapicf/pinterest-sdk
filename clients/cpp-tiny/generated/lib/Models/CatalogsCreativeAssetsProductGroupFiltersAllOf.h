
/*
 * CatalogsCreativeAssetsProductGroupFiltersAllOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFiltersAllOf_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFiltersAllOf_H_


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

class CatalogsCreativeAssetsProductGroupFiltersAllOf{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroupFiltersAllOf();
    CatalogsCreativeAssetsProductGroupFiltersAllOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroupFiltersAllOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsCreativeAssetsProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFiltersAllOf_H_ */
