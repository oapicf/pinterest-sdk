/*
 * CreateAssetGroupResponse.h
 *
 * 
 */

#ifndef _CreateAssetGroupResponse_H_
#define _CreateAssetGroupResponse_H_


#include <string>
#include "AssetGroupBinding.h"
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

class CreateAssetGroupResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetGroupResponse();
	CreateAssetGroupResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetGroupResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AssetGroupBinding getAssetGroup();

	/*! \brief Set 
	 */
	void setAssetGroup(AssetGroupBinding  asset_group);

private:
	AssetGroupBinding asset_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetGroupResponse_H_ */
