/*
 * AdGroupAudienceSizingRequest.h
 *
 * 
 */

#ifndef _AdGroupAudienceSizingRequest_H_
#define _AdGroupAudienceSizingRequest_H_


#include <string>
#include "AdGroupAudienceSizingRequest_keywords_inner.h"
#include "PlacementGroupType.h"
#include "TargetingSpec.h"
#include <list>
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

class AdGroupAudienceSizingRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupAudienceSizingRequest();
	AdGroupAudienceSizingRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupAudienceSizingRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
	 */
	void setPlacementGroup(PlacementGroupType  placement_group);
	/*! \brief Get Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	std::list<std::string> getCreativeTypes();

	/*! \brief Set Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	void setCreativeTypes(std::list <std::string> creative_types);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpec  targeting_spec);
	/*! \brief Get Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	 */
	std::list<std::string> getProductGroupIds();

	/*! \brief Set Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	 */
	void setProductGroupIds(std::list <std::string> product_group_ids);
	/*! \brief Get Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	std::list<AdGroupAudienceSizingRequest_keywords_inner> getKeywords();

	/*! \brief Set Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	void setKeywords(std::list <AdGroupAudienceSizingRequest_keywords_inner> keywords);

private:
	bool auto_targeting_enabled;
	PlacementGroupType placement_group;
	std::list <std::string>creative_types;
	TargetingSpec targeting_spec;
	std::list <std::string>product_group_ids;
	std::list <AdGroupAudienceSizingRequest_keywords_inner>keywords;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupAudienceSizingRequest_H_ */
