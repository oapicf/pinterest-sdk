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

#include "OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner() {
    this->initializeModel();
}

OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::~OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner() {}

void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::initializeModel() {

    m_log_index_isSet = false;
    m_log_index_isValid = false;

    m_field_isSet = false;
    m_field_isValid = false;

    m_value_isSet = false;
    m_value_isValid = false;

    m_reason_isSet = false;
    m_reason_isValid = false;
}

void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::fromJsonObject(QJsonObject json) {

    m_log_index_isValid = ::OpenAPI::fromJsonValue(m_log_index, json[QString("log_index")]);
    m_log_index_isSet = !json[QString("log_index")].isNull() && m_log_index_isValid;

    m_field_isValid = ::OpenAPI::fromJsonValue(m_field, json[QString("field")]);
    m_field_isSet = !json[QString("field")].isNull() && m_field_isValid;

    m_value_isValid = ::OpenAPI::fromJsonValue(m_value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;

    m_reason_isValid = ::OpenAPI::fromJsonValue(m_reason, json[QString("reason")]);
    m_reason_isSet = !json[QString("reason")].isNull() && m_reason_isValid;
}

QString OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_log_index_isSet) {
        obj.insert(QString("log_index"), ::OpenAPI::toJsonValue(m_log_index));
    }
    if (m_field_isSet) {
        obj.insert(QString("field"), ::OpenAPI::toJsonValue(m_field));
    }
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(m_value));
    }
    if (m_reason_isSet) {
        obj.insert(QString("reason"), ::OpenAPI::toJsonValue(m_reason));
    }
    return obj;
}

qint32 OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::getLogIndex() const {
    return m_log_index;
}
void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::setLogIndex(const qint32 &log_index) {
    m_log_index = log_index;
    m_log_index_isSet = true;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_log_index_Set() const{
    return m_log_index_isSet;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_log_index_Valid() const{
    return m_log_index_isValid;
}

QString OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::getField() const {
    return m_field;
}
void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::setField(const QString &field) {
    m_field = field;
    m_field_isSet = true;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_field_Set() const{
    return m_field_isSet;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_field_Valid() const{
    return m_field_isValid;
}

QString OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::getValue() const {
    return m_value;
}
void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::setValue(const QString &value) {
    m_value = value;
    m_value_isSet = true;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_value_Set() const{
    return m_value_isSet;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_value_Valid() const{
    return m_value_isValid;
}

QString OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::getReason() const {
    return m_reason;
}
void OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::setReason(const QString &reason) {
    m_reason = reason;
    m_reason_isSet = true;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_reason_Set() const{
    return m_reason_isSet;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::is_reason_Valid() const{
    return m_reason_isValid;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_log_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_field_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_reason_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIIntegrationLogsInvalidLogResponse_rejected_logs_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_field_isValid && m_value_isValid && m_reason_isValid && true;
}

} // namespace OpenAPI
