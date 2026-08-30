/*
 * AssetGroupDeletion.h
 *
 * 
 */

#ifndef _AssetGroupDeletion_H_
#define _AssetGroupDeletion_H_


#include <string>
#include "AssetGroupDeleteError.h"
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

class AssetGroupDeletion : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupDeletion();
	AssetGroupDeletion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupDeletion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getDeletedAssetGroups();

	/*! \brief Set 
	 */
	void setDeletedAssetGroups(std::list <std::string> deleted_asset_groups);
	/*! \brief Get 
	 */
	std::list<AssetGroupDeleteError> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <AssetGroupDeleteError> exceptions);

private:
	std::list <std::string>deleted_asset_groups;
	std::list <AssetGroupDeleteError>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetGroupDeletion_H_ */
