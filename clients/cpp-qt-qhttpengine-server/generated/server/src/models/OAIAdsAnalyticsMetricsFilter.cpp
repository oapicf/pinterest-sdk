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

#include "OAIAdsAnalyticsMetricsFilter.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAdsAnalyticsMetricsFilter::OAIAdsAnalyticsMetricsFilter(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAdsAnalyticsMetricsFilter::OAIAdsAnalyticsMetricsFilter() {
    this->initializeModel();
}

OAIAdsAnalyticsMetricsFilter::~OAIAdsAnalyticsMetricsFilter() {}

void OAIAdsAnalyticsMetricsFilter::initializeModel() {

    m_field_isSet = false;
    m_field_isValid = false;

    m_r_operator_isSet = false;
    m_r_operator_isValid = false;

    m_values_isSet = false;
    m_values_isValid = false;
}

void OAIAdsAnalyticsMetricsFilter::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAdsAnalyticsMetricsFilter::fromJsonObject(QJsonObject json) {

    m_field_isValid = ::OpenAPI::fromJsonValue(field, json[QString("field")]);
    m_field_isSet = !json[QString("field")].isNull() && m_field_isValid;

    m_r_operator_isValid = ::OpenAPI::fromJsonValue(r_operator, json[QString("operator")]);
    m_r_operator_isSet = !json[QString("operator")].isNull() && m_r_operator_isValid;

    m_values_isValid = ::OpenAPI::fromJsonValue(values, json[QString("values")]);
    m_values_isSet = !json[QString("values")].isNull() && m_values_isValid;
}

QString OAIAdsAnalyticsMetricsFilter::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAdsAnalyticsMetricsFilter::asJsonObject() const {
    QJsonObject obj;
    if (field.isSet()) {
        obj.insert(QString("field"), ::OpenAPI::toJsonValue(field));
    }
    if (r_operator.isSet()) {
        obj.insert(QString("operator"), ::OpenAPI::toJsonValue(r_operator));
    }
    if (values.size() > 0) {
        obj.insert(QString("values"), ::OpenAPI::toJsonValue(values));
    }
    return obj;
}

OAIAdsAnalyticsFilterColumn OAIAdsAnalyticsMetricsFilter::getField() const {
    return field;
}
void OAIAdsAnalyticsMetricsFilter::setField(const OAIAdsAnalyticsFilterColumn &field) {
    this->field = field;
    this->m_field_isSet = true;
}

bool OAIAdsAnalyticsMetricsFilter::is_field_Set() const{
    return m_field_isSet;
}

bool OAIAdsAnalyticsMetricsFilter::is_field_Valid() const{
    return m_field_isValid;
}

OAIAdsAnalyticsFilterOperator OAIAdsAnalyticsMetricsFilter::getROperator() const {
    return r_operator;
}
void OAIAdsAnalyticsMetricsFilter::setROperator(const OAIAdsAnalyticsFilterOperator &r_operator) {
    this->r_operator = r_operator;
    this->m_r_operator_isSet = true;
}

bool OAIAdsAnalyticsMetricsFilter::is_r_operator_Set() const{
    return m_r_operator_isSet;
}

bool OAIAdsAnalyticsMetricsFilter::is_r_operator_Valid() const{
    return m_r_operator_isValid;
}

QList<double> OAIAdsAnalyticsMetricsFilter::getValues() const {
    return values;
}
void OAIAdsAnalyticsMetricsFilter::setValues(const QList<double> &values) {
    this->values = values;
    this->m_values_isSet = true;
}

bool OAIAdsAnalyticsMetricsFilter::is_values_Set() const{
    return m_values_isSet;
}

bool OAIAdsAnalyticsMetricsFilter::is_values_Valid() const{
    return m_values_isValid;
}

bool OAIAdsAnalyticsMetricsFilter::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (field.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (r_operator.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (values.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAdsAnalyticsMetricsFilter::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_field_isValid && m_r_operator_isValid && m_values_isValid && true;
}

} // namespace OpenAPI
