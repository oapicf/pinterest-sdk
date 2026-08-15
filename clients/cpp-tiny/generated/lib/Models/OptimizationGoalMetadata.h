
/*
 * OptimizationGoalMetadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OptimizationGoalMetadata_H_
#define TINY_CPP_CLIENT_OptimizationGoalMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"
#include "OptimizationGoalMetadata_frequency_goal_metadata.h"
#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OptimizationGoalMetadata{
public:

    /*! \brief Constructor.
	 */
    OptimizationGoalMetadata();
    OptimizationGoalMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptimizationGoalMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_OptimizationGoalMetadata_H_ */
