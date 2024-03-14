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

#include "OAIAdsAnalyticsTargetingType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAdsAnalyticsTargetingType::OAIAdsAnalyticsTargetingType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAdsAnalyticsTargetingType::OAIAdsAnalyticsTargetingType() {
    this->initializeModel();
}

OAIAdsAnalyticsTargetingType::~OAIAdsAnalyticsTargetingType() {}

void OAIAdsAnalyticsTargetingType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIAdsAnalyticsTargetingType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIAdsAnalyticsTargetingType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("KEYWORD", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::KEYWORD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("APPTYPE", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::APPTYPE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("GENDER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::GENDER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LOCATION", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::LOCATION;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PLACEMENT", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::PLACEMENT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("COUNTRY", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::COUNTRY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TARGETED_INTEREST", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::TARGETED_INTEREST;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PINNER_INTEREST", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::PINNER_INTEREST;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AUDIENCE_INCLUDE", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::AUDIENCE_INCLUDE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AUDIENCE_EXCLUDE", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::AUDIENCE_EXCLUDE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("GEO", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::GEO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AGE_BUCKET", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::AGE_BUCKET;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("REGION", Qt::CaseInsensitive) == 0) {
        m_value = eOAIAdsAnalyticsTargetingType::REGION;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIAdsAnalyticsTargetingType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIAdsAnalyticsTargetingType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIAdsAnalyticsTargetingType::KEYWORD:
            val = "KEYWORD";
            break;
        case eOAIAdsAnalyticsTargetingType::APPTYPE:
            val = "APPTYPE";
            break;
        case eOAIAdsAnalyticsTargetingType::GENDER:
            val = "GENDER";
            break;
        case eOAIAdsAnalyticsTargetingType::LOCATION:
            val = "LOCATION";
            break;
        case eOAIAdsAnalyticsTargetingType::PLACEMENT:
            val = "PLACEMENT";
            break;
        case eOAIAdsAnalyticsTargetingType::COUNTRY:
            val = "COUNTRY";
            break;
        case eOAIAdsAnalyticsTargetingType::TARGETED_INTEREST:
            val = "TARGETED_INTEREST";
            break;
        case eOAIAdsAnalyticsTargetingType::PINNER_INTEREST:
            val = "PINNER_INTEREST";
            break;
        case eOAIAdsAnalyticsTargetingType::AUDIENCE_INCLUDE:
            val = "AUDIENCE_INCLUDE";
            break;
        case eOAIAdsAnalyticsTargetingType::AUDIENCE_EXCLUDE:
            val = "AUDIENCE_EXCLUDE";
            break;
        case eOAIAdsAnalyticsTargetingType::GEO:
            val = "GEO";
            break;
        case eOAIAdsAnalyticsTargetingType::AGE_BUCKET:
            val = "AGE_BUCKET";
            break;
        case eOAIAdsAnalyticsTargetingType::REGION:
            val = "REGION";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIAdsAnalyticsTargetingType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIAdsAnalyticsTargetingType::eOAIAdsAnalyticsTargetingType OAIAdsAnalyticsTargetingType::getValue() const {
    return m_value;
}

void OAIAdsAnalyticsTargetingType::setValue(const OAIAdsAnalyticsTargetingType::eOAIAdsAnalyticsTargetingType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIAdsAnalyticsTargetingType::isSet() const {
    
    return m_value_isSet;
}

bool OAIAdsAnalyticsTargetingType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI