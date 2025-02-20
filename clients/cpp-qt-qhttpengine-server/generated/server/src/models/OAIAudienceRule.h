/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIAudienceRule.h
 *
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */

#ifndef OAIAudienceRule_H
#define OAIAudienceRule_H

#include <QJsonObject>

#include "OAIObject.h"
#include "OAIObjectiveType.h"
#include "OAIPinterestTagEventData.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAudienceRule : public OAIObject {
public:
    OAIAudienceRule();
    OAIAudienceRule(QString json);
    ~OAIAudienceRule() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCountry() const;
    void setCountry(const QString &country);
    bool is_country_Set() const;
    bool is_country_Valid() const;

    QString getCustomerListId() const;
    void setCustomerListId(const QString &customer_list_id);
    bool is_customer_list_id_Set() const;
    bool is_customer_list_id_Valid() const;

    QList<QString> getEngagementDomain() const;
    void setEngagementDomain(const QList<QString> &engagement_domain);
    bool is_engagement_domain_Set() const;
    bool is_engagement_domain_Valid() const;

    QString getEngagementType() const;
    void setEngagementType(const QString &engagement_type);
    bool is_engagement_type_Set() const;
    bool is_engagement_type_Valid() const;

    QString getEvent() const;
    void setEvent(const QString &event);
    bool is_event_Set() const;
    bool is_event_Valid() const;

    OAIPinterestTagEventData getEventData() const;
    void setEventData(const OAIPinterestTagEventData &event_data);
    bool is_event_data_Set() const;
    bool is_event_data_Valid() const;

    qint32 getPercentage() const;
    void setPercentage(const qint32 &percentage);
    bool is_percentage_Set() const;
    bool is_percentage_Valid() const;

    QList<QString> getPinId() const;
    void setPinId(const QList<QString> &pin_id);
    bool is_pin_id_Set() const;
    bool is_pin_id_Valid() const;

    bool isPrefill() const;
    void setPrefill(const bool &prefill);
    bool is_prefill_Set() const;
    bool is_prefill_Valid() const;

    qint32 getRetentionDays() const;
    void setRetentionDays(const qint32 &retention_days);
    bool is_retention_days_Set() const;
    bool is_retention_days_Valid() const;

    QList<QString> getSeedId() const;
    void setSeedId(const QList<QString> &seed_id);
    bool is_seed_id_Set() const;
    bool is_seed_id_Valid() const;

    QList<QString> getUrl() const;
    void setUrl(const QList<QString> &url);
    bool is_url_Set() const;
    bool is_url_Valid() const;

    QString getVisitorSourceId() const;
    void setVisitorSourceId(const QString &visitor_source_id);
    bool is_visitor_source_id_Set() const;
    bool is_visitor_source_id_Valid() const;

    OAIObject getEventSource() const;
    void setEventSource(const OAIObject &event_source);
    bool is_event_source_Set() const;
    bool is_event_source_Valid() const;

    OAIObject getIngestionSource() const;
    void setIngestionSource(const OAIObject &ingestion_source);
    bool is_ingestion_source_Set() const;
    bool is_ingestion_source_Valid() const;

    qint32 getEngagerType() const;
    void setEngagerType(const qint32 &engager_type);
    bool is_engager_type_Set() const;
    bool is_engager_type_Valid() const;

    QList<QString> getCampaignId() const;
    void setCampaignId(const QList<QString> &campaign_id);
    bool is_campaign_id_Set() const;
    bool is_campaign_id_Valid() const;

    QList<QString> getAdId() const;
    void setAdId(const QList<QString> &ad_id);
    bool is_ad_id_Set() const;
    bool is_ad_id_Valid() const;

    QList<OAIObjectiveType> getObjectiveType() const;
    void setObjectiveType(const QList<OAIObjectiveType> &objective_type);
    bool is_objective_type_Set() const;
    bool is_objective_type_Valid() const;

    QString getAdAccountId() const;
    void setAdAccountId(const QString &ad_account_id);
    bool is_ad_account_id_Set() const;
    bool is_ad_account_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString country;
    bool m_country_isSet;
    bool m_country_isValid;

    QString customer_list_id;
    bool m_customer_list_id_isSet;
    bool m_customer_list_id_isValid;

    QList<QString> engagement_domain;
    bool m_engagement_domain_isSet;
    bool m_engagement_domain_isValid;

    QString engagement_type;
    bool m_engagement_type_isSet;
    bool m_engagement_type_isValid;

    QString event;
    bool m_event_isSet;
    bool m_event_isValid;

    OAIPinterestTagEventData event_data;
    bool m_event_data_isSet;
    bool m_event_data_isValid;

    qint32 percentage;
    bool m_percentage_isSet;
    bool m_percentage_isValid;

    QList<QString> pin_id;
    bool m_pin_id_isSet;
    bool m_pin_id_isValid;

    bool prefill;
    bool m_prefill_isSet;
    bool m_prefill_isValid;

    qint32 retention_days;
    bool m_retention_days_isSet;
    bool m_retention_days_isValid;

    QList<QString> seed_id;
    bool m_seed_id_isSet;
    bool m_seed_id_isValid;

    QList<QString> url;
    bool m_url_isSet;
    bool m_url_isValid;

    QString visitor_source_id;
    bool m_visitor_source_id_isSet;
    bool m_visitor_source_id_isValid;

    OAIObject event_source;
    bool m_event_source_isSet;
    bool m_event_source_isValid;

    OAIObject ingestion_source;
    bool m_ingestion_source_isSet;
    bool m_ingestion_source_isValid;

    qint32 engager_type;
    bool m_engager_type_isSet;
    bool m_engager_type_isValid;

    QList<QString> campaign_id;
    bool m_campaign_id_isSet;
    bool m_campaign_id_isValid;

    QList<QString> ad_id;
    bool m_ad_id_isSet;
    bool m_ad_id_isValid;

    QList<OAIObjectiveType> objective_type;
    bool m_objective_type_isSet;
    bool m_objective_type_isValid;

    QString ad_account_id;
    bool m_ad_account_id_isSet;
    bool m_ad_account_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAudienceRule)

#endif // OAIAudienceRule_H
