/*
 * CatalogsHotelProductGroup.h
 *
 * 
 */

#ifndef _CatalogsHotelProductGroup_H_
#define _CatalogsHotelProductGroup_H_


#include <string>
#include "CatalogsHotelProductGroupFilters.h"
#include "CatalogsHotelProductGroupType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroup();
	CatalogsHotelProductGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string catalog_id;
	std::string catalog_type;
	int created_at;
	std::string description;
	CatalogsHotelProductGroupFilters filters;
	std::string id;
	std::string name;
	CatalogsHotelProductGroupType type;
	int updated_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroup_H_ */
