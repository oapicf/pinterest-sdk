/*
 * UpdateAssetGroupBody.h
 *
 * 
 */

#ifndef _UpdateAssetGroupBody_H_
#define _UpdateAssetGroupBody_H_


#include <string>
#include "UpdateAssetGroupBody_asset_groups_to_update_inner.h"
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

class UpdateAssetGroupBody : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateAssetGroupBody();
	UpdateAssetGroupBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateAssetGroupBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of asset groups and the data that will be used to update them.
	 */
	std::list<UpdateAssetGroupBody_asset_groups_to_update_inner> getAssetGroupsToUpdate();

	/*! \brief Set A list of asset groups and the data that will be used to update them.
	 */
	void setAssetGroupsToUpdate(std::list <UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update);

private:
	std::list <UpdateAssetGroupBody_asset_groups_to_update_inner>asset_groups_to_update;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateAssetGroupBody_H_ */
