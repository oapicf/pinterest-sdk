/*
 * CreateInvitesResultsResponseArray.h
 *
 * 
 */

#ifndef _CreateInvitesResultsResponseArray_H_
#define _CreateInvitesResultsResponseArray_H_


#include <string>
#include "CreateInvitesResultsResponseArray_items_inner.h"
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

class CreateInvitesResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateInvitesResultsResponseArray();
	CreateInvitesResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateInvitesResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	std::list<CreateInvitesResultsResponseArray_items_inner> getItems();

	/*! \brief Set List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	void setItems(std::list <CreateInvitesResultsResponseArray_items_inner> items);

private:
	std::list <CreateInvitesResultsResponseArray_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateInvitesResultsResponseArray_H_ */
