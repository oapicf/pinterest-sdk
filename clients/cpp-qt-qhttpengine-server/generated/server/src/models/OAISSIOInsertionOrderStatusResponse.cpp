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

#include "OAISSIOInsertionOrderStatusResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISSIOInsertionOrderStatusResponse::OAISSIOInsertionOrderStatusResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISSIOInsertionOrderStatusResponse::OAISSIOInsertionOrderStatusResponse() {
    this->initializeModel();
}

OAISSIOInsertionOrderStatusResponse::~OAISSIOInsertionOrderStatusResponse() {}

void OAISSIOInsertionOrderStatusResponse::initializeModel() {

    m_pin_order_id_isSet = false;
    m_pin_order_id_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_creation_time_isSet = false;
    m_creation_time_isValid = false;
}

void OAISSIOInsertionOrderStatusResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISSIOInsertionOrderStatusResponse::fromJsonObject(QJsonObject json) {

    m_pin_order_id_isValid = ::OpenAPI::fromJsonValue(pin_order_id, json[QString("pin_order_id")]);
    m_pin_order_id_isSet = !json[QString("pin_order_id")].isNull() && m_pin_order_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_creation_time_isValid = ::OpenAPI::fromJsonValue(creation_time, json[QString("creation_time")]);
    m_creation_time_isSet = !json[QString("creation_time")].isNull() && m_creation_time_isValid;
}

QString OAISSIOInsertionOrderStatusResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISSIOInsertionOrderStatusResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_pin_order_id_isSet) {
        obj.insert(QString("pin_order_id"), ::OpenAPI::toJsonValue(pin_order_id));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_creation_time_isSet) {
        obj.insert(QString("creation_time"), ::OpenAPI::toJsonValue(creation_time));
    }
    return obj;
}

QString OAISSIOInsertionOrderStatusResponse::getPinOrderId() const {
    return pin_order_id;
}
void OAISSIOInsertionOrderStatusResponse::setPinOrderId(const QString &pin_order_id) {
    this->pin_order_id = pin_order_id;
    this->m_pin_order_id_isSet = true;
}

bool OAISSIOInsertionOrderStatusResponse::is_pin_order_id_Set() const{
    return m_pin_order_id_isSet;
}

bool OAISSIOInsertionOrderStatusResponse::is_pin_order_id_Valid() const{
    return m_pin_order_id_isValid;
}

QString OAISSIOInsertionOrderStatusResponse::getStatus() const {
    return status;
}
void OAISSIOInsertionOrderStatusResponse::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAISSIOInsertionOrderStatusResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAISSIOInsertionOrderStatusResponse::is_status_Valid() const{
    return m_status_isValid;
}

QString OAISSIOInsertionOrderStatusResponse::getCreationTime() const {
    return creation_time;
}
void OAISSIOInsertionOrderStatusResponse::setCreationTime(const QString &creation_time) {
    this->creation_time = creation_time;
    this->m_creation_time_isSet = true;
}

bool OAISSIOInsertionOrderStatusResponse::is_creation_time_Set() const{
    return m_creation_time_isSet;
}

bool OAISSIOInsertionOrderStatusResponse::is_creation_time_Valid() const{
    return m_creation_time_isValid;
}

bool OAISSIOInsertionOrderStatusResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_pin_order_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_creation_time_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISSIOInsertionOrderStatusResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
