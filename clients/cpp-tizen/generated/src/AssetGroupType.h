/*
 * AssetGroupType.h
 *
 * Asset group type
 */

#ifndef _AssetGroupType_H_
#define _AssetGroupType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Asset group type
 *
 *  \ingroup Models
 *
 */

class AssetGroupType : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupType();
	AssetGroupType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupType();

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

#endif /* _AssetGroupType_H_ */
