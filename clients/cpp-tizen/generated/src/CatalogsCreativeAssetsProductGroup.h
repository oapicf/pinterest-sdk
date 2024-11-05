/*
 * CatalogsCreativeAssetsProductGroup.h
 *
 * 
 */

#ifndef _CatalogsCreativeAssetsProductGroup_H_
#define _CatalogsCreativeAssetsProductGroup_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
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

class CatalogsCreativeAssetsProductGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroup();
	CatalogsCreativeAssetsProductGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get ID of the creative assets product group.
	 */
	std::string getId();

	/*! \brief Set ID of the creative assets product group.
	 */
	void setId(std::string  id);
	/*! \brief Get Name of creative assets product group
	 */
	std::string getName();

	/*! \brief Set Name of creative assets product group
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getUpdatedAt();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setUpdatedAt(int  updated_at);
	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	std::string id;
	std::string name;
	std::string description;
	CatalogsCreativeAssetsProductGroupFilters filters;
	int created_at;
	int updated_at;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroup_H_ */
