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



#include "CppRestOpenAPIClient/model/MembersToDeleteBody.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MembersToDeleteBody::MembersToDeleteBody()
{
    m_MembersIsSet = false;
}

MembersToDeleteBody::~MembersToDeleteBody()
{
}

void MembersToDeleteBody::validate()
{
    // TODO: implement validation
}

web::json::value MembersToDeleteBody::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_MembersIsSet)
    {
        val[utility::conversions::to_string_t(U("members"))] = ModelBase::toJson(m_Members);
    }

    return val;
}

bool MembersToDeleteBody::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("members"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("members")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<MembersToDeleteBody_members_inner>> refVal_setMembers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMembers);
            setMembers(refVal_setMembers);
        }
    }
    return ok;
}

void MembersToDeleteBody::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_MembersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("members")), m_Members));
    }
}

bool MembersToDeleteBody::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("members"))))
    {
        std::vector<std::shared_ptr<MembersToDeleteBody_members_inner>> refVal_setMembers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("members"))), refVal_setMembers );
        setMembers(refVal_setMembers);
    }
    return ok;
}

std::vector<std::shared_ptr<MembersToDeleteBody_members_inner>>& MembersToDeleteBody::getMembers()
{
    return m_Members;
}

void MembersToDeleteBody::setMembers(const std::vector<std::shared_ptr<MembersToDeleteBody_members_inner>>& value)
{
    m_Members = value;
    m_MembersIsSet = true;
}

bool MembersToDeleteBody::membersIsSet() const
{
    return m_MembersIsSet;
}

void MembersToDeleteBody::unsetMembers()
{
    m_MembersIsSet = false;
}
}
}
}
}


