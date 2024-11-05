/*
 * UpdateMemberAssetAccessBody_accesses_inner.h
 *
 * 
 */

#ifndef _UpdateMemberAssetAccessBody_accesses_inner_H_
#define _UpdateMemberAssetAccessBody_accesses_inner_H_


#include <string>
#include "Permissions.h"
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

class UpdateMemberAssetAccessBody_accesses_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberAssetAccessBody_accesses_inner();
	UpdateMemberAssetAccessBody_accesses_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberAssetAccessBody_accesses_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Id of the asset to update.
	 */
	std::string getAssetId();

	/*! \brief Set Id of the asset to update.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Unique identifier of the member on which to perform the update
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member on which to perform the update
	 */
	void setMemberId(std::string  member_id);
	/*! \brief Get A non-empty array of permissions to assign to the member.
	 */
	std::list<Permissions> getPermissions();

	/*! \brief Set A non-empty array of permissions to assign to the member.
	 */
	void setPermissions(std::list <Permissions> permissions);

private:
	std::string asset_id;
	std::string member_id;
	std::list <Permissions>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberAssetAccessBody_accesses_inner_H_ */
