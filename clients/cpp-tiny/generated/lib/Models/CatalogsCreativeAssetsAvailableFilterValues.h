
/*
 * CatalogsCreativeAssetsAvailableFilterValues.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsAvailableFilterValues_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsAvailableFilterValues_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsFilterValuesMap.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsAvailableFilterValues{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsAvailableFilterValues();
    CatalogsCreativeAssetsAvailableFilterValues(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsAvailableFilterValues();


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

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsAvailableFilterValues_H_ */
