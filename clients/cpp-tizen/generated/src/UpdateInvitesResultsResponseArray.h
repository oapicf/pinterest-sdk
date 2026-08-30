/*
 * UpdateInvitesResultsResponseArray.h
 *
 * 
 */

#ifndef _UpdateInvitesResultsResponseArray_H_
#define _UpdateInvitesResultsResponseArray_H_


#include <string>
#include "InviteActionResultItem.h"
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

class UpdateInvitesResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateInvitesResultsResponseArray();
	UpdateInvitesResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateInvitesResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	std::list<InviteActionResultItem> getItems();

	/*! \brief Set List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	void setItems(std::list <InviteActionResultItem> items);

private:
	std::list <InviteActionResultItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateInvitesResultsResponseArray_H_ */
