/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIPinAnalyticsMetricsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPinAnalyticsMetricsResponse::OAIPinAnalyticsMetricsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPinAnalyticsMetricsResponse::OAIPinAnalyticsMetricsResponse() {
    this->initializeModel();
}

OAIPinAnalyticsMetricsResponse::~OAIPinAnalyticsMetricsResponse() {}

void OAIPinAnalyticsMetricsResponse::initializeModel() {

    m_lifetime_metrics_isSet = false;
    m_lifetime_metrics_isValid = false;

    m_daily_metrics_isSet = false;
    m_daily_metrics_isValid = false;

    m_summary_metrics_isSet = false;
    m_summary_metrics_isValid = false;
}

void OAIPinAnalyticsMetricsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPinAnalyticsMetricsResponse::fromJsonObject(QJsonObject json) {

    m_lifetime_metrics_isValid = ::OpenAPI::fromJsonValue(m_lifetime_metrics, json[QString("lifetime_metrics")]);
    m_lifetime_metrics_isSet = !json[QString("lifetime_metrics")].isNull() && m_lifetime_metrics_isValid;

    m_daily_metrics_isValid = ::OpenAPI::fromJsonValue(m_daily_metrics, json[QString("daily_metrics")]);
    m_daily_metrics_isSet = !json[QString("daily_metrics")].isNull() && m_daily_metrics_isValid;

    m_summary_metrics_isValid = ::OpenAPI::fromJsonValue(m_summary_metrics, json[QString("summary_metrics")]);
    m_summary_metrics_isSet = !json[QString("summary_metrics")].isNull() && m_summary_metrics_isValid;
}

QString OAIPinAnalyticsMetricsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPinAnalyticsMetricsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_lifetime_metrics.size() > 0) {
        obj.insert(QString("lifetime_metrics"), ::OpenAPI::toJsonValue(m_lifetime_metrics));
    }
    if (m_daily_metrics.size() > 0) {
        obj.insert(QString("daily_metrics"), ::OpenAPI::toJsonValue(m_daily_metrics));
    }
    if (m_summary_metrics.size() > 0) {
        obj.insert(QString("summary_metrics"), ::OpenAPI::toJsonValue(m_summary_metrics));
    }
    return obj;
}

QMap<QString, qint32> OAIPinAnalyticsMetricsResponse::getLifetimeMetrics() const {
    return m_lifetime_metrics;
}
void OAIPinAnalyticsMetricsResponse::setLifetimeMetrics(const QMap<QString, qint32> &lifetime_metrics) {
    m_lifetime_metrics = lifetime_metrics;
    m_lifetime_metrics_isSet = true;
}

bool OAIPinAnalyticsMetricsResponse::is_lifetime_metrics_Set() const{
    return m_lifetime_metrics_isSet;
}

bool OAIPinAnalyticsMetricsResponse::is_lifetime_metrics_Valid() const{
    return m_lifetime_metrics_isValid;
}

QList<OAIPinAnalyticsMetricsResponse_daily_metrics_inner> OAIPinAnalyticsMetricsResponse::getDailyMetrics() const {
    return m_daily_metrics;
}
void OAIPinAnalyticsMetricsResponse::setDailyMetrics(const QList<OAIPinAnalyticsMetricsResponse_daily_metrics_inner> &daily_metrics) {
    m_daily_metrics = daily_metrics;
    m_daily_metrics_isSet = true;
}

bool OAIPinAnalyticsMetricsResponse::is_daily_metrics_Set() const{
    return m_daily_metrics_isSet;
}

bool OAIPinAnalyticsMetricsResponse::is_daily_metrics_Valid() const{
    return m_daily_metrics_isValid;
}

QMap<QString, double> OAIPinAnalyticsMetricsResponse::getSummaryMetrics() const {
    return m_summary_metrics;
}
void OAIPinAnalyticsMetricsResponse::setSummaryMetrics(const QMap<QString, double> &summary_metrics) {
    m_summary_metrics = summary_metrics;
    m_summary_metrics_isSet = true;
}

bool OAIPinAnalyticsMetricsResponse::is_summary_metrics_Set() const{
    return m_summary_metrics_isSet;
}

bool OAIPinAnalyticsMetricsResponse::is_summary_metrics_Valid() const{
    return m_summary_metrics_isValid;
}

bool OAIPinAnalyticsMetricsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_lifetime_metrics.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_daily_metrics.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_summary_metrics.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPinAnalyticsMetricsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI