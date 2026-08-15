
/*
 * CatalogsHotelProductGroupCreateRequest.h
 *
 * Request object for creating a hotel product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductGroupFilters.h"

namespace Tiny {


/*! \brief Request object for creating a hotel product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupCreateRequest();
    CatalogsHotelProductGroupCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the hotel product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel product group.
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
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsHotelProductGroupFilters  filters);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::string description{};
    CatalogsHotelProductGroupFilters filters;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupCreateRequest_H_ */
