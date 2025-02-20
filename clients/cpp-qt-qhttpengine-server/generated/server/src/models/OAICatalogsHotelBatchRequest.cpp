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

#include "OAICatalogsHotelBatchRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsHotelBatchRequest::OAICatalogsHotelBatchRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsHotelBatchRequest::OAICatalogsHotelBatchRequest() {
    this->initializeModel();
}

OAICatalogsHotelBatchRequest::~OAICatalogsHotelBatchRequest() {}

void OAICatalogsHotelBatchRequest::initializeModel() {

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
}

void OAICatalogsHotelBatchRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsHotelBatchRequest::fromJsonObject(QJsonObject json) {

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_country_isValid = ::OpenAPI::fromJsonValue(country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_language_isValid = ::OpenAPI::fromJsonValue(language, json[QString("language")]);
    m_language_isSet = !json[QString("language")].isNull() && m_language_isValid;

    m_items_isValid = ::OpenAPI::fromJsonValue(items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;

    m_catalog_id_isValid = ::OpenAPI::fromJsonValue(catalog_id, json[QString("catalog_id")]);
    m_catalog_id_isSet = !json[QString("catalog_id")].isNull() && m_catalog_id_isValid;
}

QString OAICatalogsHotelBatchRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsHotelBatchRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_catalog_type_isSet) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(catalog_type));
    }
    if (country.isSet()) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(country));
    }
    if (language.isSet()) {
        obj.insert(QString("language"), ::OpenAPI::toJsonValue(language));
    }
    if (items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(items));
    }
    if (m_catalog_id_isSet) {
        obj.insert(QString("catalog_id"), ::OpenAPI::toJsonValue(catalog_id));
    }
    return obj;
}

QString OAICatalogsHotelBatchRequest::getCatalogType() const {
    return catalog_type;
}
void OAICatalogsHotelBatchRequest::setCatalogType(const QString &catalog_type) {
    this->catalog_type = catalog_type;
    this->m_catalog_type_isSet = true;
}

bool OAICatalogsHotelBatchRequest::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalogsHotelBatchRequest::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

OAICountry OAICatalogsHotelBatchRequest::getCountry() const {
    return country;
}
void OAICatalogsHotelBatchRequest::setCountry(const OAICountry &country) {
    this->country = country;
    this->m_country_isSet = true;
}

bool OAICatalogsHotelBatchRequest::is_country_Set() const{
    return m_country_isSet;
}

bool OAICatalogsHotelBatchRequest::is_country_Valid() const{
    return m_country_isValid;
}

OAICatalogsItemsRequest_language OAICatalogsHotelBatchRequest::getLanguage() const {
    return language;
}
void OAICatalogsHotelBatchRequest::setLanguage(const OAICatalogsItemsRequest_language &language) {
    this->language = language;
    this->m_language_isSet = true;
}

bool OAICatalogsHotelBatchRequest::is_language_Set() const{
    return m_language_isSet;
}

bool OAICatalogsHotelBatchRequest::is_language_Valid() const{
    return m_language_isValid;
}

QList<OAICatalogsHotelBatchItem> OAICatalogsHotelBatchRequest::getItems() const {
    return items;
}
void OAICatalogsHotelBatchRequest::setItems(const QList<OAICatalogsHotelBatchItem> &items) {
    this->items = items;
    this->m_items_isSet = true;
}

bool OAICatalogsHotelBatchRequest::is_items_Set() const{
    return m_items_isSet;
}

bool OAICatalogsHotelBatchRequest::is_items_Valid() const{
    return m_items_isValid;
}

QString OAICatalogsHotelBatchRequest::getCatalogId() const {
    return catalog_id;
}
void OAICatalogsHotelBatchRequest::setCatalogId(const QString &catalog_id) {
    this->catalog_id = catalog_id;
    this->m_catalog_id_isSet = true;
}

bool OAICatalogsHotelBatchRequest::is_catalog_id_Set() const{
    return m_catalog_id_isSet;
}

bool OAICatalogsHotelBatchRequest::is_catalog_id_Valid() const{
    return m_catalog_id_isValid;
}

bool OAICatalogsHotelBatchRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_catalog_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (country.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (language.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (items.size() > 0) {
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

bool OAICatalogsHotelBatchRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_catalog_type_isValid && m_country_isValid && m_language_isValid && m_items_isValid && true;
}

} // namespace OpenAPI
