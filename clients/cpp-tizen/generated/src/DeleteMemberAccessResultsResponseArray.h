/*
 * DeleteMemberAccessResultsResponseArray.h
 *
 * 
 */

#ifndef _DeleteMemberAccessResultsResponseArray_H_
#define _DeleteMemberAccessResultsResponseArray_H_


#include <string>
#include "DeleteMemberAccessResult.h"
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

class DeleteMemberAccessResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteMemberAccessResultsResponseArray();
	DeleteMemberAccessResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteMemberAccessResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of member asset permissions that were deleted.
	 */
	std::list<DeleteMemberAccessResult> getItems();

	/*! \brief Set List of member asset permissions that were deleted.
	 */
	void setItems(std::list <DeleteMemberAccessResult> items);

private:
	std::list <DeleteMemberAccessResult>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteMemberAccessResultsResponseArray_H_ */
