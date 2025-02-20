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

#include "OAICatalogsCreativeAssetsProductGroupFilters.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsCreativeAssetsProductGroupFilters::OAICatalogsCreativeAssetsProductGroupFilters(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsCreativeAssetsProductGroupFilters::OAICatalogsCreativeAssetsProductGroupFilters() {
    this->initializeModel();
}

OAICatalogsCreativeAssetsProductGroupFilters::~OAICatalogsCreativeAssetsProductGroupFilters() {}

void OAICatalogsCreativeAssetsProductGroupFilters::initializeModel() {

    m_any_of_isSet = false;
    m_any_of_isValid = false;

    m_all_of_isSet = false;
    m_all_of_isValid = false;
}

void OAICatalogsCreativeAssetsProductGroupFilters::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsCreativeAssetsProductGroupFilters::fromJsonObject(QJsonObject json) {

    m_any_of_isValid = ::OpenAPI::fromJsonValue(any_of, json[QString("any_of")]);
    m_any_of_isSet = !json[QString("any_of")].isNull() && m_any_of_isValid;

    m_all_of_isValid = ::OpenAPI::fromJsonValue(all_of, json[QString("all_of")]);
    m_all_of_isSet = !json[QString("all_of")].isNull() && m_all_of_isValid;
}

QString OAICatalogsCreativeAssetsProductGroupFilters::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsCreativeAssetsProductGroupFilters::asJsonObject() const {
    QJsonObject obj;
    if (any_of.size() > 0) {
        obj.insert(QString("any_of"), ::OpenAPI::toJsonValue(any_of));
    }
    if (all_of.size() > 0) {
        obj.insert(QString("all_of"), ::OpenAPI::toJsonValue(all_of));
    }
    return obj;
}

QList<OAICatalogsCreativeAssetsProductGroupFilterKeys> OAICatalogsCreativeAssetsProductGroupFilters::getAnyOf() const {
    return any_of;
}
void OAICatalogsCreativeAssetsProductGroupFilters::setAnyOf(const QList<OAICatalogsCreativeAssetsProductGroupFilterKeys> &any_of) {
    this->any_of = any_of;
    this->m_any_of_isSet = true;
}

bool OAICatalogsCreativeAssetsProductGroupFilters::is_any_of_Set() const{
    return m_any_of_isSet;
}

bool OAICatalogsCreativeAssetsProductGroupFilters::is_any_of_Valid() const{
    return m_any_of_isValid;
}

QList<OAICatalogsCreativeAssetsProductGroupFilterKeys> OAICatalogsCreativeAssetsProductGroupFilters::getAllOf() const {
    return all_of;
}
void OAICatalogsCreativeAssetsProductGroupFilters::setAllOf(const QList<OAICatalogsCreativeAssetsProductGroupFilterKeys> &all_of) {
    this->all_of = all_of;
    this->m_all_of_isSet = true;
}

bool OAICatalogsCreativeAssetsProductGroupFilters::is_all_of_Set() const{
    return m_all_of_isSet;
}

bool OAICatalogsCreativeAssetsProductGroupFilters::is_all_of_Valid() const{
    return m_all_of_isValid;
}

bool OAICatalogsCreativeAssetsProductGroupFilters::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (any_of.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (all_of.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsCreativeAssetsProductGroupFilters::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_any_of_isValid && m_all_of_isValid && true;
}

} // namespace OpenAPI
