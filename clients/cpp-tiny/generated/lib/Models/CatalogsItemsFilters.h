
/*
 * CatalogsItemsFilters.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsFilters_H_
#define TINY_CPP_CLIENT_CatalogsItemsFilters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsItemsFilter.h"
#include "CatalogsHotelItemsFilter.h"
#include "CatalogsRetailItemsFilter.h"
#include "CatalogsType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsFilters{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsFilters();
    CatalogsItemsFilters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsFilters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::list<std::string> getItemIds();

	/*! \brief Set 
	 */
	void setItemIds(std::list <std::string> item_ids);
	/*! \brief Get 
	 */
	std::list<std::string> getHotelIds();

	/*! \brief Set 
	 */
	void setHotelIds(std::list <std::string> hotel_ids);
	/*! \brief Get 
	 */
	std::list<std::string> getCreativeAssetsIds();

	/*! \brief Set 
	 */
	void setCreativeAssetsIds(std::list <std::string> creative_assets_ids);


    private:
    CatalogsType catalog_type;
    std::string catalog_id{};
    std::list<std::string> item_ids;
    std::list<std::string> hotel_ids;
    std::list<std::string> creative_assets_ids;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsFilters_H_ */
