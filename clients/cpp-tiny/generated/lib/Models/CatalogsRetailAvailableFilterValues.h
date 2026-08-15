
/*
 * CatalogsRetailAvailableFilterValues.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailAvailableFilterValues_H_
#define TINY_CPP_CLIENT_CatalogsRetailAvailableFilterValues_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Catalogs_retail_filter_values_map.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailAvailableFilterValues{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailAvailableFilterValues();
    CatalogsRetailAvailableFilterValues(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailAvailableFilterValues();


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
	Catalogs_retail_filter_values_map getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(Catalogs_retail_filter_values_map  filter_values);


    private:
    std::string catalog_type{};
    Catalogs_retail_filter_values_map filter_values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailAvailableFilterValues_H_ */
