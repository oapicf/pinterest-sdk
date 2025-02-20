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



#include "CppRestOpenAPIClient/model/CreateAssetGroupResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateAssetGroupResponse::CreateAssetGroupResponse()
{
    m_Asset_groupIsSet = false;
}

CreateAssetGroupResponse::~CreateAssetGroupResponse()
{
}

void CreateAssetGroupResponse::validate()
{
    // TODO: implement validation
}

web::json::value CreateAssetGroupResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Asset_groupIsSet)
    {
        val[utility::conversions::to_string_t(U("asset_group"))] = ModelBase::toJson(m_Asset_group);
    }

    return val;
}

bool CreateAssetGroupResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("asset_group"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("asset_group")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AssetGroupBinding> refVal_setAssetGroup;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssetGroup);
            setAssetGroup(refVal_setAssetGroup);
        }
    }
    return ok;
}

void CreateAssetGroupResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Asset_groupIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("asset_group")), m_Asset_group));
    }
}

bool CreateAssetGroupResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("asset_group"))))
    {
        std::shared_ptr<AssetGroupBinding> refVal_setAssetGroup;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("asset_group"))), refVal_setAssetGroup );
        setAssetGroup(refVal_setAssetGroup);
    }
    return ok;
}

std::shared_ptr<AssetGroupBinding> CreateAssetGroupResponse::getAssetGroup() const
{
    return m_Asset_group;
}

void CreateAssetGroupResponse::setAssetGroup(const std::shared_ptr<AssetGroupBinding>& value)
{
    m_Asset_group = value;
    m_Asset_groupIsSet = true;
}

bool CreateAssetGroupResponse::assetGroupIsSet() const
{
    return m_Asset_groupIsSet;
}

void CreateAssetGroupResponse::unsetAsset_group()
{
    m_Asset_groupIsSet = false;
}
}
}
}
}


