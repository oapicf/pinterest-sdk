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



#include "CppRestOpenAPIClient/model/BaseInviteDataResponse_invite_data.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



BaseInviteDataResponse_invite_data::BaseInviteDataResponse_invite_data()
{
    m_Invite_expiration = 0;
    m_Invite_expirationIsSet = false;
    m_Invite_status = utility::conversions::to_string_t("");
    m_Invite_statusIsSet = false;
    m_Invite_type = utility::conversions::to_string_t("");
    m_Invite_typeIsSet = false;
    m_Last_updated_time = 0;
    m_Last_updated_timeIsSet = false;
    m_Sent_at = 0;
    m_Sent_atIsSet = false;
}

BaseInviteDataResponse_invite_data::~BaseInviteDataResponse_invite_data()
{
}

void BaseInviteDataResponse_invite_data::validate()
{
    // TODO: implement validation
}

web::json::value BaseInviteDataResponse_invite_data::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Invite_expirationIsSet)
    {
        val[utility::conversions::to_string_t(U("invite_expiration"))] = ModelBase::toJson(m_Invite_expiration);
    }
    if(m_Invite_statusIsSet)
    {
        val[utility::conversions::to_string_t(U("invite_status"))] = ModelBase::toJson(m_Invite_status);
    }
    if(m_Invite_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("invite_type"))] = ModelBase::toJson(m_Invite_type);
    }
    if(m_Last_updated_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("last_updated_time"))] = ModelBase::toJson(m_Last_updated_time);
    }
    if(m_Sent_atIsSet)
    {
        val[utility::conversions::to_string_t(U("sent_at"))] = ModelBase::toJson(m_Sent_at);
    }

    return val;
}

bool BaseInviteDataResponse_invite_data::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("invite_expiration"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("invite_expiration")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setInviteExpiration;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInviteExpiration);
            setInviteExpiration(refVal_setInviteExpiration);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("invite_status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("invite_status")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setInviteStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInviteStatus);
            setInviteStatus(refVal_setInviteStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("invite_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("invite_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setInviteType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInviteType);
            setInviteType(refVal_setInviteType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("last_updated_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("last_updated_time")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setLastUpdatedTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastUpdatedTime);
            setLastUpdatedTime(refVal_setLastUpdatedTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("sent_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sent_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setSentAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSentAt);
            setSentAt(refVal_setSentAt);
        }
    }
    return ok;
}

void BaseInviteDataResponse_invite_data::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Invite_expirationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("invite_expiration")), m_Invite_expiration));
    }
    if(m_Invite_statusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("invite_status")), m_Invite_status));
    }
    if(m_Invite_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("invite_type")), m_Invite_type));
    }
    if(m_Last_updated_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("last_updated_time")), m_Last_updated_time));
    }
    if(m_Sent_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sent_at")), m_Sent_at));
    }
}

bool BaseInviteDataResponse_invite_data::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("invite_expiration"))))
    {
        int32_t refVal_setInviteExpiration;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("invite_expiration"))), refVal_setInviteExpiration );
        setInviteExpiration(refVal_setInviteExpiration);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("invite_status"))))
    {
        utility::string_t refVal_setInviteStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("invite_status"))), refVal_setInviteStatus );
        setInviteStatus(refVal_setInviteStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("invite_type"))))
    {
        utility::string_t refVal_setInviteType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("invite_type"))), refVal_setInviteType );
        setInviteType(refVal_setInviteType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("last_updated_time"))))
    {
        int32_t refVal_setLastUpdatedTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("last_updated_time"))), refVal_setLastUpdatedTime );
        setLastUpdatedTime(refVal_setLastUpdatedTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sent_at"))))
    {
        int32_t refVal_setSentAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sent_at"))), refVal_setSentAt );
        setSentAt(refVal_setSentAt);
    }
    return ok;
}

int32_t BaseInviteDataResponse_invite_data::getInviteExpiration() const
{
    return m_Invite_expiration;
}

void BaseInviteDataResponse_invite_data::setInviteExpiration(int32_t value)
{
    m_Invite_expiration = value;
    m_Invite_expirationIsSet = true;
}

bool BaseInviteDataResponse_invite_data::inviteExpirationIsSet() const
{
    return m_Invite_expirationIsSet;
}

void BaseInviteDataResponse_invite_data::unsetInvite_expiration()
{
    m_Invite_expirationIsSet = false;
}
utility::string_t BaseInviteDataResponse_invite_data::getInviteStatus() const
{
    return m_Invite_status;
}

void BaseInviteDataResponse_invite_data::setInviteStatus(const utility::string_t& value)
{
    m_Invite_status = value;
    m_Invite_statusIsSet = true;
}

bool BaseInviteDataResponse_invite_data::inviteStatusIsSet() const
{
    return m_Invite_statusIsSet;
}

void BaseInviteDataResponse_invite_data::unsetInvite_status()
{
    m_Invite_statusIsSet = false;
}
utility::string_t BaseInviteDataResponse_invite_data::getInviteType() const
{
    return m_Invite_type;
}

void BaseInviteDataResponse_invite_data::setInviteType(const utility::string_t& value)
{
    m_Invite_type = value;
    m_Invite_typeIsSet = true;
}

bool BaseInviteDataResponse_invite_data::inviteTypeIsSet() const
{
    return m_Invite_typeIsSet;
}

void BaseInviteDataResponse_invite_data::unsetInvite_type()
{
    m_Invite_typeIsSet = false;
}
int32_t BaseInviteDataResponse_invite_data::getLastUpdatedTime() const
{
    return m_Last_updated_time;
}

void BaseInviteDataResponse_invite_data::setLastUpdatedTime(int32_t value)
{
    m_Last_updated_time = value;
    m_Last_updated_timeIsSet = true;
}

bool BaseInviteDataResponse_invite_data::lastUpdatedTimeIsSet() const
{
    return m_Last_updated_timeIsSet;
}

void BaseInviteDataResponse_invite_data::unsetLast_updated_time()
{
    m_Last_updated_timeIsSet = false;
}
int32_t BaseInviteDataResponse_invite_data::getSentAt() const
{
    return m_Sent_at;
}

void BaseInviteDataResponse_invite_data::setSentAt(int32_t value)
{
    m_Sent_at = value;
    m_Sent_atIsSet = true;
}

bool BaseInviteDataResponse_invite_data::sentAtIsSet() const
{
    return m_Sent_atIsSet;
}

void BaseInviteDataResponse_invite_data::unsetSent_at()
{
    m_Sent_atIsSet = false;
}
}
}
}
}


