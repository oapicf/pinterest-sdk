/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIMediaUploadStatus.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMediaUploadStatus::OAIMediaUploadStatus(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMediaUploadStatus::OAIMediaUploadStatus() {
    this->initializeModel();
}

OAIMediaUploadStatus::~OAIMediaUploadStatus() {}

void OAIMediaUploadStatus::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIMediaUploadStatus::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIMediaUploadStatus::fromJson(QString jsonString) {
    
    if ( jsonString.compare("registered", Qt::CaseInsensitive) == 0) {
        m_value = eOAIMediaUploadStatus::REGISTERED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("processing", Qt::CaseInsensitive) == 0) {
        m_value = eOAIMediaUploadStatus::PROCESSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("succeeded", Qt::CaseInsensitive) == 0) {
        m_value = eOAIMediaUploadStatus::SUCCEEDED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("failed", Qt::CaseInsensitive) == 0) {
        m_value = eOAIMediaUploadStatus::FAILED;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIMediaUploadStatus::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIMediaUploadStatus::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIMediaUploadStatus::REGISTERED:
            val = "registered";
            break;
        case eOAIMediaUploadStatus::PROCESSING:
            val = "processing";
            break;
        case eOAIMediaUploadStatus::SUCCEEDED:
            val = "succeeded";
            break;
        case eOAIMediaUploadStatus::FAILED:
            val = "failed";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIMediaUploadStatus::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIMediaUploadStatus::eOAIMediaUploadStatus OAIMediaUploadStatus::getValue() const {
    return m_value;
}

void OAIMediaUploadStatus::setValue(const OAIMediaUploadStatus::eOAIMediaUploadStatus& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIMediaUploadStatus::isSet() const {
    
    return m_value_isSet;
}

bool OAIMediaUploadStatus::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI