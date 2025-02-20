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

#include "OAICatalogsItemsRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsItemsRequest::OAICatalogsItemsRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsItemsRequest::OAICatalogsItemsRequest() {
    this->initializeModel();
}

OAICatalogsItemsRequest::~OAICatalogsItemsRequest() {}

void OAICatalogsItemsRequest::initializeModel() {

    m_country_isSet = false;
    m_country_isValid = false;

    m_language_isSet = false;
    m_language_isValid = false;

    m_filters_isSet = false;
    m_filters_isValid = false;
}

void OAICatalogsItemsRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsItemsRequest::fromJsonObject(QJsonObject json) {

    m_country_isValid = ::OpenAPI::fromJsonValue(country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_language_isValid = ::OpenAPI::fromJsonValue(language, json[QString("language")]);
    m_language_isSet = !json[QString("language")].isNull() && m_language_isValid;

    m_filters_isValid = ::OpenAPI::fromJsonValue(filters, json[QString("filters")]);
    m_filters_isSet = !json[QString("filters")].isNull() && m_filters_isValid;
}

QString OAICatalogsItemsRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsItemsRequest::asJsonObject() const {
    QJsonObject obj;
    if (country.isSet()) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(country));
    }
    if (language.isSet()) {
        obj.insert(QString("language"), ::OpenAPI::toJsonValue(language));
    }
    if (filters.isSet()) {
        obj.insert(QString("filters"), ::OpenAPI::toJsonValue(filters));
    }
    return obj;
}

OAICountry OAICatalogsItemsRequest::getCountry() const {
    return country;
}
void OAICatalogsItemsRequest::setCountry(const OAICountry &country) {
    this->country = country;
    this->m_country_isSet = true;
}

bool OAICatalogsItemsRequest::is_country_Set() const{
    return m_country_isSet;
}

bool OAICatalogsItemsRequest::is_country_Valid() const{
    return m_country_isValid;
}

OAICatalogsItemsRequest_language OAICatalogsItemsRequest::getLanguage() const {
    return language;
}
void OAICatalogsItemsRequest::setLanguage(const OAICatalogsItemsRequest_language &language) {
    this->language = language;
    this->m_language_isSet = true;
}

bool OAICatalogsItemsRequest::is_language_Set() const{
    return m_language_isSet;
}

bool OAICatalogsItemsRequest::is_language_Valid() const{
    return m_language_isValid;
}

OAICatalogsItemsPostFilters OAICatalogsItemsRequest::getFilters() const {
    return filters;
}
void OAICatalogsItemsRequest::setFilters(const OAICatalogsItemsPostFilters &filters) {
    this->filters = filters;
    this->m_filters_isSet = true;
}

bool OAICatalogsItemsRequest::is_filters_Set() const{
    return m_filters_isSet;
}

bool OAICatalogsItemsRequest::is_filters_Valid() const{
    return m_filters_isValid;
}

bool OAICatalogsItemsRequest::isSet() const {
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

        if (filters.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsItemsRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_country_isValid && m_language_isValid && m_filters_isValid && true;
}

} // namespace OpenAPI
