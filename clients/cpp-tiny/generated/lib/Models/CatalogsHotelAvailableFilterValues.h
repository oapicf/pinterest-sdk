
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
#include "Catalogs_hotel_filter_values_map.h"

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
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	Catalogs_hotel_filter_values_map getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(Catalogs_hotel_filter_values_map  filter_values);


    private:
    std::string catalog_type{};
    Catalogs_hotel_filter_values_map filter_values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelAvailableFilterValues_H_ */
