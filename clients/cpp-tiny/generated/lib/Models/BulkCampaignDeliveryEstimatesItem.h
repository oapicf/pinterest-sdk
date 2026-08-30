
/*
 * BulkCampaignDeliveryEstimatesItem.h
 *
 * Delivery estimate result for a single campaign within a bulk request.
 */

#ifndef TINY_CPP_CLIENT_BulkCampaignDeliveryEstimatesItem_H_
#define TINY_CPP_CLIENT_BulkCampaignDeliveryEstimatesItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignDeliveryEstimatesDerivedMetrics.h"
#include "CampaignPlanningAdGroupAudienceSize.h"
#include "CampaignPlanningConversionRate.h"
#include "CampaignPlanningCurveEstimate.h"
#include "CampaignPlanningResponseError.h"
#include <list>

namespace Tiny {


/*! \brief Delivery estimate result for a single campaign within a bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkCampaignDeliveryEstimatesItem{
public:

    /*! \brief Constructor.
	 */
    BulkCampaignDeliveryEstimatesItem();
    BulkCampaignDeliveryEstimatesItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkCampaignDeliveryEstimatesItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Range audience sizes for each ad group, in the same order as the ad groups in the request.
	 */
	std::list<CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes();

	/*! \brief Set Range audience sizes for each ad group, in the same order as the ad groups in the request.
	 */
	void setAdgroupAudienceSizes(std::list<CampaignPlanningAdGroupAudienceSize> adgroup_audience_sizes);
	/*! \brief Get Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
	 */
	float getConversionRate();

	/*! \brief Set Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
	 */
	void setConversionRate(float conversion_rate);
	/*! \brief Get Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
	 */
	std::list<CampaignPlanningConversionRate> getConversionRates();

	/*! \brief Set Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
	 */
	void setConversionRates(std::list<CampaignPlanningConversionRate> conversion_rates);
	/*! \brief Get Estimated curves. Each curve will pertain to a single estimation type.
	 */
	std::list<CampaignPlanningCurveEstimate> getCurves();

	/*! \brief Set Estimated curves. Each curve will pertain to a single estimation type.
	 */
	void setCurves(std::list<CampaignPlanningCurveEstimate> curves);
	/*! \brief Get 
	 */
	CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics();

	/*! \brief Set 
	 */
	void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derived_metrics);
	/*! \brief Get Errors encountered during estimation for this campaign.
	 */
	std::list<CampaignPlanningResponseError> getErrors();

	/*! \brief Set Errors encountered during estimation for this campaign.
	 */
	void setErrors(std::list<CampaignPlanningResponseError> errors);
	/*! \brief Get UUID used to track delivery estimates when they are generated as part of a saved campaign.
	 */
	std::string getEstimateId();

	/*! \brief Set UUID used to track delivery estimates when they are generated as part of a saved campaign.
	 */
	void setEstimateId(std::string estimate_id);
	/*! \brief Get Maximum potential spend estimate.
	 */
	int getMaxPotentialSpend();

	/*! \brief Set Maximum potential spend estimate.
	 */
	void setMaxPotentialSpend(int max_potential_spend);


    private:
    std::list<CampaignPlanningAdGroupAudienceSize> adgroup_audience_sizes;
    float conversion_rate{};
    std::list<CampaignPlanningConversionRate> conversion_rates;
    std::list<CampaignPlanningCurveEstimate> curves;
    CampaignDeliveryEstimatesDerivedMetrics derived_metrics;
    std::list<CampaignPlanningResponseError> errors;
    std::string estimate_id{};
    int max_potential_spend{};
};
}

#endif /* TINY_CPP_CLIENT_BulkCampaignDeliveryEstimatesItem_H_ */
