
/*
 * OptimizationGoalMetadata_frequency_goal_metadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OptimizationGoalMetadata_frequency_goal_metadata_H_
#define TINY_CPP_CLIENT_OptimizationGoalMetadata_frequency_goal_metadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OptimizationGoalMetadata_frequency_goal_metadata{
public:

    /*! \brief Constructor.
	 */
    OptimizationGoalMetadata_frequency_goal_metadata();
    OptimizationGoalMetadata_frequency_goal_metadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptimizationGoalMetadata_frequency_goal_metadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Frequency target can only be between 2 and 20
	 */
	int getFrequency();

	/*! \brief Set Frequency target can only be between 2 and 20
	 */
	void setFrequency(int  frequency);
	/*! \brief Get User entity counts time range
	 */
	std::string getTimerange();

	/*! \brief Set User entity counts time range
	 */
	void setTimerange(std::string  timerange);


    private:
    int frequency{};
    std::string timerange{};
};
}

#endif /* TINY_CPP_CLIENT_OptimizationGoalMetadata_frequency_goal_metadata_H_ */
