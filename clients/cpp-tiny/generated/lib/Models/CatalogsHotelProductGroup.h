
/*
 * CatalogsHotelProductGroup.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroup_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductGroupFilters.h"
#include "CatalogsHotelProductGroupType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroup{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroup();
    CatalogsHotelProductGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroup();


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
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int  created_at);
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
	/*! \brief Get ID of the hotel product group.
	 */
	std::string getId();

	/*! \brief Set ID of the hotel product group.
	 */
	void setId(std::string  id);
	/*! \brief Get Name of hotel product group
	 */
	std::string getName();

	/*! \brief Set Name of hotel product group
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupType getType();

	/*! \brief Set 
	 */
	void setType(CatalogsHotelProductGroupType  type);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getUpdatedAt();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setUpdatedAt(int  updated_at);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    int created_at{};
    std::string description{};
    CatalogsHotelProductGroupFilters filters;
    std::string id{};
    std::string name{};
    CatalogsHotelProductGroupType type;
    int updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroup_H_ */
