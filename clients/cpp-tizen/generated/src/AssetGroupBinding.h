/*
 * AssetGroupBinding.h
 *
 * 
 */

#ifndef _AssetGroupBinding_H_
#define _AssetGroupBinding_H_


#include <string>
#include "BusinessAccessUserSummary.h"
#include <list>
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

class AssetGroupBinding : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupBinding();
	AssetGroupBinding(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupBinding();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of ad account IDs under the asset group
	 */
	std::list<std::string> getAdAccountsIds();

	/*! \brief Set A list of ad account IDs under the asset group
	 */
	void setAdAccountsIds(std::list <std::string> ad_accounts_ids);
	/*! \brief Get Asset group description
	 */
	std::string getAssetGroupDescription();

	/*! \brief Set Asset group description
	 */
	void setAssetGroupDescription(std::string  asset_group_description);
	/*! \brief Get Asset Group name
	 */
	std::string getAssetGroupName();

	/*! \brief Set Asset Group name
	 */
	void setAssetGroupName(std::string  asset_group_name);
	/*! \brief Get Asset group types
	 */
	std::list<std::string> getAssetGroupTypes();

	/*! \brief Set Asset group types
	 */
	void setAssetGroupTypes(std::list <std::string> asset_group_types);
	/*! \brief Get A list of catalog IDs under asset group
	 */
	std::list<std::string> getCatalogsIds();

	/*! \brief Set A list of catalog IDs under asset group
	 */
	void setCatalogsIds(std::list <std::string> catalogs_ids);
	/*! \brief Get The data of the user that created the asset group.
	 */
	BusinessAccessUserSummary getCreatedBy();

	/*! \brief Set The data of the user that created the asset group.
	 */
	void setCreatedBy(BusinessAccessUserSummary  created_by);
	/*! \brief Get The creation time of the asset group
	 */
	int getCreatedTime();

	/*! \brief Set The creation time of the asset group
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Asset Group ID.
	 */
	std::string getId();

	/*! \brief Set Asset Group ID.
	 */
	void setId(std::string  id);
	/*! \brief Get The data of the business that owns the asset group.
	 */
	BusinessAccessUserSummary getOwner();

	/*! \brief Set The data of the business that owns the asset group.
	 */
	void setOwner(BusinessAccessUserSummary  owner);
	/*! \brief Get A list of profile IDs under asset group
	 */
	std::list<std::string> getProfilesIds();

	/*! \brief Set A list of profile IDs under asset group
	 */
	void setProfilesIds(std::list <std::string> profiles_ids);
	/*! \brief Get The last update time of the asset group
	 */
	int getUpdatedTime();

	/*! \brief Set The last update time of the asset group
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::list <std::string>ad_accounts_ids;
	std::string asset_group_description;
	std::string asset_group_name;
	std::list <std::string>asset_group_types;
	std::list <std::string>catalogs_ids;
	BusinessAccessUserSummary created_by;
	int created_time;
	std::string id;
	BusinessAccessUserSummary owner;
	std::list <std::string>profiles_ids;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetGroupBinding_H_ */
