
/*
 * CampaignDeliveryEstimatesDerivedMetrics.h
 *
 * Derived metrics for an ad campaign.
 */

#ifndef TINY_CPP_CLIENT_CampaignDeliveryEstimatesDerivedMetrics_H_
#define TINY_CPP_CLIENT_CampaignDeliveryEstimatesDerivedMetrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Derived metrics for an ad campaign.
 *
 *  \ingroup Models
 *
 */

class CampaignDeliveryEstimatesDerivedMetrics{
public:

    /*! \brief Constructor.
	 */
    CampaignDeliveryEstimatesDerivedMetrics();
    CampaignDeliveryEstimatesDerivedMetrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignDeliveryEstimatesDerivedMetrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Estimated cost per click.
	 */
	float getCpc();

	/*! \brief Set Estimated cost per click.
	 */
	void setCpc(float cpc);
	/*! \brief Get Lower estimate of the cost per click.
	 */
	float getCpcLower();

	/*! \brief Set Lower estimate of the cost per click.
	 */
	void setCpcLower(float cpc_lower);
	/*! \brief Get Upper estimate of the cost per click.
	 */
	float getCpcUpper();

	/*! \brief Set Upper estimate of the cost per click.
	 */
	void setCpcUpper(float cpc_upper);
	/*! \brief Get Estimated cost per thousand impressions.
	 */
	float getCpm();

	/*! \brief Set Estimated cost per thousand impressions.
	 */
	void setCpm(float cpm);
	/*! \brief Get Lower estimate of cost per thousand impressions.
	 */
	float getCpmLower();

	/*! \brief Set Lower estimate of cost per thousand impressions.
	 */
	void setCpmLower(float cpm_lower);
	/*! \brief Get Upper estimate of cost per thousand impressions.
	 */
	float getCpmUpper();

	/*! \brief Set Upper estimate of cost per thousand impressions.
	 */
	void setCpmUpper(float cpm_upper);
	/*! \brief Get Estimated lifetime frequency.
	 */
	float getLifetimeFrequency();

	/*! \brief Set Estimated lifetime frequency.
	 */
	void setLifetimeFrequency(float lifetime_frequency);
	/*! \brief Get Lower estimate of lifetime frequency.
	 */
	float getLifetimeFrequencyLower();

	/*! \brief Set Lower estimate of lifetime frequency.
	 */
	void setLifetimeFrequencyLower(float lifetime_frequency_lower);
	/*! \brief Get Upper estimate of lifetime frequency.
	 */
	float getLifetimeFrequencyUpper();

	/*! \brief Set Upper estimate of lifetime frequency.
	 */
	void setLifetimeFrequencyUpper(float lifetime_frequency_upper);
	/*! \brief Get Estimated lifetime impressions.
	 */
	float getLifetimeImpression();

	/*! \brief Set Estimated lifetime impressions.
	 */
	void setLifetimeImpression(float lifetime_impression);
	/*! \brief Get Lower estimate of lifetime impressions.
	 */
	float getLifetimeImpressionLower();

	/*! \brief Set Lower estimate of lifetime impressions.
	 */
	void setLifetimeImpressionLower(float lifetime_impression_lower);
	/*! \brief Get Upper estimate of lifetime impressions.
	 */
	float getLifetimeImpressionUpper();

	/*! \brief Set Upper estimate of lifetime impressions.
	 */
	void setLifetimeImpressionUpper(float lifetime_impression_upper);
	/*! \brief Get Estimated lifetime reach.
	 */
	float getLifetimeReach();

	/*! \brief Set Estimated lifetime reach.
	 */
	void setLifetimeReach(float lifetime_reach);
	/*! \brief Get Lower estimate of lifetime reach.
	 */
	float getLifetimeReachLower();

	/*! \brief Set Lower estimate of lifetime reach.
	 */
	void setLifetimeReachLower(float lifetime_reach_lower);
	/*! \brief Get Upper estimate of lifetime reach.
	 */
	float getLifetimeReachUpper();

	/*! \brief Set Upper estimate of lifetime reach.
	 */
	void setLifetimeReachUpper(float lifetime_reach_upper);
	/*! \brief Get Estimated weekly clicks.
	 */
	float getWeeklyClick();

	/*! \brief Set Estimated weekly clicks.
	 */
	void setWeeklyClick(float weekly_click);
	/*! \brief Get Lower estimate of weekly clicks.
	 */
	float getWeeklyClickLower();

	/*! \brief Set Lower estimate of weekly clicks.
	 */
	void setWeeklyClickLower(float weekly_click_lower);
	/*! \brief Get Upper estimate of weekly clicks.
	 */
	float getWeeklyClickUpper();

	/*! \brief Set Upper estimate of weekly clicks.
	 */
	void setWeeklyClickUpper(float weekly_click_upper);
	/*! \brief Get Estimated weekly frequency.
	 */
	float getWeeklyFrequency();

	/*! \brief Set Estimated weekly frequency.
	 */
	void setWeeklyFrequency(float weekly_frequency);
	/*! \brief Get Lower estimate of weekly frequency.
	 */
	float getWeeklyFrequencyLower();

	/*! \brief Set Lower estimate of weekly frequency.
	 */
	void setWeeklyFrequencyLower(float weekly_frequency_lower);
	/*! \brief Get Upper estimate of weekly frequency.
	 */
	float getWeeklyFrequencyUpper();

	/*! \brief Set Upper estimate of weekly frequency.
	 */
	void setWeeklyFrequencyUpper(float weekly_frequency_upper);
	/*! \brief Get Estimated weekly impressions.
	 */
	float getWeeklyImpression();

	/*! \brief Set Estimated weekly impressions.
	 */
	void setWeeklyImpression(float weekly_impression);
	/*! \brief Get Lower estimate of weekly impressions.
	 */
	float getWeeklyImpressionLower();

	/*! \brief Set Lower estimate of weekly impressions.
	 */
	void setWeeklyImpressionLower(float weekly_impression_lower);
	/*! \brief Get Upper estimate of weekly impressions.
	 */
	float getWeeklyImpressionUpper();

	/*! \brief Set Upper estimate of weekly impressions.
	 */
	void setWeeklyImpressionUpper(float weekly_impression_upper);
	/*! \brief Get Estimated weekly reach.
	 */
	float getWeeklyReach();

	/*! \brief Set Estimated weekly reach.
	 */
	void setWeeklyReach(float weekly_reach);
	/*! \brief Get Lower estimate of weekly reach.
	 */
	float getWeeklyReachLower();

	/*! \brief Set Lower estimate of weekly reach.
	 */
	void setWeeklyReachLower(float weekly_reach_lower);
	/*! \brief Get Upper estimate of weekly reach.
	 */
	float getWeeklyReachUpper();

	/*! \brief Set Upper estimate of weekly reach.
	 */
	void setWeeklyReachUpper(float weekly_reach_upper);


    private:
    float cpc{};
    float cpc_lower{};
    float cpc_upper{};
    float cpm{};
    float cpm_lower{};
    float cpm_upper{};
    float lifetime_frequency{};
    float lifetime_frequency_lower{};
    float lifetime_frequency_upper{};
    float lifetime_impression{};
    float lifetime_impression_lower{};
    float lifetime_impression_upper{};
    float lifetime_reach{};
    float lifetime_reach_lower{};
    float lifetime_reach_upper{};
    float weekly_click{};
    float weekly_click_lower{};
    float weekly_click_upper{};
    float weekly_frequency{};
    float weekly_frequency_lower{};
    float weekly_frequency_upper{};
    float weekly_impression{};
    float weekly_impression_lower{};
    float weekly_impression_upper{};
    float weekly_reach{};
    float weekly_reach_lower{};
    float weekly_reach_upper{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignDeliveryEstimatesDerivedMetrics_H_ */
