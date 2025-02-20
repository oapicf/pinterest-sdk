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

#include "OAIItemProcessingStatus.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIItemProcessingStatus::OAIItemProcessingStatus(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIItemProcessingStatus::OAIItemProcessingStatus() {
    this->initializeModel();
}

OAIItemProcessingStatus::~OAIItemProcessingStatus() {}

void OAIItemProcessingStatus::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIItemProcessingStatus::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIItemProcessingStatus::fromJson(QString jsonString) {
    
    if ( jsonString.compare("SUCCESS", Qt::CaseInsensitive) == 0) {
        m_value = eOAIItemProcessingStatus::SUCCESS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FAILURE", Qt::CaseInsensitive) == 0) {
        m_value = eOAIItemProcessingStatus::FAILURE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PROCESSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAIItemProcessingStatus::PROCESSING;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIItemProcessingStatus::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIItemProcessingStatus::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIItemProcessingStatus::SUCCESS:
            val = "SUCCESS";
            break;
        case eOAIItemProcessingStatus::FAILURE:
            val = "FAILURE";
            break;
        case eOAIItemProcessingStatus::PROCESSING:
            val = "PROCESSING";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIItemProcessingStatus::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIItemProcessingStatus::eOAIItemProcessingStatus OAIItemProcessingStatus::getValue() const {
    return m_value;
}

void OAIItemProcessingStatus::setValue(const OAIItemProcessingStatus::eOAIItemProcessingStatus& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIItemProcessingStatus::isSet() const {
    
    return m_value_isSet;
}

bool OAIItemProcessingStatus::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
