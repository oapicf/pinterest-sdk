
/*
 * CatalogsHotelProductGroupFiltersAllOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupFiltersAllOf_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupFiltersAllOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductGroupFilterKeys.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupFiltersAllOf{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupFiltersAllOf();
    CatalogsHotelProductGroupFiltersAllOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupFiltersAllOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsHotelProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list<CatalogsHotelProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsHotelProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupFiltersAllOf_H_ */
