/*
 * AssetGroupDeletionDelete.h
 *
 * 
 */

#ifndef _AssetGroupDeletionDelete_H_
#define _AssetGroupDeletionDelete_H_


#include <string>
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

class AssetGroupDeletionDelete : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupDeletionDelete();
	AssetGroupDeletionDelete(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupDeletionDelete();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getAssetGroupsToDelete();

	/*! \brief Set 
	 */
	void setAssetGroupsToDelete(std::list <std::string> asset_groups_to_delete);

private:
	std::list <std::string>asset_groups_to_delete;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetGroupDeletionDelete_H_ */
