/*
 * UpdateBusinessMembershipsResponse.h
 *
 * 
 */

#ifndef _UpdateBusinessMembershipsResponse_H_
#define _UpdateBusinessMembershipsResponse_H_


#include <string>
#include "BusinessMembershipMember.h"
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

class UpdateBusinessMembershipsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateBusinessMembershipsResponse();
	UpdateBusinessMembershipsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateBusinessMembershipsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of members with updated business access role.
	 */
	std::list<BusinessMembershipMember> getItems();

	/*! \brief Set List of members with updated business access role.
	 */
	void setItems(std::list <BusinessMembershipMember> items);

private:
	std::list <BusinessMembershipMember>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateBusinessMembershipsResponse_H_ */
