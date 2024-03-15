/*
 * OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h
 *
 * 
 */

#ifndef _OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_
#define _OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_


#include <string>
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

class OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows : public Object {
public:
	/*! \brief Constructor.
	 */
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getClickWindowDays();

	/*! \brief Set 
	 */
	void setClickWindowDays(int  click_window_days);
	/*! \brief Get 
	 */
	int getEngagementWindowDays();

	/*! \brief Set 
	 */
	void setEngagementWindowDays(int  engagement_window_days);
	/*! \brief Get 
	 */
	int getViewWindowDays();

	/*! \brief Set 
	 */
	void setViewWindowDays(int  view_window_days);

private:
	int click_window_days;
	int engagement_window_days;
	int view_window_days;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_ */
