
/*
 * CatalogsHotelListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given hotel catalog_id and product group filter.
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelListProductsByCatalogBasedFilterRequest_H_
#define TINY_CPP_CLIENT_CatalogsHotelListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductGroupFilters.h"

namespace Tiny {


/*! \brief Request object to list products for a given hotel catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelListProductsByCatalogBasedFilterRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelListProductsByCatalogBasedFilterRequest();
    CatalogsHotelListProductsByCatalogBasedFilterRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelListProductsByCatalogBasedFilterRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog ID pertaining to the product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog ID pertaining to the product group.
	 */
	void setCatalogId(std::string catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsHotelProductGroupFilters filters);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    CatalogsHotelProductGroupFilters filters;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelListProductsByCatalogBasedFilterRequest_H_ */
