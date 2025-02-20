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

#include "OAIAdsCreditRedeemResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAdsCreditRedeemResponse::OAIAdsCreditRedeemResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAdsCreditRedeemResponse::OAIAdsCreditRedeemResponse() {
    this->initializeModel();
}

OAIAdsCreditRedeemResponse::~OAIAdsCreditRedeemResponse() {}

void OAIAdsCreditRedeemResponse::initializeModel() {

    m_success_isSet = false;
    m_success_isValid = false;

    m_error_code_isSet = false;
    m_error_code_isValid = false;

    m_error_message_isSet = false;
    m_error_message_isValid = false;
}

void OAIAdsCreditRedeemResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAdsCreditRedeemResponse::fromJsonObject(QJsonObject json) {

    m_success_isValid = ::OpenAPI::fromJsonValue(m_success, json[QString("success")]);
    m_success_isSet = !json[QString("success")].isNull() && m_success_isValid;

    m_error_code_isValid = ::OpenAPI::fromJsonValue(m_error_code, json[QString("errorCode")]);
    m_error_code_isSet = !json[QString("errorCode")].isNull() && m_error_code_isValid;

    m_error_message_isValid = ::OpenAPI::fromJsonValue(m_error_message, json[QString("errorMessage")]);
    m_error_message_isSet = !json[QString("errorMessage")].isNull() && m_error_message_isValid;
}

QString OAIAdsCreditRedeemResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAdsCreditRedeemResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_success_isSet) {
        obj.insert(QString("success"), ::OpenAPI::toJsonValue(m_success));
    }
    if (m_error_code_isSet) {
        obj.insert(QString("errorCode"), ::OpenAPI::toJsonValue(m_error_code));
    }
    if (m_error_message_isSet) {
        obj.insert(QString("errorMessage"), ::OpenAPI::toJsonValue(m_error_message));
    }
    return obj;
}

bool OAIAdsCreditRedeemResponse::isSuccess() const {
    return m_success;
}
void OAIAdsCreditRedeemResponse::setSuccess(const bool &success) {
    m_success = success;
    m_success_isSet = true;
}

bool OAIAdsCreditRedeemResponse::is_success_Set() const{
    return m_success_isSet;
}

bool OAIAdsCreditRedeemResponse::is_success_Valid() const{
    return m_success_isValid;
}

qint32 OAIAdsCreditRedeemResponse::getErrorCode() const {
    return m_error_code;
}
void OAIAdsCreditRedeemResponse::setErrorCode(const qint32 &error_code) {
    m_error_code = error_code;
    m_error_code_isSet = true;
}

bool OAIAdsCreditRedeemResponse::is_error_code_Set() const{
    return m_error_code_isSet;
}

bool OAIAdsCreditRedeemResponse::is_error_code_Valid() const{
    return m_error_code_isValid;
}

QString OAIAdsCreditRedeemResponse::getErrorMessage() const {
    return m_error_message;
}
void OAIAdsCreditRedeemResponse::setErrorMessage(const QString &error_message) {
    m_error_message = error_message;
    m_error_message_isSet = true;
}

bool OAIAdsCreditRedeemResponse::is_error_message_Set() const{
    return m_error_message_isSet;
}

bool OAIAdsCreditRedeemResponse::is_error_message_Valid() const{
    return m_error_message_isValid;
}

bool OAIAdsCreditRedeemResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_success_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_error_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_error_message_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAdsCreditRedeemResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
