/*
 * UpdateAssetGroupResponse.h
 *
 * 
 */

#ifndef _UpdateAssetGroupResponse_H_
#define _UpdateAssetGroupResponse_H_


#include <string>
#include "AssetGroupBinding.h"
#include "UpdateAssetGroupResponse_exceptions_inner.h"
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

class UpdateAssetGroupResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateAssetGroupResponse();
	UpdateAssetGroupResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateAssetGroupResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of successfully edited asset groups.
	 */
	std::list<AssetGroupBinding> getUpdatedAssetGroups();

	/*! \brief Set A list of successfully edited asset groups.
	 */
	void setUpdatedAssetGroups(std::list <AssetGroupBinding> updated_asset_groups);
	/*! \brief Get A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	std::list<UpdateAssetGroupResponse_exceptions_inner> getExceptions();

	/*! \brief Set A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	void setExceptions(std::list <UpdateAssetGroupResponse_exceptions_inner> exceptions);

private:
	std::list <AssetGroupBinding>updated_asset_groups;
	std::list <UpdateAssetGroupResponse_exceptions_inner>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateAssetGroupResponse_H_ */
