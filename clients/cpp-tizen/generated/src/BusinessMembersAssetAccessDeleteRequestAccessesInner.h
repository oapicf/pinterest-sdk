/*
 * Business_members_asset_access_delete_request_accesses_inner.h
 *
 * 
 */

#ifndef _Business_members_asset_access_delete_request_accesses_inner_H_
#define _Business_members_asset_access_delete_request_accesses_inner_H_


#include <string>
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

class Business_members_asset_access_delete_request_accesses_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Business_members_asset_access_delete_request_accesses_inner();
	Business_members_asset_access_delete_request_accesses_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Business_members_asset_access_delete_request_accesses_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Id of the asset on which to remove member permissions.
	 */
	std::string getAssetId();

	/*! \brief Set Id of the asset on which to remove member permissions.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Unique identifier of the member on which to perform the asset permission removal
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member on which to perform the asset permission removal
	 */
	void setMemberId(std::string  member_id);

private:
	std::string asset_id;
	std::string member_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Business_members_asset_access_delete_request_accesses_inner_H_ */
