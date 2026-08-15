
/*
 * OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_H_
#define TINY_CPP_CLIENT_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OptimizationGoalMetadata_conversion_tag_v3_goal_metadata{
public:

    /*! \brief Constructor.
	 */
    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata();
    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
	 */
	bool isIsRoasOptimized();

	/*! \brief Set Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
	 */
	void setIsRoasOptimized(bool  is_roas_optimized);
	/*! \brief Get Conversion learning model type
	 */
	std::string getLearningModeType();

	/*! \brief Set Conversion learning model type
	 */
	void setLearningModeType(std::string  learning_mode_type);
	/*! \brief Get Event name for custom or standard events mapped to an oCPM model
	 */
	std::string getReportingEvent();

	/*! \brief Set Event name for custom or standard events mapped to an oCPM model
	 */
	void setReportingEvent(std::string  reporting_event);


    private:
    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows attribution_windows;
    std::string conversion_event{};
    std::string conversion_tag_id{};
    std::string cpa_goal_value_in_micro_currency{};
    bool is_roas_optimized{};
    std::string learning_mode_type{};
    std::string reporting_event{};
};
}

#endif /* TINY_CPP_CLIENT_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_H_ */
