
/*
 * OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_
#define TINY_CPP_CLIENT_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows{
public:

    /*! \brief Constructor.
	 */
    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();
    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int click_window_days{};
    int engagement_window_days{};
    int view_window_days{};
};
}

#endif /* TINY_CPP_CLIENT_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_ */
