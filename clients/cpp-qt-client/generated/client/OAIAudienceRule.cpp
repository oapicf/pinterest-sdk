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

#include "OAIAudienceRule.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAudienceRule::OAIAudienceRule(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAudienceRule::OAIAudienceRule() {
    this->initializeModel();
}

OAIAudienceRule::~OAIAudienceRule() {}

void OAIAudienceRule::initializeModel() {

    m_country_isSet = false;
    m_country_isValid = false;

    m_customer_list_id_isSet = false;
    m_customer_list_id_isValid = false;

    m_engagement_domain_isSet = false;
    m_engagement_domain_isValid = false;

    m_engagement_type_isSet = false;
    m_engagement_type_isValid = false;

    m_event_isSet = false;
    m_event_isValid = false;

    m_event_data_isSet = false;
    m_event_data_isValid = false;

    m_percentage_isSet = false;
    m_percentage_isValid = false;

    m_pin_id_isSet = false;
    m_pin_id_isValid = false;

    m_prefill_isSet = false;
    m_prefill_isValid = false;

    m_retention_days_isSet = false;
    m_retention_days_isValid = false;

    m_seed_id_isSet = false;
    m_seed_id_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;

    m_visitor_source_id_isSet = false;
    m_visitor_source_id_isValid = false;

    m_event_source_isSet = false;
    m_event_source_isValid = false;

    m_ingestion_source_isSet = false;
    m_ingestion_source_isValid = false;

    m_engager_type_isSet = false;
    m_engager_type_isValid = false;

    m_campaign_id_isSet = false;
    m_campaign_id_isValid = false;

    m_ad_id_isSet = false;
    m_ad_id_isValid = false;

    m_objective_type_isSet = false;
    m_objective_type_isValid = false;

    m_ad_account_id_isSet = false;
    m_ad_account_id_isValid = false;
}

void OAIAudienceRule::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAudienceRule::fromJsonObject(QJsonObject json) {

    m_country_isValid = ::OpenAPI::fromJsonValue(m_country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_customer_list_id_isValid = ::OpenAPI::fromJsonValue(m_customer_list_id, json[QString("customer_list_id")]);
    m_customer_list_id_isSet = !json[QString("customer_list_id")].isNull() && m_customer_list_id_isValid;

    m_engagement_domain_isValid = ::OpenAPI::fromJsonValue(m_engagement_domain, json[QString("engagement_domain")]);
    m_engagement_domain_isSet = !json[QString("engagement_domain")].isNull() && m_engagement_domain_isValid;

    m_engagement_type_isValid = ::OpenAPI::fromJsonValue(m_engagement_type, json[QString("engagement_type")]);
    m_engagement_type_isSet = !json[QString("engagement_type")].isNull() && m_engagement_type_isValid;

    m_event_isValid = ::OpenAPI::fromJsonValue(m_event, json[QString("event")]);
    m_event_isSet = !json[QString("event")].isNull() && m_event_isValid;

    m_event_data_isValid = ::OpenAPI::fromJsonValue(m_event_data, json[QString("event_data")]);
    m_event_data_isSet = !json[QString("event_data")].isNull() && m_event_data_isValid;

    m_percentage_isValid = ::OpenAPI::fromJsonValue(m_percentage, json[QString("percentage")]);
    m_percentage_isSet = !json[QString("percentage")].isNull() && m_percentage_isValid;

    m_pin_id_isValid = ::OpenAPI::fromJsonValue(m_pin_id, json[QString("pin_id")]);
    m_pin_id_isSet = !json[QString("pin_id")].isNull() && m_pin_id_isValid;

    m_prefill_isValid = ::OpenAPI::fromJsonValue(m_prefill, json[QString("prefill")]);
    m_prefill_isSet = !json[QString("prefill")].isNull() && m_prefill_isValid;

    m_retention_days_isValid = ::OpenAPI::fromJsonValue(m_retention_days, json[QString("retention_days")]);
    m_retention_days_isSet = !json[QString("retention_days")].isNull() && m_retention_days_isValid;

    m_seed_id_isValid = ::OpenAPI::fromJsonValue(m_seed_id, json[QString("seed_id")]);
    m_seed_id_isSet = !json[QString("seed_id")].isNull() && m_seed_id_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(m_url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m_visitor_source_id_isValid = ::OpenAPI::fromJsonValue(m_visitor_source_id, json[QString("visitor_source_id")]);
    m_visitor_source_id_isSet = !json[QString("visitor_source_id")].isNull() && m_visitor_source_id_isValid;

    m_event_source_isValid = ::OpenAPI::fromJsonValue(m_event_source, json[QString("event_source")]);
    m_event_source_isSet = !json[QString("event_source")].isNull() && m_event_source_isValid;

    m_ingestion_source_isValid = ::OpenAPI::fromJsonValue(m_ingestion_source, json[QString("ingestion_source")]);
    m_ingestion_source_isSet = !json[QString("ingestion_source")].isNull() && m_ingestion_source_isValid;

    m_engager_type_isValid = ::OpenAPI::fromJsonValue(m_engager_type, json[QString("engager_type")]);
    m_engager_type_isSet = !json[QString("engager_type")].isNull() && m_engager_type_isValid;

    m_campaign_id_isValid = ::OpenAPI::fromJsonValue(m_campaign_id, json[QString("campaign_id")]);
    m_campaign_id_isSet = !json[QString("campaign_id")].isNull() && m_campaign_id_isValid;

    m_ad_id_isValid = ::OpenAPI::fromJsonValue(m_ad_id, json[QString("ad_id")]);
    m_ad_id_isSet = !json[QString("ad_id")].isNull() && m_ad_id_isValid;

    m_objective_type_isValid = ::OpenAPI::fromJsonValue(m_objective_type, json[QString("objective_type")]);
    m_objective_type_isSet = !json[QString("objective_type")].isNull() && m_objective_type_isValid;

    m_ad_account_id_isValid = ::OpenAPI::fromJsonValue(m_ad_account_id, json[QString("ad_account_id")]);
    m_ad_account_id_isSet = !json[QString("ad_account_id")].isNull() && m_ad_account_id_isValid;
}

QString OAIAudienceRule::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAudienceRule::asJsonObject() const {
    QJsonObject obj;
    if (m_country_isSet) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(m_country));
    }
    if (m_customer_list_id_isSet) {
        obj.insert(QString("customer_list_id"), ::OpenAPI::toJsonValue(m_customer_list_id));
    }
    if (m_engagement_domain.size() > 0) {
        obj.insert(QString("engagement_domain"), ::OpenAPI::toJsonValue(m_engagement_domain));
    }
    if (m_engagement_type_isSet) {
        obj.insert(QString("engagement_type"), ::OpenAPI::toJsonValue(m_engagement_type));
    }
    if (m_event_isSet) {
        obj.insert(QString("event"), ::OpenAPI::toJsonValue(m_event));
    }
    if (m_event_data.isSet()) {
        obj.insert(QString("event_data"), ::OpenAPI::toJsonValue(m_event_data));
    }
    if (m_percentage_isSet) {
        obj.insert(QString("percentage"), ::OpenAPI::toJsonValue(m_percentage));
    }
    if (m_pin_id.size() > 0) {
        obj.insert(QString("pin_id"), ::OpenAPI::toJsonValue(m_pin_id));
    }
    if (m_prefill_isSet) {
        obj.insert(QString("prefill"), ::OpenAPI::toJsonValue(m_prefill));
    }
    if (m_retention_days_isSet) {
        obj.insert(QString("retention_days"), ::OpenAPI::toJsonValue(m_retention_days));
    }
    if (m_seed_id.size() > 0) {
        obj.insert(QString("seed_id"), ::OpenAPI::toJsonValue(m_seed_id));
    }
    if (m_url.size() > 0) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(m_url));
    }
    if (m_visitor_source_id_isSet) {
        obj.insert(QString("visitor_source_id"), ::OpenAPI::toJsonValue(m_visitor_source_id));
    }
    if (m_event_source_isSet) {
        obj.insert(QString("event_source"), ::OpenAPI::toJsonValue(m_event_source));
    }
    if (m_ingestion_source_isSet) {
        obj.insert(QString("ingestion_source"), ::OpenAPI::toJsonValue(m_ingestion_source));
    }
    if (m_engager_type_isSet) {
        obj.insert(QString("engager_type"), ::OpenAPI::toJsonValue(m_engager_type));
    }
    if (m_campaign_id.size() > 0) {
        obj.insert(QString("campaign_id"), ::OpenAPI::toJsonValue(m_campaign_id));
    }
    if (m_ad_id.size() > 0) {
        obj.insert(QString("ad_id"), ::OpenAPI::toJsonValue(m_ad_id));
    }
    if (m_objective_type.size() > 0) {
        obj.insert(QString("objective_type"), ::OpenAPI::toJsonValue(m_objective_type));
    }
    if (m_ad_account_id_isSet) {
        obj.insert(QString("ad_account_id"), ::OpenAPI::toJsonValue(m_ad_account_id));
    }
    return obj;
}

QString OAIAudienceRule::getCountry() const {
    return m_country;
}
void OAIAudienceRule::setCountry(const QString &country) {
    m_country = country;
    m_country_isSet = true;
}

bool OAIAudienceRule::is_country_Set() const{
    return m_country_isSet;
}

bool OAIAudienceRule::is_country_Valid() const{
    return m_country_isValid;
}

QString OAIAudienceRule::getCustomerListId() const {
    return m_customer_list_id;
}
void OAIAudienceRule::setCustomerListId(const QString &customer_list_id) {
    m_customer_list_id = customer_list_id;
    m_customer_list_id_isSet = true;
}

bool OAIAudienceRule::is_customer_list_id_Set() const{
    return m_customer_list_id_isSet;
}

bool OAIAudienceRule::is_customer_list_id_Valid() const{
    return m_customer_list_id_isValid;
}

QList<QString> OAIAudienceRule::getEngagementDomain() const {
    return m_engagement_domain;
}
void OAIAudienceRule::setEngagementDomain(const QList<QString> &engagement_domain) {
    m_engagement_domain = engagement_domain;
    m_engagement_domain_isSet = true;
}

bool OAIAudienceRule::is_engagement_domain_Set() const{
    return m_engagement_domain_isSet;
}

bool OAIAudienceRule::is_engagement_domain_Valid() const{
    return m_engagement_domain_isValid;
}

QString OAIAudienceRule::getEngagementType() const {
    return m_engagement_type;
}
void OAIAudienceRule::setEngagementType(const QString &engagement_type) {
    m_engagement_type = engagement_type;
    m_engagement_type_isSet = true;
}

bool OAIAudienceRule::is_engagement_type_Set() const{
    return m_engagement_type_isSet;
}

bool OAIAudienceRule::is_engagement_type_Valid() const{
    return m_engagement_type_isValid;
}

QString OAIAudienceRule::getEvent() const {
    return m_event;
}
void OAIAudienceRule::setEvent(const QString &event) {
    m_event = event;
    m_event_isSet = true;
}

bool OAIAudienceRule::is_event_Set() const{
    return m_event_isSet;
}

bool OAIAudienceRule::is_event_Valid() const{
    return m_event_isValid;
}

OAIPinterestTagEventData OAIAudienceRule::getEventData() const {
    return m_event_data;
}
void OAIAudienceRule::setEventData(const OAIPinterestTagEventData &event_data) {
    m_event_data = event_data;
    m_event_data_isSet = true;
}

bool OAIAudienceRule::is_event_data_Set() const{
    return m_event_data_isSet;
}

bool OAIAudienceRule::is_event_data_Valid() const{
    return m_event_data_isValid;
}

qint32 OAIAudienceRule::getPercentage() const {
    return m_percentage;
}
void OAIAudienceRule::setPercentage(const qint32 &percentage) {
    m_percentage = percentage;
    m_percentage_isSet = true;
}

bool OAIAudienceRule::is_percentage_Set() const{
    return m_percentage_isSet;
}

bool OAIAudienceRule::is_percentage_Valid() const{
    return m_percentage_isValid;
}

QList<QString> OAIAudienceRule::getPinId() const {
    return m_pin_id;
}
void OAIAudienceRule::setPinId(const QList<QString> &pin_id) {
    m_pin_id = pin_id;
    m_pin_id_isSet = true;
}

bool OAIAudienceRule::is_pin_id_Set() const{
    return m_pin_id_isSet;
}

bool OAIAudienceRule::is_pin_id_Valid() const{
    return m_pin_id_isValid;
}

bool OAIAudienceRule::isPrefill() const {
    return m_prefill;
}
void OAIAudienceRule::setPrefill(const bool &prefill) {
    m_prefill = prefill;
    m_prefill_isSet = true;
}

bool OAIAudienceRule::is_prefill_Set() const{
    return m_prefill_isSet;
}

bool OAIAudienceRule::is_prefill_Valid() const{
    return m_prefill_isValid;
}

qint32 OAIAudienceRule::getRetentionDays() const {
    return m_retention_days;
}
void OAIAudienceRule::setRetentionDays(const qint32 &retention_days) {
    m_retention_days = retention_days;
    m_retention_days_isSet = true;
}

bool OAIAudienceRule::is_retention_days_Set() const{
    return m_retention_days_isSet;
}

bool OAIAudienceRule::is_retention_days_Valid() const{
    return m_retention_days_isValid;
}

QList<QString> OAIAudienceRule::getSeedId() const {
    return m_seed_id;
}
void OAIAudienceRule::setSeedId(const QList<QString> &seed_id) {
    m_seed_id = seed_id;
    m_seed_id_isSet = true;
}

bool OAIAudienceRule::is_seed_id_Set() const{
    return m_seed_id_isSet;
}

bool OAIAudienceRule::is_seed_id_Valid() const{
    return m_seed_id_isValid;
}

QList<QString> OAIAudienceRule::getUrl() const {
    return m_url;
}
void OAIAudienceRule::setUrl(const QList<QString> &url) {
    m_url = url;
    m_url_isSet = true;
}

bool OAIAudienceRule::is_url_Set() const{
    return m_url_isSet;
}

bool OAIAudienceRule::is_url_Valid() const{
    return m_url_isValid;
}

QString OAIAudienceRule::getVisitorSourceId() const {
    return m_visitor_source_id;
}
void OAIAudienceRule::setVisitorSourceId(const QString &visitor_source_id) {
    m_visitor_source_id = visitor_source_id;
    m_visitor_source_id_isSet = true;
}

bool OAIAudienceRule::is_visitor_source_id_Set() const{
    return m_visitor_source_id_isSet;
}

bool OAIAudienceRule::is_visitor_source_id_Valid() const{
    return m_visitor_source_id_isValid;
}

OAIObject OAIAudienceRule::getEventSource() const {
    return m_event_source;
}
void OAIAudienceRule::setEventSource(const OAIObject &event_source) {
    m_event_source = event_source;
    m_event_source_isSet = true;
}

bool OAIAudienceRule::is_event_source_Set() const{
    return m_event_source_isSet;
}

bool OAIAudienceRule::is_event_source_Valid() const{
    return m_event_source_isValid;
}

OAIObject OAIAudienceRule::getIngestionSource() const {
    return m_ingestion_source;
}
void OAIAudienceRule::setIngestionSource(const OAIObject &ingestion_source) {
    m_ingestion_source = ingestion_source;
    m_ingestion_source_isSet = true;
}

bool OAIAudienceRule::is_ingestion_source_Set() const{
    return m_ingestion_source_isSet;
}

bool OAIAudienceRule::is_ingestion_source_Valid() const{
    return m_ingestion_source_isValid;
}

qint32 OAIAudienceRule::getEngagerType() const {
    return m_engager_type;
}
void OAIAudienceRule::setEngagerType(const qint32 &engager_type) {
    m_engager_type = engager_type;
    m_engager_type_isSet = true;
}

bool OAIAudienceRule::is_engager_type_Set() const{
    return m_engager_type_isSet;
}

bool OAIAudienceRule::is_engager_type_Valid() const{
    return m_engager_type_isValid;
}

QList<QString> OAIAudienceRule::getCampaignId() const {
    return m_campaign_id;
}
void OAIAudienceRule::setCampaignId(const QList<QString> &campaign_id) {
    m_campaign_id = campaign_id;
    m_campaign_id_isSet = true;
}

bool OAIAudienceRule::is_campaign_id_Set() const{
    return m_campaign_id_isSet;
}

bool OAIAudienceRule::is_campaign_id_Valid() const{
    return m_campaign_id_isValid;
}

QList<QString> OAIAudienceRule::getAdId() const {
    return m_ad_id;
}
void OAIAudienceRule::setAdId(const QList<QString> &ad_id) {
    m_ad_id = ad_id;
    m_ad_id_isSet = true;
}

bool OAIAudienceRule::is_ad_id_Set() const{
    return m_ad_id_isSet;
}

bool OAIAudienceRule::is_ad_id_Valid() const{
    return m_ad_id_isValid;
}

QList<OAIObjectiveType> OAIAudienceRule::getObjectiveType() const {
    return m_objective_type;
}
void OAIAudienceRule::setObjectiveType(const QList<OAIObjectiveType> &objective_type) {
    m_objective_type = objective_type;
    m_objective_type_isSet = true;
}

bool OAIAudienceRule::is_objective_type_Set() const{
    return m_objective_type_isSet;
}

bool OAIAudienceRule::is_objective_type_Valid() const{
    return m_objective_type_isValid;
}

QString OAIAudienceRule::getAdAccountId() const {
    return m_ad_account_id;
}
void OAIAudienceRule::setAdAccountId(const QString &ad_account_id) {
    m_ad_account_id = ad_account_id;
    m_ad_account_id_isSet = true;
}

bool OAIAudienceRule::is_ad_account_id_Set() const{
    return m_ad_account_id_isSet;
}

bool OAIAudienceRule::is_ad_account_id_Valid() const{
    return m_ad_account_id_isValid;
}

bool OAIAudienceRule::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_country_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_customer_list_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_engagement_domain.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_engagement_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_event_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_event_data.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_percentage_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_pin_id.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_prefill_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_retention_days_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_seed_id.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_url.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_visitor_source_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_event_source_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ingestion_source_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_engager_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_campaign_id.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_ad_id.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_objective_type.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_ad_account_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAudienceRule::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
