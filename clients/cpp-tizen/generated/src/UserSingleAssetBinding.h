/*
 * UserSingleAssetBinding.h
 *
 * An object containing the permissions a business member/partner has on the asset.
 */

#ifndef _UserSingleAssetBinding_H_
#define _UserSingleAssetBinding_H_


#include <string>
#include "BusinessAccessUserSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object containing the permissions a business member/partner has on the asset.
 *
 *  \ingroup Models
 *
 */

class UserSingleAssetBinding : public Object {
public:
	/*! \brief Constructor.
	 */
	UserSingleAssetBinding();
	UserSingleAssetBinding(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserSingleAssetBinding();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);
	/*! \brief Get 
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set 
	 */
	void setUser(BusinessAccessUserSummary  user);

private:
	std::list <std::string>permissions;
	BusinessAccessUserSummary user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserSingleAssetBinding_H_ */
