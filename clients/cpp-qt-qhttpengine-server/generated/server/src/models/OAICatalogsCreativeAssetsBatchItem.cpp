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

#include "OAICatalogsCreativeAssetsBatchItem.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsCreativeAssetsBatchItem::OAICatalogsCreativeAssetsBatchItem(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsCreativeAssetsBatchItem::OAICatalogsCreativeAssetsBatchItem() {
    this->initializeModel();
}

OAICatalogsCreativeAssetsBatchItem::~OAICatalogsCreativeAssetsBatchItem() {}

void OAICatalogsCreativeAssetsBatchItem::initializeModel() {

    m_creative_assets_id_isSet = false;
    m_creative_assets_id_isValid = false;

    m_operation_isSet = false;
    m_operation_isValid = false;

    m_attributes_isSet = false;
    m_attributes_isValid = false;
}

void OAICatalogsCreativeAssetsBatchItem::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsCreativeAssetsBatchItem::fromJsonObject(QJsonObject json) {

    m_creative_assets_id_isValid = ::OpenAPI::fromJsonValue(creative_assets_id, json[QString("creative_assets_id")]);
    m_creative_assets_id_isSet = !json[QString("creative_assets_id")].isNull() && m_creative_assets_id_isValid;

    m_operation_isValid = ::OpenAPI::fromJsonValue(operation, json[QString("operation")]);
    m_operation_isSet = !json[QString("operation")].isNull() && m_operation_isValid;

    m_attributes_isValid = ::OpenAPI::fromJsonValue(attributes, json[QString("attributes")]);
    m_attributes_isSet = !json[QString("attributes")].isNull() && m_attributes_isValid;
}

QString OAICatalogsCreativeAssetsBatchItem::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsCreativeAssetsBatchItem::asJsonObject() const {
    QJsonObject obj;
    if (m_creative_assets_id_isSet) {
        obj.insert(QString("creative_assets_id"), ::OpenAPI::toJsonValue(creative_assets_id));
    }
    if (m_operation_isSet) {
        obj.insert(QString("operation"), ::OpenAPI::toJsonValue(operation));
    }
    if (attributes.isSet()) {
        obj.insert(QString("attributes"), ::OpenAPI::toJsonValue(attributes));
    }
    return obj;
}

QString OAICatalogsCreativeAssetsBatchItem::getCreativeAssetsId() const {
    return creative_assets_id;
}
void OAICatalogsCreativeAssetsBatchItem::setCreativeAssetsId(const QString &creative_assets_id) {
    this->creative_assets_id = creative_assets_id;
    this->m_creative_assets_id_isSet = true;
}

bool OAICatalogsCreativeAssetsBatchItem::is_creative_assets_id_Set() const{
    return m_creative_assets_id_isSet;
}

bool OAICatalogsCreativeAssetsBatchItem::is_creative_assets_id_Valid() const{
    return m_creative_assets_id_isValid;
}

QString OAICatalogsCreativeAssetsBatchItem::getOperation() const {
    return operation;
}
void OAICatalogsCreativeAssetsBatchItem::setOperation(const QString &operation) {
    this->operation = operation;
    this->m_operation_isSet = true;
}

bool OAICatalogsCreativeAssetsBatchItem::is_operation_Set() const{
    return m_operation_isSet;
}

bool OAICatalogsCreativeAssetsBatchItem::is_operation_Valid() const{
    return m_operation_isValid;
}

OAICatalogsUpdatableCreativeAssetsAttributes OAICatalogsCreativeAssetsBatchItem::getAttributes() const {
    return attributes;
}
void OAICatalogsCreativeAssetsBatchItem::setAttributes(const OAICatalogsUpdatableCreativeAssetsAttributes &attributes) {
    this->attributes = attributes;
    this->m_attributes_isSet = true;
}

bool OAICatalogsCreativeAssetsBatchItem::is_attributes_Set() const{
    return m_attributes_isSet;
}

bool OAICatalogsCreativeAssetsBatchItem::is_attributes_Valid() const{
    return m_attributes_isValid;
}

bool OAICatalogsCreativeAssetsBatchItem::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_creative_assets_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_operation_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (attributes.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsCreativeAssetsBatchItem::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_creative_assets_id_isValid && m_operation_isValid && m_attributes_isValid && true;
}

} // namespace OpenAPI
