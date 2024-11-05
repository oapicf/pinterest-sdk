/*
 * RespondToInvitesResponseArray.h
 *
 * 
 */

#ifndef _RespondToInvitesResponseArray_H_
#define _RespondToInvitesResponseArray_H_


#include <string>
#include "RespondToInvitesResponseArray_items_inner.h"
#include <list>
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

class RespondToInvitesResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	RespondToInvitesResponseArray();
	RespondToInvitesResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RespondToInvitesResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
	 */
	std::list<RespondToInvitesResponseArray_items_inner> getItems();

	/*! \brief Set List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
	 */
	void setItems(std::list <RespondToInvitesResponseArray_items_inner> items);

private:
	std::list <RespondToInvitesResponseArray_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RespondToInvitesResponseArray_H_ */
