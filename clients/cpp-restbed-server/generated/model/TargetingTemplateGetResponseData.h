/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * TargetingTemplateGetResponseData.h
 *
 * 
 */

#ifndef TargetingTemplateGetResponseData_H_
#define TargetingTemplateGetResponseData_H_



#include "TargetingSpec.h"
#include "PlacementGroupType.h"
#include "TargetingTemplateAudienceSizing.h"
#include <string>
#include "TrackingUrls.h"
#include "TargetingTemplateKeyword.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "TargetingTemplateResponseData.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  TargetingTemplateGetResponseData : public TargetingTemplateResponseData
{
public:
    TargetingTemplateGetResponseData() = default;
    explicit TargetingTemplateGetResponseData(boost::property_tree::ptree const& pt);
    virtual ~TargetingTemplateGetResponseData() = default;

    TargetingTemplateGetResponseData(const TargetingTemplateGetResponseData& other) = default; // copy constructor
    TargetingTemplateGetResponseData(TargetingTemplateGetResponseData&& other) noexcept = default; // move constructor

    TargetingTemplateGetResponseData& operator=(const TargetingTemplateGetResponseData& other) = default; // copy assignment
    TargetingTemplateGetResponseData& operator=(TargetingTemplateGetResponseData&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// TargetingTemplateGetResponseData members

    /// <summary>
    /// targeting template name
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
    /// </summary>
    bool isAutoTargetingEnabled() const;
    void setAutoTargetingEnabled(bool value);

    /// <summary>
    /// 
    /// </summary>
    TargetingSpec getTargetingAttributes() const;
    void setTargetingAttributes(TargetingSpec value);

    /// <summary>
    /// 
    /// </summary>
    PlacementGroupType getPlacementGroup() const;
    void setPlacementGroup(PlacementGroupType value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<TargetingTemplateKeyword> getKeywords() const;
    void setKeywords(std::vector<TargetingTemplateKeyword> value);

    /// <summary>
    /// 
    /// </summary>
    TrackingUrls getTrackingUrls() const;
    void setTrackingUrls(TrackingUrls value);

    /// <summary>
    /// Targeting template ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Targeting template created time. Unix timestamp in seconds.
    /// </summary>
    int32_t getCreatedTime() const;
    void setCreatedTime(int32_t value);

    /// <summary>
    /// Targeting template updated time.Unix timestamp in seconds.
    /// </summary>
    int32_t getUpdatedTime() const;
    void setUpdatedTime(int32_t value);

    /// <summary>
    /// The ID of the advertiser that this targeting template belongs to.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string value);

    /// <summary>
    /// Indicate targeting template is active or Deleted
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// 
    /// </summary>
    TargetingTemplateAudienceSizing getSizing() const;
    void setSizing(TargetingTemplateAudienceSizing value);

    /// <summary>
    /// Inform if the targeting template is valid (ex. would be false if has revoked audience)
    /// </summary>
    bool isValid() const;
    void setValid(bool value);

protected:
    std::string m_Name = "";
    bool m_Auto_targeting_enabled = true;
    TargetingSpec m_Targeting_attributes;
    PlacementGroupType m_Placement_group = PlacementGroupType{};
    std::vector<TargetingTemplateKeyword> m_Keywords;
    TrackingUrls m_Tracking_urls;
    std::string m_Id = "";
    int32_t m_Created_time = 0;
    int32_t m_Updated_time = 0;
    std::string m_Ad_account_id = "";
    std::string m_Status = "ACTIVE";
    TargetingTemplateAudienceSizing m_Sizing;
    bool m_Valid = false;
};

std::vector<TargetingTemplateGetResponseData> createTargetingTemplateGetResponseDataVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<TargetingTemplateGetResponseData>(const TargetingTemplateGetResponseData& val) {
    return val.toPropertyTree();
}

template<>
inline TargetingTemplateGetResponseData fromPt<TargetingTemplateGetResponseData>(const boost::property_tree::ptree& pt) {
    TargetingTemplateGetResponseData ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* TargetingTemplateGetResponseData_H_ */
