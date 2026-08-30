/*
 * BusinessMembersAssetAccessDeleteBody.h
 *
 * An object with a list of member asset accesses to delete.
 */

#ifndef _BusinessMembersAssetAccessDeleteBody_H_
#define _BusinessMembersAssetAccessDeleteBody_H_


#include <string>
#include "DeleteMemberAssetAccessItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of member asset accesses to delete.
 *
 *  \ingroup Models
 *
 */

class BusinessMembersAssetAccessDeleteBody : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessMembersAssetAccessDeleteBody();
	BusinessMembersAssetAccessDeleteBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessMembersAssetAccessDeleteBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of members asset access to be deleted
	 */
	std::list<DeleteMemberAssetAccessItem> getAccesses();

	/*! \brief Set List of members asset access to be deleted
	 */
	void setAccesses(std::list <DeleteMemberAssetAccessItem> accesses);

private:
	std::list <DeleteMemberAssetAccessItem>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessMembersAssetAccessDeleteBody_H_ */
