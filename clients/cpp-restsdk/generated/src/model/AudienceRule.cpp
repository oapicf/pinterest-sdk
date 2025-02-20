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



#include "CppRestOpenAPIClient/model/AudienceRule.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AudienceRule::AudienceRule()
{
    m_Country = utility::conversions::to_string_t("");
    m_CountryIsSet = false;
    m_Customer_list_id = utility::conversions::to_string_t("");
    m_Customer_list_idIsSet = false;
    m_Engagement_domainIsSet = false;
    m_Engagement_type = utility::conversions::to_string_t("");
    m_Engagement_typeIsSet = false;
    m_Event = utility::conversions::to_string_t("");
    m_EventIsSet = false;
    m_Event_dataIsSet = false;
    m_Percentage = 0;
    m_PercentageIsSet = false;
    m_Pin_idIsSet = false;
    m_Prefill = false;
    m_PrefillIsSet = false;
    m_Retention_days = 0;
    m_Retention_daysIsSet = false;
    m_Seed_idIsSet = false;
    m_UrlIsSet = false;
    m_Visitor_source_id = utility::conversions::to_string_t("");
    m_Visitor_source_idIsSet = false;
    m_Event_sourceIsSet = false;
    m_Ingestion_sourceIsSet = false;
    m_Engager_type = 0;
    m_Engager_typeIsSet = false;
    m_Campaign_idIsSet = false;
    m_Ad_idIsSet = false;
    m_Objective_typeIsSet = false;
    m_Ad_account_id = utility::conversions::to_string_t("");
    m_Ad_account_idIsSet = false;
}

AudienceRule::~AudienceRule()
{
}

void AudienceRule::validate()
{
    // TODO: implement validation
}

web::json::value AudienceRule::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CountryIsSet)
    {
        val[utility::conversions::to_string_t(U("country"))] = ModelBase::toJson(m_Country);
    }
    if(m_Customer_list_idIsSet)
    {
        val[utility::conversions::to_string_t(U("customer_list_id"))] = ModelBase::toJson(m_Customer_list_id);
    }
    if(m_Engagement_domainIsSet)
    {
        val[utility::conversions::to_string_t(U("engagement_domain"))] = ModelBase::toJson(m_Engagement_domain);
    }
    if(m_Engagement_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("engagement_type"))] = ModelBase::toJson(m_Engagement_type);
    }
    if(m_EventIsSet)
    {
        val[utility::conversions::to_string_t(U("event"))] = ModelBase::toJson(m_Event);
    }
    if(m_Event_dataIsSet)
    {
        val[utility::conversions::to_string_t(U("event_data"))] = ModelBase::toJson(m_Event_data);
    }
    if(m_PercentageIsSet)
    {
        val[utility::conversions::to_string_t(U("percentage"))] = ModelBase::toJson(m_Percentage);
    }
    if(m_Pin_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pin_id"))] = ModelBase::toJson(m_Pin_id);
    }
    if(m_PrefillIsSet)
    {
        val[utility::conversions::to_string_t(U("prefill"))] = ModelBase::toJson(m_Prefill);
    }
    if(m_Retention_daysIsSet)
    {
        val[utility::conversions::to_string_t(U("retention_days"))] = ModelBase::toJson(m_Retention_days);
    }
    if(m_Seed_idIsSet)
    {
        val[utility::conversions::to_string_t(U("seed_id"))] = ModelBase::toJson(m_Seed_id);
    }
    if(m_UrlIsSet)
    {
        val[utility::conversions::to_string_t(U("url"))] = ModelBase::toJson(m_Url);
    }
    if(m_Visitor_source_idIsSet)
    {
        val[utility::conversions::to_string_t(U("visitor_source_id"))] = ModelBase::toJson(m_Visitor_source_id);
    }
    if(m_Event_sourceIsSet)
    {
        val[utility::conversions::to_string_t(U("event_source"))] = ModelBase::toJson(m_Event_source);
    }
    if(m_Ingestion_sourceIsSet)
    {
        val[utility::conversions::to_string_t(U("ingestion_source"))] = ModelBase::toJson(m_Ingestion_source);
    }
    if(m_Engager_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("engager_type"))] = ModelBase::toJson(m_Engager_type);
    }
    if(m_Campaign_idIsSet)
    {
        val[utility::conversions::to_string_t(U("campaign_id"))] = ModelBase::toJson(m_Campaign_id);
    }
    if(m_Ad_idIsSet)
    {
        val[utility::conversions::to_string_t(U("ad_id"))] = ModelBase::toJson(m_Ad_id);
    }
    if(m_Objective_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("objective_type"))] = ModelBase::toJson(m_Objective_type);
    }
    if(m_Ad_account_idIsSet)
    {
        val[utility::conversions::to_string_t(U("ad_account_id"))] = ModelBase::toJson(m_Ad_account_id);
    }

    return val;
}

bool AudienceRule::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("country"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("country")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCountry;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCountry);
            setCountry(refVal_setCountry);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("customer_list_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("customer_list_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCustomerListId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCustomerListId);
            setCustomerListId(refVal_setCustomerListId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("engagement_domain"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("engagement_domain")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setEngagementDomain;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEngagementDomain);
            setEngagementDomain(refVal_setEngagementDomain);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("engagement_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("engagement_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setEngagementType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEngagementType);
            setEngagementType(refVal_setEngagementType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("event"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("event")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setEvent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEvent);
            setEvent(refVal_setEvent);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("event_data"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("event_data")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<PinterestTagEventData> refVal_setEventData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEventData);
            setEventData(refVal_setEventData);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("percentage"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("percentage")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPercentage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPercentage);
            setPercentage(refVal_setPercentage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pin_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pin_id")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setPinId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPinId);
            setPinId(refVal_setPinId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("prefill"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("prefill")));
        if(!fieldValue.is_null())
        {
            bool refVal_setPrefill;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPrefill);
            setPrefill(refVal_setPrefill);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("retention_days"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("retention_days")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setRetentionDays;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRetentionDays);
            setRetentionDays(refVal_setRetentionDays);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("seed_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("seed_id")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setSeedId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSeedId);
            setSeedId(refVal_setSeedId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("url")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUrl);
            setUrl(refVal_setUrl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("visitor_source_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("visitor_source_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVisitorSourceId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVisitorSourceId);
            setVisitorSourceId(refVal_setVisitorSourceId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("event_source"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("event_source")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setEventSource;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEventSource);
            setEventSource(refVal_setEventSource);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ingestion_source"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ingestion_source")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setIngestionSource;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIngestionSource);
            setIngestionSource(refVal_setIngestionSource);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("engager_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("engager_type")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setEngagerType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEngagerType);
            setEngagerType(refVal_setEngagerType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("campaign_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("campaign_id")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setCampaignId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCampaignId);
            setCampaignId(refVal_setCampaignId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ad_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ad_id")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setAdId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdId);
            setAdId(refVal_setAdId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("objective_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("objective_type")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<ObjectiveType>> refVal_setObjectiveType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setObjectiveType);
            setObjectiveType(refVal_setObjectiveType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ad_account_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ad_account_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdAccountId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdAccountId);
            setAdAccountId(refVal_setAdAccountId);
        }
    }
    return ok;
}

void AudienceRule::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CountryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("country")), m_Country));
    }
    if(m_Customer_list_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("customer_list_id")), m_Customer_list_id));
    }
    if(m_Engagement_domainIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("engagement_domain")), m_Engagement_domain));
    }
    if(m_Engagement_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("engagement_type")), m_Engagement_type));
    }
    if(m_EventIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("event")), m_Event));
    }
    if(m_Event_dataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("event_data")), m_Event_data));
    }
    if(m_PercentageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("percentage")), m_Percentage));
    }
    if(m_Pin_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pin_id")), m_Pin_id));
    }
    if(m_PrefillIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("prefill")), m_Prefill));
    }
    if(m_Retention_daysIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("retention_days")), m_Retention_days));
    }
    if(m_Seed_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("seed_id")), m_Seed_id));
    }
    if(m_UrlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("url")), m_Url));
    }
    if(m_Visitor_source_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("visitor_source_id")), m_Visitor_source_id));
    }
    if(m_Event_sourceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("event_source")), m_Event_source));
    }
    if(m_Ingestion_sourceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ingestion_source")), m_Ingestion_source));
    }
    if(m_Engager_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("engager_type")), m_Engager_type));
    }
    if(m_Campaign_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("campaign_id")), m_Campaign_id));
    }
    if(m_Ad_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ad_id")), m_Ad_id));
    }
    if(m_Objective_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("objective_type")), m_Objective_type));
    }
    if(m_Ad_account_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ad_account_id")), m_Ad_account_id));
    }
}

bool AudienceRule::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("country"))))
    {
        utility::string_t refVal_setCountry;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("country"))), refVal_setCountry );
        setCountry(refVal_setCountry);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("customer_list_id"))))
    {
        utility::string_t refVal_setCustomerListId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("customer_list_id"))), refVal_setCustomerListId );
        setCustomerListId(refVal_setCustomerListId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("engagement_domain"))))
    {
        std::vector<utility::string_t> refVal_setEngagementDomain;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("engagement_domain"))), refVal_setEngagementDomain );
        setEngagementDomain(refVal_setEngagementDomain);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("engagement_type"))))
    {
        utility::string_t refVal_setEngagementType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("engagement_type"))), refVal_setEngagementType );
        setEngagementType(refVal_setEngagementType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("event"))))
    {
        utility::string_t refVal_setEvent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("event"))), refVal_setEvent );
        setEvent(refVal_setEvent);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("event_data"))))
    {
        std::shared_ptr<PinterestTagEventData> refVal_setEventData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("event_data"))), refVal_setEventData );
        setEventData(refVal_setEventData);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("percentage"))))
    {
        int32_t refVal_setPercentage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("percentage"))), refVal_setPercentage );
        setPercentage(refVal_setPercentage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pin_id"))))
    {
        std::vector<utility::string_t> refVal_setPinId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pin_id"))), refVal_setPinId );
        setPinId(refVal_setPinId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("prefill"))))
    {
        bool refVal_setPrefill;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("prefill"))), refVal_setPrefill );
        setPrefill(refVal_setPrefill);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("retention_days"))))
    {
        int32_t refVal_setRetentionDays;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("retention_days"))), refVal_setRetentionDays );
        setRetentionDays(refVal_setRetentionDays);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("seed_id"))))
    {
        std::vector<utility::string_t> refVal_setSeedId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("seed_id"))), refVal_setSeedId );
        setSeedId(refVal_setSeedId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("url"))))
    {
        std::vector<utility::string_t> refVal_setUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("url"))), refVal_setUrl );
        setUrl(refVal_setUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("visitor_source_id"))))
    {
        utility::string_t refVal_setVisitorSourceId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("visitor_source_id"))), refVal_setVisitorSourceId );
        setVisitorSourceId(refVal_setVisitorSourceId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("event_source"))))
    {
        std::shared_ptr<Object> refVal_setEventSource;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("event_source"))), refVal_setEventSource );
        setEventSource(refVal_setEventSource);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ingestion_source"))))
    {
        std::shared_ptr<Object> refVal_setIngestionSource;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ingestion_source"))), refVal_setIngestionSource );
        setIngestionSource(refVal_setIngestionSource);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("engager_type"))))
    {
        int32_t refVal_setEngagerType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("engager_type"))), refVal_setEngagerType );
        setEngagerType(refVal_setEngagerType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("campaign_id"))))
    {
        std::vector<utility::string_t> refVal_setCampaignId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("campaign_id"))), refVal_setCampaignId );
        setCampaignId(refVal_setCampaignId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ad_id"))))
    {
        std::vector<utility::string_t> refVal_setAdId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ad_id"))), refVal_setAdId );
        setAdId(refVal_setAdId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("objective_type"))))
    {
        std::vector<std::shared_ptr<ObjectiveType>> refVal_setObjectiveType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("objective_type"))), refVal_setObjectiveType );
        setObjectiveType(refVal_setObjectiveType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ad_account_id"))))
    {
        utility::string_t refVal_setAdAccountId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ad_account_id"))), refVal_setAdAccountId );
        setAdAccountId(refVal_setAdAccountId);
    }
    return ok;
}

utility::string_t AudienceRule::getCountry() const
{
    return m_Country;
}

void AudienceRule::setCountry(const utility::string_t& value)
{
    m_Country = value;
    m_CountryIsSet = true;
}

bool AudienceRule::countryIsSet() const
{
    return m_CountryIsSet;
}

void AudienceRule::unsetCountry()
{
    m_CountryIsSet = false;
}
utility::string_t AudienceRule::getCustomerListId() const
{
    return m_Customer_list_id;
}

void AudienceRule::setCustomerListId(const utility::string_t& value)
{
    m_Customer_list_id = value;
    m_Customer_list_idIsSet = true;
}

bool AudienceRule::customerListIdIsSet() const
{
    return m_Customer_list_idIsSet;
}

void AudienceRule::unsetCustomer_list_id()
{
    m_Customer_list_idIsSet = false;
}
std::vector<utility::string_t>& AudienceRule::getEngagementDomain()
{
    return m_Engagement_domain;
}

void AudienceRule::setEngagementDomain(const std::vector<utility::string_t>& value)
{
    m_Engagement_domain = value;
    m_Engagement_domainIsSet = true;
}

bool AudienceRule::engagementDomainIsSet() const
{
    return m_Engagement_domainIsSet;
}

void AudienceRule::unsetEngagement_domain()
{
    m_Engagement_domainIsSet = false;
}
utility::string_t AudienceRule::getEngagementType() const
{
    return m_Engagement_type;
}

void AudienceRule::setEngagementType(const utility::string_t& value)
{
    m_Engagement_type = value;
    m_Engagement_typeIsSet = true;
}

bool AudienceRule::engagementTypeIsSet() const
{
    return m_Engagement_typeIsSet;
}

void AudienceRule::unsetEngagement_type()
{
    m_Engagement_typeIsSet = false;
}
utility::string_t AudienceRule::getEvent() const
{
    return m_Event;
}

void AudienceRule::setEvent(const utility::string_t& value)
{
    m_Event = value;
    m_EventIsSet = true;
}

bool AudienceRule::eventIsSet() const
{
    return m_EventIsSet;
}

void AudienceRule::unsetEvent()
{
    m_EventIsSet = false;
}
std::shared_ptr<PinterestTagEventData> AudienceRule::getEventData() const
{
    return m_Event_data;
}

void AudienceRule::setEventData(const std::shared_ptr<PinterestTagEventData>& value)
{
    m_Event_data = value;
    m_Event_dataIsSet = true;
}

bool AudienceRule::eventDataIsSet() const
{
    return m_Event_dataIsSet;
}

void AudienceRule::unsetEvent_data()
{
    m_Event_dataIsSet = false;
}
int32_t AudienceRule::getPercentage() const
{
    return m_Percentage;
}

void AudienceRule::setPercentage(int32_t value)
{
    m_Percentage = value;
    m_PercentageIsSet = true;
}

bool AudienceRule::percentageIsSet() const
{
    return m_PercentageIsSet;
}

void AudienceRule::unsetPercentage()
{
    m_PercentageIsSet = false;
}
std::vector<utility::string_t>& AudienceRule::getPinId()
{
    return m_Pin_id;
}

void AudienceRule::setPinId(const std::vector<utility::string_t>& value)
{
    m_Pin_id = value;
    m_Pin_idIsSet = true;
}

bool AudienceRule::pinIdIsSet() const
{
    return m_Pin_idIsSet;
}

void AudienceRule::unsetPin_id()
{
    m_Pin_idIsSet = false;
}
bool AudienceRule::isPrefill() const
{
    return m_Prefill;
}

void AudienceRule::setPrefill(bool value)
{
    m_Prefill = value;
    m_PrefillIsSet = true;
}

bool AudienceRule::prefillIsSet() const
{
    return m_PrefillIsSet;
}

void AudienceRule::unsetPrefill()
{
    m_PrefillIsSet = false;
}
int32_t AudienceRule::getRetentionDays() const
{
    return m_Retention_days;
}

void AudienceRule::setRetentionDays(int32_t value)
{
    m_Retention_days = value;
    m_Retention_daysIsSet = true;
}

bool AudienceRule::retentionDaysIsSet() const
{
    return m_Retention_daysIsSet;
}

void AudienceRule::unsetRetention_days()
{
    m_Retention_daysIsSet = false;
}
std::vector<utility::string_t>& AudienceRule::getSeedId()
{
    return m_Seed_id;
}

void AudienceRule::setSeedId(const std::vector<utility::string_t>& value)
{
    m_Seed_id = value;
    m_Seed_idIsSet = true;
}

bool AudienceRule::seedIdIsSet() const
{
    return m_Seed_idIsSet;
}

void AudienceRule::unsetSeed_id()
{
    m_Seed_idIsSet = false;
}
std::vector<utility::string_t>& AudienceRule::getUrl()
{
    return m_Url;
}

void AudienceRule::setUrl(const std::vector<utility::string_t>& value)
{
    m_Url = value;
    m_UrlIsSet = true;
}

bool AudienceRule::urlIsSet() const
{
    return m_UrlIsSet;
}

void AudienceRule::unsetUrl()
{
    m_UrlIsSet = false;
}
utility::string_t AudienceRule::getVisitorSourceId() const
{
    return m_Visitor_source_id;
}

void AudienceRule::setVisitorSourceId(const utility::string_t& value)
{
    m_Visitor_source_id = value;
    m_Visitor_source_idIsSet = true;
}

bool AudienceRule::visitorSourceIdIsSet() const
{
    return m_Visitor_source_idIsSet;
}

void AudienceRule::unsetVisitor_source_id()
{
    m_Visitor_source_idIsSet = false;
}
std::shared_ptr<Object> AudienceRule::getEventSource() const
{
    return m_Event_source;
}

void AudienceRule::setEventSource(const std::shared_ptr<Object>& value)
{
    m_Event_source = value;
    m_Event_sourceIsSet = true;
}

bool AudienceRule::eventSourceIsSet() const
{
    return m_Event_sourceIsSet;
}

void AudienceRule::unsetEvent_source()
{
    m_Event_sourceIsSet = false;
}
std::shared_ptr<Object> AudienceRule::getIngestionSource() const
{
    return m_Ingestion_source;
}

void AudienceRule::setIngestionSource(const std::shared_ptr<Object>& value)
{
    m_Ingestion_source = value;
    m_Ingestion_sourceIsSet = true;
}

bool AudienceRule::ingestionSourceIsSet() const
{
    return m_Ingestion_sourceIsSet;
}

void AudienceRule::unsetIngestion_source()
{
    m_Ingestion_sourceIsSet = false;
}
int32_t AudienceRule::getEngagerType() const
{
    return m_Engager_type;
}

void AudienceRule::setEngagerType(int32_t value)
{
    m_Engager_type = value;
    m_Engager_typeIsSet = true;
}

bool AudienceRule::engagerTypeIsSet() const
{
    return m_Engager_typeIsSet;
}

void AudienceRule::unsetEngager_type()
{
    m_Engager_typeIsSet = false;
}
std::vector<utility::string_t>& AudienceRule::getCampaignId()
{
    return m_Campaign_id;
}

void AudienceRule::setCampaignId(const std::vector<utility::string_t>& value)
{
    m_Campaign_id = value;
    m_Campaign_idIsSet = true;
}

bool AudienceRule::campaignIdIsSet() const
{
    return m_Campaign_idIsSet;
}

void AudienceRule::unsetCampaign_id()
{
    m_Campaign_idIsSet = false;
}
std::vector<utility::string_t>& AudienceRule::getAdId()
{
    return m_Ad_id;
}

void AudienceRule::setAdId(const std::vector<utility::string_t>& value)
{
    m_Ad_id = value;
    m_Ad_idIsSet = true;
}

bool AudienceRule::adIdIsSet() const
{
    return m_Ad_idIsSet;
}

void AudienceRule::unsetAd_id()
{
    m_Ad_idIsSet = false;
}
std::vector<std::shared_ptr<ObjectiveType>>& AudienceRule::getObjectiveType()
{
    return m_Objective_type;
}

void AudienceRule::setObjectiveType(const std::vector<std::shared_ptr<ObjectiveType>>& value)
{
    m_Objective_type = value;
    m_Objective_typeIsSet = true;
}

bool AudienceRule::objectiveTypeIsSet() const
{
    return m_Objective_typeIsSet;
}

void AudienceRule::unsetObjective_type()
{
    m_Objective_typeIsSet = false;
}
utility::string_t AudienceRule::getAdAccountId() const
{
    return m_Ad_account_id;
}

void AudienceRule::setAdAccountId(const utility::string_t& value)
{
    m_Ad_account_id = value;
    m_Ad_account_idIsSet = true;
}

bool AudienceRule::adAccountIdIsSet() const
{
    return m_Ad_account_idIsSet;
}

void AudienceRule::unsetAd_account_id()
{
    m_Ad_account_idIsSet = false;
}
}
}
}
}


