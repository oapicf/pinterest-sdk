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

#include "OAICurrency.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICurrency::OAICurrency(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICurrency::OAICurrency() {
    this->initializeModel();
}

OAICurrency::~OAICurrency() {}

void OAICurrency::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAICurrency::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAICurrency::fromJson(QString jsonString) {
    
    if ( jsonString.compare("UNK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::UNK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("USD", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::USD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("GBP", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::GBP;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CAD", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::CAD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("EUR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::EUR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AUD", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::AUD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NZD", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::NZD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SEK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::SEK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ILS", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::ILS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CHF", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::CHF;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HKD", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::HKD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("JPY", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::JPY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SGD", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::SGD;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("KRW", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::KRW;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("NOK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::NOK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DKK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::DKK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PLN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::PLN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RON", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::RON;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("HUF", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::HUF;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CZK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::CZK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BRL", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::BRL;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MXN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::MXN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ARS", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::ARS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CLP", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::CLP;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("COP", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::COP;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("INR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::INR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TRY", Qt::CaseInsensitive) == 0) {
        m_value = eOAICurrency::TRY;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAICurrency::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAICurrency::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAICurrency::UNK:
            val = "UNK";
            break;
        case eOAICurrency::USD:
            val = "USD";
            break;
        case eOAICurrency::GBP:
            val = "GBP";
            break;
        case eOAICurrency::CAD:
            val = "CAD";
            break;
        case eOAICurrency::EUR:
            val = "EUR";
            break;
        case eOAICurrency::AUD:
            val = "AUD";
            break;
        case eOAICurrency::NZD:
            val = "NZD";
            break;
        case eOAICurrency::SEK:
            val = "SEK";
            break;
        case eOAICurrency::ILS:
            val = "ILS";
            break;
        case eOAICurrency::CHF:
            val = "CHF";
            break;
        case eOAICurrency::HKD:
            val = "HKD";
            break;
        case eOAICurrency::JPY:
            val = "JPY";
            break;
        case eOAICurrency::SGD:
            val = "SGD";
            break;
        case eOAICurrency::KRW:
            val = "KRW";
            break;
        case eOAICurrency::NOK:
            val = "NOK";
            break;
        case eOAICurrency::DKK:
            val = "DKK";
            break;
        case eOAICurrency::PLN:
            val = "PLN";
            break;
        case eOAICurrency::RON:
            val = "RON";
            break;
        case eOAICurrency::HUF:
            val = "HUF";
            break;
        case eOAICurrency::CZK:
            val = "CZK";
            break;
        case eOAICurrency::BRL:
            val = "BRL";
            break;
        case eOAICurrency::MXN:
            val = "MXN";
            break;
        case eOAICurrency::ARS:
            val = "ARS";
            break;
        case eOAICurrency::CLP:
            val = "CLP";
            break;
        case eOAICurrency::COP:
            val = "COP";
            break;
        case eOAICurrency::INR:
            val = "INR";
            break;
        case eOAICurrency::TRY:
            val = "TRY";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAICurrency::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAICurrency::eOAICurrency OAICurrency::getValue() const {
    return m_value;
}

void OAICurrency::setValue(const OAICurrency::eOAICurrency& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAICurrency::isSet() const {
    
    return m_value_isSet;
}

bool OAICurrency::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
