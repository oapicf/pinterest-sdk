
/*
 * CatalogsHotelProductGroupFilters.h
 *
 * Object holding a group of filters for a hotel product group
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupFilters_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupFilters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductGroupFilterKeys.h"
#include "CatalogsHotelProductGroupFiltersAllOf.h"
#include "CatalogsHotelProductGroupFiltersAnyOf.h"
#include <list>

namespace Tiny {


/*! \brief Object holding a group of filters for a hotel product group
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupFilters{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupFilters();
    CatalogsHotelProductGroupFilters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupFilters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsHotelProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsHotelProductGroupFilterKeys> any_of);
	/*! \brief Get 
	 */
	std::list<CatalogsHotelProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsHotelProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsHotelProductGroupFilterKeys> any_of;
    std::list<CatalogsHotelProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupFilters_H_ */
