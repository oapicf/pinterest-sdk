/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AdGroupAudienceSizingRequest.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AdGroupAudienceSizingRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AdGroupAudienceSizingRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/AdGroupAudienceSizingRequest_keywords_inner.h"
#include "CppRestOpenAPIClient/model/PlacementGroupType.h"
#include <cpprest/details/basic_types.h>
#include <vector>
#include "CppRestOpenAPIClient/model/TargetingSpec.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class TargetingSpec;
class AdGroupAudienceSizingRequest_keywords_inner;

/// <summary>
/// 
/// </summary>
class  AdGroupAudienceSizingRequest
    : public ModelBase
{
public:
    AdGroupAudienceSizingRequest();
    virtual ~AdGroupAudienceSizingRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AdGroupAudienceSizingRequest members

    /// <summary>
    /// Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
    /// </summary>
    bool isAutoTargetingEnabled() const;
    bool autoTargetingEnabledIsSet() const;
    void unsetAuto_targeting_enabled();

    void setAutoTargetingEnabled(bool value);

    /// <summary>
    /// &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
    /// </summary>
    std::shared_ptr<PlacementGroupType> getPlacementGroup() const;
    bool placementGroupIsSet() const;
    void unsetPlacement_group();

    void setPlacementGroup(const std::shared_ptr<PlacementGroupType>& value);

    /// <summary>
    /// Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    /// </summary>
    std::vector<utility::string_t>& getCreativeTypes();
    bool creativeTypesIsSet() const;
    void unsetCreative_types();

    void setCreativeTypes(const std::vector<utility::string_t>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TargetingSpec> getTargetingSpec() const;
    bool targetingSpecIsSet() const;
    void unsetTargeting_spec();

    void setTargetingSpec(const std::shared_ptr<TargetingSpec>& value);

    /// <summary>
    /// Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
    /// </summary>
    std::vector<utility::string_t>& getProductGroupIds();
    bool productGroupIdsIsSet() const;
    void unsetProduct_group_ids();

    void setProductGroupIds(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    /// </summary>
    std::vector<std::shared_ptr<AdGroupAudienceSizingRequest_keywords_inner>>& getKeywords();
    bool keywordsIsSet() const;
    void unsetKeywords();

    void setKeywords(const std::vector<std::shared_ptr<AdGroupAudienceSizingRequest_keywords_inner>>& value);


protected:
    bool m_Auto_targeting_enabled;
    bool m_Auto_targeting_enabledIsSet;
    std::shared_ptr<PlacementGroupType> m_Placement_group;
    bool m_Placement_groupIsSet;
    std::vector<utility::string_t> m_Creative_types;
    bool m_Creative_typesIsSet;
    std::shared_ptr<TargetingSpec> m_Targeting_spec;
    bool m_Targeting_specIsSet;
    std::vector<utility::string_t> m_Product_group_ids;
    bool m_Product_group_idsIsSet;
    std::vector<std::shared_ptr<AdGroupAudienceSizingRequest_keywords_inner>> m_Keywords;
    bool m_KeywordsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AdGroupAudienceSizingRequest_H_ */