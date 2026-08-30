
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
#include "ConversionTagV3GoalMetadata.h"
#include "FrequencyGoalMetadata.h"
#include "ScrollupGoalMetadata.h"

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
	ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata();

	/*! \brief Set 
	 */
	void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversion_tag_v3_goal_metadata);
	/*! \brief Get 
	 */
	FrequencyGoalMetadata getFrequencyGoalMetadata();

	/*! \brief Set 
	 */
	void setFrequencyGoalMetadata(FrequencyGoalMetadata frequency_goal_metadata);
	/*! \brief Get 
	 */
	ScrollupGoalMetadata getScrollupGoalMetadata();

	/*! \brief Set 
	 */
	void setScrollupGoalMetadata(ScrollupGoalMetadata scrollup_goal_metadata);


    private:
    ConversionTagV3GoalMetadata conversion_tag_v3_goal_metadata;
    FrequencyGoalMetadata frequency_goal_metadata;
    ScrollupGoalMetadata scrollup_goal_metadata;
};
}

#endif /* TINY_CPP_CLIENT_OptimizationGoalMetadata_H_ */
