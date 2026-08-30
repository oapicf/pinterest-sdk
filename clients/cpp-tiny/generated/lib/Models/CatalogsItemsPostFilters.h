
/*
 * CatalogsItemsPostFilters.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsPostFilters_H_
#define TINY_CPP_CLIENT_CatalogsItemsPostFilters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsItemsPostFilter.h"
#include "CatalogsHotelItemsPostFilter.h"
#include "CatalogsRetailItemsPostFilter.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsPostFilters{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsPostFilters();
    CatalogsItemsPostFilters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsPostFilters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
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
	std::list<std::string> getItemIds();

	/*! \brief Set 
	 */
	void setItemIds(std::list<std::string> item_ids);
	/*! \brief Get 
	 */
	std::list<std::string> getHotelIds();

	/*! \brief Set 
	 */
	void setHotelIds(std::list<std::string> hotel_ids);
	/*! \brief Get 
	 */
	std::list<std::string> getCreativeAssetsIds();

	/*! \brief Set 
	 */
	void setCreativeAssetsIds(std::list<std::string> creative_assets_ids);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::list<std::string> item_ids;
    std::list<std::string> hotel_ids;
    std::list<std::string> creative_assets_ids;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsPostFilters_H_ */
