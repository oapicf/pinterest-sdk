/*
 * UpdateInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef _UpdateInvitesResultsResponseArray_items_inner_H_
#define _UpdateInvitesResultsResponseArray_items_inner_H_


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


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateInvitesResultsResponseArray_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateInvitesResultsResponseArray_items_inner();
	UpdateInvitesResultsResponseArray_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateInvitesResultsResponseArray_items_inner();

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

#endif /* _UpdateInvitesResultsResponseArray_items_inner_H_ */
