
/*
 * CatalogsHotelProductGroupFiltersAnyOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupFiltersAnyOf_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupFiltersAnyOf_H_


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

class CatalogsHotelProductGroupFiltersAnyOf{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupFiltersAnyOf();
    CatalogsHotelProductGroupFiltersAnyOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupFiltersAnyOf();


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


    private:
    std::list<CatalogsHotelProductGroupFilterKeys> any_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupFiltersAnyOf_H_ */
