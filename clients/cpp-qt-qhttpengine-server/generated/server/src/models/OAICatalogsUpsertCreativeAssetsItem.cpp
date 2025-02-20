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

#include "OAICatalogsUpsertCreativeAssetsItem.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsUpsertCreativeAssetsItem::OAICatalogsUpsertCreativeAssetsItem(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsUpsertCreativeAssetsItem::OAICatalogsUpsertCreativeAssetsItem() {
    this->initializeModel();
}

OAICatalogsUpsertCreativeAssetsItem::~OAICatalogsUpsertCreativeAssetsItem() {}

void OAICatalogsUpsertCreativeAssetsItem::initializeModel() {

    m_creative_assets_id_isSet = false;
    m_creative_assets_id_isValid = false;

    m_operation_isSet = false;
    m_operation_isValid = false;

    m_attributes_isSet = false;
    m_attributes_isValid = false;
}

void OAICatalogsUpsertCreativeAssetsItem::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsUpsertCreativeAssetsItem::fromJsonObject(QJsonObject json) {

    m_creative_assets_id_isValid = ::OpenAPI::fromJsonValue(creative_assets_id, json[QString("creative_assets_id")]);
    m_creative_assets_id_isSet = !json[QString("creative_assets_id")].isNull() && m_creative_assets_id_isValid;

    m_operation_isValid = ::OpenAPI::fromJsonValue(operation, json[QString("operation")]);
    m_operation_isSet = !json[QString("operation")].isNull() && m_operation_isValid;

    m_attributes_isValid = ::OpenAPI::fromJsonValue(attributes, json[QString("attributes")]);
    m_attributes_isSet = !json[QString("attributes")].isNull() && m_attributes_isValid;
}

QString OAICatalogsUpsertCreativeAssetsItem::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsUpsertCreativeAssetsItem::asJsonObject() const {
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

QString OAICatalogsUpsertCreativeAssetsItem::getCreativeAssetsId() const {
    return creative_assets_id;
}
void OAICatalogsUpsertCreativeAssetsItem::setCreativeAssetsId(const QString &creative_assets_id) {
    this->creative_assets_id = creative_assets_id;
    this->m_creative_assets_id_isSet = true;
}

bool OAICatalogsUpsertCreativeAssetsItem::is_creative_assets_id_Set() const{
    return m_creative_assets_id_isSet;
}

bool OAICatalogsUpsertCreativeAssetsItem::is_creative_assets_id_Valid() const{
    return m_creative_assets_id_isValid;
}

QString OAICatalogsUpsertCreativeAssetsItem::getOperation() const {
    return operation;
}
void OAICatalogsUpsertCreativeAssetsItem::setOperation(const QString &operation) {
    this->operation = operation;
    this->m_operation_isSet = true;
}

bool OAICatalogsUpsertCreativeAssetsItem::is_operation_Set() const{
    return m_operation_isSet;
}

bool OAICatalogsUpsertCreativeAssetsItem::is_operation_Valid() const{
    return m_operation_isValid;
}

OAICatalogsCreativeAssetsAttributes OAICatalogsUpsertCreativeAssetsItem::getAttributes() const {
    return attributes;
}
void OAICatalogsUpsertCreativeAssetsItem::setAttributes(const OAICatalogsCreativeAssetsAttributes &attributes) {
    this->attributes = attributes;
    this->m_attributes_isSet = true;
}

bool OAICatalogsUpsertCreativeAssetsItem::is_attributes_Set() const{
    return m_attributes_isSet;
}

bool OAICatalogsUpsertCreativeAssetsItem::is_attributes_Valid() const{
    return m_attributes_isValid;
}

bool OAICatalogsUpsertCreativeAssetsItem::isSet() const {
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

bool OAICatalogsUpsertCreativeAssetsItem::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_creative_assets_id_isValid && m_operation_isValid && m_attributes_isValid && true;
}

} // namespace OpenAPI
