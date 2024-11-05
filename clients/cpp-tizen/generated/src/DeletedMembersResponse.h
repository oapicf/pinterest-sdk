/*
 * DeletedMembersResponse.h
 *
 * An object with a list of members that were deleted.
 */

#ifndef _DeletedMembersResponse_H_
#define _DeletedMembersResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of members that were deleted.
 *
 *  \ingroup Models
 *
 */

class DeletedMembersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletedMembersResponse();
	DeletedMembersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletedMembersResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of members whose business membership have been terminated.
	 */
	std::list<std::string> getDeletedMembers();

	/*! \brief Set List of members whose business membership have been terminated.
	 */
	void setDeletedMembers(std::list <std::string> deleted_members);

private:
	std::list <std::string>deleted_members;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletedMembersResponse_H_ */
