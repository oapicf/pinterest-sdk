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

#include "OAIBrandFilter.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBrandFilter::OAIBrandFilter(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBrandFilter::OAIBrandFilter() {
    this->initializeModel();
}

OAIBrandFilter::~OAIBrandFilter() {}

void OAIBrandFilter::initializeModel() {

    m_brand_isSet = false;
    m_brand_isValid = false;
}

void OAIBrandFilter::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBrandFilter::fromJsonObject(QJsonObject json) {

    m_brand_isValid = ::OpenAPI::fromJsonValue(brand, json[QString("BRAND")]);
    m_brand_isSet = !json[QString("BRAND")].isNull() && m_brand_isValid;
}

QString OAIBrandFilter::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBrandFilter::asJsonObject() const {
    QJsonObject obj;
    if (m_brand_isSet) {
        obj.insert(QString("BRAND"), ::OpenAPI::toJsonValue(brand));
    }
    return obj;
}

OAICatalogsProductGroupMultipleStringCriteria OAIBrandFilter::getBrand() const {
    return brand;
}
void OAIBrandFilter::setBrand(const OAICatalogsProductGroupMultipleStringCriteria &brand) {
    this->brand = brand;
    this->m_brand_isSet = true;
}

bool OAIBrandFilter::is_brand_Set() const{
    return m_brand_isSet;
}

bool OAIBrandFilter::is_brand_Valid() const{
    return m_brand_isValid;
}

bool OAIBrandFilter::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_brand_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBrandFilter::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_brand_isValid && true;
}

} // namespace OpenAPI
