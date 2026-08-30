/*
 * AssetGroupModificationReadOrUpdate.h
 *
 * 
 */

#ifndef _AssetGroupModificationReadOrUpdate_H_
#define _AssetGroupModificationReadOrUpdate_H_


#include <string>
#include "AssetGroupBinding.h"
#include "AssetGroupUpdateError.h"
#include "AssetGroupUpdateItemReadOrUpdateItem.h"
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

class AssetGroupModificationReadOrUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupModificationReadOrUpdate();
	AssetGroupModificationReadOrUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupModificationReadOrUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of asset groups and the data that will be used to update them.
	 */
	std::list<AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate();

	/*! \brief Set A list of asset groups and the data that will be used to update them.
	 */
	void setAssetGroupsToUpdate(std::list <AssetGroupUpdateItemReadOrUpdateItem> asset_groups_to_update);
	/*! \brief Get A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	std::list<AssetGroupUpdateError> getExceptions();

	/*! \brief Set A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	void setExceptions(std::list <AssetGroupUpdateError> exceptions);
	/*! \brief Get A list of successfully edited asset groups.
	 */
	std::list<AssetGroupBinding> getUpdatedAssetGroups();

	/*! \brief Set A list of successfully edited asset groups.
	 */
	void setUpdatedAssetGroups(std::list <AssetGroupBinding> updated_asset_groups);

private:
	std::list <AssetGroupUpdateItemReadOrUpdateItem>asset_groups_to_update;
	std::list <AssetGroupUpdateError>exceptions;
	std::list <AssetGroupBinding>updated_asset_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetGroupModificationReadOrUpdate_H_ */
