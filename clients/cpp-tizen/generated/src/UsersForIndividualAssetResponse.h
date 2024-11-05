/*
 * UsersForIndividualAssetResponse.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef _UsersForIndividualAssetResponse_H_
#define _UsersForIndividualAssetResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object containing the permissions a business member has on the asset.
 *
 *  \ingroup Models
 *
 */

class UsersForIndividualAssetResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UsersForIndividualAssetResponse();
	UsersForIndividualAssetResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsersForIndividualAssetResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Unique identifier of the business member with asset access.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the business member with asset access.
	 */
	void setMemberId(std::string  member_id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);

private:
	std::string asset_id;
	std::string member_id;
	std::list <std::string>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsersForIndividualAssetResponse_H_ */
