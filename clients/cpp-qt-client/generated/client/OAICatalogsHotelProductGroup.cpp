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

#include "OAICatalogsHotelProductGroup.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsHotelProductGroup::OAICatalogsHotelProductGroup(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsHotelProductGroup::OAICatalogsHotelProductGroup() {
    this->initializeModel();
}

OAICatalogsHotelProductGroup::~OAICatalogsHotelProductGroup() {}

void OAICatalogsHotelProductGroup::initializeModel() {

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_filters_isSet = false;
    m_filters_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_updated_at_isSet = false;
    m_updated_at_isValid = false;

    m_catalog_id_isSet = false;
    m_catalog_id_isValid = false;
}

void OAICatalogsHotelProductGroup::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsHotelProductGroup::fromJsonObject(QJsonObject json) {

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(m_catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_filters_isValid = ::OpenAPI::fromJsonValue(m_filters, json[QString("filters")]);
    m_filters_isSet = !json[QString("filters")].isNull() && m_filters_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(m_created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_updated_at_isValid = ::OpenAPI::fromJsonValue(m_updated_at, json[QString("updated_at")]);
    m_updated_at_isSet = !json[QString("updated_at")].isNull() && m_updated_at_isValid;

    m_catalog_id_isValid = ::OpenAPI::fromJsonValue(m_catalog_id, json[QString("catalog_id")]);
    m_catalog_id_isSet = !json[QString("catalog_id")].isNull() && m_catalog_id_isValid;
}

QString OAICatalogsHotelProductGroup::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsHotelProductGroup::asJsonObject() const {
    QJsonObject obj;
    if (m_catalog_type_isSet) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(m_catalog_type));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    if (m_filters.isSet()) {
        obj.insert(QString("filters"), ::OpenAPI::toJsonValue(m_filters));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(m_created_at));
    }
    if (m_updated_at_isSet) {
        obj.insert(QString("updated_at"), ::OpenAPI::toJsonValue(m_updated_at));
    }
    if (m_catalog_id_isSet) {
        obj.insert(QString("catalog_id"), ::OpenAPI::toJsonValue(m_catalog_id));
    }
    return obj;
}

QString OAICatalogsHotelProductGroup::getCatalogType() const {
    return m_catalog_type;
}
void OAICatalogsHotelProductGroup::setCatalogType(const QString &catalog_type) {
    m_catalog_type = catalog_type;
    m_catalog_type_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalogsHotelProductGroup::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

QString OAICatalogsHotelProductGroup::getId() const {
    return m_id;
}
void OAICatalogsHotelProductGroup::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_id_Set() const{
    return m_id_isSet;
}

bool OAICatalogsHotelProductGroup::is_id_Valid() const{
    return m_id_isValid;
}

QString OAICatalogsHotelProductGroup::getName() const {
    return m_name;
}
void OAICatalogsHotelProductGroup::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_name_Set() const{
    return m_name_isSet;
}

bool OAICatalogsHotelProductGroup::is_name_Valid() const{
    return m_name_isValid;
}

QString OAICatalogsHotelProductGroup::getDescription() const {
    return m_description;
}
void OAICatalogsHotelProductGroup::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_description_Set() const{
    return m_description_isSet;
}

bool OAICatalogsHotelProductGroup::is_description_Valid() const{
    return m_description_isValid;
}

OAICatalogsHotelProductGroupFilters OAICatalogsHotelProductGroup::getFilters() const {
    return m_filters;
}
void OAICatalogsHotelProductGroup::setFilters(const OAICatalogsHotelProductGroupFilters &filters) {
    m_filters = filters;
    m_filters_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_filters_Set() const{
    return m_filters_isSet;
}

bool OAICatalogsHotelProductGroup::is_filters_Valid() const{
    return m_filters_isValid;
}

qint32 OAICatalogsHotelProductGroup::getCreatedAt() const {
    return m_created_at;
}
void OAICatalogsHotelProductGroup::setCreatedAt(const qint32 &created_at) {
    m_created_at = created_at;
    m_created_at_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAICatalogsHotelProductGroup::is_created_at_Valid() const{
    return m_created_at_isValid;
}

qint32 OAICatalogsHotelProductGroup::getUpdatedAt() const {
    return m_updated_at;
}
void OAICatalogsHotelProductGroup::setUpdatedAt(const qint32 &updated_at) {
    m_updated_at = updated_at;
    m_updated_at_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_updated_at_Set() const{
    return m_updated_at_isSet;
}

bool OAICatalogsHotelProductGroup::is_updated_at_Valid() const{
    return m_updated_at_isValid;
}

QString OAICatalogsHotelProductGroup::getCatalogId() const {
    return m_catalog_id;
}
void OAICatalogsHotelProductGroup::setCatalogId(const QString &catalog_id) {
    m_catalog_id = catalog_id;
    m_catalog_id_isSet = true;
}

bool OAICatalogsHotelProductGroup::is_catalog_id_Set() const{
    return m_catalog_id_isSet;
}

bool OAICatalogsHotelProductGroup::is_catalog_id_Valid() const{
    return m_catalog_id_isValid;
}

bool OAICatalogsHotelProductGroup::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_catalog_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_filters.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_updated_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_catalog_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsHotelProductGroup::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_catalog_type_isValid && m_id_isValid && m_filters_isValid && m_catalog_id_isValid && true;
}

} // namespace OpenAPI
