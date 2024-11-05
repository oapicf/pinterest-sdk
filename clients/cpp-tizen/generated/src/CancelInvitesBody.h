/*
 * CancelInvitesBody.h
 *
 * Request body used to cancel invites
 */

#ifndef _CancelInvitesBody_H_
#define _CancelInvitesBody_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request body used to cancel invites
 *
 *  \ingroup Models
 *
 */

class CancelInvitesBody : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInvitesBody();
	CancelInvitesBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInvitesBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of invite/request ids to be cancelled
	 */
	std::list<std::string> getInviteIds();

	/*! \brief Set List of invite/request ids to be cancelled
	 */
	void setInviteIds(std::list <std::string> invite_ids);

private:
	std::list <std::string>invite_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInvitesBody_H_ */
