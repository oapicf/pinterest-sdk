/*
 * AssetGroupInput.h
 *
 * 
 */

#ifndef _AssetGroupInput_H_
#define _AssetGroupInput_H_


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

class AssetGroupInput : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupInput();
	AssetGroupInput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupInput();

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

#endif /* _AssetGroupInput_H_ */
