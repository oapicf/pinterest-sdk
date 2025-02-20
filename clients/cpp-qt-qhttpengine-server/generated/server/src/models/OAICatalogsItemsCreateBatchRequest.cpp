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

#include "OAICatalogsItemsCreateBatchRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsItemsCreateBatchRequest::OAICatalogsItemsCreateBatchRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsItemsCreateBatchRequest::OAICatalogsItemsCreateBatchRequest() {
    this->initializeModel();
}

OAICatalogsItemsCreateBatchRequest::~OAICatalogsItemsCreateBatchRequest() {}

void OAICatalogsItemsCreateBatchRequest::initializeModel() {

    m_country_isSet = false;
    m_country_isValid = false;

    m_language_isSet = false;
    m_language_isValid = false;

    m_operation_isSet = false;
    m_operation_isValid = false;

    m_items_isSet = false;
    m_items_isValid = false;
}

void OAICatalogsItemsCreateBatchRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsItemsCreateBatchRequest::fromJsonObject(QJsonObject json) {

    m_country_isValid = ::OpenAPI::fromJsonValue(country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_language_isValid = ::OpenAPI::fromJsonValue(language, json[QString("language")]);
    m_language_isSet = !json[QString("language")].isNull() && m_language_isValid;

    m_operation_isValid = ::OpenAPI::fromJsonValue(operation, json[QString("operation")]);
    m_operation_isSet = !json[QString("operation")].isNull() && m_operation_isValid;

    m_items_isValid = ::OpenAPI::fromJsonValue(items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;
}

QString OAICatalogsItemsCreateBatchRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsItemsCreateBatchRequest::asJsonObject() const {
    QJsonObject obj;
    if (country.isSet()) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(country));
    }
    if (language.isSet()) {
        obj.insert(QString("language"), ::OpenAPI::toJsonValue(language));
    }
    if (operation.isSet()) {
        obj.insert(QString("operation"), ::OpenAPI::toJsonValue(operation));
    }
    if (items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(items));
    }
    return obj;
}

OAICountry OAICatalogsItemsCreateBatchRequest::getCountry() const {
    return country;
}
void OAICatalogsItemsCreateBatchRequest::setCountry(const OAICountry &country) {
    this->country = country;
    this->m_country_isSet = true;
}

bool OAICatalogsItemsCreateBatchRequest::is_country_Set() const{
    return m_country_isSet;
}

bool OAICatalogsItemsCreateBatchRequest::is_country_Valid() const{
    return m_country_isValid;
}

OAICatalogsItemsRequest_language OAICatalogsItemsCreateBatchRequest::getLanguage() const {
    return language;
}
void OAICatalogsItemsCreateBatchRequest::setLanguage(const OAICatalogsItemsRequest_language &language) {
    this->language = language;
    this->m_language_isSet = true;
}

bool OAICatalogsItemsCreateBatchRequest::is_language_Set() const{
    return m_language_isSet;
}

bool OAICatalogsItemsCreateBatchRequest::is_language_Valid() const{
    return m_language_isValid;
}

OAIBatchOperation OAICatalogsItemsCreateBatchRequest::getOperation() const {
    return operation;
}
void OAICatalogsItemsCreateBatchRequest::setOperation(const OAIBatchOperation &operation) {
    this->operation = operation;
    this->m_operation_isSet = true;
}

bool OAICatalogsItemsCreateBatchRequest::is_operation_Set() const{
    return m_operation_isSet;
}

bool OAICatalogsItemsCreateBatchRequest::is_operation_Valid() const{
    return m_operation_isValid;
}

QList<OAIItemCreateBatchRecord> OAICatalogsItemsCreateBatchRequest::getItems() const {
    return items;
}
void OAICatalogsItemsCreateBatchRequest::setItems(const QList<OAIItemCreateBatchRecord> &items) {
    this->items = items;
    this->m_items_isSet = true;
}

bool OAICatalogsItemsCreateBatchRequest::is_items_Set() const{
    return m_items_isSet;
}

bool OAICatalogsItemsCreateBatchRequest::is_items_Valid() const{
    return m_items_isValid;
}

bool OAICatalogsItemsCreateBatchRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (country.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (language.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (operation.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (items.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsItemsCreateBatchRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_country_isValid && m_language_isValid && m_operation_isValid && m_items_isValid && true;
}

} // namespace OpenAPI
