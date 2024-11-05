/*
 * RespondToInvitesResponseArray_items_inner.h
 *
 * 
 */

#ifndef _RespondToInvitesResponseArray_items_inner_H_
#define _RespondToInvitesResponseArray_items_inner_H_


#include <string>
#include "BaseInviteDataResponse.h"
#include "InviteExceptionResponse.h"
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

class RespondToInvitesResponseArray_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RespondToInvitesResponseArray_items_inner();
	RespondToInvitesResponseArray_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RespondToInvitesResponseArray_items_inner();

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
	BaseInviteDataResponse getInvite();

	/*! \brief Set 
	 */
	void setInvite(BaseInviteDataResponse  invite);

private:
	InviteExceptionResponse exception;
	BaseInviteDataResponse invite;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RespondToInvitesResponseArray_items_inner_H_ */
