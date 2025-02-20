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

#include "OAIGetMMMReportResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetMMMReportResponse::OAIGetMMMReportResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetMMMReportResponse::OAIGetMMMReportResponse() {
    this->initializeModel();
}

OAIGetMMMReportResponse::~OAIGetMMMReportResponse() {}

void OAIGetMMMReportResponse::initializeModel() {

    m_code_isSet = false;
    m_code_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;
}

void OAIGetMMMReportResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetMMMReportResponse::fromJsonObject(QJsonObject json) {

    m_code_isValid = ::OpenAPI::fromJsonValue(code, json[QString("code")]);
    m_code_isSet = !json[QString("code")].isNull() && m_code_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;
}

QString OAIGetMMMReportResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetMMMReportResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_code_isSet) {
        obj.insert(QString("code"), ::OpenAPI::toJsonValue(code));
    }
    if (data.isSet()) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(message));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    return obj;
}

double OAIGetMMMReportResponse::getCode() const {
    return code;
}
void OAIGetMMMReportResponse::setCode(const double &code) {
    this->code = code;
    this->m_code_isSet = true;
}

bool OAIGetMMMReportResponse::is_code_Set() const{
    return m_code_isSet;
}

bool OAIGetMMMReportResponse::is_code_Valid() const{
    return m_code_isValid;
}

OAIGetMMMReportResponseData OAIGetMMMReportResponse::getData() const {
    return data;
}
void OAIGetMMMReportResponse::setData(const OAIGetMMMReportResponseData &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIGetMMMReportResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIGetMMMReportResponse::is_data_Valid() const{
    return m_data_isValid;
}

QString OAIGetMMMReportResponse::getMessage() const {
    return message;
}
void OAIGetMMMReportResponse::setMessage(const QString &message) {
    this->message = message;
    this->m_message_isSet = true;
}

bool OAIGetMMMReportResponse::is_message_Set() const{
    return m_message_isSet;
}

bool OAIGetMMMReportResponse::is_message_Valid() const{
    return m_message_isValid;
}

QString OAIGetMMMReportResponse::getStatus() const {
    return status;
}
void OAIGetMMMReportResponse::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIGetMMMReportResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAIGetMMMReportResponse::is_status_Valid() const{
    return m_status_isValid;
}

bool OAIGetMMMReportResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (data.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetMMMReportResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
