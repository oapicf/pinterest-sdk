/*
 * CreateInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef _CreateInvitesResultsResponseArray_items_inner_H_
#define _CreateInvitesResultsResponseArray_items_inner_H_


#include <string>
#include "CreateInvitesResultsResponseArray_items_inner_invite.h"
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

class CreateInvitesResultsResponseArray_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateInvitesResultsResponseArray_items_inner();
	CreateInvitesResultsResponseArray_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateInvitesResultsResponseArray_items_inner();

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
	CreateInvitesResultsResponseArray_items_inner_invite getInvite();

	/*! \brief Set 
	 */
	void setInvite(CreateInvitesResultsResponseArray_items_inner_invite  invite);

private:
	InviteExceptionResponse exception;
	CreateInvitesResultsResponseArray_items_inner_invite invite;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateInvitesResultsResponseArray_items_inner_H_ */
