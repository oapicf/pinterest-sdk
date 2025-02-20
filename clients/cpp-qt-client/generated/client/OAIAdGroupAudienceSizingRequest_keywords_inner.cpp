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

#include "OAIAdGroupAudienceSizingRequest_keywords_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAdGroupAudienceSizingRequest_keywords_inner::OAIAdGroupAudienceSizingRequest_keywords_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAdGroupAudienceSizingRequest_keywords_inner::OAIAdGroupAudienceSizingRequest_keywords_inner() {
    this->initializeModel();
}

OAIAdGroupAudienceSizingRequest_keywords_inner::~OAIAdGroupAudienceSizingRequest_keywords_inner() {}

void OAIAdGroupAudienceSizingRequest_keywords_inner::initializeModel() {

    m_match_type_isSet = false;
    m_match_type_isValid = false;

    m_value_isSet = false;
    m_value_isValid = false;
}

void OAIAdGroupAudienceSizingRequest_keywords_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAdGroupAudienceSizingRequest_keywords_inner::fromJsonObject(QJsonObject json) {

    m_match_type_isValid = ::OpenAPI::fromJsonValue(m_match_type, json[QString("match_type")]);
    m_match_type_isSet = !json[QString("match_type")].isNull() && m_match_type_isValid;

    m_value_isValid = ::OpenAPI::fromJsonValue(m_value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;
}

QString OAIAdGroupAudienceSizingRequest_keywords_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAdGroupAudienceSizingRequest_keywords_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_match_type.isSet()) {
        obj.insert(QString("match_type"), ::OpenAPI::toJsonValue(m_match_type));
    }
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(m_value));
    }
    return obj;
}

OAIMatchTypeResponse OAIAdGroupAudienceSizingRequest_keywords_inner::getMatchType() const {
    return m_match_type;
}
void OAIAdGroupAudienceSizingRequest_keywords_inner::setMatchType(const OAIMatchTypeResponse &match_type) {
    m_match_type = match_type;
    m_match_type_isSet = true;
}

bool OAIAdGroupAudienceSizingRequest_keywords_inner::is_match_type_Set() const{
    return m_match_type_isSet;
}

bool OAIAdGroupAudienceSizingRequest_keywords_inner::is_match_type_Valid() const{
    return m_match_type_isValid;
}

QString OAIAdGroupAudienceSizingRequest_keywords_inner::getValue() const {
    return m_value;
}
void OAIAdGroupAudienceSizingRequest_keywords_inner::setValue(const QString &value) {
    m_value = value;
    m_value_isSet = true;
}

bool OAIAdGroupAudienceSizingRequest_keywords_inner::is_value_Set() const{
    return m_value_isSet;
}

bool OAIAdGroupAudienceSizingRequest_keywords_inner::is_value_Valid() const{
    return m_value_isValid;
}

bool OAIAdGroupAudienceSizingRequest_keywords_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_match_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAdGroupAudienceSizingRequest_keywords_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_match_type_isValid && m_value_isValid && true;
}

} // namespace OpenAPI
