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

#include "OAICatalogs_product_groups_update_request.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogs_product_groups_update_request::OAICatalogs_product_groups_update_request(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogs_product_groups_update_request::OAICatalogs_product_groups_update_request() {
    this->initializeModel();
}

OAICatalogs_product_groups_update_request::~OAICatalogs_product_groups_update_request() {}

void OAICatalogs_product_groups_update_request::initializeModel() {

    m_name_isSet = false;
    m_name_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_is_featured_isSet = false;
    m_is_featured_isValid = false;

    m_filters_isSet = false;
    m_filters_isValid = false;

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;

    m_country_isSet = false;
    m_country_isValid = false;

    m_locale_isSet = false;
    m_locale_isValid = false;
}

void OAICatalogs_product_groups_update_request::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogs_product_groups_update_request::fromJsonObject(QJsonObject json) {

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_is_featured_isValid = ::OpenAPI::fromJsonValue(m_is_featured, json[QString("is_featured")]);
    m_is_featured_isSet = !json[QString("is_featured")].isNull() && m_is_featured_isValid;

    m_filters_isValid = ::OpenAPI::fromJsonValue(m_filters, json[QString("filters")]);
    m_filters_isSet = !json[QString("filters")].isNull() && m_filters_isValid;

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(m_catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_country_isValid = ::OpenAPI::fromJsonValue(m_country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_locale_isValid = ::OpenAPI::fromJsonValue(m_locale, json[QString("locale")]);
    m_locale_isSet = !json[QString("locale")].isNull() && m_locale_isValid;
}

QString OAICatalogs_product_groups_update_request::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogs_product_groups_update_request::asJsonObject() const {
    QJsonObject obj;
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    if (m_is_featured_isSet) {
        obj.insert(QString("is_featured"), ::OpenAPI::toJsonValue(m_is_featured));
    }
    if (m_filters.isSet()) {
        obj.insert(QString("filters"), ::OpenAPI::toJsonValue(m_filters));
    }
    if (m_catalog_type_isSet) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(m_catalog_type));
    }
    if (m_country.isSet()) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(m_country));
    }
    if (m_locale.isSet()) {
        obj.insert(QString("locale"), ::OpenAPI::toJsonValue(m_locale));
    }
    return obj;
}

QString OAICatalogs_product_groups_update_request::getName() const {
    return m_name;
}
void OAICatalogs_product_groups_update_request::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_name_Set() const{
    return m_name_isSet;
}

bool OAICatalogs_product_groups_update_request::is_name_Valid() const{
    return m_name_isValid;
}

QString OAICatalogs_product_groups_update_request::getDescription() const {
    return m_description;
}
void OAICatalogs_product_groups_update_request::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_description_Set() const{
    return m_description_isSet;
}

bool OAICatalogs_product_groups_update_request::is_description_Valid() const{
    return m_description_isValid;
}

bool OAICatalogs_product_groups_update_request::isIsFeatured() const {
    return m_is_featured;
}
void OAICatalogs_product_groups_update_request::setIsFeatured(const bool &is_featured) {
    m_is_featured = is_featured;
    m_is_featured_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_is_featured_Set() const{
    return m_is_featured_isSet;
}

bool OAICatalogs_product_groups_update_request::is_is_featured_Valid() const{
    return m_is_featured_isValid;
}

OAICatalogsCreativeAssetsProductGroupFilters OAICatalogs_product_groups_update_request::getFilters() const {
    return m_filters;
}
void OAICatalogs_product_groups_update_request::setFilters(const OAICatalogsCreativeAssetsProductGroupFilters &filters) {
    m_filters = filters;
    m_filters_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_filters_Set() const{
    return m_filters_isSet;
}

bool OAICatalogs_product_groups_update_request::is_filters_Valid() const{
    return m_filters_isValid;
}

QString OAICatalogs_product_groups_update_request::getCatalogType() const {
    return m_catalog_type;
}
void OAICatalogs_product_groups_update_request::setCatalogType(const QString &catalog_type) {
    m_catalog_type = catalog_type;
    m_catalog_type_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalogs_product_groups_update_request::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

OAICountry OAICatalogs_product_groups_update_request::getCountry() const {
    return m_country;
}
void OAICatalogs_product_groups_update_request::setCountry(const OAICountry &country) {
    m_country = country;
    m_country_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_country_Set() const{
    return m_country_isSet;
}

bool OAICatalogs_product_groups_update_request::is_country_Valid() const{
    return m_country_isValid;
}

OAICatalogsLocale OAICatalogs_product_groups_update_request::getLocale() const {
    return m_locale;
}
void OAICatalogs_product_groups_update_request::setLocale(const OAICatalogsLocale &locale) {
    m_locale = locale;
    m_locale_isSet = true;
}

bool OAICatalogs_product_groups_update_request::is_locale_Set() const{
    return m_locale_isSet;
}

bool OAICatalogs_product_groups_update_request::is_locale_Valid() const{
    return m_locale_isValid;
}

bool OAICatalogs_product_groups_update_request::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_featured_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_filters.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_catalog_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_country.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_locale.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogs_product_groups_update_request::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
