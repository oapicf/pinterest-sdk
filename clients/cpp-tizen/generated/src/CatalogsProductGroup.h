/*
 * CatalogsProductGroup.h
 *
 * catalog product group entity
 */

#ifndef _CatalogsProductGroup_H_
#define _CatalogsProductGroup_H_


#include <string>
#include "CatalogsProductGroupFilters.h"
#include "CatalogsProductGroupStatus.h"
#include "CatalogsProductGroupType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief catalog product group entity
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroup();
	CatalogsProductGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the catalog product group.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog product group.
	 */
	void setId(std::string  id);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
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
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters  filters);
	/*! \brief Get 
	 */
	CatalogsProductGroupType getType();

	/*! \brief Set 
	 */
	void setType(CatalogsProductGroupType  type);
	/*! \brief Get 
	 */
	CatalogsProductGroupStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsProductGroupStatus  status);
	/*! \brief Get id of the catalogs feed belonging to this catalog product group
	 */
	std::string getFeedId();

	/*! \brief Set id of the catalogs feed belonging to this catalog product group
	 */
	void setFeedId(std::string  feed_id);
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

private:
	std::string id;
	std::string name;
	std::string description;
	CatalogsProductGroupFilters filters;
	CatalogsProductGroupType type;
	CatalogsProductGroupStatus status;
	std::string feed_id;
	int created_at;
	int updated_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroup_H_ */
