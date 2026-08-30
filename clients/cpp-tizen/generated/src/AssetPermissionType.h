/*
 * AssetPermissionType.h
 *
 * Permission aggregation type for asset access
 */

#ifndef _AssetPermissionType_H_
#define _AssetPermissionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Permission aggregation type for asset access
 *
 *  \ingroup Models
 *
 */

class AssetPermissionType : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetPermissionType();
	AssetPermissionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetPermissionType();

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

#endif /* _AssetPermissionType_H_ */
