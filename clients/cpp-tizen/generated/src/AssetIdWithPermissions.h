/*
 * AssetIdWithPermissions.h
 *
 * Asset ID with permission levels.
 */

#ifndef _AssetIdWithPermissions_H_
#define _AssetIdWithPermissions_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Asset ID with permission levels.
 *
 *  \ingroup Models
 *
 */

class AssetIdWithPermissions : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetIdWithPermissions();
	AssetIdWithPermissions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetIdWithPermissions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setId(std::string  id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);

private:
	std::string id;
	std::list <std::string>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetIdWithPermissions_H_ */
