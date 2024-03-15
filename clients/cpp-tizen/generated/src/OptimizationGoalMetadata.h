/*
 * OptimizationGoalMetadata.h
 *
 * 
 */

#ifndef _OptimizationGoalMetadata_H_
#define _OptimizationGoalMetadata_H_


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


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OptimizationGoalMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	OptimizationGoalMetadata();
	OptimizationGoalMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptimizationGoalMetadata();

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

#endif /* _OptimizationGoalMetadata_H_ */
