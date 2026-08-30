/*
 * NullableOptimizationGoalMetadata.h
 *
 * 
 */

#ifndef _NullableOptimizationGoalMetadata_H_
#define _NullableOptimizationGoalMetadata_H_


#include <string>
#include "ConversionTagV3GoalMetadata.h"
#include "FrequencyGoalMetadata.h"
#include "ScrollupGoalMetadata.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class NullableOptimizationGoalMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	NullableOptimizationGoalMetadata();
	NullableOptimizationGoalMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NullableOptimizationGoalMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata();

	/*! \brief Set 
	 */
	void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata  conversion_tag_v3_goal_metadata);
	/*! \brief Get 
	 */
	FrequencyGoalMetadata getFrequencyGoalMetadata();

	/*! \brief Set 
	 */
	void setFrequencyGoalMetadata(FrequencyGoalMetadata  frequency_goal_metadata);
	/*! \brief Get 
	 */
	ScrollupGoalMetadata getScrollupGoalMetadata();

	/*! \brief Set 
	 */
	void setScrollupGoalMetadata(ScrollupGoalMetadata  scrollup_goal_metadata);

private:
	ConversionTagV3GoalMetadata conversion_tag_v3_goal_metadata;
	FrequencyGoalMetadata frequency_goal_metadata;
	ScrollupGoalMetadata scrollup_goal_metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NullableOptimizationGoalMetadata_H_ */
