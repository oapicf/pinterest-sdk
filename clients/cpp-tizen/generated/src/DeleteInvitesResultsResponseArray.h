/*
 * DeleteInvitesResultsResponseArray.h
 *
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 */

#ifndef _DeleteInvitesResultsResponseArray_H_
#define _DeleteInvitesResultsResponseArray_H_


#include <string>
#include "DeleteInvitesResultsResponseArray_items_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 *
 *  \ingroup Models
 *
 */

class DeleteInvitesResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteInvitesResultsResponseArray();
	DeleteInvitesResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteInvitesResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
	 */
	std::list<DeleteInvitesResultsResponseArray_items_inner> getItems();

	/*! \brief Set List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
	 */
	void setItems(std::list <DeleteInvitesResultsResponseArray_items_inner> items);

private:
	std::list <DeleteInvitesResultsResponseArray_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteInvitesResultsResponseArray_H_ */
