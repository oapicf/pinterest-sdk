
/*
 * InviteAssetsSummary.h
 *
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */

#ifndef TINY_CPP_CLIENT_InviteAssetsSummary_H_
#define TINY_CPP_CLIENT_InviteAssetsSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteAssetsSummary_ad_accounts_inner.h"
#include "InviteAssetsSummary_profiles_inner.h"
#include <list>

namespace Tiny {


/*! \brief Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 *
 *  \ingroup Models
 *
 */

class InviteAssetsSummary{
public:

    /*! \brief Constructor.
	 */
    InviteAssetsSummary();
    InviteAssetsSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteAssetsSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of ad account IDs and respective permission levels that will be assigned.
	 */
	std::list<InviteAssetsSummary_ad_accounts_inner> getAdAccounts();

	/*! \brief Set List of ad account IDs and respective permission levels that will be assigned.
	 */
	void setAdAccounts(std::list <InviteAssetsSummary_ad_accounts_inner> ad_accounts);
	/*! \brief Get List of profile IDs and respective permission levels that will be assigned.
	 */
	std::list<InviteAssetsSummary_profiles_inner> getProfiles();

	/*! \brief Set List of profile IDs and respective permission levels that will be assigned.
	 */
	void setProfiles(std::list <InviteAssetsSummary_profiles_inner> profiles);


    private:
    std::list<InviteAssetsSummary_ad_accounts_inner> ad_accounts;
    std::list<InviteAssetsSummary_profiles_inner> profiles;
};
}

#endif /* TINY_CPP_CLIENT_InviteAssetsSummary_H_ */
