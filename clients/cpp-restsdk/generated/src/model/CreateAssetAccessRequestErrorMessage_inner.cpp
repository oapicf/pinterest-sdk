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



#include "CppRestOpenAPIClient/model/CreateAssetAccessRequestErrorMessage_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateAssetAccessRequestErrorMessage_inner::CreateAssetAccessRequestErrorMessage_inner()
{
    m_Code = 0;
    m_CodeIsSet = false;
    m_MessagesIsSet = false;
}

CreateAssetAccessRequestErrorMessage_inner::~CreateAssetAccessRequestErrorMessage_inner()
{
}

void CreateAssetAccessRequestErrorMessage_inner::validate()
{
    // TODO: implement validation
}

web::json::value CreateAssetAccessRequestErrorMessage_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CodeIsSet)
    {
        val[utility::conversions::to_string_t(U("code"))] = ModelBase::toJson(m_Code);
    }
    if(m_MessagesIsSet)
    {
        val[utility::conversions::to_string_t(U("messages"))] = ModelBase::toJson(m_Messages);
    }

    return val;
}

bool CreateAssetAccessRequestErrorMessage_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("code"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("code")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCode;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCode);
            setCode(refVal_setCode);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("messages"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("messages")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setMessages;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMessages);
            setMessages(refVal_setMessages);
        }
    }
    return ok;
}

void CreateAssetAccessRequestErrorMessage_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("code")), m_Code));
    }
    if(m_MessagesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("messages")), m_Messages));
    }
}

bool CreateAssetAccessRequestErrorMessage_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("code"))))
    {
        int32_t refVal_setCode;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("code"))), refVal_setCode );
        setCode(refVal_setCode);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("messages"))))
    {
        std::vector<utility::string_t> refVal_setMessages;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("messages"))), refVal_setMessages );
        setMessages(refVal_setMessages);
    }
    return ok;
}

int32_t CreateAssetAccessRequestErrorMessage_inner::getCode() const
{
    return m_Code;
}

void CreateAssetAccessRequestErrorMessage_inner::setCode(int32_t value)
{
    m_Code = value;
    m_CodeIsSet = true;
}

bool CreateAssetAccessRequestErrorMessage_inner::codeIsSet() const
{
    return m_CodeIsSet;
}

void CreateAssetAccessRequestErrorMessage_inner::unsetCode()
{
    m_CodeIsSet = false;
}
std::vector<utility::string_t>& CreateAssetAccessRequestErrorMessage_inner::getMessages()
{
    return m_Messages;
}

void CreateAssetAccessRequestErrorMessage_inner::setMessages(const std::vector<utility::string_t>& value)
{
    m_Messages = value;
    m_MessagesIsSet = true;
}

bool CreateAssetAccessRequestErrorMessage_inner::messagesIsSet() const
{
    return m_MessagesIsSet;
}

void CreateAssetAccessRequestErrorMessage_inner::unsetMessages()
{
    m_MessagesIsSet = false;
}
}
}
}
}


