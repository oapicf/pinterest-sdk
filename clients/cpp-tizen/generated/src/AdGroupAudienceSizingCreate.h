/*
 * AdGroupAudienceSizingCreate.h
 *
 * Resource create operation model.
 */

#ifndef _AdGroupAudienceSizingCreate_H_
#define _AdGroupAudienceSizingCreate_H_


#include <string>
#include "AdGroupAudienceSizingCreativeTypes.h"
#include "AdGroupAudienceSizingKeyword.h"
#include "AdgroupPlacementGroupType.h"
#include "TargetingSpecOptimal.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdGroupAudienceSizingCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupAudienceSizingCreate();
	AdGroupAudienceSizingCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupAudienceSizingCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	std::list<AdGroupAudienceSizingCreativeTypes> getCreativeTypes();

	/*! \brief Set Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	void setCreativeTypes(std::list <AdGroupAudienceSizingCreativeTypes> creative_types);
	/*! \brief Get Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	std::list<AdGroupAudienceSizingKeyword> getKeywords();

	/*! \brief Set Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	void setKeywords(std::list <AdGroupAudienceSizingKeyword> keywords);
	/*! \brief Get [Placement group](/docs/redoc/#section/Placement-group).
	 */
	AdgroupPlacementGroupType getPlacementGroup();

	/*! \brief Set [Placement group](/docs/redoc/#section/Placement-group).
	 */
	void setPlacementGroup(AdgroupPlacementGroupType  placement_group);
	/*! \brief Get Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	 */
	std::list<std::string> getProductGroupIds();

	/*! \brief Set Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	 */
	void setProductGroupIds(std::list <std::string> product_group_ids);
	/*! \brief Get 
	 */
	TargetingSpecOptimal getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpecOptimal  targeting_spec);

private:
	bool auto_targeting_enabled;
	std::list <AdGroupAudienceSizingCreativeTypes>creative_types;
	std::list <AdGroupAudienceSizingKeyword>keywords;
	AdgroupPlacementGroupType placement_group;
	std::list <std::string>product_group_ids;
	TargetingSpecOptimal targeting_spec;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupAudienceSizingCreate_H_ */
