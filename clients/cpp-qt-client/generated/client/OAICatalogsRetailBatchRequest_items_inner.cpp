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

#include "OAICatalogsRetailBatchRequest_items_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsRetailBatchRequest_items_inner::OAICatalogsRetailBatchRequest_items_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsRetailBatchRequest_items_inner::OAICatalogsRetailBatchRequest_items_inner() {
    this->initializeModel();
}

OAICatalogsRetailBatchRequest_items_inner::~OAICatalogsRetailBatchRequest_items_inner() {}

void OAICatalogsRetailBatchRequest_items_inner::initializeModel() {

    m_item_id_isSet = false;
    m_item_id_isValid = false;

    m_operation_isSet = false;
    m_operation_isValid = false;

    m_attributes_isSet = false;
    m_attributes_isValid = false;

    m_update_mask_isSet = false;
    m_update_mask_isValid = false;
}

void OAICatalogsRetailBatchRequest_items_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsRetailBatchRequest_items_inner::fromJsonObject(QJsonObject json) {

    m_item_id_isValid = ::OpenAPI::fromJsonValue(m_item_id, json[QString("item_id")]);
    m_item_id_isSet = !json[QString("item_id")].isNull() && m_item_id_isValid;

    m_operation_isValid = ::OpenAPI::fromJsonValue(m_operation, json[QString("operation")]);
    m_operation_isSet = !json[QString("operation")].isNull() && m_operation_isValid;

    m_attributes_isValid = ::OpenAPI::fromJsonValue(m_attributes, json[QString("attributes")]);
    m_attributes_isSet = !json[QString("attributes")].isNull() && m_attributes_isValid;

    m_update_mask_isValid = ::OpenAPI::fromJsonValue(m_update_mask, json[QString("update_mask")]);
    m_update_mask_isSet = !json[QString("update_mask")].isNull() && m_update_mask_isValid;
}

QString OAICatalogsRetailBatchRequest_items_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsRetailBatchRequest_items_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_item_id_isSet) {
        obj.insert(QString("item_id"), ::OpenAPI::toJsonValue(m_item_id));
    }
    if (m_operation_isSet) {
        obj.insert(QString("operation"), ::OpenAPI::toJsonValue(m_operation));
    }
    if (m_attributes.isSet()) {
        obj.insert(QString("attributes"), ::OpenAPI::toJsonValue(m_attributes));
    }
    if (m_update_mask.size() > 0) {
        obj.insert(QString("update_mask"), ::OpenAPI::toJsonValue(m_update_mask));
    }
    return obj;
}

QString OAICatalogsRetailBatchRequest_items_inner::getItemId() const {
    return m_item_id;
}
void OAICatalogsRetailBatchRequest_items_inner::setItemId(const QString &item_id) {
    m_item_id = item_id;
    m_item_id_isSet = true;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_item_id_Set() const{
    return m_item_id_isSet;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_item_id_Valid() const{
    return m_item_id_isValid;
}

QString OAICatalogsRetailBatchRequest_items_inner::getOperation() const {
    return m_operation;
}
void OAICatalogsRetailBatchRequest_items_inner::setOperation(const QString &operation) {
    m_operation = operation;
    m_operation_isSet = true;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_operation_Set() const{
    return m_operation_isSet;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_operation_Valid() const{
    return m_operation_isValid;
}

OAIItemAttributesRequest OAICatalogsRetailBatchRequest_items_inner::getAttributes() const {
    return m_attributes;
}
void OAICatalogsRetailBatchRequest_items_inner::setAttributes(const OAIItemAttributesRequest &attributes) {
    m_attributes = attributes;
    m_attributes_isSet = true;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_attributes_Set() const{
    return m_attributes_isSet;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_attributes_Valid() const{
    return m_attributes_isValid;
}

QList<OAIUpdateMaskFieldType> OAICatalogsRetailBatchRequest_items_inner::getUpdateMask() const {
    return m_update_mask;
}
void OAICatalogsRetailBatchRequest_items_inner::setUpdateMask(const QList<OAIUpdateMaskFieldType> &update_mask) {
    m_update_mask = update_mask;
    m_update_mask_isSet = true;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_update_mask_Set() const{
    return m_update_mask_isSet;
}

bool OAICatalogsRetailBatchRequest_items_inner::is_update_mask_Valid() const{
    return m_update_mask_isValid;
}

bool OAICatalogsRetailBatchRequest_items_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_item_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_operation_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_attributes.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_update_mask.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsRetailBatchRequest_items_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_item_id_isValid && m_operation_isValid && m_attributes_isValid && true;
}

} // namespace OpenAPI
