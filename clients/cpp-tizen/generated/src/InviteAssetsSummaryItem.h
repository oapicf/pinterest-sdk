/*
 * InviteAssetsSummaryItem.h
 *
 * 
 */

#ifndef _InviteAssetsSummaryItem_H_
#define _InviteAssetsSummaryItem_H_


#include <string>
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

class InviteAssetsSummaryItem : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteAssetsSummaryItem();
	InviteAssetsSummaryItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteAssetsSummaryItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the asset.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the asset.
	 */
	void setId(std::string  id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);

private:
	std::string id;
	std::list <std::string>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteAssetsSummaryItem_H_ */
