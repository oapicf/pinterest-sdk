
/*
 * OptimizationGoalMetadata_scrollup_goal_metadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OptimizationGoalMetadata_scrollup_goal_metadata_H_
#define TINY_CPP_CLIENT_OptimizationGoalMetadata_scrollup_goal_metadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OptimizationGoalMetadata_scrollup_goal_metadata{
public:

    /*! \brief Constructor.
	 */
    OptimizationGoalMetadata_scrollup_goal_metadata();
    OptimizationGoalMetadata_scrollup_goal_metadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptimizationGoalMetadata_scrollup_goal_metadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getScrollupGoalValueInMicroCurrency();

	/*! \brief Set 
	 */
	void setScrollupGoalValueInMicroCurrency(std::string  scrollup_goal_value_in_micro_currency);


    private:
    std::string scrollup_goal_value_in_micro_currency{};
};
}

#endif /* TINY_CPP_CLIENT_OptimizationGoalMetadata_scrollup_goal_metadata_H_ */
