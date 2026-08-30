/*
 * RespondToInviteResultItem.h
 *
 * 
 */

#ifndef _RespondToInviteResultItem_H_
#define _RespondToInviteResultItem_H_


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

class RespondToInviteResultItem : public Object {
public:
	/*! \brief Constructor.
	 */
	RespondToInviteResultItem();
	RespondToInviteResultItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RespondToInviteResultItem();

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
	/*! \brief Get An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
	 */
	BaseInviteDataResponse getInvite();

	/*! \brief Set An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
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

#endif /* _RespondToInviteResultItem_H_ */
