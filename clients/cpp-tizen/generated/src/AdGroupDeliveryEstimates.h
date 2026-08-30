/*
 * AdGroupDeliveryEstimates.h
 *
 * Ad group configuration for delivery estimates.
 */

#ifndef _AdGroupDeliveryEstimates_H_
#define _AdGroupDeliveryEstimates_H_


#include <string>
#include "AdGroupAudienceSizingCreativeTypes.h"
#include "AdGroupDeliveryEstimatesKeywordsItems.h"
#include "OptimizationGoalMetadata.h"
#include "OptimizationType.h"
#include "PlacementGroupType.h"
#include "TargetingSpecOptimal.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad group configuration for delivery estimates.
 *
 *  \ingroup Models
 *
 */

class AdGroupDeliveryEstimates : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupDeliveryEstimates();
	AdGroupDeliveryEstimates(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupDeliveryEstimates();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set 
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	std::list<AdGroupAudienceSizingCreativeTypes> getCreativeTypes();

	/*! \brief Set Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	void setCreativeTypes(std::list <AdGroupAudienceSizingCreativeTypes> creative_types);
	/*! \brief Get Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	std::list<AdGroupDeliveryEstimatesKeywordsItems> getKeywords();

	/*! \brief Set Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	void setKeywords(std::list <AdGroupDeliveryEstimatesKeywordsItems> keywords);
	/*! \brief Get Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
	 */
	int getMonthlyFrequencyCap();

	/*! \brief Set Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
	 */
	void setMonthlyFrequencyCap(int  monthly_frequency_cap);
	/*! \brief Get 
	 */
	OptimizationGoalMetadata getOptimizationGoalMetadata();

	/*! \brief Set 
	 */
	void setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata);
	/*! \brief Get Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
	 */
	OptimizationType getOptimizationType();

	/*! \brief Set Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
	 */
	void setOptimizationType(OptimizationType  optimization_type);
	/*! \brief Get 
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set 
	 */
	void setPlacementGroup(PlacementGroupType  placement_group);
	/*! \brief Get [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
	 */
	std::list<std::string> getProductGroupIds();

	/*! \brief Set [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
	 */
	void setProductGroupIds(std::list <std::string> product_group_ids);
	/*! \brief Get 
	 */
	TargetingSpecOptimal getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpecOptimal  targeting_spec);

private:
	bool auto_targeting_enabled;
	std::list <AdGroupAudienceSizingCreativeTypes>creative_types;
	std::list <AdGroupDeliveryEstimatesKeywordsItems>keywords;
	int monthly_frequency_cap;
	OptimizationGoalMetadata optimization_goal_metadata;
	OptimizationType optimization_type;
	PlacementGroupType placement_group;
	std::list <std::string>product_group_ids;
	TargetingSpecOptimal targeting_spec;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupDeliveryEstimates_H_ */
