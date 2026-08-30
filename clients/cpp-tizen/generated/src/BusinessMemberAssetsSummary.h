/*
 * BusinessMemberAssetsSummary.h
 *
 * Ad accounts and profiles the business member/partner has access to.
 */

#ifndef _BusinessMemberAssetsSummary_H_
#define _BusinessMemberAssetsSummary_H_


#include <string>
#include "AssetIdWithPermissions.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad accounts and profiles the business member/partner has access to.
 *
 *  \ingroup Models
 *
 */

class BusinessMemberAssetsSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessMemberAssetsSummary();
	BusinessMemberAssetsSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessMemberAssetsSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of ad account IDs and respective permission levels.
	 */
	std::list<AssetIdWithPermissions> getAdAccounts();

	/*! \brief Set List of ad account IDs and respective permission levels.
	 */
	void setAdAccounts(std::list <AssetIdWithPermissions> ad_accounts);
	/*! \brief Get List of profile IDs and respective permission levels.
	 */
	std::list<AssetIdWithPermissions> getProfiles();

	/*! \brief Set List of profile IDs and respective permission levels.
	 */
	void setProfiles(std::list <AssetIdWithPermissions> profiles);

private:
	std::list <AssetIdWithPermissions>ad_accounts;
	std::list <AssetIdWithPermissions>profiles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessMemberAssetsSummary_H_ */
