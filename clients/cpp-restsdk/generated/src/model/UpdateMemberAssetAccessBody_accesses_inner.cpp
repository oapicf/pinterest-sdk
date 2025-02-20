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



#include "CppRestOpenAPIClient/model/UpdateMemberAssetAccessBody_accesses_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UpdateMemberAssetAccessBody_accesses_inner::UpdateMemberAssetAccessBody_accesses_inner()
{
    m_Asset_id = utility::conversions::to_string_t("");
    m_Asset_idIsSet = false;
    m_Member_id = utility::conversions::to_string_t("");
    m_Member_idIsSet = false;
    m_PermissionsIsSet = false;
}

UpdateMemberAssetAccessBody_accesses_inner::~UpdateMemberAssetAccessBody_accesses_inner()
{
}

void UpdateMemberAssetAccessBody_accesses_inner::validate()
{
    // TODO: implement validation
}

web::json::value UpdateMemberAssetAccessBody_accesses_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Asset_idIsSet)
    {
        val[utility::conversions::to_string_t(U("asset_id"))] = ModelBase::toJson(m_Asset_id);
    }
    if(m_Member_idIsSet)
    {
        val[utility::conversions::to_string_t(U("member_id"))] = ModelBase::toJson(m_Member_id);
    }
    if(m_PermissionsIsSet)
    {
        val[utility::conversions::to_string_t(U("permissions"))] = ModelBase::toJson(m_Permissions);
    }

    return val;
}

bool UpdateMemberAssetAccessBody_accesses_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("asset_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("asset_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAssetId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssetId);
            setAssetId(refVal_setAssetId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("member_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("member_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMemberId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMemberId);
            setMemberId(refVal_setMemberId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("permissions"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("permissions")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Permissions>> refVal_setPermissions;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPermissions);
            setPermissions(refVal_setPermissions);
        }
    }
    return ok;
}

void UpdateMemberAssetAccessBody_accesses_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Asset_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("asset_id")), m_Asset_id));
    }
    if(m_Member_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("member_id")), m_Member_id));
    }
    if(m_PermissionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("permissions")), m_Permissions));
    }
}

bool UpdateMemberAssetAccessBody_accesses_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("asset_id"))))
    {
        utility::string_t refVal_setAssetId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("asset_id"))), refVal_setAssetId );
        setAssetId(refVal_setAssetId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("member_id"))))
    {
        utility::string_t refVal_setMemberId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("member_id"))), refVal_setMemberId );
        setMemberId(refVal_setMemberId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("permissions"))))
    {
        std::vector<std::shared_ptr<Permissions>> refVal_setPermissions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("permissions"))), refVal_setPermissions );
        setPermissions(refVal_setPermissions);
    }
    return ok;
}

utility::string_t UpdateMemberAssetAccessBody_accesses_inner::getAssetId() const
{
    return m_Asset_id;
}

void UpdateMemberAssetAccessBody_accesses_inner::setAssetId(const utility::string_t& value)
{
    m_Asset_id = value;
    m_Asset_idIsSet = true;
}

bool UpdateMemberAssetAccessBody_accesses_inner::assetIdIsSet() const
{
    return m_Asset_idIsSet;
}

void UpdateMemberAssetAccessBody_accesses_inner::unsetAsset_id()
{
    m_Asset_idIsSet = false;
}
utility::string_t UpdateMemberAssetAccessBody_accesses_inner::getMemberId() const
{
    return m_Member_id;
}

void UpdateMemberAssetAccessBody_accesses_inner::setMemberId(const utility::string_t& value)
{
    m_Member_id = value;
    m_Member_idIsSet = true;
}

bool UpdateMemberAssetAccessBody_accesses_inner::memberIdIsSet() const
{
    return m_Member_idIsSet;
}

void UpdateMemberAssetAccessBody_accesses_inner::unsetMember_id()
{
    m_Member_idIsSet = false;
}
std::vector<std::shared_ptr<Permissions>>& UpdateMemberAssetAccessBody_accesses_inner::getPermissions()
{
    return m_Permissions;
}

void UpdateMemberAssetAccessBody_accesses_inner::setPermissions(const std::vector<std::shared_ptr<Permissions>>& value)
{
    m_Permissions = value;
    m_PermissionsIsSet = true;
}

bool UpdateMemberAssetAccessBody_accesses_inner::permissionsIsSet() const
{
    return m_PermissionsIsSet;
}

void UpdateMemberAssetAccessBody_accesses_inner::unsetPermissions()
{
    m_PermissionsIsSet = false;
}
}
}
}
}


