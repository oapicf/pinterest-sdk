/*
 * UpdateMemberAssetAccessBody.h
 *
 * An object with a list of all the new accesses.
 */

#ifndef _UpdateMemberAssetAccessBody_H_
#define _UpdateMemberAssetAccessBody_H_


#include <string>
#include "UpdateMemberAssetAccessBody_accesses_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of all the new accesses.
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

	/*! \brief Get 
	 */
	std::list<UpdateMemberAssetAccessBody_accesses_inner> getAccesses();

	/*! \brief Set 
	 */
	void setAccesses(std::list <UpdateMemberAssetAccessBody_accesses_inner> accesses);

private:
	std::list <UpdateMemberAssetAccessBody_accesses_inner>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberAssetAccessBody_H_ */
