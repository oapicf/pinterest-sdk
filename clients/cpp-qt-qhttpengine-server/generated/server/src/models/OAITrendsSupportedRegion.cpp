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

#include "OAITrendsSupportedRegion.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITrendsSupportedRegion::OAITrendsSupportedRegion(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITrendsSupportedRegion::OAITrendsSupportedRegion() {
    this->initializeModel();
}

OAITrendsSupportedRegion::~OAITrendsSupportedRegion() {}

void OAITrendsSupportedRegion::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAITrendsSupportedRegion::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAITrendsSupportedRegion::fromJson(QString jsonString) {
    
    if ( jsonString.compare("US", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::US;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CA", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::CA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DE", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::DE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FR", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::FR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ES", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::ES;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IT", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::IT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DE+AT+CH", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::DE_AT_CH;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("GB+IE", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::GB_IE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IT+ES+PT+GR+MT", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::IT_ES_PT_GR_MT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PL+RO+HU+SK+CZ", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::PL_RO_HU_SK_CZ;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SE+DK+FI+NO", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::SE_DK_FI_NO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NL+BE+LU", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::NL_BE_LU;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AR", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::AR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BR", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::BR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CO", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::CO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MX", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::MX;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MX+AR+CO+CL", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::MX_AR_CO_CL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AU+NZ", Qt::CaseInsensitive) == 0) {
        m_value = eOAITrendsSupportedRegion::AU_NZ;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAITrendsSupportedRegion::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAITrendsSupportedRegion::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAITrendsSupportedRegion::US:
            val = "US";
            break;
        case eOAITrendsSupportedRegion::CA:
            val = "CA";
            break;
        case eOAITrendsSupportedRegion::DE:
            val = "DE";
            break;
        case eOAITrendsSupportedRegion::FR:
            val = "FR";
            break;
        case eOAITrendsSupportedRegion::ES:
            val = "ES";
            break;
        case eOAITrendsSupportedRegion::IT:
            val = "IT";
            break;
        case eOAITrendsSupportedRegion::DE_AT_CH:
            val = "DE+AT+CH";
            break;
        case eOAITrendsSupportedRegion::GB_IE:
            val = "GB+IE";
            break;
        case eOAITrendsSupportedRegion::IT_ES_PT_GR_MT:
            val = "IT+ES+PT+GR+MT";
            break;
        case eOAITrendsSupportedRegion::PL_RO_HU_SK_CZ:
            val = "PL+RO+HU+SK+CZ";
            break;
        case eOAITrendsSupportedRegion::SE_DK_FI_NO:
            val = "SE+DK+FI+NO";
            break;
        case eOAITrendsSupportedRegion::NL_BE_LU:
            val = "NL+BE+LU";
            break;
        case eOAITrendsSupportedRegion::AR:
            val = "AR";
            break;
        case eOAITrendsSupportedRegion::BR:
            val = "BR";
            break;
        case eOAITrendsSupportedRegion::CO:
            val = "CO";
            break;
        case eOAITrendsSupportedRegion::MX:
            val = "MX";
            break;
        case eOAITrendsSupportedRegion::MX_AR_CO_CL:
            val = "MX+AR+CO+CL";
            break;
        case eOAITrendsSupportedRegion::AU_NZ:
            val = "AU+NZ";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAITrendsSupportedRegion::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAITrendsSupportedRegion::eOAITrendsSupportedRegion OAITrendsSupportedRegion::getValue() const {
    return m_value;
}

void OAITrendsSupportedRegion::setValue(const OAITrendsSupportedRegion::eOAITrendsSupportedRegion& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAITrendsSupportedRegion::isSet() const {
    
    return m_value_isSet;
}

bool OAITrendsSupportedRegion::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
