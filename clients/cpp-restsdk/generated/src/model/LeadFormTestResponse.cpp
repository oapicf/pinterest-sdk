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



#include "CppRestOpenAPIClient/model/LeadFormTestResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



LeadFormTestResponse::LeadFormTestResponse()
{
    m_Subscription_id = utility::conversions::to_string_t("");
    m_Subscription_idIsSet = false;
}

LeadFormTestResponse::~LeadFormTestResponse()
{
}

void LeadFormTestResponse::validate()
{
    // TODO: implement validation
}

web::json::value LeadFormTestResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Subscription_idIsSet)
    {
        val[utility::conversions::to_string_t(U("subscription_id"))] = ModelBase::toJson(m_Subscription_id);
    }

    return val;
}

bool LeadFormTestResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("subscription_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("subscription_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSubscriptionId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSubscriptionId);
            setSubscriptionId(refVal_setSubscriptionId);
        }
    }
    return ok;
}

void LeadFormTestResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Subscription_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("subscription_id")), m_Subscription_id));
    }
}

bool LeadFormTestResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("subscription_id"))))
    {
        utility::string_t refVal_setSubscriptionId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("subscription_id"))), refVal_setSubscriptionId );
        setSubscriptionId(refVal_setSubscriptionId);
    }
    return ok;
}

utility::string_t LeadFormTestResponse::getSubscriptionId() const
{
    return m_Subscription_id;
}

void LeadFormTestResponse::setSubscriptionId(const utility::string_t& value)
{
    m_Subscription_id = value;
    m_Subscription_idIsSet = true;
}

bool LeadFormTestResponse::subscriptionIdIsSet() const
{
    return m_Subscription_idIsSet;
}

void LeadFormTestResponse::unsetSubscription_id()
{
    m_Subscription_idIsSet = false;
}
}
}
}
}


