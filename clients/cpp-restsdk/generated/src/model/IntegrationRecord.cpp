/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/IntegrationRecord.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



IntegrationRecord::IntegrationRecord()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_External_business_id = utility::conversions::to_string_t("");
    m_External_business_idIsSet = false;
    m_Connected_merchant_id = utility::conversions::to_string_t("");
    m_Connected_merchant_idIsSet = false;
    m_Connected_user_id = utility::conversions::to_string_t("");
    m_Connected_user_idIsSet = false;
    m_Connected_advertiser_id = utility::conversions::to_string_t("");
    m_Connected_advertiser_idIsSet = false;
    m_Connected_lba_id = utility::conversions::to_string_t("");
    m_Connected_lba_idIsSet = false;
    m_Connected_tag_id = utility::conversions::to_string_t("");
    m_Connected_tag_idIsSet = false;
    m_Partner_access_token = utility::conversions::to_string_t("");
    m_Partner_access_tokenIsSet = false;
    m_Partner_refresh_token = utility::conversions::to_string_t("");
    m_Partner_refresh_tokenIsSet = false;
    m_Partner_primary_email = utility::conversions::to_string_t("");
    m_Partner_primary_emailIsSet = false;
    m_Partner_access_token_expiry = 0;
    m_Partner_access_token_expiryIsSet = false;
    m_Partner_refresh_token_expiry = 0;
    m_Partner_refresh_token_expiryIsSet = false;
    m_Scopes = utility::conversions::to_string_t("");
    m_ScopesIsSet = false;
    m_Partner_metadata = utility::conversions::to_string_t("");
    m_Partner_metadataIsSet = false;
    m_Additional_id_1 = utility::conversions::to_string_t("");
    m_Additional_id_1IsSet = false;
    m_Created_time = 0;
    m_Created_timeIsSet = false;
    m_Updated_time = 0;
    m_Updated_timeIsSet = false;
}

IntegrationRecord::~IntegrationRecord()
{
}

void IntegrationRecord::validate()
{
    // TODO: implement validation
}

web::json::value IntegrationRecord::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_External_business_idIsSet)
    {
        val[utility::conversions::to_string_t(U("external_business_id"))] = ModelBase::toJson(m_External_business_id);
    }
    if(m_Connected_merchant_idIsSet)
    {
        val[utility::conversions::to_string_t(U("connected_merchant_id"))] = ModelBase::toJson(m_Connected_merchant_id);
    }
    if(m_Connected_user_idIsSet)
    {
        val[utility::conversions::to_string_t(U("connected_user_id"))] = ModelBase::toJson(m_Connected_user_id);
    }
    if(m_Connected_advertiser_idIsSet)
    {
        val[utility::conversions::to_string_t(U("connected_advertiser_id"))] = ModelBase::toJson(m_Connected_advertiser_id);
    }
    if(m_Connected_lba_idIsSet)
    {
        val[utility::conversions::to_string_t(U("connected_lba_id"))] = ModelBase::toJson(m_Connected_lba_id);
    }
    if(m_Connected_tag_idIsSet)
    {
        val[utility::conversions::to_string_t(U("connected_tag_id"))] = ModelBase::toJson(m_Connected_tag_id);
    }
    if(m_Partner_access_tokenIsSet)
    {
        val[utility::conversions::to_string_t(U("partner_access_token"))] = ModelBase::toJson(m_Partner_access_token);
    }
    if(m_Partner_refresh_tokenIsSet)
    {
        val[utility::conversions::to_string_t(U("partner_refresh_token"))] = ModelBase::toJson(m_Partner_refresh_token);
    }
    if(m_Partner_primary_emailIsSet)
    {
        val[utility::conversions::to_string_t(U("partner_primary_email"))] = ModelBase::toJson(m_Partner_primary_email);
    }
    if(m_Partner_access_token_expiryIsSet)
    {
        val[utility::conversions::to_string_t(U("partner_access_token_expiry"))] = ModelBase::toJson(m_Partner_access_token_expiry);
    }
    if(m_Partner_refresh_token_expiryIsSet)
    {
        val[utility::conversions::to_string_t(U("partner_refresh_token_expiry"))] = ModelBase::toJson(m_Partner_refresh_token_expiry);
    }
    if(m_ScopesIsSet)
    {
        val[utility::conversions::to_string_t(U("scopes"))] = ModelBase::toJson(m_Scopes);
    }
    if(m_Partner_metadataIsSet)
    {
        val[utility::conversions::to_string_t(U("partner_metadata"))] = ModelBase::toJson(m_Partner_metadata);
    }
    if(m_Additional_id_1IsSet)
    {
        val[utility::conversions::to_string_t(U("additional_id_1"))] = ModelBase::toJson(m_Additional_id_1);
    }
    if(m_Created_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("created_time"))] = ModelBase::toJson(m_Created_time);
    }
    if(m_Updated_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_time"))] = ModelBase::toJson(m_Updated_time);
    }

    return val;
}

bool IntegrationRecord::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("external_business_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("external_business_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setExternalBusinessId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExternalBusinessId);
            setExternalBusinessId(refVal_setExternalBusinessId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("connected_merchant_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("connected_merchant_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setConnectedMerchantId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setConnectedMerchantId);
            setConnectedMerchantId(refVal_setConnectedMerchantId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("connected_user_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("connected_user_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setConnectedUserId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setConnectedUserId);
            setConnectedUserId(refVal_setConnectedUserId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("connected_advertiser_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("connected_advertiser_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setConnectedAdvertiserId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setConnectedAdvertiserId);
            setConnectedAdvertiserId(refVal_setConnectedAdvertiserId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("connected_lba_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("connected_lba_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setConnectedLbaId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setConnectedLbaId);
            setConnectedLbaId(refVal_setConnectedLbaId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("connected_tag_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("connected_tag_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setConnectedTagId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setConnectedTagId);
            setConnectedTagId(refVal_setConnectedTagId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partner_access_token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partner_access_token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPartnerAccessToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartnerAccessToken);
            setPartnerAccessToken(refVal_setPartnerAccessToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partner_refresh_token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partner_refresh_token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPartnerRefreshToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartnerRefreshToken);
            setPartnerRefreshToken(refVal_setPartnerRefreshToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partner_primary_email"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partner_primary_email")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPartnerPrimaryEmail;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartnerPrimaryEmail);
            setPartnerPrimaryEmail(refVal_setPartnerPrimaryEmail);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partner_access_token_expiry"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partner_access_token_expiry")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPartnerAccessTokenExpiry;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartnerAccessTokenExpiry);
            setPartnerAccessTokenExpiry(refVal_setPartnerAccessTokenExpiry);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partner_refresh_token_expiry"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partner_refresh_token_expiry")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPartnerRefreshTokenExpiry;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartnerRefreshTokenExpiry);
            setPartnerRefreshTokenExpiry(refVal_setPartnerRefreshTokenExpiry);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("scopes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("scopes")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setScopes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setScopes);
            setScopes(refVal_setScopes);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partner_metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partner_metadata")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPartnerMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartnerMetadata);
            setPartnerMetadata(refVal_setPartnerMetadata);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("additional_id_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("additional_id_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdditionalId1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdditionalId1);
            setAdditionalId1(refVal_setAdditionalId1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_time")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCreatedTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedTime);
            setCreatedTime(refVal_setCreatedTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_time")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setUpdatedTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedTime);
            setUpdatedTime(refVal_setUpdatedTime);
        }
    }
    return ok;
}

void IntegrationRecord::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_External_business_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("external_business_id")), m_External_business_id));
    }
    if(m_Connected_merchant_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("connected_merchant_id")), m_Connected_merchant_id));
    }
    if(m_Connected_user_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("connected_user_id")), m_Connected_user_id));
    }
    if(m_Connected_advertiser_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("connected_advertiser_id")), m_Connected_advertiser_id));
    }
    if(m_Connected_lba_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("connected_lba_id")), m_Connected_lba_id));
    }
    if(m_Connected_tag_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("connected_tag_id")), m_Connected_tag_id));
    }
    if(m_Partner_access_tokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partner_access_token")), m_Partner_access_token));
    }
    if(m_Partner_refresh_tokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partner_refresh_token")), m_Partner_refresh_token));
    }
    if(m_Partner_primary_emailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partner_primary_email")), m_Partner_primary_email));
    }
    if(m_Partner_access_token_expiryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partner_access_token_expiry")), m_Partner_access_token_expiry));
    }
    if(m_Partner_refresh_token_expiryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partner_refresh_token_expiry")), m_Partner_refresh_token_expiry));
    }
    if(m_ScopesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("scopes")), m_Scopes));
    }
    if(m_Partner_metadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partner_metadata")), m_Partner_metadata));
    }
    if(m_Additional_id_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("additional_id_1")), m_Additional_id_1));
    }
    if(m_Created_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_time")), m_Created_time));
    }
    if(m_Updated_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_time")), m_Updated_time));
    }
}

bool IntegrationRecord::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("external_business_id"))))
    {
        utility::string_t refVal_setExternalBusinessId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("external_business_id"))), refVal_setExternalBusinessId );
        setExternalBusinessId(refVal_setExternalBusinessId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("connected_merchant_id"))))
    {
        utility::string_t refVal_setConnectedMerchantId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("connected_merchant_id"))), refVal_setConnectedMerchantId );
        setConnectedMerchantId(refVal_setConnectedMerchantId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("connected_user_id"))))
    {
        utility::string_t refVal_setConnectedUserId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("connected_user_id"))), refVal_setConnectedUserId );
        setConnectedUserId(refVal_setConnectedUserId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("connected_advertiser_id"))))
    {
        utility::string_t refVal_setConnectedAdvertiserId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("connected_advertiser_id"))), refVal_setConnectedAdvertiserId );
        setConnectedAdvertiserId(refVal_setConnectedAdvertiserId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("connected_lba_id"))))
    {
        utility::string_t refVal_setConnectedLbaId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("connected_lba_id"))), refVal_setConnectedLbaId );
        setConnectedLbaId(refVal_setConnectedLbaId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("connected_tag_id"))))
    {
        utility::string_t refVal_setConnectedTagId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("connected_tag_id"))), refVal_setConnectedTagId );
        setConnectedTagId(refVal_setConnectedTagId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partner_access_token"))))
    {
        utility::string_t refVal_setPartnerAccessToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partner_access_token"))), refVal_setPartnerAccessToken );
        setPartnerAccessToken(refVal_setPartnerAccessToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partner_refresh_token"))))
    {
        utility::string_t refVal_setPartnerRefreshToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partner_refresh_token"))), refVal_setPartnerRefreshToken );
        setPartnerRefreshToken(refVal_setPartnerRefreshToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partner_primary_email"))))
    {
        utility::string_t refVal_setPartnerPrimaryEmail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partner_primary_email"))), refVal_setPartnerPrimaryEmail );
        setPartnerPrimaryEmail(refVal_setPartnerPrimaryEmail);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partner_access_token_expiry"))))
    {
        int32_t refVal_setPartnerAccessTokenExpiry;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partner_access_token_expiry"))), refVal_setPartnerAccessTokenExpiry );
        setPartnerAccessTokenExpiry(refVal_setPartnerAccessTokenExpiry);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partner_refresh_token_expiry"))))
    {
        int32_t refVal_setPartnerRefreshTokenExpiry;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partner_refresh_token_expiry"))), refVal_setPartnerRefreshTokenExpiry );
        setPartnerRefreshTokenExpiry(refVal_setPartnerRefreshTokenExpiry);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("scopes"))))
    {
        utility::string_t refVal_setScopes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("scopes"))), refVal_setScopes );
        setScopes(refVal_setScopes);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partner_metadata"))))
    {
        utility::string_t refVal_setPartnerMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partner_metadata"))), refVal_setPartnerMetadata );
        setPartnerMetadata(refVal_setPartnerMetadata);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("additional_id_1"))))
    {
        utility::string_t refVal_setAdditionalId1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("additional_id_1"))), refVal_setAdditionalId1 );
        setAdditionalId1(refVal_setAdditionalId1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_time"))))
    {
        int32_t refVal_setCreatedTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_time"))), refVal_setCreatedTime );
        setCreatedTime(refVal_setCreatedTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_time"))))
    {
        int32_t refVal_setUpdatedTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_time"))), refVal_setUpdatedTime );
        setUpdatedTime(refVal_setUpdatedTime);
    }
    return ok;
}

utility::string_t IntegrationRecord::getId() const
{
    return m_Id;
}

void IntegrationRecord::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool IntegrationRecord::idIsSet() const
{
    return m_IdIsSet;
}

void IntegrationRecord::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t IntegrationRecord::getExternalBusinessId() const
{
    return m_External_business_id;
}

void IntegrationRecord::setExternalBusinessId(const utility::string_t& value)
{
    m_External_business_id = value;
    m_External_business_idIsSet = true;
}

bool IntegrationRecord::externalBusinessIdIsSet() const
{
    return m_External_business_idIsSet;
}

void IntegrationRecord::unsetExternal_business_id()
{
    m_External_business_idIsSet = false;
}
utility::string_t IntegrationRecord::getConnectedMerchantId() const
{
    return m_Connected_merchant_id;
}

void IntegrationRecord::setConnectedMerchantId(const utility::string_t& value)
{
    m_Connected_merchant_id = value;
    m_Connected_merchant_idIsSet = true;
}

bool IntegrationRecord::connectedMerchantIdIsSet() const
{
    return m_Connected_merchant_idIsSet;
}

void IntegrationRecord::unsetConnected_merchant_id()
{
    m_Connected_merchant_idIsSet = false;
}
utility::string_t IntegrationRecord::getConnectedUserId() const
{
    return m_Connected_user_id;
}

void IntegrationRecord::setConnectedUserId(const utility::string_t& value)
{
    m_Connected_user_id = value;
    m_Connected_user_idIsSet = true;
}

bool IntegrationRecord::connectedUserIdIsSet() const
{
    return m_Connected_user_idIsSet;
}

void IntegrationRecord::unsetConnected_user_id()
{
    m_Connected_user_idIsSet = false;
}
utility::string_t IntegrationRecord::getConnectedAdvertiserId() const
{
    return m_Connected_advertiser_id;
}

void IntegrationRecord::setConnectedAdvertiserId(const utility::string_t& value)
{
    m_Connected_advertiser_id = value;
    m_Connected_advertiser_idIsSet = true;
}

bool IntegrationRecord::connectedAdvertiserIdIsSet() const
{
    return m_Connected_advertiser_idIsSet;
}

void IntegrationRecord::unsetConnected_advertiser_id()
{
    m_Connected_advertiser_idIsSet = false;
}
utility::string_t IntegrationRecord::getConnectedLbaId() const
{
    return m_Connected_lba_id;
}

void IntegrationRecord::setConnectedLbaId(const utility::string_t& value)
{
    m_Connected_lba_id = value;
    m_Connected_lba_idIsSet = true;
}

bool IntegrationRecord::connectedLbaIdIsSet() const
{
    return m_Connected_lba_idIsSet;
}

void IntegrationRecord::unsetConnected_lba_id()
{
    m_Connected_lba_idIsSet = false;
}
utility::string_t IntegrationRecord::getConnectedTagId() const
{
    return m_Connected_tag_id;
}

void IntegrationRecord::setConnectedTagId(const utility::string_t& value)
{
    m_Connected_tag_id = value;
    m_Connected_tag_idIsSet = true;
}

bool IntegrationRecord::connectedTagIdIsSet() const
{
    return m_Connected_tag_idIsSet;
}

void IntegrationRecord::unsetConnected_tag_id()
{
    m_Connected_tag_idIsSet = false;
}
utility::string_t IntegrationRecord::getPartnerAccessToken() const
{
    return m_Partner_access_token;
}

void IntegrationRecord::setPartnerAccessToken(const utility::string_t& value)
{
    m_Partner_access_token = value;
    m_Partner_access_tokenIsSet = true;
}

bool IntegrationRecord::partnerAccessTokenIsSet() const
{
    return m_Partner_access_tokenIsSet;
}

void IntegrationRecord::unsetPartner_access_token()
{
    m_Partner_access_tokenIsSet = false;
}
utility::string_t IntegrationRecord::getPartnerRefreshToken() const
{
    return m_Partner_refresh_token;
}

void IntegrationRecord::setPartnerRefreshToken(const utility::string_t& value)
{
    m_Partner_refresh_token = value;
    m_Partner_refresh_tokenIsSet = true;
}

bool IntegrationRecord::partnerRefreshTokenIsSet() const
{
    return m_Partner_refresh_tokenIsSet;
}

void IntegrationRecord::unsetPartner_refresh_token()
{
    m_Partner_refresh_tokenIsSet = false;
}
utility::string_t IntegrationRecord::getPartnerPrimaryEmail() const
{
    return m_Partner_primary_email;
}

void IntegrationRecord::setPartnerPrimaryEmail(const utility::string_t& value)
{
    m_Partner_primary_email = value;
    m_Partner_primary_emailIsSet = true;
}

bool IntegrationRecord::partnerPrimaryEmailIsSet() const
{
    return m_Partner_primary_emailIsSet;
}

void IntegrationRecord::unsetPartner_primary_email()
{
    m_Partner_primary_emailIsSet = false;
}
int32_t IntegrationRecord::getPartnerAccessTokenExpiry() const
{
    return m_Partner_access_token_expiry;
}

void IntegrationRecord::setPartnerAccessTokenExpiry(int32_t value)
{
    m_Partner_access_token_expiry = value;
    m_Partner_access_token_expiryIsSet = true;
}

bool IntegrationRecord::partnerAccessTokenExpiryIsSet() const
{
    return m_Partner_access_token_expiryIsSet;
}

void IntegrationRecord::unsetPartner_access_token_expiry()
{
    m_Partner_access_token_expiryIsSet = false;
}
int32_t IntegrationRecord::getPartnerRefreshTokenExpiry() const
{
    return m_Partner_refresh_token_expiry;
}

void IntegrationRecord::setPartnerRefreshTokenExpiry(int32_t value)
{
    m_Partner_refresh_token_expiry = value;
    m_Partner_refresh_token_expiryIsSet = true;
}

bool IntegrationRecord::partnerRefreshTokenExpiryIsSet() const
{
    return m_Partner_refresh_token_expiryIsSet;
}

void IntegrationRecord::unsetPartner_refresh_token_expiry()
{
    m_Partner_refresh_token_expiryIsSet = false;
}
utility::string_t IntegrationRecord::getScopes() const
{
    return m_Scopes;
}

void IntegrationRecord::setScopes(const utility::string_t& value)
{
    m_Scopes = value;
    m_ScopesIsSet = true;
}

bool IntegrationRecord::scopesIsSet() const
{
    return m_ScopesIsSet;
}

void IntegrationRecord::unsetScopes()
{
    m_ScopesIsSet = false;
}
utility::string_t IntegrationRecord::getPartnerMetadata() const
{
    return m_Partner_metadata;
}

void IntegrationRecord::setPartnerMetadata(const utility::string_t& value)
{
    m_Partner_metadata = value;
    m_Partner_metadataIsSet = true;
}

bool IntegrationRecord::partnerMetadataIsSet() const
{
    return m_Partner_metadataIsSet;
}

void IntegrationRecord::unsetPartner_metadata()
{
    m_Partner_metadataIsSet = false;
}
utility::string_t IntegrationRecord::getAdditionalId1() const
{
    return m_Additional_id_1;
}

void IntegrationRecord::setAdditionalId1(const utility::string_t& value)
{
    m_Additional_id_1 = value;
    m_Additional_id_1IsSet = true;
}

bool IntegrationRecord::additionalId1IsSet() const
{
    return m_Additional_id_1IsSet;
}

void IntegrationRecord::unsetAdditional_id_1()
{
    m_Additional_id_1IsSet = false;
}
int32_t IntegrationRecord::getCreatedTime() const
{
    return m_Created_time;
}

void IntegrationRecord::setCreatedTime(int32_t value)
{
    m_Created_time = value;
    m_Created_timeIsSet = true;
}

bool IntegrationRecord::createdTimeIsSet() const
{
    return m_Created_timeIsSet;
}

void IntegrationRecord::unsetCreated_time()
{
    m_Created_timeIsSet = false;
}
int32_t IntegrationRecord::getUpdatedTime() const
{
    return m_Updated_time;
}

void IntegrationRecord::setUpdatedTime(int32_t value)
{
    m_Updated_time = value;
    m_Updated_timeIsSet = true;
}

bool IntegrationRecord::updatedTimeIsSet() const
{
    return m_Updated_timeIsSet;
}

void IntegrationRecord::unsetUpdated_time()
{
    m_Updated_timeIsSet = false;
}
}
}
}
}

