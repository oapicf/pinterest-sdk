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

#include "OAILanguage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAILanguage::OAILanguage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAILanguage::OAILanguage() {
    this->initializeModel();
}

OAILanguage::~OAILanguage() {}

void OAILanguage::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAILanguage::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAILanguage::fromJson(QString jsonString) {
    
    if ( jsonString.compare("AM", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::AM;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AR", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::AR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AZ", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::AZ;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BG", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::BG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BN", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::BN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BS", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::BS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CA", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::CA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CS", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::CS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DA", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::DA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DV", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::DV;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DZ", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::DZ;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DE", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::DE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("EL", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::EL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("EN", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::EN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ES", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::ES;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ET", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::ET;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FA", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::FA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FI", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::FI;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FR", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::FR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HE", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::HE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HI", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::HI;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HR", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::HR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HU", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::HU;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HY", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::HY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ID", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::ID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IN", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::IN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IS", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::IS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IT", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::IT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IW", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::IW;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("JA", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::JA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("KA", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::KA;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("KM", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::KM;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("KO", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::KO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LO", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::LO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LT", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::LT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LV", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::LV;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MK", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::MK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MN", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::MN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MS", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::MS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MY", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::MY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NB", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::NB;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NE", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::NE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NL", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::NL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NO", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::NO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PL", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::PL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PT", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::PT;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RO", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::RO;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RU", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::RU;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SK", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::SK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SL", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::SL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SQ", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::SQ;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SR", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::SR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SV", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::SV;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TL", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::TL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("UK", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::UK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("VI", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::VI;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TE", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::TE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TH", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::TH;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TR", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::TR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("XX", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::XX;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ZH", Qt::CaseInsensitive) == 0) {
        m_value = eOAILanguage::ZH;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAILanguage::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAILanguage::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAILanguage::AM:
            val = "AM";
            break;
        case eOAILanguage::AR:
            val = "AR";
            break;
        case eOAILanguage::AZ:
            val = "AZ";
            break;
        case eOAILanguage::BG:
            val = "BG";
            break;
        case eOAILanguage::BN:
            val = "BN";
            break;
        case eOAILanguage::BS:
            val = "BS";
            break;
        case eOAILanguage::CA:
            val = "CA";
            break;
        case eOAILanguage::CS:
            val = "CS";
            break;
        case eOAILanguage::DA:
            val = "DA";
            break;
        case eOAILanguage::DV:
            val = "DV";
            break;
        case eOAILanguage::DZ:
            val = "DZ";
            break;
        case eOAILanguage::DE:
            val = "DE";
            break;
        case eOAILanguage::EL:
            val = "EL";
            break;
        case eOAILanguage::EN:
            val = "EN";
            break;
        case eOAILanguage::ES:
            val = "ES";
            break;
        case eOAILanguage::ET:
            val = "ET";
            break;
        case eOAILanguage::FA:
            val = "FA";
            break;
        case eOAILanguage::FI:
            val = "FI";
            break;
        case eOAILanguage::FR:
            val = "FR";
            break;
        case eOAILanguage::HE:
            val = "HE";
            break;
        case eOAILanguage::HI:
            val = "HI";
            break;
        case eOAILanguage::HR:
            val = "HR";
            break;
        case eOAILanguage::HU:
            val = "HU";
            break;
        case eOAILanguage::HY:
            val = "HY";
            break;
        case eOAILanguage::ID:
            val = "ID";
            break;
        case eOAILanguage::IN:
            val = "IN";
            break;
        case eOAILanguage::IS:
            val = "IS";
            break;
        case eOAILanguage::IT:
            val = "IT";
            break;
        case eOAILanguage::IW:
            val = "IW";
            break;
        case eOAILanguage::JA:
            val = "JA";
            break;
        case eOAILanguage::KA:
            val = "KA";
            break;
        case eOAILanguage::KM:
            val = "KM";
            break;
        case eOAILanguage::KO:
            val = "KO";
            break;
        case eOAILanguage::LO:
            val = "LO";
            break;
        case eOAILanguage::LT:
            val = "LT";
            break;
        case eOAILanguage::LV:
            val = "LV";
            break;
        case eOAILanguage::MK:
            val = "MK";
            break;
        case eOAILanguage::MN:
            val = "MN";
            break;
        case eOAILanguage::MS:
            val = "MS";
            break;
        case eOAILanguage::MY:
            val = "MY";
            break;
        case eOAILanguage::NB:
            val = "NB";
            break;
        case eOAILanguage::NE:
            val = "NE";
            break;
        case eOAILanguage::NL:
            val = "NL";
            break;
        case eOAILanguage::NO:
            val = "NO";
            break;
        case eOAILanguage::PL:
            val = "PL";
            break;
        case eOAILanguage::PT:
            val = "PT";
            break;
        case eOAILanguage::RO:
            val = "RO";
            break;
        case eOAILanguage::RU:
            val = "RU";
            break;
        case eOAILanguage::SK:
            val = "SK";
            break;
        case eOAILanguage::SL:
            val = "SL";
            break;
        case eOAILanguage::SQ:
            val = "SQ";
            break;
        case eOAILanguage::SR:
            val = "SR";
            break;
        case eOAILanguage::SV:
            val = "SV";
            break;
        case eOAILanguage::TL:
            val = "TL";
            break;
        case eOAILanguage::UK:
            val = "UK";
            break;
        case eOAILanguage::VI:
            val = "VI";
            break;
        case eOAILanguage::TE:
            val = "TE";
            break;
        case eOAILanguage::TH:
            val = "TH";
            break;
        case eOAILanguage::TR:
            val = "TR";
            break;
        case eOAILanguage::XX:
            val = "XX";
            break;
        case eOAILanguage::ZH:
            val = "ZH";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAILanguage::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAILanguage::eOAILanguage OAILanguage::getValue() const {
    return m_value;
}

void OAILanguage::setValue(const OAILanguage::eOAILanguage& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAILanguage::isSet() const {
    
    return m_value_isSet;
}

bool OAILanguage::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
