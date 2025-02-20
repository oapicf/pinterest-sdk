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
 * TemplateResponse_date_range.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TemplateResponse_date_range_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TemplateResponse_date_range_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/TemplateResponse_date_range_absolute_date_range.h"
#include "CppRestOpenAPIClient/model/TemplateResponse_date_range_relative_date_range.h"
#include "CppRestOpenAPIClient/model/TemplateResponse_date_range_dynamic_date_range.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class TemplateResponse_date_range_dynamic_date_range;
class TemplateResponse_date_range_relative_date_range;
class TemplateResponse_date_range_absolute_date_range;


/// <summary>
/// 
/// </summary>
class  TemplateResponse_date_range
    : public ModelBase
{
public:
    TemplateResponse_date_range();
    virtual ~TemplateResponse_date_range();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// TemplateResponse_date_range members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TemplateResponse_date_range_dynamic_date_range> getDynamicDateRange() const;
    bool dynamicDateRangeIsSet() const;
    void unsetDynamic_date_range();

    void setDynamicDateRange(const std::shared_ptr<TemplateResponse_date_range_dynamic_date_range>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TemplateResponse_date_range_relative_date_range> getRelativeDateRange() const;
    bool relativeDateRangeIsSet() const;
    void unsetRelative_date_range();

    void setRelativeDateRange(const std::shared_ptr<TemplateResponse_date_range_relative_date_range>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TemplateResponse_date_range_absolute_date_range> getAbsoluteDateRange() const;
    bool absoluteDateRangeIsSet() const;
    void unsetAbsolute_date_range();

    void setAbsoluteDateRange(const std::shared_ptr<TemplateResponse_date_range_absolute_date_range>& value);


protected:
    std::shared_ptr<TemplateResponse_date_range_dynamic_date_range> m_Dynamic_date_range;
    bool m_Dynamic_date_rangeIsSet;
    std::shared_ptr<TemplateResponse_date_range_relative_date_range> m_Relative_date_range;
    bool m_Relative_date_rangeIsSet;
    std::shared_ptr<TemplateResponse_date_range_absolute_date_range> m_Absolute_date_range;
    bool m_Absolute_date_rangeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TemplateResponse_date_range_H_ */
