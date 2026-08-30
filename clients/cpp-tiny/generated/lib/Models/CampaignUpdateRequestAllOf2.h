
/*
 * CampaignUpdateRequestAllOf2.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignUpdateRequestAllOf2_H_
#define TINY_CPP_CLIENT_CampaignUpdateRequestAllOf2_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignBidOptionsUpdate.h"
#include "IntendedPromotionType.h"
#include "ObjectiveType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignUpdateRequestAllOf2{
public:

    /*! \brief Constructor.
	 */
    CampaignUpdateRequestAllOf2();
    CampaignUpdateRequestAllOf2(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignUpdateRequestAllOf2();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignBidOptionsUpdate getBidOptions();

	/*! \brief Set 
	 */
	void setBidOptions(CampaignBidOptionsUpdate bid_options);
	/*! \brief Get 
	 */
	IntendedPromotionType getIntendedPromotionType();

	/*! \brief Set 
	 */
	void setIntendedPromotionType(IntendedPromotionType intended_promotion_type);
	/*! \brief Get Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
	 */
	bool isIsLtvOptimized();

	/*! \brief Set Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
	 */
	void setIsLtvOptimized(bool is_ltv_optimized);
	/*! \brief Get Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
	 */
	bool isIsPerformancePlus();

	/*! \brief Set Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
	 */
	void setIsPerformancePlus(bool is_performance_plus);
	/*! \brief Get Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
	 */
	bool isIsTopOfSearch();

	/*! \brief Set Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
	 */
	void setIsTopOfSearch(bool is_top_of_search);
	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType objective_type);


    private:
    CampaignBidOptionsUpdate bid_options;
    IntendedPromotionType intended_promotion_type;
    bool is_ltv_optimized{};
    bool is_performance_plus{};
    bool is_top_of_search{};
    ObjectiveType objective_type;
};
}

#endif /* TINY_CPP_CLIENT_CampaignUpdateRequestAllOf2_H_ */
