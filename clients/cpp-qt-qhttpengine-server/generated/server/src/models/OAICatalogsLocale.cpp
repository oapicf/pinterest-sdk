/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICatalogsLocale.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsLocale::OAICatalogsLocale(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsLocale::OAICatalogsLocale() {
    this->initializeModel();
}

OAICatalogsLocale::~OAICatalogsLocale() {}

void OAICatalogsLocale::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAICatalogsLocale::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAICatalogsLocale::fromJson(QString jsonString) {
    
    if ( jsonString.compare("af-ZA", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::AF_ZA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ar-SA", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::AR_SA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("bg-BG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::BG_BG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("bn-IN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::BN_IN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("cs-CZ", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::CS_CZ;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("da-DK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::DA_DK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("de", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::DE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("el-GR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::EL_GR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("en-AU", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::EN_AU;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("en-CA", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::EN_CA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("en-GB", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::EN_GB;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("en-IN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::EN_IN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("en-US", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::EN_US;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("es-419", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ES_419;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("es-AR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ES_AR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("es-ES", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ES_ES;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("es-MX", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ES_MX;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("fi-FI", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::FI_FI;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("fr", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::FR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("fr-CA", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::FR_CA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("he-IL", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::HE_IL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("hi-IN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::HI_IN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("hr-HR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::HR_HR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("hu-HU", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::HU_HU;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("id-ID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ID_ID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("it", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::IT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ja", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::JA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ko-KR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::KO_KR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ms-MY", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::MS_MY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("nb-NO", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::NB_NO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("nl", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::NL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("pl-PL", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::PL_PL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("pt-BR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::PT_BR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("pt-PT", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::PT_PT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ro-RO", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::RO_RO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ru-RU", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::RU_RU;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("sk-SK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::SK_SK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("sv-SE", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::SV_SE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("te-IN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::TE_IN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("th-TH", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::TH_TH;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("tl-PH", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::TL_PH;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("tr", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::TR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("uk-UA", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::UK_UA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("vi-VN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::VI_VN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("zh-CN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ZH_CN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("zh-TW", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsLocale::ZH_TW;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAICatalogsLocale::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAICatalogsLocale::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAICatalogsLocale::AF_ZA:
            val = "af-ZA";
            break;
        case eOAICatalogsLocale::AR_SA:
            val = "ar-SA";
            break;
        case eOAICatalogsLocale::BG_BG:
            val = "bg-BG";
            break;
        case eOAICatalogsLocale::BN_IN:
            val = "bn-IN";
            break;
        case eOAICatalogsLocale::CS_CZ:
            val = "cs-CZ";
            break;
        case eOAICatalogsLocale::DA_DK:
            val = "da-DK";
            break;
        case eOAICatalogsLocale::DE:
            val = "de";
            break;
        case eOAICatalogsLocale::EL_GR:
            val = "el-GR";
            break;
        case eOAICatalogsLocale::EN_AU:
            val = "en-AU";
            break;
        case eOAICatalogsLocale::EN_CA:
            val = "en-CA";
            break;
        case eOAICatalogsLocale::EN_GB:
            val = "en-GB";
            break;
        case eOAICatalogsLocale::EN_IN:
            val = "en-IN";
            break;
        case eOAICatalogsLocale::EN_US:
            val = "en-US";
            break;
        case eOAICatalogsLocale::ES_419:
            val = "es-419";
            break;
        case eOAICatalogsLocale::ES_AR:
            val = "es-AR";
            break;
        case eOAICatalogsLocale::ES_ES:
            val = "es-ES";
            break;
        case eOAICatalogsLocale::ES_MX:
            val = "es-MX";
            break;
        case eOAICatalogsLocale::FI_FI:
            val = "fi-FI";
            break;
        case eOAICatalogsLocale::FR:
            val = "fr";
            break;
        case eOAICatalogsLocale::FR_CA:
            val = "fr-CA";
            break;
        case eOAICatalogsLocale::HE_IL:
            val = "he-IL";
            break;
        case eOAICatalogsLocale::HI_IN:
            val = "hi-IN";
            break;
        case eOAICatalogsLocale::HR_HR:
            val = "hr-HR";
            break;
        case eOAICatalogsLocale::HU_HU:
            val = "hu-HU";
            break;
        case eOAICatalogsLocale::ID_ID:
            val = "id-ID";
            break;
        case eOAICatalogsLocale::IT:
            val = "it";
            break;
        case eOAICatalogsLocale::JA:
            val = "ja";
            break;
        case eOAICatalogsLocale::KO_KR:
            val = "ko-KR";
            break;
        case eOAICatalogsLocale::MS_MY:
            val = "ms-MY";
            break;
        case eOAICatalogsLocale::NB_NO:
            val = "nb-NO";
            break;
        case eOAICatalogsLocale::NL:
            val = "nl";
            break;
        case eOAICatalogsLocale::PL_PL:
            val = "pl-PL";
            break;
        case eOAICatalogsLocale::PT_BR:
            val = "pt-BR";
            break;
        case eOAICatalogsLocale::PT_PT:
            val = "pt-PT";
            break;
        case eOAICatalogsLocale::RO_RO:
            val = "ro-RO";
            break;
        case eOAICatalogsLocale::RU_RU:
            val = "ru-RU";
            break;
        case eOAICatalogsLocale::SK_SK:
            val = "sk-SK";
            break;
        case eOAICatalogsLocale::SV_SE:
            val = "sv-SE";
            break;
        case eOAICatalogsLocale::TE_IN:
            val = "te-IN";
            break;
        case eOAICatalogsLocale::TH_TH:
            val = "th-TH";
            break;
        case eOAICatalogsLocale::TL_PH:
            val = "tl-PH";
            break;
        case eOAICatalogsLocale::TR:
            val = "tr";
            break;
        case eOAICatalogsLocale::UK_UA:
            val = "uk-UA";
            break;
        case eOAICatalogsLocale::VI_VN:
            val = "vi-VN";
            break;
        case eOAICatalogsLocale::ZH_CN:
            val = "zh-CN";
            break;
        case eOAICatalogsLocale::ZH_TW:
            val = "zh-TW";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAICatalogsLocale::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAICatalogsLocale::eOAICatalogsLocale OAICatalogsLocale::getValue() const {
    return m_value;
}

void OAICatalogsLocale::setValue(const OAICatalogsLocale::eOAICatalogsLocale& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAICatalogsLocale::isSet() const {
    
    return m_value_isSet;
}

bool OAICatalogsLocale::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI