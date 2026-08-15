
/*
 * CatalogsHotelProductGroupUpdateRequest.h
 *
 * Request object for updating a hotel product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupUpdateRequest_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductGroupFilters.h"

namespace Tiny {


/*! \brief Request object for updating a hotel product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupUpdateRequest();
    CatalogsHotelProductGroupUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupUpdateRequest();


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
    std::string catalog_type{};
    std::string description{};
    CatalogsHotelProductGroupFilters filters;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupUpdateRequest_H_ */
