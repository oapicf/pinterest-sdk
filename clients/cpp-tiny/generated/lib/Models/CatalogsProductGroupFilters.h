
/*
 * CatalogsProductGroupFilters.h
 *
 * Object holding a group of filters for a catalog product group
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupFilters_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupFilters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilterKeys.h"
#include "CatalogsProductGroupFiltersAllOf.h"
#include "CatalogsProductGroupFiltersAnyOf.h"
#include <list>

namespace Tiny {


/*! \brief Object holding a group of filters for a catalog product group
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupFilters{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupFilters();
    CatalogsProductGroupFilters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupFilters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list<CatalogsProductGroupFilterKeys> any_of);
	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list<CatalogsProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsProductGroupFilterKeys> any_of;
    std::list<CatalogsProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupFilters_H_ */
