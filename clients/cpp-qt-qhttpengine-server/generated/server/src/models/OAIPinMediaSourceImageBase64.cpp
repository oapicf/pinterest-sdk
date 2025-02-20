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

#include "OAIPinMediaSourceImageBase64.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPinMediaSourceImageBase64::OAIPinMediaSourceImageBase64(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPinMediaSourceImageBase64::OAIPinMediaSourceImageBase64() {
    this->initializeModel();
}

OAIPinMediaSourceImageBase64::~OAIPinMediaSourceImageBase64() {}

void OAIPinMediaSourceImageBase64::initializeModel() {

    m_source_type_isSet = false;
    m_source_type_isValid = false;

    m_content_type_isSet = false;
    m_content_type_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;

    m_is_standard_isSet = false;
    m_is_standard_isValid = false;
}

void OAIPinMediaSourceImageBase64::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPinMediaSourceImageBase64::fromJsonObject(QJsonObject json) {

    m_source_type_isValid = ::OpenAPI::fromJsonValue(source_type, json[QString("source_type")]);
    m_source_type_isSet = !json[QString("source_type")].isNull() && m_source_type_isValid;

    m_content_type_isValid = ::OpenAPI::fromJsonValue(content_type, json[QString("content_type")]);
    m_content_type_isSet = !json[QString("content_type")].isNull() && m_content_type_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_is_standard_isValid = ::OpenAPI::fromJsonValue(is_standard, json[QString("is_standard")]);
    m_is_standard_isSet = !json[QString("is_standard")].isNull() && m_is_standard_isValid;
}

QString OAIPinMediaSourceImageBase64::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPinMediaSourceImageBase64::asJsonObject() const {
    QJsonObject obj;
    if (m_source_type_isSet) {
        obj.insert(QString("source_type"), ::OpenAPI::toJsonValue(source_type));
    }
    if (m_content_type_isSet) {
        obj.insert(QString("content_type"), ::OpenAPI::toJsonValue(content_type));
    }
    if (m_data_isSet) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (m_is_standard_isSet) {
        obj.insert(QString("is_standard"), ::OpenAPI::toJsonValue(is_standard));
    }
    return obj;
}

QString OAIPinMediaSourceImageBase64::getSourceType() const {
    return source_type;
}
void OAIPinMediaSourceImageBase64::setSourceType(const QString &source_type) {
    this->source_type = source_type;
    this->m_source_type_isSet = true;
}

bool OAIPinMediaSourceImageBase64::is_source_type_Set() const{
    return m_source_type_isSet;
}

bool OAIPinMediaSourceImageBase64::is_source_type_Valid() const{
    return m_source_type_isValid;
}

QString OAIPinMediaSourceImageBase64::getContentType() const {
    return content_type;
}
void OAIPinMediaSourceImageBase64::setContentType(const QString &content_type) {
    this->content_type = content_type;
    this->m_content_type_isSet = true;
}

bool OAIPinMediaSourceImageBase64::is_content_type_Set() const{
    return m_content_type_isSet;
}

bool OAIPinMediaSourceImageBase64::is_content_type_Valid() const{
    return m_content_type_isValid;
}

QString OAIPinMediaSourceImageBase64::getData() const {
    return data;
}
void OAIPinMediaSourceImageBase64::setData(const QString &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIPinMediaSourceImageBase64::is_data_Set() const{
    return m_data_isSet;
}

bool OAIPinMediaSourceImageBase64::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIPinMediaSourceImageBase64::isIsStandard() const {
    return is_standard;
}
void OAIPinMediaSourceImageBase64::setIsStandard(const bool &is_standard) {
    this->is_standard = is_standard;
    this->m_is_standard_isSet = true;
}

bool OAIPinMediaSourceImageBase64::is_is_standard_Set() const{
    return m_is_standard_isSet;
}

bool OAIPinMediaSourceImageBase64::is_is_standard_Valid() const{
    return m_is_standard_isValid;
}

bool OAIPinMediaSourceImageBase64::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_source_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_content_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_data_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_standard_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPinMediaSourceImageBase64::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_source_type_isValid && m_content_type_isValid && m_data_isValid && true;
}

} // namespace OpenAPI
