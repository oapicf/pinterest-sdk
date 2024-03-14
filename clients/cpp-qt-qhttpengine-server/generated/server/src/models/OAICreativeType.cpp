/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICreativeType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreativeType::OAICreativeType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreativeType::OAICreativeType() {
    this->initializeModel();
}

OAICreativeType::~OAICreativeType() {}

void OAICreativeType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAICreativeType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAICreativeType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("REGULAR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::REGULAR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("VIDEO", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::VIDEO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SHOPPING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::SHOPPING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CAROUSEL", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::CAROUSEL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MAX_VIDEO", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::MAX_VIDEO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SHOP_THE_PIN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::SHOP_THE_PIN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IDEA", Qt::CaseInsensitive) == 0) {
        m_value = eOAICreativeType::IDEA;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAICreativeType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAICreativeType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAICreativeType::REGULAR:
            val = "REGULAR";
            break;
        case eOAICreativeType::VIDEO:
            val = "VIDEO";
            break;
        case eOAICreativeType::SHOPPING:
            val = "SHOPPING";
            break;
        case eOAICreativeType::CAROUSEL:
            val = "CAROUSEL";
            break;
        case eOAICreativeType::MAX_VIDEO:
            val = "MAX_VIDEO";
            break;
        case eOAICreativeType::SHOP_THE_PIN:
            val = "SHOP_THE_PIN";
            break;
        case eOAICreativeType::IDEA:
            val = "IDEA";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAICreativeType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAICreativeType::eOAICreativeType OAICreativeType::getValue() const {
    return m_value;
}

void OAICreativeType::setValue(const OAICreativeType::eOAICreativeType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAICreativeType::isSet() const {
    
    return m_value_isSet;
}

bool OAICreativeType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI