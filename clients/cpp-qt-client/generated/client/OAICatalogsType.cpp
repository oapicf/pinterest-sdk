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

#include "OAICatalogsType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsType::OAICatalogsType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsType::OAICatalogsType() {
    this->initializeModel();
}

OAICatalogsType::~OAICatalogsType() {}

void OAICatalogsType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAICatalogsType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAICatalogsType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("RETAIL", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsType::RETAIL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HOTEL", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsType::HOTEL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CREATIVE_ASSETS", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsType::CREATIVE_ASSETS;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAICatalogsType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAICatalogsType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAICatalogsType::RETAIL:
            val = "RETAIL";
            break;
        case eOAICatalogsType::HOTEL:
            val = "HOTEL";
            break;
        case eOAICatalogsType::CREATIVE_ASSETS:
            val = "CREATIVE_ASSETS";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAICatalogsType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAICatalogsType::eOAICatalogsType OAICatalogsType::getValue() const {
    return m_value;
}

void OAICatalogsType::setValue(const OAICatalogsType::eOAICatalogsType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAICatalogsType::isSet() const {
    
    return m_value_isSet;
}

bool OAICatalogsType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
