/*
 * Delete_business_membership_200_response.h
 *
 * 
 */

#ifndef _Delete_business_membership_200_response_H_
#define _Delete_business_membership_200_response_H_


#include <string>
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

class Delete_business_membership_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Delete_business_membership_200_response();
	Delete_business_membership_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Delete_business_membership_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getDeletedMembers();

	/*! \brief Set 
	 */
	void setDeletedMembers(std::list <std::string> deleted_members);

private:
	std::list <std::string>deleted_members;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Delete_business_membership_200_response_H_ */
