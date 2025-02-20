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



#include "CppRestOpenAPIClient/model/Permissions.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

Permissions::ePermissions toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("ADMIN")))
        return Permissions::ePermissions::Permissions_ADMIN;
    if (val == utility::conversions::to_string_t(U("ANALYST")))
        return Permissions::ePermissions::Permissions_ANALYST;
    if (val == utility::conversions::to_string_t(U("FINANCE_MANAGER")))
        return Permissions::ePermissions::Permissions_FINANCE_MANAGER;
    if (val == utility::conversions::to_string_t(U("AUDIENCE_MANAGER")))
        return Permissions::ePermissions::Permissions_AUDIENCE_MANAGER;
    if (val == utility::conversions::to_string_t(U("CAMPAIGN_MANAGER")))
        return Permissions::ePermissions::Permissions_CAMPAIGN_MANAGER;
    if (val == utility::conversions::to_string_t(U("CATALOGS_MANAGER")))
        return Permissions::ePermissions::Permissions_CATALOGS_MANAGER;
    if (val == utility::conversions::to_string_t(U("PROFILE_PUBLISHER")))
        return Permissions::ePermissions::Permissions_PROFILE_PUBLISHER;
    return {};
}

EnumUnderlyingType fromEnum(Permissions::ePermissions e)
{
    switch (e)
    {
    case Permissions::ePermissions::Permissions_ADMIN:
        return U("ADMIN");
    case Permissions::ePermissions::Permissions_ANALYST:
        return U("ANALYST");
    case Permissions::ePermissions::Permissions_FINANCE_MANAGER:
        return U("FINANCE_MANAGER");
    case Permissions::ePermissions::Permissions_AUDIENCE_MANAGER:
        return U("AUDIENCE_MANAGER");
    case Permissions::ePermissions::Permissions_CAMPAIGN_MANAGER:
        return U("CAMPAIGN_MANAGER");
    case Permissions::ePermissions::Permissions_CATALOGS_MANAGER:
        return U("CATALOGS_MANAGER");
    case Permissions::ePermissions::Permissions_PROFILE_PUBLISHER:
        return U("PROFILE_PUBLISHER");
    default:
        break;
    }
    return {};
}
}

Permissions::Permissions()
{
}

Permissions::~Permissions()
{
}

void Permissions::validate()
{
    // TODO: implement validation
}

web::json::value Permissions::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool Permissions::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void Permissions::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool Permissions::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

Permissions::ePermissions Permissions::getValue() const
{
   return m_value;
}

void Permissions::setValue(Permissions::ePermissions const value)
{
   m_value = value;
}


}
}
}
}


