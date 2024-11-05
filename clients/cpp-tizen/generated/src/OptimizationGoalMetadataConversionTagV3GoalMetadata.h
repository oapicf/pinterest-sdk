/*
 * OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h
 *
 * 
 */

#ifndef _OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_H_
#define _OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_H_


#include <string>
#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h"
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

class OptimizationGoalMetadata_conversion_tag_v3_goal_metadata : public Object {
public:
	/*! \brief Constructor.
	 */
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata();
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows getAttributionWindows();

	/*! \brief Set 
	 */
	void setAttributionWindows(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows  attribution_windows);
	/*! \brief Get 
	 */
	std::string getConversionEvent();

	/*! \brief Set 
	 */
	void setConversionEvent(std::string  conversion_event);
	/*! \brief Get 
	 */
	std::string getConversionTagId();

	/*! \brief Set 
	 */
	void setConversionTagId(std::string  conversion_tag_id);
	/*! \brief Get 
	 */
	std::string getCpaGoalValueInMicroCurrency();

	/*! \brief Set 
	 */
	void setCpaGoalValueInMicroCurrency(std::string  cpa_goal_value_in_micro_currency);
	/*! \brief Get ROAS optimization is not supported
	 */
	bool getIsRoasOptimized();

	/*! \brief Set ROAS optimization is not supported
	 */
	void setIsRoasOptimized(bool  is_roas_optimized);
	/*! \brief Get Conversion learning model type
	 */
	std::string getLearningModeType();

	/*! \brief Set Conversion learning model type
	 */
	void setLearningModeType(std::string  learning_mode_type);

private:
	OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows attribution_windows;
	std::string conversion_event;
	std::string conversion_tag_id;
	std::string cpa_goal_value_in_micro_currency;
	bool is_roas_optimized;
	std::string learning_mode_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_H_ */
