/*
 * InviteActionResultItem.h
 *
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */

#ifndef _InviteActionResultItem_H_
#define _InviteActionResultItem_H_


#include <string>
#include "InviteBusinessRoleBinding.h"
#include "InviteExceptionResponse.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 *
 *  \ingroup Models
 *
 */

class InviteActionResultItem : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteActionResultItem();
	InviteActionResultItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteActionResultItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	InviteExceptionResponse getException();

	/*! \brief Set 
	 */
	void setException(InviteExceptionResponse  exception);
	/*! \brief Get 
	 */
	InviteBusinessRoleBinding getInvite();

	/*! \brief Set 
	 */
	void setInvite(InviteBusinessRoleBinding  invite);

private:
	InviteExceptionResponse exception;
	InviteBusinessRoleBinding invite;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteActionResultItem_H_ */
