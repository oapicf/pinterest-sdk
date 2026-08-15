
/*
 * CatalogsHotelItemsFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelItemsFilter_H_
#define TINY_CPP_CLIENT_CatalogsHotelItemsFilter_H_


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

class CatalogsHotelItemsFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelItemsFilter();
    CatalogsHotelItemsFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelItemsFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
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
	std::list<std::string> getHotelIds();

	/*! \brief Set 
	 */
	void setHotelIds(std::list <std::string> hotel_ids);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::list<std::string> hotel_ids;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelItemsFilter_H_ */
