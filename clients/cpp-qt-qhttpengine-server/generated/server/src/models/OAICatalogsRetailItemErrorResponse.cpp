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

#include "OAICatalogsRetailItemErrorResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsRetailItemErrorResponse::OAICatalogsRetailItemErrorResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsRetailItemErrorResponse::OAICatalogsRetailItemErrorResponse() {
    this->initializeModel();
}

OAICatalogsRetailItemErrorResponse::~OAICatalogsRetailItemErrorResponse() {}

void OAICatalogsRetailItemErrorResponse::initializeModel() {

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;

    m_item_id_isSet = false;
    m_item_id_isValid = false;

    m_errors_isSet = false;
    m_errors_isValid = false;
}

void OAICatalogsRetailItemErrorResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsRetailItemErrorResponse::fromJsonObject(QJsonObject json) {

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_item_id_isValid = ::OpenAPI::fromJsonValue(item_id, json[QString("item_id")]);
    m_item_id_isSet = !json[QString("item_id")].isNull() && m_item_id_isValid;

    m_errors_isValid = ::OpenAPI::fromJsonValue(errors, json[QString("errors")]);
    m_errors_isSet = !json[QString("errors")].isNull() && m_errors_isValid;
}

QString OAICatalogsRetailItemErrorResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsRetailItemErrorResponse::asJsonObject() const {
    QJsonObject obj;
    if (catalog_type.isSet()) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(catalog_type));
    }
    if (m_item_id_isSet) {
        obj.insert(QString("item_id"), ::OpenAPI::toJsonValue(item_id));
    }
    if (errors.size() > 0) {
        obj.insert(QString("errors"), ::OpenAPI::toJsonValue(errors));
    }
    return obj;
}

OAICatalogsType OAICatalogsRetailItemErrorResponse::getCatalogType() const {
    return catalog_type;
}
void OAICatalogsRetailItemErrorResponse::setCatalogType(const OAICatalogsType &catalog_type) {
    this->catalog_type = catalog_type;
    this->m_catalog_type_isSet = true;
}

bool OAICatalogsRetailItemErrorResponse::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalogsRetailItemErrorResponse::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

QString OAICatalogsRetailItemErrorResponse::getItemId() const {
    return item_id;
}
void OAICatalogsRetailItemErrorResponse::setItemId(const QString &item_id) {
    this->item_id = item_id;
    this->m_item_id_isSet = true;
}

bool OAICatalogsRetailItemErrorResponse::is_item_id_Set() const{
    return m_item_id_isSet;
}

bool OAICatalogsRetailItemErrorResponse::is_item_id_Valid() const{
    return m_item_id_isValid;
}

QList<OAIItemValidationEvent> OAICatalogsRetailItemErrorResponse::getErrors() const {
    return errors;
}
void OAICatalogsRetailItemErrorResponse::setErrors(const QList<OAIItemValidationEvent> &errors) {
    this->errors = errors;
    this->m_errors_isSet = true;
}

bool OAICatalogsRetailItemErrorResponse::is_errors_Set() const{
    return m_errors_isSet;
}

bool OAICatalogsRetailItemErrorResponse::is_errors_Valid() const{
    return m_errors_isValid;
}

bool OAICatalogsRetailItemErrorResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (catalog_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_item_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (errors.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsRetailItemErrorResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_catalog_type_isValid && true;
}

} // namespace OpenAPI
