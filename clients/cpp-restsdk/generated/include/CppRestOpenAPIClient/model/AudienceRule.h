/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AudienceRule.h
 *
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AudienceRule_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AudienceRule_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/PinterestTagEventData.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/Object.h"
#include "CppRestOpenAPIClient/model/ObjectiveType.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class PinterestTagEventData;

/// <summary>
/// JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
/// </summary>
class  AudienceRule
    : public ModelBase
{
public:
    AudienceRule();
    virtual ~AudienceRule();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AudienceRule members

    /// <summary>
    /// Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
    /// </summary>
    utility::string_t getCountry() const;
    bool countryIsSet() const;
    void unsetCountry();

    void setCountry(const utility::string_t& value);

    /// <summary>
    /// Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
    /// </summary>
    utility::string_t getCustomerListId() const;
    bool customerListIdIsSet() const;
    void unsetCustomer_list_id();

    void setCustomerListId(const utility::string_t& value);

    /// <summary>
    /// The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
    /// </summary>
    std::vector<utility::string_t>& getEngagementDomain();
    bool engagementDomainIsSet() const;
    void unsetEngagement_domain();

    void setEngagementDomain(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. 
    /// </summary>
    utility::string_t getEngagementType() const;
    bool engagementTypeIsSet() const;
    void unsetEngagement_type();

    void setEngagementType(const utility::string_t& value);

    /// <summary>
    /// A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
    /// </summary>
    utility::string_t getEvent() const;
    bool eventIsSet() const;
    void unsetEvent();

    void setEvent(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PinterestTagEventData> getEventData() const;
    bool eventDataIsSet() const;
    void unsetEvent_data();

    void setEventData(const std::shared_ptr<PinterestTagEventData>& value);

    /// <summary>
    /// Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
    /// </summary>
    int32_t getPercentage() const;
    bool percentageIsSet() const;
    void unsetPercentage();

    void setPercentage(int32_t value);

    /// <summary>
    /// IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
    /// </summary>
    std::vector<utility::string_t>& getPinId();
    bool pinIdIsSet() const;
    void unsetPin_id();

    void setPinId(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
    /// </summary>
    bool isPrefill() const;
    bool prefillIsSet() const;
    void unsetPrefill();

    void setPrefill(bool value);

    /// <summary>
    /// Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
    /// </summary>
    int32_t getRetentionDays() const;
    bool retentionDaysIsSet() const;
    void unsetRetention_days();

    void setRetentionDays(int32_t value);

    /// <summary>
    /// Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. 
    /// </summary>
    std::vector<utility::string_t>& getSeedId();
    bool seedIdIsSet() const;
    void unsetSeed_id();

    void setSeedId(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
    /// </summary>
    std::vector<utility::string_t>& getUrl();
    bool urlIsSet() const;
    void unsetUrl();

    void setUrl(const std::vector<utility::string_t>& value);

    /// <summary>
    /// The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
    /// </summary>
    utility::string_t getVisitorSourceId() const;
    bool visitorSourceIdIsSet() const;
    void unsetVisitor_source_id();

    void setVisitorSourceId(const utility::string_t& value);

    /// <summary>
    /// Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
    /// </summary>
    std::shared_ptr<Object> getEventSource() const;
    bool eventSourceIsSet() const;
    void unsetEvent_source();

    void setEventSource(const std::shared_ptr<Object>& value);

    /// <summary>
    /// Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
    /// </summary>
    std::shared_ptr<Object> getIngestionSource() const;
    bool ingestionSourceIsSet() const;
    void unsetIngestion_source();

    void setIngestionSource(const std::shared_ptr<Object>& value);

    /// <summary>
    /// Optional for ENGAGEMENT. Engager type value should be 1-2.
    /// </summary>
    int32_t getEngagerType() const;
    bool engagerTypeIsSet() const;
    void unsetEngager_type();

    void setEngagerType(int32_t value);

    /// <summary>
    /// Campaign ID for engagement audience filter.
    /// </summary>
    std::vector<utility::string_t>& getCampaignId();
    bool campaignIdIsSet() const;
    void unsetCampaign_id();

    void setCampaignId(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Ad ID for engagement audience filter.
    /// </summary>
    std::vector<utility::string_t>& getAdId();
    bool adIdIsSet() const;
    void unsetAd_id();

    void setAdId(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Objective for engagement audience filter.
    /// </summary>
    std::vector<std::shared_ptr<ObjectiveType>>& getObjectiveType();
    bool objectiveTypeIsSet() const;
    void unsetObjective_type();

    void setObjectiveType(const std::vector<std::shared_ptr<ObjectiveType>>& value);

    /// <summary>
    /// Ad account ID.
    /// </summary>
    utility::string_t getAdAccountId() const;
    bool adAccountIdIsSet() const;
    void unsetAd_account_id();

    void setAdAccountId(const utility::string_t& value);


protected:
    utility::string_t m_Country;
    bool m_CountryIsSet;
    utility::string_t m_Customer_list_id;
    bool m_Customer_list_idIsSet;
    std::vector<utility::string_t> m_Engagement_domain;
    bool m_Engagement_domainIsSet;
    utility::string_t m_Engagement_type;
    bool m_Engagement_typeIsSet;
    utility::string_t m_Event;
    bool m_EventIsSet;
    std::shared_ptr<PinterestTagEventData> m_Event_data;
    bool m_Event_dataIsSet;
    int32_t m_Percentage;
    bool m_PercentageIsSet;
    std::vector<utility::string_t> m_Pin_id;
    bool m_Pin_idIsSet;
    bool m_Prefill;
    bool m_PrefillIsSet;
    int32_t m_Retention_days;
    bool m_Retention_daysIsSet;
    std::vector<utility::string_t> m_Seed_id;
    bool m_Seed_idIsSet;
    std::vector<utility::string_t> m_Url;
    bool m_UrlIsSet;
    utility::string_t m_Visitor_source_id;
    bool m_Visitor_source_idIsSet;
    std::shared_ptr<Object> m_Event_source;
    bool m_Event_sourceIsSet;
    std::shared_ptr<Object> m_Ingestion_source;
    bool m_Ingestion_sourceIsSet;
    int32_t m_Engager_type;
    bool m_Engager_typeIsSet;
    std::vector<utility::string_t> m_Campaign_id;
    bool m_Campaign_idIsSet;
    std::vector<utility::string_t> m_Ad_id;
    bool m_Ad_idIsSet;
    std::vector<std::shared_ptr<ObjectiveType>> m_Objective_type;
    bool m_Objective_typeIsSet;
    utility::string_t m_Ad_account_id;
    bool m_Ad_account_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AudienceRule_H_ */