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

#include "OAIKeywordError.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIKeywordError::OAIKeywordError(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIKeywordError::OAIKeywordError() {
    this->initializeModel();
}

OAIKeywordError::~OAIKeywordError() {}

void OAIKeywordError::initializeModel() {

    m_data_isSet = false;
    m_data_isValid = false;

    m_error_messages_isSet = false;
    m_error_messages_isValid = false;
}

void OAIKeywordError::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIKeywordError::fromJsonObject(QJsonObject json) {

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_error_messages_isValid = ::OpenAPI::fromJsonValue(error_messages, json[QString("error_messages")]);
    m_error_messages_isSet = !json[QString("error_messages")].isNull() && m_error_messages_isValid;
}

QString OAIKeywordError::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIKeywordError::asJsonObject() const {
    QJsonObject obj;
    if (data.isSet()) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (error_messages.size() > 0) {
        obj.insert(QString("error_messages"), ::OpenAPI::toJsonValue(error_messages));
    }
    return obj;
}

OAIKeyword OAIKeywordError::getData() const {
    return data;
}
void OAIKeywordError::setData(const OAIKeyword &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIKeywordError::is_data_Set() const{
    return m_data_isSet;
}

bool OAIKeywordError::is_data_Valid() const{
    return m_data_isValid;
}

QList<QString> OAIKeywordError::getErrorMessages() const {
    return error_messages;
}
void OAIKeywordError::setErrorMessages(const QList<QString> &error_messages) {
    this->error_messages = error_messages;
    this->m_error_messages_isSet = true;
}

bool OAIKeywordError::is_error_messages_Set() const{
    return m_error_messages_isSet;
}

bool OAIKeywordError::is_error_messages_Valid() const{
    return m_error_messages_isValid;
}

bool OAIKeywordError::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (data.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (error_messages.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIKeywordError::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
