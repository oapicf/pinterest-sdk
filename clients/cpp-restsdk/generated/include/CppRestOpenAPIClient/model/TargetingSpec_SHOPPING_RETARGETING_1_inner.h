/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * TargetingSpec_SHOPPING_RETARGETING_1_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TargetingSpec_SHOPPING_RETARGETING_1_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TargetingSpec_SHOPPING_RETARGETING_1_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  TargetingSpec_SHOPPING_RETARGETING_1_inner
    : public ModelBase
{
public:
    TargetingSpec_SHOPPING_RETARGETING_1_inner();
    virtual ~TargetingSpec_SHOPPING_RETARGETING_1_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// TargetingSpec_SHOPPING_RETARGETING_1_inner members

    /// <summary>
    /// 
    /// </summary>
    int32_t getLookbackWindow() const;
    bool lookbackWindowIsSet() const;
    void unsetLookback_window();

    void setLookbackWindow(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<int32_t>& getTagTypes();
    bool tagTypesIsSet() const;
    void unsetTag_types();

    void setTagTypes(std::vector<int32_t> value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getExclusionWindow() const;
    bool exclusionWindowIsSet() const;
    void unsetExclusion_window();

    void setExclusionWindow(int32_t value);


protected:
    int32_t m_Lookback_window;
    bool m_Lookback_windowIsSet;
    std::vector<int32_t> m_Tag_types;
    bool m_Tag_typesIsSet;
    int32_t m_Exclusion_window;
    bool m_Exclusion_windowIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TargetingSpec_SHOPPING_RETARGETING_1_inner_H_ */