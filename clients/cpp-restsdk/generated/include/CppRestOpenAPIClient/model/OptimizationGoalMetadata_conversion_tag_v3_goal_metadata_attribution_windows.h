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
 * OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows
    : public ModelBase
{
public:
    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();
    virtual ~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows members

    /// <summary>
    /// 
    /// </summary>
    int32_t getClickWindowDays() const;
    bool clickWindowDaysIsSet() const;
    void unsetClick_window_days();

    void setClickWindowDays(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getEngagementWindowDays() const;
    bool engagementWindowDaysIsSet() const;
    void unsetEngagement_window_days();

    void setEngagementWindowDays(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getViewWindowDays() const;
    bool viewWindowDaysIsSet() const;
    void unsetView_window_days();

    void setViewWindowDays(int32_t value);


protected:
    int32_t m_Click_window_days;
    bool m_Click_window_daysIsSet;
    int32_t m_Engagement_window_days;
    bool m_Engagement_window_daysIsSet;
    int32_t m_View_window_days;
    bool m_View_window_daysIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_H_ */
