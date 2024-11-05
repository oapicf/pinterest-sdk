/*
 * DeleteAssetGroupBody.h
 *
 * Request body used to delete asset groups
 */

#ifndef _DeleteAssetGroupBody_H_
#define _DeleteAssetGroupBody_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request body used to delete asset groups
 *
 *  \ingroup Models
 *
 */

class DeleteAssetGroupBody : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteAssetGroupBody();
	DeleteAssetGroupBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteAssetGroupBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of ids of asset groups to be deleted
	 */
	std::list<std::string> getAssetGroupsToDelete();

	/*! \brief Set List of ids of asset groups to be deleted
	 */
	void setAssetGroupsToDelete(std::list <std::string> asset_groups_to_delete);

private:
	std::list <std::string>asset_groups_to_delete;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteAssetGroupBody_H_ */
