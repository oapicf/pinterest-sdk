
/*
 * PerformancePlusCampaignSettings.h
 *
 * Pinterest Performance+ campaign settings.
 */

#ifndef TINY_CPP_CLIENT_PerformancePlusCampaignSettings_H_
#define TINY_CPP_CLIENT_PerformancePlusCampaignSettings_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Pinterest Performance+ campaign settings.
 *
 *  \ingroup Models
 *
 */

class PerformancePlusCampaignSettings{
public:

    /*! \brief Constructor.
	 */
    PerformancePlusCampaignSettings();
    PerformancePlusCampaignSettings(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PerformancePlusCampaignSettings();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether to boost prospecting ad group bid.
	 */
	bool isBoostProspectingAdGroupBid();

	/*! \brief Set Whether to boost prospecting ad group bid.
	 */
	void setBoostProspectingAdGroupBid(bool boost_prospecting_ad_group_bid);
	/*! \brief Get List of campaign-level exclusion pinner list IDs.
	 */
	std::list<std::string> getPinnerListExclusions();

	/*! \brief Set List of campaign-level exclusion pinner list IDs.
	 */
	void setPinnerListExclusions(std::list<std::string> pinner_list_exclusions);


    private:
    bool boost_prospecting_ad_group_bid{};
    std::list<std::string> pinner_list_exclusions;
};
}

#endif /* TINY_CPP_CLIENT_PerformancePlusCampaignSettings_H_ */
