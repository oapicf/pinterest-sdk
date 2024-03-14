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

#include "OAIItemResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIItemResponse::OAIItemResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIItemResponse::OAIItemResponse() {
    this->initializeModel();
}

OAIItemResponse::~OAIItemResponse() {}

void OAIItemResponse::initializeModel() {

    m_item_id_isSet = false;
    m_item_id_isValid = false;

    m_attributes_isSet = false;
    m_attributes_isValid = false;

    m_errors_isSet = false;
    m_errors_isValid = false;
}

void OAIItemResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIItemResponse::fromJsonObject(QJsonObject json) {

    m_item_id_isValid = ::OpenAPI::fromJsonValue(m_item_id, json[QString("item_id")]);
    m_item_id_isSet = !json[QString("item_id")].isNull() && m_item_id_isValid;

    m_attributes_isValid = ::OpenAPI::fromJsonValue(m_attributes, json[QString("attributes")]);
    m_attributes_isSet = !json[QString("attributes")].isNull() && m_attributes_isValid;

    m_errors_isValid = ::OpenAPI::fromJsonValue(m_errors, json[QString("errors")]);
    m_errors_isSet = !json[QString("errors")].isNull() && m_errors_isValid;
}

QString OAIItemResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIItemResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_item_id_isSet) {
        obj.insert(QString("item_id"), ::OpenAPI::toJsonValue(m_item_id));
    }
    if (m_attributes.isSet()) {
        obj.insert(QString("attributes"), ::OpenAPI::toJsonValue(m_attributes));
    }
    if (m_errors.size() > 0) {
        obj.insert(QString("errors"), ::OpenAPI::toJsonValue(m_errors));
    }
    return obj;
}

QString OAIItemResponse::getItemId() const {
    return m_item_id;
}
void OAIItemResponse::setItemId(const QString &item_id) {
    m_item_id = item_id;
    m_item_id_isSet = true;
}

bool OAIItemResponse::is_item_id_Set() const{
    return m_item_id_isSet;
}

bool OAIItemResponse::is_item_id_Valid() const{
    return m_item_id_isValid;
}

OAIItemAttributes OAIItemResponse::getAttributes() const {
    return m_attributes;
}
void OAIItemResponse::setAttributes(const OAIItemAttributes &attributes) {
    m_attributes = attributes;
    m_attributes_isSet = true;
}

bool OAIItemResponse::is_attributes_Set() const{
    return m_attributes_isSet;
}

bool OAIItemResponse::is_attributes_Valid() const{
    return m_attributes_isValid;
}

QList<OAIItemValidationEvent> OAIItemResponse::getErrors() const {
    return m_errors;
}
void OAIItemResponse::setErrors(const QList<OAIItemValidationEvent> &errors) {
    m_errors = errors;
    m_errors_isSet = true;
}

bool OAIItemResponse::is_errors_Set() const{
    return m_errors_isSet;
}

bool OAIItemResponse::is_errors_Valid() const{
    return m_errors_isValid;
}

bool OAIItemResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_item_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_attributes.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_errors.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIItemResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI