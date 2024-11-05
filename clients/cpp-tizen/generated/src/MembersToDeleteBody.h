/*
 * MembersToDeleteBody.h
 *
 * 
 */

#ifndef _MembersToDeleteBody_H_
#define _MembersToDeleteBody_H_


#include <string>
#include "MembersToDeleteBody_members_inner.h"
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

class MembersToDeleteBody : public Object {
public:
	/*! \brief Constructor.
	 */
	MembersToDeleteBody();
	MembersToDeleteBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MembersToDeleteBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<MembersToDeleteBody_members_inner> getMembers();

	/*! \brief Set 
	 */
	void setMembers(std::list <MembersToDeleteBody_members_inner> members);

private:
	std::list <MembersToDeleteBody_members_inner>members;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MembersToDeleteBody_H_ */
