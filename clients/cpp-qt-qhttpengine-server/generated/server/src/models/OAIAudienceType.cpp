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

#include "OAIAudienceType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAudienceType::OAIAudienceType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAudienceType::OAIAudienceType() {
    this->initializeModel();
}

OAIAudienceType::~OAIAudienceType() {}

void OAIAudienceType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIAudienceType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIAudienceType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("CUSTOMER_LIST", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAudienceType::CUSTOMER_LIST;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("VISITOR", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAudienceType::VISITOR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ENGAGEMENT", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAudienceType::ENGAGEMENT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ACTALIKE", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAudienceType::ACTALIKE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PERSONA", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAudienceType::PERSONA;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIAudienceType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIAudienceType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIAudienceType::CUSTOMER_LIST:
            val = "CUSTOMER_LIST";
            break;
        case eOAIAudienceType::VISITOR:
            val = "VISITOR";
            break;
        case eOAIAudienceType::ENGAGEMENT:
            val = "ENGAGEMENT";
            break;
        case eOAIAudienceType::ACTALIKE:
            val = "ACTALIKE";
            break;
        case eOAIAudienceType::PERSONA:
            val = "PERSONA";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIAudienceType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIAudienceType::eOAIAudienceType OAIAudienceType::getValue() const {
    return m_value;
}

void OAIAudienceType::setValue(const OAIAudienceType::eOAIAudienceType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIAudienceType::isSet() const {
    
    return m_value_isSet;
}

bool OAIAudienceType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
