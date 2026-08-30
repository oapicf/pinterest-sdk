/*
 * InviteAssetsSummary.h
 *
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */

#ifndef _InviteAssetsSummary_H_
#define _InviteAssetsSummary_H_


#include <string>
#include "InviteAssetsSummaryItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 *
 *  \ingroup Models
 *
 */

class InviteAssetsSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteAssetsSummary();
	InviteAssetsSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteAssetsSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of ad account IDs and respective permission levels that will be assigned.
	 */
	std::list<InviteAssetsSummaryItem> getAdAccounts();

	/*! \brief Set List of ad account IDs and respective permission levels that will be assigned.
	 */
	void setAdAccounts(std::list <InviteAssetsSummaryItem> ad_accounts);
	/*! \brief Get List of profile IDs and respective permission levels that will be assigned.
	 */
	std::list<InviteAssetsSummaryItem> getProfiles();

	/*! \brief Set List of profile IDs and respective permission levels that will be assigned.
	 */
	void setProfiles(std::list <InviteAssetsSummaryItem> profiles);

private:
	std::list <InviteAssetsSummaryItem>ad_accounts;
	std::list <InviteAssetsSummaryItem>profiles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteAssetsSummary_H_ */
