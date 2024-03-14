/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICampaignResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICampaignResponse::OAICampaignResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICampaignResponse::OAICampaignResponse() {
    this->initializeModel();
}

OAICampaignResponse::~OAICampaignResponse() {}

void OAICampaignResponse::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_ad_account_id_isSet = false;
    m_ad_account_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_lifetime_spend_cap_isSet = false;
    m_lifetime_spend_cap_isValid = false;

    m_daily_spend_cap_isSet = false;
    m_daily_spend_cap_isValid = false;

    m_order_line_id_isSet = false;
    m_order_line_id_isValid = false;

    m_tracking_urls_isSet = false;
    m_tracking_urls_isValid = false;

    m_start_time_isSet = false;
    m_start_time_isValid = false;

    m_end_time_isSet = false;
    m_end_time_isValid = false;

    m_objective_type_isSet = false;
    m_objective_type_isValid = false;

    m_created_time_isSet = false;
    m_created_time_isValid = false;

    m_updated_time_isSet = false;
    m_updated_time_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_is_flexible_daily_budgets_isSet = false;
    m_is_flexible_daily_budgets_isValid = false;

    m_is_campaign_budget_optimization_isSet = false;
    m_is_campaign_budget_optimization_isValid = false;
}

void OAICampaignResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICampaignResponse::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_ad_account_id_isValid = ::OpenAPI::fromJsonValue(ad_account_id, json[QString("ad_account_id")]);
    m_ad_account_id_isSet = !json[QString("ad_account_id")].isNull() && m_ad_account_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_lifetime_spend_cap_isValid = ::OpenAPI::fromJsonValue(lifetime_spend_cap, json[QString("lifetime_spend_cap")]);
    m_lifetime_spend_cap_isSet = !json[QString("lifetime_spend_cap")].isNull() && m_lifetime_spend_cap_isValid;

    m_daily_spend_cap_isValid = ::OpenAPI::fromJsonValue(daily_spend_cap, json[QString("daily_spend_cap")]);
    m_daily_spend_cap_isSet = !json[QString("daily_spend_cap")].isNull() && m_daily_spend_cap_isValid;

    m_order_line_id_isValid = ::OpenAPI::fromJsonValue(order_line_id, json[QString("order_line_id")]);
    m_order_line_id_isSet = !json[QString("order_line_id")].isNull() && m_order_line_id_isValid;

    m_tracking_urls_isValid = ::OpenAPI::fromJsonValue(tracking_urls, json[QString("tracking_urls")]);
    m_tracking_urls_isSet = !json[QString("tracking_urls")].isNull() && m_tracking_urls_isValid;

    m_start_time_isValid = ::OpenAPI::fromJsonValue(start_time, json[QString("start_time")]);
    m_start_time_isSet = !json[QString("start_time")].isNull() && m_start_time_isValid;

    m_end_time_isValid = ::OpenAPI::fromJsonValue(end_time, json[QString("end_time")]);
    m_end_time_isSet = !json[QString("end_time")].isNull() && m_end_time_isValid;

    m_objective_type_isValid = ::OpenAPI::fromJsonValue(objective_type, json[QString("objective_type")]);
    m_objective_type_isSet = !json[QString("objective_type")].isNull() && m_objective_type_isValid;

    m_created_time_isValid = ::OpenAPI::fromJsonValue(created_time, json[QString("created_time")]);
    m_created_time_isSet = !json[QString("created_time")].isNull() && m_created_time_isValid;

    m_updated_time_isValid = ::OpenAPI::fromJsonValue(updated_time, json[QString("updated_time")]);
    m_updated_time_isSet = !json[QString("updated_time")].isNull() && m_updated_time_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_is_flexible_daily_budgets_isValid = ::OpenAPI::fromJsonValue(is_flexible_daily_budgets, json[QString("is_flexible_daily_budgets")]);
    m_is_flexible_daily_budgets_isSet = !json[QString("is_flexible_daily_budgets")].isNull() && m_is_flexible_daily_budgets_isValid;

    m_is_campaign_budget_optimization_isValid = ::OpenAPI::fromJsonValue(is_campaign_budget_optimization, json[QString("is_campaign_budget_optimization")]);
    m_is_campaign_budget_optimization_isSet = !json[QString("is_campaign_budget_optimization")].isNull() && m_is_campaign_budget_optimization_isValid;
}

QString OAICampaignResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICampaignResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_ad_account_id_isSet) {
        obj.insert(QString("ad_account_id"), ::OpenAPI::toJsonValue(ad_account_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_lifetime_spend_cap_isSet) {
        obj.insert(QString("lifetime_spend_cap"), ::OpenAPI::toJsonValue(lifetime_spend_cap));
    }
    if (m_daily_spend_cap_isSet) {
        obj.insert(QString("daily_spend_cap"), ::OpenAPI::toJsonValue(daily_spend_cap));
    }
    if (m_order_line_id_isSet) {
        obj.insert(QString("order_line_id"), ::OpenAPI::toJsonValue(order_line_id));
    }
    if (tracking_urls.isSet()) {
        obj.insert(QString("tracking_urls"), ::OpenAPI::toJsonValue(tracking_urls));
    }
    if (m_start_time_isSet) {
        obj.insert(QString("start_time"), ::OpenAPI::toJsonValue(start_time));
    }
    if (m_end_time_isSet) {
        obj.insert(QString("end_time"), ::OpenAPI::toJsonValue(end_time));
    }
    if (objective_type.isSet()) {
        obj.insert(QString("objective_type"), ::OpenAPI::toJsonValue(objective_type));
    }
    if (m_created_time_isSet) {
        obj.insert(QString("created_time"), ::OpenAPI::toJsonValue(created_time));
    }
    if (m_updated_time_isSet) {
        obj.insert(QString("updated_time"), ::OpenAPI::toJsonValue(updated_time));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_is_flexible_daily_budgets_isSet) {
        obj.insert(QString("is_flexible_daily_budgets"), ::OpenAPI::toJsonValue(is_flexible_daily_budgets));
    }
    if (m_is_campaign_budget_optimization_isSet) {
        obj.insert(QString("is_campaign_budget_optimization"), ::OpenAPI::toJsonValue(is_campaign_budget_optimization));
    }
    return obj;
}

QString OAICampaignResponse::getId() const {
    return id;
}
void OAICampaignResponse::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAICampaignResponse::is_id_Set() const{
    return m_id_isSet;
}

bool OAICampaignResponse::is_id_Valid() const{
    return m_id_isValid;
}

QString OAICampaignResponse::getAdAccountId() const {
    return ad_account_id;
}
void OAICampaignResponse::setAdAccountId(const QString &ad_account_id) {
    this->ad_account_id = ad_account_id;
    this->m_ad_account_id_isSet = true;
}

bool OAICampaignResponse::is_ad_account_id_Set() const{
    return m_ad_account_id_isSet;
}

bool OAICampaignResponse::is_ad_account_id_Valid() const{
    return m_ad_account_id_isValid;
}

QString OAICampaignResponse::getName() const {
    return name;
}
void OAICampaignResponse::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAICampaignResponse::is_name_Set() const{
    return m_name_isSet;
}

bool OAICampaignResponse::is_name_Valid() const{
    return m_name_isValid;
}

OAIEntityStatus OAICampaignResponse::getStatus() const {
    return status;
}
void OAICampaignResponse::setStatus(const OAIEntityStatus &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAICampaignResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAICampaignResponse::is_status_Valid() const{
    return m_status_isValid;
}

qint32 OAICampaignResponse::getLifetimeSpendCap() const {
    return lifetime_spend_cap;
}
void OAICampaignResponse::setLifetimeSpendCap(const qint32 &lifetime_spend_cap) {
    this->lifetime_spend_cap = lifetime_spend_cap;
    this->m_lifetime_spend_cap_isSet = true;
}

bool OAICampaignResponse::is_lifetime_spend_cap_Set() const{
    return m_lifetime_spend_cap_isSet;
}

bool OAICampaignResponse::is_lifetime_spend_cap_Valid() const{
    return m_lifetime_spend_cap_isValid;
}

qint32 OAICampaignResponse::getDailySpendCap() const {
    return daily_spend_cap;
}
void OAICampaignResponse::setDailySpendCap(const qint32 &daily_spend_cap) {
    this->daily_spend_cap = daily_spend_cap;
    this->m_daily_spend_cap_isSet = true;
}

bool OAICampaignResponse::is_daily_spend_cap_Set() const{
    return m_daily_spend_cap_isSet;
}

bool OAICampaignResponse::is_daily_spend_cap_Valid() const{
    return m_daily_spend_cap_isValid;
}

QString OAICampaignResponse::getOrderLineId() const {
    return order_line_id;
}
void OAICampaignResponse::setOrderLineId(const QString &order_line_id) {
    this->order_line_id = order_line_id;
    this->m_order_line_id_isSet = true;
}

bool OAICampaignResponse::is_order_line_id_Set() const{
    return m_order_line_id_isSet;
}

bool OAICampaignResponse::is_order_line_id_Valid() const{
    return m_order_line_id_isValid;
}

OAIAdCommon_tracking_urls OAICampaignResponse::getTrackingUrls() const {
    return tracking_urls;
}
void OAICampaignResponse::setTrackingUrls(const OAIAdCommon_tracking_urls &tracking_urls) {
    this->tracking_urls = tracking_urls;
    this->m_tracking_urls_isSet = true;
}

bool OAICampaignResponse::is_tracking_urls_Set() const{
    return m_tracking_urls_isSet;
}

bool OAICampaignResponse::is_tracking_urls_Valid() const{
    return m_tracking_urls_isValid;
}

qint32 OAICampaignResponse::getStartTime() const {
    return start_time;
}
void OAICampaignResponse::setStartTime(const qint32 &start_time) {
    this->start_time = start_time;
    this->m_start_time_isSet = true;
}

bool OAICampaignResponse::is_start_time_Set() const{
    return m_start_time_isSet;
}

bool OAICampaignResponse::is_start_time_Valid() const{
    return m_start_time_isValid;
}

qint32 OAICampaignResponse::getEndTime() const {
    return end_time;
}
void OAICampaignResponse::setEndTime(const qint32 &end_time) {
    this->end_time = end_time;
    this->m_end_time_isSet = true;
}

bool OAICampaignResponse::is_end_time_Set() const{
    return m_end_time_isSet;
}

bool OAICampaignResponse::is_end_time_Valid() const{
    return m_end_time_isValid;
}

OAIObjectiveType OAICampaignResponse::getObjectiveType() const {
    return objective_type;
}
void OAICampaignResponse::setObjectiveType(const OAIObjectiveType &objective_type) {
    this->objective_type = objective_type;
    this->m_objective_type_isSet = true;
}

bool OAICampaignResponse::is_objective_type_Set() const{
    return m_objective_type_isSet;
}

bool OAICampaignResponse::is_objective_type_Valid() const{
    return m_objective_type_isValid;
}

qint32 OAICampaignResponse::getCreatedTime() const {
    return created_time;
}
void OAICampaignResponse::setCreatedTime(const qint32 &created_time) {
    this->created_time = created_time;
    this->m_created_time_isSet = true;
}

bool OAICampaignResponse::is_created_time_Set() const{
    return m_created_time_isSet;
}

bool OAICampaignResponse::is_created_time_Valid() const{
    return m_created_time_isValid;
}

qint32 OAICampaignResponse::getUpdatedTime() const {
    return updated_time;
}
void OAICampaignResponse::setUpdatedTime(const qint32 &updated_time) {
    this->updated_time = updated_time;
    this->m_updated_time_isSet = true;
}

bool OAICampaignResponse::is_updated_time_Set() const{
    return m_updated_time_isSet;
}

bool OAICampaignResponse::is_updated_time_Valid() const{
    return m_updated_time_isValid;
}

QString OAICampaignResponse::getType() const {
    return type;
}
void OAICampaignResponse::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAICampaignResponse::is_type_Set() const{
    return m_type_isSet;
}

bool OAICampaignResponse::is_type_Valid() const{
    return m_type_isValid;
}

bool OAICampaignResponse::isIsFlexibleDailyBudgets() const {
    return is_flexible_daily_budgets;
}
void OAICampaignResponse::setIsFlexibleDailyBudgets(const bool &is_flexible_daily_budgets) {
    this->is_flexible_daily_budgets = is_flexible_daily_budgets;
    this->m_is_flexible_daily_budgets_isSet = true;
}

bool OAICampaignResponse::is_is_flexible_daily_budgets_Set() const{
    return m_is_flexible_daily_budgets_isSet;
}

bool OAICampaignResponse::is_is_flexible_daily_budgets_Valid() const{
    return m_is_flexible_daily_budgets_isValid;
}

bool OAICampaignResponse::isIsCampaignBudgetOptimization() const {
    return is_campaign_budget_optimization;
}
void OAICampaignResponse::setIsCampaignBudgetOptimization(const bool &is_campaign_budget_optimization) {
    this->is_campaign_budget_optimization = is_campaign_budget_optimization;
    this->m_is_campaign_budget_optimization_isSet = true;
}

bool OAICampaignResponse::is_is_campaign_budget_optimization_Set() const{
    return m_is_campaign_budget_optimization_isSet;
}

bool OAICampaignResponse::is_is_campaign_budget_optimization_Valid() const{
    return m_is_campaign_budget_optimization_isValid;
}

bool OAICampaignResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ad_account_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_lifetime_spend_cap_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_daily_spend_cap_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_order_line_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (tracking_urls.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_start_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_end_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (objective_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_updated_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_flexible_daily_budgets_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_campaign_budget_optimization_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICampaignResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI