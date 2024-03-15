/*
 * OptimizationGoalMetadata_scrollup_goal_metadata.h
 *
 * 
 */

#ifndef _OptimizationGoalMetadata_scrollup_goal_metadata_H_
#define _OptimizationGoalMetadata_scrollup_goal_metadata_H_


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

class OptimizationGoalMetadata_scrollup_goal_metadata : public Object {
public:
	/*! \brief Constructor.
	 */
	OptimizationGoalMetadata_scrollup_goal_metadata();
	OptimizationGoalMetadata_scrollup_goal_metadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptimizationGoalMetadata_scrollup_goal_metadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getScrollupGoalValueInMicroCurrency();

	/*! \brief Set 
	 */
	void setScrollupGoalValueInMicroCurrency(std::string  scrollup_goal_value_in_micro_currency);

private:
	std::string scrollup_goal_value_in_micro_currency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OptimizationGoalMetadata_scrollup_goal_metadata_H_ */
