
/*
 * ConversionTagV3GoalMetadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionTagV3GoalMetadata_H_
#define TINY_CPP_CLIENT_ConversionTagV3GoalMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AttributionWindows.h"
#include "ConversionEvent.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionTagV3GoalMetadata{
public:

    /*! \brief Constructor.
	 */
    ConversionTagV3GoalMetadata();
    ConversionTagV3GoalMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionTagV3GoalMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AttributionWindows getAttributionWindows();

	/*! \brief Set 
	 */
	void setAttributionWindows(AttributionWindows attribution_windows);
	/*! \brief Get 
	 */
	ConversionEvent getConversionEvent();

	/*! \brief Set 
	 */
	void setConversionEvent(ConversionEvent conversion_event);
	/*! \brief Get 
	 */
	std::string getConversionTagId();

	/*! \brief Set 
	 */
	void setConversionTagId(std::string conversion_tag_id);
	/*! \brief Get 
	 */
	std::string getCpaGoalValueInMicroCurrency();

	/*! \brief Set 
	 */
	void setCpaGoalValueInMicroCurrency(std::string cpa_goal_value_in_micro_currency);
	/*! \brief Get Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
	 */
	bool isIsRoasOptimized();

	/*! \brief Set Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
	 */
	void setIsRoasOptimized(bool is_roas_optimized);
	/*! \brief Get Event name for custom or standard events mapped to an oCPM model
	 */
	std::string getReportingEvent();

	/*! \brief Set Event name for custom or standard events mapped to an oCPM model
	 */
	void setReportingEvent(std::string reporting_event);


    private:
    AttributionWindows attribution_windows;
    ConversionEvent conversion_event;
    std::string conversion_tag_id{};
    std::string cpa_goal_value_in_micro_currency{};
    bool is_roas_optimized{};
    std::string reporting_event{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionTagV3GoalMetadata_H_ */
