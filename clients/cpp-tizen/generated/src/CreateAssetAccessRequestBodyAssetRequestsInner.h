/*
 * CreateAssetAccessRequestBody_asset_requests_inner.h
 *
 * 
 */

#ifndef _CreateAssetAccessRequestBody_asset_requests_inner_H_
#define _CreateAssetAccessRequestBody_asset_requests_inner_H_


#include <string>
#include "Permissions.h"
#include <list>
#include <map>
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

class CreateAssetAccessRequestBody_asset_requests_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetAccessRequestBody_asset_requests_inner();
	CreateAssetAccessRequestBody_asset_requests_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetAccessRequestBody_asset_requests_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a business partner to request asset access to.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner to request asset access to.
	 */
	void setPartnerId(std::string  partner_id);
	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	std::map<std::string, std::string> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	void setAssetIdToPermissions(std::map <std::string, std::string> asset_id_to_permissions);

private:
	std::string partner_id;
	std::map <std::string, std::string>asset_id_to_permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetAccessRequestBody_asset_requests_inner_H_ */
