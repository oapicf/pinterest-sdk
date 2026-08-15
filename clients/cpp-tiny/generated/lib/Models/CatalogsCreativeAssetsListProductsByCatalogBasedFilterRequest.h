
/*
 * CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given creative assets catalog_id and product group filter.
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"

namespace Tiny {


/*! \brief Request object to list products for a given creative assets catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest();
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    CatalogsCreativeAssetsProductGroupFilters filters;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_H_ */
