/*
 * PerformancePlusCampaignSettings.h
 *
 * Pinterest Performance+ campaign settings.
 */

#ifndef _PerformancePlusCampaignSettings_H_
#define _PerformancePlusCampaignSettings_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pinterest Performance+ campaign settings.
 *
 *  \ingroup Models
 *
 */

class PerformancePlusCampaignSettings : public Object {
public:
	/*! \brief Constructor.
	 */
	PerformancePlusCampaignSettings();
	PerformancePlusCampaignSettings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PerformancePlusCampaignSettings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether to boost prospecting ad group bid.
	 */
	bool getBoostProspectingAdGroupBid();

	/*! \brief Set Whether to boost prospecting ad group bid.
	 */
	void setBoostProspectingAdGroupBid(bool  boost_prospecting_ad_group_bid);
	/*! \brief Get List of campaign-level exclusion pinner list IDs.
	 */
	std::list<std::string> getPinnerListExclusions();

	/*! \brief Set List of campaign-level exclusion pinner list IDs.
	 */
	void setPinnerListExclusions(std::list <std::string> pinner_list_exclusions);

private:
	bool boost_prospecting_ad_group_bid;
	std::list <std::string>pinner_list_exclusions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PerformancePlusCampaignSettings_H_ */
