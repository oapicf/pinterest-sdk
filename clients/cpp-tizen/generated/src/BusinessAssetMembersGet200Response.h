/*
 * Business_asset_members_get_200_response.h
 *
 * 
 */

#ifndef _Business_asset_members_get_200_response_H_
#define _Business_asset_members_get_200_response_H_


#include <string>
#include "UserSingleAssetBinding.h"
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

class Business_asset_members_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Business_asset_members_get_200_response();
	Business_asset_members_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Business_asset_members_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of members with permissions to the asset.
	 */
	std::list<UserSingleAssetBinding> getItems();

	/*! \brief Set List of members with permissions to the asset.
	 */
	void setItems(std::list <UserSingleAssetBinding> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <UserSingleAssetBinding>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Business_asset_members_get_200_response_H_ */
