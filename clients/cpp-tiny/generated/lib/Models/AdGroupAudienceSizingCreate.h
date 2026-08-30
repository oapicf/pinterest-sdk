
/*
 * AdGroupAudienceSizingCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_AdGroupAudienceSizingCreate_H_
#define TINY_CPP_CLIENT_AdGroupAudienceSizingCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdGroupAudienceSizingCreativeTypes.h"
#include "AdGroupAudienceSizingKeyword.h"
#include "AdgroupPlacementGroupType.h"
#include "TargetingSpecOptimal.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdGroupAudienceSizingCreate{
public:

    /*! \brief Constructor.
	 */
    AdGroupAudienceSizingCreate();
    AdGroupAudienceSizingCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupAudienceSizingCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	 */
	bool isAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	 */
	void setAutoTargetingEnabled(bool auto_targeting_enabled);
	/*! \brief Get Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	std::list<AdGroupAudienceSizingCreativeTypes> getCreativeTypes();

	/*! \brief Set Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	 */
	void setCreativeTypes(std::list<AdGroupAudienceSizingCreativeTypes> creative_types);
	/*! \brief Get Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	std::list<AdGroupAudienceSizingKeyword> getKeywords();

	/*! \brief Set Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	 */
	void setKeywords(std::list<AdGroupAudienceSizingKeyword> keywords);
	/*! \brief Get [Placement group](/docs/redoc/#section/Placement-group).
	 */
	AdgroupPlacementGroupType getPlacementGroup();

	/*! \brief Set [Placement group](/docs/redoc/#section/Placement-group).
	 */
	void setPlacementGroup(AdgroupPlacementGroupType placement_group);
	/*! \brief Get Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	 */
	std::list<std::string> getProductGroupIds();

	/*! \brief Set Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	 */
	void setProductGroupIds(std::list<std::string> product_group_ids);
	/*! \brief Get 
	 */
	TargetingSpecOptimal getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpecOptimal targeting_spec);


    private:
    bool auto_targeting_enabled{};
    std::list<AdGroupAudienceSizingCreativeTypes> creative_types;
    std::list<AdGroupAudienceSizingKeyword> keywords;
    AdgroupPlacementGroupType placement_group;
    std::list<std::string> product_group_ids;
    TargetingSpecOptimal targeting_spec;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupAudienceSizingCreate_H_ */
