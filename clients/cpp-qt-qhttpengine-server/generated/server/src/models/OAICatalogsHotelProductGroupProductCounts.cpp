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

#include "OAICatalogsHotelProductGroupProductCounts.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsHotelProductGroupProductCounts::OAICatalogsHotelProductGroupProductCounts(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsHotelProductGroupProductCounts::OAICatalogsHotelProductGroupProductCounts() {
    this->initializeModel();
}

OAICatalogsHotelProductGroupProductCounts::~OAICatalogsHotelProductGroupProductCounts() {}

void OAICatalogsHotelProductGroupProductCounts::initializeModel() {

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;

    m_total_isSet = false;
    m_total_isValid = false;
}

void OAICatalogsHotelProductGroupProductCounts::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsHotelProductGroupProductCounts::fromJsonObject(QJsonObject json) {

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_total_isValid = ::OpenAPI::fromJsonValue(total, json[QString("total")]);
    m_total_isSet = !json[QString("total")].isNull() && m_total_isValid;
}

QString OAICatalogsHotelProductGroupProductCounts::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsHotelProductGroupProductCounts::asJsonObject() const {
    QJsonObject obj;
    if (m_catalog_type_isSet) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(catalog_type));
    }
    if (m_total_isSet) {
        obj.insert(QString("total"), ::OpenAPI::toJsonValue(total));
    }
    return obj;
}

QString OAICatalogsHotelProductGroupProductCounts::getCatalogType() const {
    return catalog_type;
}
void OAICatalogsHotelProductGroupProductCounts::setCatalogType(const QString &catalog_type) {
    this->catalog_type = catalog_type;
    this->m_catalog_type_isSet = true;
}

bool OAICatalogsHotelProductGroupProductCounts::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalogsHotelProductGroupProductCounts::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

double OAICatalogsHotelProductGroupProductCounts::getTotal() const {
    return total;
}
void OAICatalogsHotelProductGroupProductCounts::setTotal(const double &total) {
    this->total = total;
    this->m_total_isSet = true;
}

bool OAICatalogsHotelProductGroupProductCounts::is_total_Set() const{
    return m_total_isSet;
}

bool OAICatalogsHotelProductGroupProductCounts::is_total_Valid() const{
    return m_total_isValid;
}

bool OAICatalogsHotelProductGroupProductCounts::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_catalog_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_total_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsHotelProductGroupProductCounts::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_catalog_type_isValid && m_total_isValid && true;
}

} // namespace OpenAPI
