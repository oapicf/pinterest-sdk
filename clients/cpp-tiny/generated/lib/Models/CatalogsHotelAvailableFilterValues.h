
/*
 * CatalogsHotelAvailableFilterValues.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelAvailableFilterValues_H_
#define TINY_CPP_CLIENT_CatalogsHotelAvailableFilterValues_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelFilterValuesMap.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelAvailableFilterValues{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelAvailableFilterValues();
    CatalogsHotelAvailableFilterValues(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelAvailableFilterValues();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelFilterValuesMap getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(CatalogsHotelFilterValuesMap filter_values);


    private:
    std::string catalog_type{};
    CatalogsHotelFilterValuesMap filter_values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelAvailableFilterValues_H_ */
