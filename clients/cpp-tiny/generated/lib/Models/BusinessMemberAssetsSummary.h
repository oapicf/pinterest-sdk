
/*
 * BusinessMemberAssetsSummary.h
 *
 * Ad accounts and profiles the business member/partner has access to.
 */

#ifndef TINY_CPP_CLIENT_BusinessMemberAssetsSummary_H_
#define TINY_CPP_CLIENT_BusinessMemberAssetsSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetIdWithPermissions.h"
#include <list>

namespace Tiny {


/*! \brief Ad accounts and profiles the business member/partner has access to.
 *
 *  \ingroup Models
 *
 */

class BusinessMemberAssetsSummary{
public:

    /*! \brief Constructor.
	 */
    BusinessMemberAssetsSummary();
    BusinessMemberAssetsSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMemberAssetsSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of ad account IDs and respective permission levels.
	 */
	std::list<AssetIdWithPermissions> getAdAccounts();

	/*! \brief Set List of ad account IDs and respective permission levels.
	 */
	void setAdAccounts(std::list<AssetIdWithPermissions> ad_accounts);
	/*! \brief Get List of profile IDs and respective permission levels.
	 */
	std::list<AssetIdWithPermissions> getProfiles();

	/*! \brief Set List of profile IDs and respective permission levels.
	 */
	void setProfiles(std::list<AssetIdWithPermissions> profiles);


    private:
    std::list<AssetIdWithPermissions> ad_accounts;
    std::list<AssetIdWithPermissions> profiles;
};
}

#endif /* TINY_CPP_CLIENT_BusinessMemberAssetsSummary_H_ */
