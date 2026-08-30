/*
 * UpdateMemberAssetAccessBody.h
 *
 * An object with a list of all the new member asset accesses.
 */

#ifndef _UpdateMemberAssetAccessBody_H_
#define _UpdateMemberAssetAccessBody_H_


#include <string>
#include "UpdateMemberAssetAccessItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of all the new member asset accesses.
 *
 *  \ingroup Models
 *
 */

class UpdateMemberAssetAccessBody : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberAssetAccessBody();
	UpdateMemberAssetAccessBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberAssetAccessBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of member asset accesses to assign or update.
	 */
	std::list<UpdateMemberAssetAccessItem> getAccesses();

	/*! \brief Set List of member asset accesses to assign or update.
	 */
	void setAccesses(std::list <UpdateMemberAssetAccessItem> accesses);

private:
	std::list <UpdateMemberAssetAccessItem>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberAssetAccessBody_H_ */
