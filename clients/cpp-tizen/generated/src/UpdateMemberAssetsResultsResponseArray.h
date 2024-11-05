/*
 * UpdateMemberAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef _UpdateMemberAssetsResultsResponseArray_H_
#define _UpdateMemberAssetsResultsResponseArray_H_


#include <string>
#include "UpdateMemberAssetsResultsResponseArray_items_inner.h"
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

class UpdateMemberAssetsResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberAssetsResultsResponseArray();
	UpdateMemberAssetsResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberAssetsResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
	 */
	std::list<UpdateMemberAssetsResultsResponseArray_items_inner> getItems();

	/*! \brief Set List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
	 */
	void setItems(std::list <UpdateMemberAssetsResultsResponseArray_items_inner> items);

private:
	std::list <UpdateMemberAssetsResultsResponseArray_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberAssetsResultsResponseArray_H_ */
