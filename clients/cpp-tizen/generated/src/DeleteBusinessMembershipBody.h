/*
 * DeleteBusinessMembershipBody.h
 *
 * List of members with role to delete.
 */

#ifndef _DeleteBusinessMembershipBody_H_
#define _DeleteBusinessMembershipBody_H_


#include <string>
#include "DeleteBusinessMembershipMember.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of members with role to delete.
 *
 *  \ingroup Models
 *
 */

class DeleteBusinessMembershipBody : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteBusinessMembershipBody();
	DeleteBusinessMembershipBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteBusinessMembershipBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<DeleteBusinessMembershipMember> getMembers();

	/*! \brief Set 
	 */
	void setMembers(std::list <DeleteBusinessMembershipMember> members);

private:
	std::list <DeleteBusinessMembershipMember>members;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteBusinessMembershipBody_H_ */
