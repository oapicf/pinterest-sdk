/*
 * AssetTypeResponse.h
 *
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 */

#ifndef _AssetTypeResponse_H_
#define _AssetTypeResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 *
 *  \ingroup Models
 *
 */

class AssetTypeResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetTypeResponse();
	AssetTypeResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetTypeResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetTypeResponse_H_ */
