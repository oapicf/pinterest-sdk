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

#include "OAICatalogsCreativeAssetsProduct.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsCreativeAssetsProduct::OAICatalogsCreativeAssetsProduct(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsCreativeAssetsProduct::OAICatalogsCreativeAssetsProduct() {
    this->initializeModel();
}

OAICatalogsCreativeAssetsProduct::~OAICatalogsCreativeAssetsProduct() {}

void OAICatalogsCreativeAssetsProduct::initializeModel() {

    m_catalog_type_isSet = false;
    m_catalog_type_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;

    m_pin_isSet = false;
    m_pin_isValid = false;
}

void OAICatalogsCreativeAssetsProduct::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsCreativeAssetsProduct::fromJsonObject(QJsonObject json) {

    m_catalog_type_isValid = ::OpenAPI::fromJsonValue(catalog_type, json[QString("catalog_type")]);
    m_catalog_type_isSet = !json[QString("catalog_type")].isNull() && m_catalog_type_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;

    m_pin_isValid = ::OpenAPI::fromJsonValue(pin, json[QString("pin")]);
    m_pin_isSet = !json[QString("pin")].isNull() && m_pin_isValid;
}

QString OAICatalogsCreativeAssetsProduct::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsCreativeAssetsProduct::asJsonObject() const {
    QJsonObject obj;
    if (m_catalog_type_isSet) {
        obj.insert(QString("catalog_type"), ::OpenAPI::toJsonValue(catalog_type));
    }
    if (metadata.isSet()) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    if (pin.isSet()) {
        obj.insert(QString("pin"), ::OpenAPI::toJsonValue(pin));
    }
    return obj;
}

QString OAICatalogsCreativeAssetsProduct::getCatalogType() const {
    return catalog_type;
}
void OAICatalogsCreativeAssetsProduct::setCatalogType(const QString &catalog_type) {
    this->catalog_type = catalog_type;
    this->m_catalog_type_isSet = true;
}

bool OAICatalogsCreativeAssetsProduct::is_catalog_type_Set() const{
    return m_catalog_type_isSet;
}

bool OAICatalogsCreativeAssetsProduct::is_catalog_type_Valid() const{
    return m_catalog_type_isValid;
}

OAICatalogsCreativeAssetsProductMetadata OAICatalogsCreativeAssetsProduct::getMetadata() const {
    return metadata;
}
void OAICatalogsCreativeAssetsProduct::setMetadata(const OAICatalogsCreativeAssetsProductMetadata &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAICatalogsCreativeAssetsProduct::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAICatalogsCreativeAssetsProduct::is_metadata_Valid() const{
    return m_metadata_isValid;
}

OAIPin OAICatalogsCreativeAssetsProduct::getPin() const {
    return pin;
}
void OAICatalogsCreativeAssetsProduct::setPin(const OAIPin &pin) {
    this->pin = pin;
    this->m_pin_isSet = true;
}

bool OAICatalogsCreativeAssetsProduct::is_pin_Set() const{
    return m_pin_isSet;
}

bool OAICatalogsCreativeAssetsProduct::is_pin_Valid() const{
    return m_pin_isValid;
}

bool OAICatalogsCreativeAssetsProduct::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_catalog_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (metadata.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (pin.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsCreativeAssetsProduct::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_catalog_type_isValid && m_metadata_isValid && m_pin_isValid && true;
}

} // namespace OpenAPI
