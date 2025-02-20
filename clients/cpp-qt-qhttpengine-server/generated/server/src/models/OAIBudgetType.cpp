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

#include "OAIBudgetType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBudgetType::OAIBudgetType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBudgetType::OAIBudgetType() {
    this->initializeModel();
}

OAIBudgetType::~OAIBudgetType() {}

void OAIBudgetType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIBudgetType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIBudgetType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("DAILY", Qt::CaseInsensitive) == 0) {
        m_value = eOAIBudgetType::DAILY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LIFETIME", Qt::CaseInsensitive) == 0) {
        m_value = eOAIBudgetType::LIFETIME;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CBO_ADGROUP", Qt::CaseInsensitive) == 0) {
        m_value = eOAIBudgetType::CBO_ADGROUP;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIBudgetType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIBudgetType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIBudgetType::DAILY:
            val = "DAILY";
            break;
        case eOAIBudgetType::LIFETIME:
            val = "LIFETIME";
            break;
        case eOAIBudgetType::CBO_ADGROUP:
            val = "CBO_ADGROUP";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIBudgetType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIBudgetType::eOAIBudgetType OAIBudgetType::getValue() const {
    return m_value;
}

void OAIBudgetType::setValue(const OAIBudgetType::eOAIBudgetType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIBudgetType::isSet() const {
    
    return m_value_isSet;
}

bool OAIBudgetType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
