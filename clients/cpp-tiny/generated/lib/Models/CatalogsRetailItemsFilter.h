
/*
 * CatalogsRetailItemsFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailItemsFilter_H_
#define TINY_CPP_CLIENT_CatalogsRetailItemsFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailItemsFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailItemsFilter();
    CatalogsRetailItemsFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailItemsFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
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
	std::list<std::string> getItemIds();

	/*! \brief Set 
	 */
	void setItemIds(std::list <std::string> item_ids);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::list<std::string> item_ids;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailItemsFilter_H_ */
