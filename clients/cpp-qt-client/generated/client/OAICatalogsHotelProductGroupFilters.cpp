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

#include "OAICatalogsHotelProductGroupFilters.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsHotelProductGroupFilters::OAICatalogsHotelProductGroupFilters(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsHotelProductGroupFilters::OAICatalogsHotelProductGroupFilters() {
    this->initializeModel();
}

OAICatalogsHotelProductGroupFilters::~OAICatalogsHotelProductGroupFilters() {}

void OAICatalogsHotelProductGroupFilters::initializeModel() {

    m_any_of_isSet = false;
    m_any_of_isValid = false;

    m_all_of_isSet = false;
    m_all_of_isValid = false;
}

void OAICatalogsHotelProductGroupFilters::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsHotelProductGroupFilters::fromJsonObject(QJsonObject json) {

    m_any_of_isValid = ::OpenAPI::fromJsonValue(m_any_of, json[QString("any_of")]);
    m_any_of_isSet = !json[QString("any_of")].isNull() && m_any_of_isValid;

    m_all_of_isValid = ::OpenAPI::fromJsonValue(m_all_of, json[QString("all_of")]);
    m_all_of_isSet = !json[QString("all_of")].isNull() && m_all_of_isValid;
}

QString OAICatalogsHotelProductGroupFilters::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsHotelProductGroupFilters::asJsonObject() const {
    QJsonObject obj;
    if (m_any_of.size() > 0) {
        obj.insert(QString("any_of"), ::OpenAPI::toJsonValue(m_any_of));
    }
    if (m_all_of.size() > 0) {
        obj.insert(QString("all_of"), ::OpenAPI::toJsonValue(m_all_of));
    }
    return obj;
}

QList<OAICatalogsHotelProductGroupFilterKeys> OAICatalogsHotelProductGroupFilters::getAnyOf() const {
    return m_any_of;
}
void OAICatalogsHotelProductGroupFilters::setAnyOf(const QList<OAICatalogsHotelProductGroupFilterKeys> &any_of) {
    m_any_of = any_of;
    m_any_of_isSet = true;
}

bool OAICatalogsHotelProductGroupFilters::is_any_of_Set() const{
    return m_any_of_isSet;
}

bool OAICatalogsHotelProductGroupFilters::is_any_of_Valid() const{
    return m_any_of_isValid;
}

QList<OAICatalogsHotelProductGroupFilterKeys> OAICatalogsHotelProductGroupFilters::getAllOf() const {
    return m_all_of;
}
void OAICatalogsHotelProductGroupFilters::setAllOf(const QList<OAICatalogsHotelProductGroupFilterKeys> &all_of) {
    m_all_of = all_of;
    m_all_of_isSet = true;
}

bool OAICatalogsHotelProductGroupFilters::is_all_of_Set() const{
    return m_all_of_isSet;
}

bool OAICatalogsHotelProductGroupFilters::is_all_of_Valid() const{
    return m_all_of_isValid;
}

bool OAICatalogsHotelProductGroupFilters::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_any_of.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_all_of.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsHotelProductGroupFilters::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_any_of_isValid && m_all_of_isValid && true;
}

} // namespace OpenAPI
