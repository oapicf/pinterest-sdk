
/*
 * CatalogsAvailableFilterValues.h
 *
 * Object holding available filter values for each filter key
 */

#ifndef TINY_CPP_CLIENT_CatalogsAvailableFilterValues_H_
#define TINY_CPP_CLIENT_CatalogsAvailableFilterValues_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsAvailableFilterValues.h"
#include "CatalogsCreativeAssetsFilterValuesMap.h"
#include "CatalogsHotelAvailableFilterValues.h"
#include "CatalogsRetailAvailableFilterValues.h"

namespace Tiny {


/*! \brief Object holding available filter values for each filter key
 *
 *  \ingroup Models
 *
 */

class CatalogsAvailableFilterValues{
public:

    /*! \brief Constructor.
	 */
    CatalogsAvailableFilterValues();
    CatalogsAvailableFilterValues(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsAvailableFilterValues();


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
	CatalogsCreativeAssetsFilterValuesMap getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(CatalogsCreativeAssetsFilterValuesMap filter_values);


    private:
    std::string catalog_type{};
    CatalogsCreativeAssetsFilterValuesMap filter_values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsAvailableFilterValues_H_ */
