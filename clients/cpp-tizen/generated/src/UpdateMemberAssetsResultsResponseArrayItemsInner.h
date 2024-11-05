/*
 * UpdateMemberAssetsResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef _UpdateMemberAssetsResultsResponseArray_items_inner_H_
#define _UpdateMemberAssetsResultsResponseArray_items_inner_H_


#include <string>
#include "UsersForIndividualAssetResponse.h"
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

class UpdateMemberAssetsResultsResponseArray_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberAssetsResultsResponseArray_items_inner();
	UpdateMemberAssetsResultsResponseArray_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberAssetsResultsResponseArray_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	UsersForIndividualAssetResponse getResponse();

	/*! \brief Set 
	 */
	void setResponse(UsersForIndividualAssetResponse  response);

private:
	UsersForIndividualAssetResponse response;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberAssetsResultsResponseArray_items_inner_H_ */
