/*
 * UpdateMemberAssetResultItem.h
 *
 * 
 */

#ifndef _UpdateMemberAssetResultItem_H_
#define _UpdateMemberAssetResultItem_H_


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

class UpdateMemberAssetResultItem : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberAssetResultItem();
	UpdateMemberAssetResultItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberAssetResultItem();

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

#endif /* _UpdateMemberAssetResultItem_H_ */
