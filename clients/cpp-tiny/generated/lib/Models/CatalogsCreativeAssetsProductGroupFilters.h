
/*
 * CatalogsCreativeAssetsProductGroupFilters.h
 *
 * Object holding a group of filters for a creative assets product group
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFilters_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFilters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"
#include "CatalogsCreativeAssetsProductGroupFiltersAllOf.h"
#include "CatalogsCreativeAssetsProductGroupFiltersAnyOf.h"
#include <list>

namespace Tiny {


/*! \brief Object holding a group of filters for a creative assets product group
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupFilters{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroupFilters();
    CatalogsCreativeAssetsProductGroupFilters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroupFilters();


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
	/*! \brief Get 
	 */
	std::list<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsCreativeAssetsProductGroupFilterKeys> any_of;
    std::list<CatalogsCreativeAssetsProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupFilters_H_ */
