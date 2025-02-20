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

#include "OAICatalog.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalog::OAICatalog(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalog::OAICatalog() {
    this->initializeModel();
}

OAICatalog::~OAICatalog() {}

void OAICatalog::initializeModel() {

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_updated_at_isSet = false;
    m_updated_at_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;
}

void OAICatalog::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalog::fromJsonObject(QJsonObject json) {

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_updated_at_isValid = ::OpenAPI::fromJsonValue(updated_at, json[QString("updated_at")]);
    m_updated_at_isSet = !json[QString("updated_at")].isNull() && m_updated_at_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;
}

QString OAICatalog::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalog::asJsonObject() const {
    QJsonObject obj;
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(created_at));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_updated_at_isSet) {
        obj.insert(QString("updated_at"), ::OpenAPI::toJsonValue(updated_at));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (catalog_type.isSet()) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(catalog_type));
    }
    return obj;
}

QDateTime OAICatalog::getCreatedAt() const {
    return created_at;
}
void OAICatalog::setCreatedAt(const QDateTime &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAICatalog::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAICatalog::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAICatalog::getId() const {
    return id;
}
void OAICatalog::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAICatalog::is_id_Set() const{
    return m_id_isSet;
}

bool OAICatalog::is_id_Valid() const{
    return m_id_isValid;
}

QDateTime OAICatalog::getUpdatedAt() const {
    return updated_at;
}
void OAICatalog::setUpdatedAt(const QDateTime &updated_at) {
    this->updated_at = updated_at;
    this->m_updated_at_isSet = true;
}

bool OAICatalog::is_updated_at_Set() const{
    return m_updated_at_isSet;
}

bool OAICatalog::is_updated_at_Valid() const{
    return m_updated_at_isValid;
}

QString OAICatalog::getName() const {
    return name;
}
void OAICatalog::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAICatalog::is_name_Set() const{
    return m_name_isSet;
}

bool OAICatalog::is_name_Valid() const{
    return m_name_isValid;
}

OAICatalogsType OAICatalog::getCatalogType() const {
    return catalog_type;
}
void OAICatalog::setCatalogType(const OAICatalogsType &catalog_type) {
    this->catalog_type = catalog_type;
    this->m_catalog_type_isSet = true;
}

bool OAICatalog::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalog::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

bool OAICatalog::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_updated_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (catalog_type.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalog::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_created_at_isValid && m_id_isValid && m_updated_at_isValid && m_name_isValid && m_catalog_type_isValid && true;
}

} // namespace OpenAPI
