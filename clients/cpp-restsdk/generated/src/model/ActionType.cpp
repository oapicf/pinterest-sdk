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



#include "CppRestOpenAPIClient/model/ActionType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

ActionType::eActionType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("CLICKTHROUGH")))
        return ActionType::eActionType::ActionType_CLICKTHROUGH;
    if (val == utility::conversions::to_string_t(U("IMPRESSION")))
        return ActionType::eActionType::ActionType_IMPRESSION;
    if (val == utility::conversions::to_string_t(U("VIDEO_V_50_MRC")))
        return ActionType::eActionType::ActionType_VIDEO_V_50_MRC;
    return {};
}

EnumUnderlyingType fromEnum(ActionType::eActionType e)
{
    switch (e)
    {
    case ActionType::eActionType::ActionType_CLICKTHROUGH:
        return U("CLICKTHROUGH");
    case ActionType::eActionType::ActionType_IMPRESSION:
        return U("IMPRESSION");
    case ActionType::eActionType::ActionType_VIDEO_V_50_MRC:
        return U("VIDEO_V_50_MRC");
    default:
        break;
    }
    return {};
}
}

ActionType::ActionType()
{
}

ActionType::~ActionType()
{
}

void ActionType::validate()
{
    // TODO: implement validation
}

web::json::value ActionType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool ActionType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void ActionType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool ActionType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

ActionType::eActionType ActionType::getValue() const
{
   return m_value;
}

void ActionType::setValue(ActionType::eActionType const value)
{
   m_value = value;
}


}
}
}
}


