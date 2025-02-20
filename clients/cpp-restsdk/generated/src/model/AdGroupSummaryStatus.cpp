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



#include "CppRestOpenAPIClient/model/AdGroupSummaryStatus.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

AdGroupSummaryStatus::eAdGroupSummaryStatus toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("RUNNING")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_RUNNING;
    if (val == utility::conversions::to_string_t(U("PAUSED")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_PAUSED;
    if (val == utility::conversions::to_string_t(U("NOT_STARTED")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_NOT_STARTED;
    if (val == utility::conversions::to_string_t(U("COMPLETED")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_COMPLETED;
    if (val == utility::conversions::to_string_t(U("ADVERTISER_DISABLED")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_ADVERTISER_DISABLED;
    if (val == utility::conversions::to_string_t(U("ARCHIVED")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_ARCHIVED;
    if (val == utility::conversions::to_string_t(U("DRAFT")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_DRAFT;
    if (val == utility::conversions::to_string_t(U("DELETED_DRAFT")))
        return AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_DELETED_DRAFT;
    return {};
}

EnumUnderlyingType fromEnum(AdGroupSummaryStatus::eAdGroupSummaryStatus e)
{
    switch (e)
    {
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_RUNNING:
        return U("RUNNING");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_PAUSED:
        return U("PAUSED");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_NOT_STARTED:
        return U("NOT_STARTED");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_COMPLETED:
        return U("COMPLETED");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_ADVERTISER_DISABLED:
        return U("ADVERTISER_DISABLED");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_ARCHIVED:
        return U("ARCHIVED");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_DRAFT:
        return U("DRAFT");
    case AdGroupSummaryStatus::eAdGroupSummaryStatus::AdGroupSummaryStatus_DELETED_DRAFT:
        return U("DELETED_DRAFT");
    default:
        break;
    }
    return {};
}
}

AdGroupSummaryStatus::AdGroupSummaryStatus()
{
}

AdGroupSummaryStatus::~AdGroupSummaryStatus()
{
}

void AdGroupSummaryStatus::validate()
{
    // TODO: implement validation
}

web::json::value AdGroupSummaryStatus::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool AdGroupSummaryStatus::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void AdGroupSummaryStatus::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool AdGroupSummaryStatus::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

AdGroupSummaryStatus::eAdGroupSummaryStatus AdGroupSummaryStatus::getValue() const
{
   return m_value;
}

void AdGroupSummaryStatus::setValue(AdGroupSummaryStatus::eAdGroupSummaryStatus const value)
{
   m_value = value;
}


}
}
}
}


