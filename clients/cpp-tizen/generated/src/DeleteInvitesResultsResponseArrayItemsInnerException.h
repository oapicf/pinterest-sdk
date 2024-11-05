/*
 * DeleteInvitesResultsResponseArray_items_inner_exception.h
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

#ifndef _DeleteInvitesResultsResponseArray_items_inner_exception_H_
#define _DeleteInvitesResultsResponseArray_items_inner_exception_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 *  \ingroup Models
 *
 */

class DeleteInvitesResultsResponseArray_items_inner_exception : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteInvitesResultsResponseArray_items_inner_exception();
	DeleteInvitesResultsResponseArray_items_inner_exception(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteInvitesResultsResponseArray_items_inner_exception();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of an invite.
	 */
	std::string getInviteId();

	/*! \brief Set Unique identifier of an invite.
	 */
	void setInviteId(std::string  invite_id);
	/*! \brief Get Error message associated with the error in performing the action on the invite/request.
	 */
	std::string getMessage();

	/*! \brief Set Error message associated with the error in performing the action on the invite/request.
	 */
	void setMessage(std::string  message);

private:
	std::string invite_id;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteInvitesResultsResponseArray_items_inner_exception_H_ */
