/*
 * AssetGroupModification.h
 *
 * 
 */

#ifndef _AssetGroupModification_H_
#define _AssetGroupModification_H_


#include <string>
#include "AssetGroupBinding.h"
#include "AssetGroupUpdateError.h"
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

class AssetGroupModification : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupModification();
	AssetGroupModification(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupModification();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <AssetGroupUpdateError>exceptions;
	std::list <AssetGroupBinding>updated_asset_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetGroupModification_H_ */
