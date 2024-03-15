/*
 * AdGroupCommon_optimization_goal_metadata.h
 *
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
 */

#ifndef _AdGroupCommon_optimization_goal_metadata_H_
#define _AdGroupCommon_optimization_goal_metadata_H_


#include <string>
#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"
#include "OptimizationGoalMetadata_frequency_goal_metadata.h"
#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 *
 *  \ingroup Models
 *
 */

class AdGroupCommon_optimization_goal_metadata : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupCommon_optimization_goal_metadata();
	AdGroupCommon_optimization_goal_metadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupCommon_optimization_goal_metadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata getConversionTagV3GoalMetadata();

	/*! \brief Set 
	 */
	void setConversionTagV3GoalMetadata(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata  conversion_tag_v3_goal_metadata);
	/*! \brief Get 
	 */
	OptimizationGoalMetadata_frequency_goal_metadata getFrequencyGoalMetadata();

	/*! \brief Set 
	 */
	void setFrequencyGoalMetadata(OptimizationGoalMetadata_frequency_goal_metadata  frequency_goal_metadata);
	/*! \brief Get 
	 */
	OptimizationGoalMetadata_scrollup_goal_metadata getScrollupGoalMetadata();

	/*! \brief Set 
	 */
	void setScrollupGoalMetadata(OptimizationGoalMetadata_scrollup_goal_metadata  scrollup_goal_metadata);

private:
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata conversion_tag_v3_goal_metadata;
	OptimizationGoalMetadata_frequency_goal_metadata frequency_goal_metadata;
	OptimizationGoalMetadata_scrollup_goal_metadata scrollup_goal_metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupCommon_optimization_goal_metadata_H_ */
