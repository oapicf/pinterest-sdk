/*
 * DeleteAssetGroupResponse.h
 *
 * 
 */

#ifndef _DeleteAssetGroupResponse_H_
#define _DeleteAssetGroupResponse_H_


#include <string>
#include "DeleteAssetGroupResponse_exceptions_inner.h"
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

class DeleteAssetGroupResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteAssetGroupResponse();
	DeleteAssetGroupResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteAssetGroupResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of ids of successfully deleted asset groups.
	 */
	std::list<std::string> getDeletedAssetGroups();

	/*! \brief Set A list of ids of successfully deleted asset groups.
	 */
	void setDeletedAssetGroups(std::list <std::string> deleted_asset_groups);
	/*! \brief Get A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	std::list<DeleteAssetGroupResponse_exceptions_inner> getExceptions();

	/*! \brief Set A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	void setExceptions(std::list <DeleteAssetGroupResponse_exceptions_inner> exceptions);

private:
	std::list <std::string>deleted_asset_groups;
	std::list <DeleteAssetGroupResponse_exceptions_inner>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteAssetGroupResponse_H_ */
