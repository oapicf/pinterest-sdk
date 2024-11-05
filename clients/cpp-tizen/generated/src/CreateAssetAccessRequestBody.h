/*
 * CreateAssetAccessRequestBody.h
 *
 * An object containing a list of all the asset access requests
 */

#ifndef _CreateAssetAccessRequestBody_H_
#define _CreateAssetAccessRequestBody_H_


#include <string>
#include "CreateAssetAccessRequestBody_asset_requests_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object containing a list of all the asset access requests
 *
 *  \ingroup Models
 *
 */

class CreateAssetAccessRequestBody : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetAccessRequestBody();
	CreateAssetAccessRequestBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetAccessRequestBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CreateAssetAccessRequestBody_asset_requests_inner> getAssetRequests();

	/*! \brief Set 
	 */
	void setAssetRequests(std::list <CreateAssetAccessRequestBody_asset_requests_inner> asset_requests);

private:
	std::list <CreateAssetAccessRequestBody_asset_requests_inner>asset_requests;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetAccessRequestBody_H_ */
