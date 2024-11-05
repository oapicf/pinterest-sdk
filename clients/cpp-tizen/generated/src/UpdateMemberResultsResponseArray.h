/*
 * UpdateMemberResultsResponseArray.h
 *
 * 
 */

#ifndef _UpdateMemberResultsResponseArray_H_
#define _UpdateMemberResultsResponseArray_H_


#include <string>
#include "UpdateMemberResult.h"
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

class UpdateMemberResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberResultsResponseArray();
	UpdateMemberResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of members with updated business access role.
	 */
	std::list<UpdateMemberResult> getItems();

	/*! \brief Set List of members with updated business access role.
	 */
	void setItems(std::list <UpdateMemberResult> items);

private:
	std::list <UpdateMemberResult>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberResultsResponseArray_H_ */
