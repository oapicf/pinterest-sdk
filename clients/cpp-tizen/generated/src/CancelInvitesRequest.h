/*
 * CancelInvitesRequest.h
 *
 * An object with the list of invite/request ids to cancel.
 */

#ifndef _CancelInvitesRequest_H_
#define _CancelInvitesRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with the list of invite/request ids to cancel.
 *
 *  \ingroup Models
 *
 */

class CancelInvitesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInvitesRequest();
	CancelInvitesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInvitesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of invite/request ids to cancel.
	 */
	std::list<std::string> getInviteIds();

	/*! \brief Set A list of invite/request ids to cancel.
	 */
	void setInviteIds(std::list <std::string> invite_ids);

private:
	std::list <std::string>invite_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInvitesRequest_H_ */
