/*
 * Business_member_assets_get_200_response.h
 *
 * 
 */

#ifndef _Business_member_assets_get_200_response_H_
#define _Business_member_assets_get_200_response_H_


#include <string>
#include "AssetIdPermissions.h"
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

class Business_member_assets_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Business_member_assets_get_200_response();
	Business_member_assets_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Business_member_assets_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List asset permissions the given member was granted.
	 */
	std::list<AssetIdPermissions> getItems();

	/*! \brief Set List asset permissions the given member was granted.
	 */
	void setItems(std::list <AssetIdPermissions> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <AssetIdPermissions>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Business_member_assets_get_200_response_H_ */
