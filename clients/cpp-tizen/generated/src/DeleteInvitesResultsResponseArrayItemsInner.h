/*
 * DeleteInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef _DeleteInvitesResultsResponseArray_items_inner_H_
#define _DeleteInvitesResultsResponseArray_items_inner_H_


#include <string>
#include "BaseInviteDataResponse.h"
#include "DeleteInvitesResultsResponseArray_items_inner_exception.h"
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

class DeleteInvitesResultsResponseArray_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteInvitesResultsResponseArray_items_inner();
	DeleteInvitesResultsResponseArray_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteInvitesResultsResponseArray_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	DeleteInvitesResultsResponseArray_items_inner_exception getException();

	/*! \brief Set 
	 */
	void setException(DeleteInvitesResultsResponseArray_items_inner_exception  exception);
	/*! \brief Get 
	 */
	BaseInviteDataResponse getInvite();

	/*! \brief Set 
	 */
	void setInvite(BaseInviteDataResponse  invite);

private:
	DeleteInvitesResultsResponseArray_items_inner_exception exception;
	BaseInviteDataResponse invite;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteInvitesResultsResponseArray_items_inner_H_ */
