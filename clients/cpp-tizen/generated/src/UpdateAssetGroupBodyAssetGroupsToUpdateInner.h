/*
 * UpdateAssetGroupBody_asset_groups_to_update_inner.h
 *
 * 
 */

#ifndef _UpdateAssetGroupBody_asset_groups_to_update_inner_H_
#define _UpdateAssetGroupBody_asset_groups_to_update_inner_H_


#include <string>
#include "AssetGroupType.h"
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

class UpdateAssetGroupBody_asset_groups_to_update_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateAssetGroupBody_asset_groups_to_update_inner();
	UpdateAssetGroupBody_asset_groups_to_update_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateAssetGroupBody_asset_groups_to_update_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the asset group to update.
	 */
	std::string getAssetGroupId();

	/*! \brief Set Unique identifier of the asset group to update.
	 */
	void setAssetGroupId(std::string  asset_group_id);
	/*! \brief Get Asset Group name
	 */
	std::string getName();

	/*! \brief Set Asset Group name
	 */
	void setName(std::string  name);
	/*! \brief Get Asset group description
	 */
	std::string getDescription();

	/*! \brief Set Asset group description
	 */
	void setDescription(std::string  description);
	/*! \brief Get Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	 */
	std::list<AssetGroupType> getAssetGroupTypes();

	/*! \brief Set Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	 */
	void setAssetGroupTypes(std::list <AssetGroupType> asset_group_types);
	/*! \brief Get A list of asset ids to add to the asset group.
	 */
	std::list<std::string> getAssetsToAdd();

	/*! \brief Set A list of asset ids to add to the asset group.
	 */
	void setAssetsToAdd(std::list <std::string> assets_to_add);
	/*! \brief Get A list of asset ids to remove from the asset group.
	 */
	std::list<std::string> getAssetsToRemove();

	/*! \brief Set A list of asset ids to remove from the asset group.
	 */
	void setAssetsToRemove(std::list <std::string> assets_to_remove);

private:
	std::string asset_group_id;
	std::string name;
	std::string description;
	std::list <AssetGroupType>asset_group_types;
	std::list <std::string>assets_to_add;
	std::list <std::string>assets_to_remove;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateAssetGroupBody_asset_groups_to_update_inner_H_ */
