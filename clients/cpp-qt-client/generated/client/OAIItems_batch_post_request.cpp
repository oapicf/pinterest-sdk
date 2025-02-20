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

#include "OAIItems_batch_post_request.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIItems_batch_post_request::OAIItems_batch_post_request(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIItems_batch_post_request::OAIItems_batch_post_request() {
    this->initializeModel();
}

OAIItems_batch_post_request::~OAIItems_batch_post_request() {}

void OAIItems_batch_post_request::initializeModel() {

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;

    m_country_isSet = false;
    m_country_isValid = false;

    m_language_isSet = false;
    m_language_isValid = false;

    m_items_isSet = false;
    m_items_isValid = false;

    m_catalog_id_isSet = false;
    m_catalog_id_isValid = false;

    m_operation_isSet = false;
    m_operation_isValid = false;
}

void OAIItems_batch_post_request::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIItems_batch_post_request::fromJsonObject(QJsonObject json) {

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(m_catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_country_isValid = ::OpenAPI::fromJsonValue(m_country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_language_isValid = ::OpenAPI::fromJsonValue(m_language, json[QString("language")]);
    m_language_isSet = !json[QString("language")].isNull() && m_language_isValid;

    m_items_isValid = ::OpenAPI::fromJsonValue(m_items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;

    m_catalog_id_isValid = ::OpenAPI::fromJsonValue(m_catalog_id, json[QString("catalog_id")]);
    m_catalog_id_isSet = !json[QString("catalog_id")].isNull() && m_catalog_id_isValid;

    m_operation_isValid = ::OpenAPI::fromJsonValue(m_operation, json[QString("operation")]);
    m_operation_isSet = !json[QString("operation")].isNull() && m_operation_isValid;
}

QString OAIItems_batch_post_request::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIItems_batch_post_request::asJsonObject() const {
    QJsonObject obj;
    if (m_catalog_type_isSet) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(m_catalog_type));
    }
    if (m_country.isSet()) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(m_country));
    }
    if (m_language.isSet()) {
        obj.insert(QString("language"), ::OpenAPI::toJsonValue(m_language));
    }
    if (m_items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(m_items));
    }
    if (m_catalog_id_isSet) {
        obj.insert(QString("catalog_id"), ::OpenAPI::toJsonValue(m_catalog_id));
    }
    if (m_operation.isSet()) {
        obj.insert(QString("operation"), ::OpenAPI::toJsonValue(m_operation));
    }
    return obj;
}

QString OAIItems_batch_post_request::getCatalogType() const {
    return m_catalog_type;
}
void OAIItems_batch_post_request::setCatalogType(const QString &catalog_type) {
    m_catalog_type = catalog_type;
    m_catalog_type_isSet = true;
}

bool OAIItems_batch_post_request::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAIItems_batch_post_request::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

OAICountry OAIItems_batch_post_request::getCountry() const {
    return m_country;
}
void OAIItems_batch_post_request::setCountry(const OAICountry &country) {
    m_country = country;
    m_country_isSet = true;
}

bool OAIItems_batch_post_request::is_country_Set() const{
    return m_country_isSet;
}

bool OAIItems_batch_post_request::is_country_Valid() const{
    return m_country_isValid;
}

OAICatalogsItemsRequest_language OAIItems_batch_post_request::getLanguage() const {
    return m_language;
}
void OAIItems_batch_post_request::setLanguage(const OAICatalogsItemsRequest_language &language) {
    m_language = language;
    m_language_isSet = true;
}

bool OAIItems_batch_post_request::is_language_Set() const{
    return m_language_isSet;
}

bool OAIItems_batch_post_request::is_language_Valid() const{
    return m_language_isValid;
}

QList<OAIItemDeleteBatchRecord> OAIItems_batch_post_request::getItems() const {
    return m_items;
}
void OAIItems_batch_post_request::setItems(const QList<OAIItemDeleteBatchRecord> &items) {
    m_items = items;
    m_items_isSet = true;
}

bool OAIItems_batch_post_request::is_items_Set() const{
    return m_items_isSet;
}

bool OAIItems_batch_post_request::is_items_Valid() const{
    return m_items_isValid;
}

QString OAIItems_batch_post_request::getCatalogId() const {
    return m_catalog_id;
}
void OAIItems_batch_post_request::setCatalogId(const QString &catalog_id) {
    m_catalog_id = catalog_id;
    m_catalog_id_isSet = true;
}

bool OAIItems_batch_post_request::is_catalog_id_Set() const{
    return m_catalog_id_isSet;
}

bool OAIItems_batch_post_request::is_catalog_id_Valid() const{
    return m_catalog_id_isValid;
}

OAIBatchOperation OAIItems_batch_post_request::getOperation() const {
    return m_operation;
}
void OAIItems_batch_post_request::setOperation(const OAIBatchOperation &operation) {
    m_operation = operation;
    m_operation_isSet = true;
}

bool OAIItems_batch_post_request::is_operation_Set() const{
    return m_operation_isSet;
}

bool OAIItems_batch_post_request::is_operation_Valid() const{
    return m_operation_isValid;
}

bool OAIItems_batch_post_request::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_catalog_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_country.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_language.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_items.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_catalog_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_operation.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIItems_batch_post_request::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_catalog_type_isValid && m_country_isValid && m_language_isValid && m_items_isValid && m_operation_isValid && true;
}

} // namespace OpenAPI
