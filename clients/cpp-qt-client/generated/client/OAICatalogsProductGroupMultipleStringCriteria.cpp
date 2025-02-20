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

#include "OAICatalogsProductGroupMultipleStringCriteria.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsProductGroupMultipleStringCriteria::OAICatalogsProductGroupMultipleStringCriteria(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsProductGroupMultipleStringCriteria::OAICatalogsProductGroupMultipleStringCriteria() {
    this->initializeModel();
}

OAICatalogsProductGroupMultipleStringCriteria::~OAICatalogsProductGroupMultipleStringCriteria() {}

void OAICatalogsProductGroupMultipleStringCriteria::initializeModel() {

    m_values_isSet = false;
    m_values_isValid = false;

    m_negated_isSet = false;
    m_negated_isValid = false;
}

void OAICatalogsProductGroupMultipleStringCriteria::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsProductGroupMultipleStringCriteria::fromJsonObject(QJsonObject json) {

    m_values_isValid = ::OpenAPI::fromJsonValue(m_values, json[QString("values")]);
    m_values_isSet = !json[QString("values")].isNull() && m_values_isValid;

    m_negated_isValid = ::OpenAPI::fromJsonValue(m_negated, json[QString("negated")]);
    m_negated_isSet = !json[QString("negated")].isNull() && m_negated_isValid;
}

QString OAICatalogsProductGroupMultipleStringCriteria::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsProductGroupMultipleStringCriteria::asJsonObject() const {
    QJsonObject obj;
    if (m_values.size() > 0) {
        obj.insert(QString("values"), ::OpenAPI::toJsonValue(m_values));
    }
    if (m_negated_isSet) {
        obj.insert(QString("negated"), ::OpenAPI::toJsonValue(m_negated));
    }
    return obj;
}

QList<QString> OAICatalogsProductGroupMultipleStringCriteria::getValues() const {
    return m_values;
}
void OAICatalogsProductGroupMultipleStringCriteria::setValues(const QList<QString> &values) {
    m_values = values;
    m_values_isSet = true;
}

bool OAICatalogsProductGroupMultipleStringCriteria::is_values_Set() const{
    return m_values_isSet;
}

bool OAICatalogsProductGroupMultipleStringCriteria::is_values_Valid() const{
    return m_values_isValid;
}

bool OAICatalogsProductGroupMultipleStringCriteria::isNegated() const {
    return m_negated;
}
void OAICatalogsProductGroupMultipleStringCriteria::setNegated(const bool &negated) {
    m_negated = negated;
    m_negated_isSet = true;
}

bool OAICatalogsProductGroupMultipleStringCriteria::is_negated_Set() const{
    return m_negated_isSet;
}

bool OAICatalogsProductGroupMultipleStringCriteria::is_negated_Valid() const{
    return m_negated_isValid;
}

bool OAICatalogsProductGroupMultipleStringCriteria::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_values.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_negated_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsProductGroupMultipleStringCriteria::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_values_isValid && true;
}

} // namespace OpenAPI
