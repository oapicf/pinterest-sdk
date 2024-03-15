/*
 * OptimizationGoalMetadata_frequency_goal_metadata.h
 *
 * 
 */

#ifndef _OptimizationGoalMetadata_frequency_goal_metadata_H_
#define _OptimizationGoalMetadata_frequency_goal_metadata_H_


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

class OptimizationGoalMetadata_frequency_goal_metadata : public Object {
public:
	/*! \brief Constructor.
	 */
	OptimizationGoalMetadata_frequency_goal_metadata();
	OptimizationGoalMetadata_frequency_goal_metadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptimizationGoalMetadata_frequency_goal_metadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getFrequency();

	/*! \brief Set 
	 */
	void setFrequency(int  frequency);
	/*! \brief Get User entity counts time range
	 */
	std::string getTimerange();

	/*! \brief Set User entity counts time range
	 */
	void setTimerange(std::string  timerange);

private:
	int frequency;
	std::string timerange;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OptimizationGoalMetadata_frequency_goal_metadata_H_ */
