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

#include "OAIRole.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRole::OAIRole(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRole::OAIRole() {
    this->initializeModel();
}

OAIRole::~OAIRole() {}

void OAIRole::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIRole::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIRole::fromJson(QString jsonString) {
    
    if ( jsonString.compare("UNKNOWN", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::UNKNOWN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("OWNER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::OWNER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADMIN", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::ADMIN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ANALYST", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::ANALYST;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SOS_READER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::SOS_READER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("FINANCE_MANAGER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::FINANCE_MANAGER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AUDIENCE_MANAGER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::AUDIENCE_MANAGER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CAMPAIGN_MANAGER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::CAMPAIGN_MANAGER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CATALOGS_MANAGER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::CATALOGS_MANAGER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RESTRICTED_OWNER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::RESTRICTED_OWNER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PROFILE_MANAGER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::PROFILE_MANAGER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PROFILE_PUBLISHER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::PROFILE_PUBLISHER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RESOURCE_PINNER_LIST_OWNER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::RESOURCE_PINNER_LIST_OWNER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RESOURCE_PINNER_LIST_READER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::RESOURCE_PINNER_LIST_READER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BIZ_PINNER_LIST_SHARER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::BIZ_PINNER_LIST_SHARER;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("RESOURCE_CONVERSION_TAGS_READER", Qt::CaseInsensitive) == 0) {
        m_value = eOAIRole::RESOURCE_CONVERSION_TAGS_READER;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIRole::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIRole::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIRole::UNKNOWN:
            val = "UNKNOWN";
            break;
        case eOAIRole::OWNER:
            val = "OWNER";
            break;
        case eOAIRole::ADMIN:
            val = "ADMIN";
            break;
        case eOAIRole::ANALYST:
            val = "ANALYST";
            break;
        case eOAIRole::SOS_READER:
            val = "SOS_READER";
            break;
        case eOAIRole::FINANCE_MANAGER:
            val = "FINANCE_MANAGER";
            break;
        case eOAIRole::AUDIENCE_MANAGER:
            val = "AUDIENCE_MANAGER";
            break;
        case eOAIRole::CAMPAIGN_MANAGER:
            val = "CAMPAIGN_MANAGER";
            break;
        case eOAIRole::CATALOGS_MANAGER:
            val = "CATALOGS_MANAGER";
            break;
        case eOAIRole::RESTRICTED_OWNER:
            val = "RESTRICTED_OWNER";
            break;
        case eOAIRole::PROFILE_MANAGER:
            val = "PROFILE_MANAGER";
            break;
        case eOAIRole::PROFILE_PUBLISHER:
            val = "PROFILE_PUBLISHER";
            break;
        case eOAIRole::RESOURCE_PINNER_LIST_OWNER:
            val = "RESOURCE_PINNER_LIST_OWNER";
            break;
        case eOAIRole::RESOURCE_PINNER_LIST_READER:
            val = "RESOURCE_PINNER_LIST_READER";
            break;
        case eOAIRole::BIZ_PINNER_LIST_SHARER:
            val = "BIZ_PINNER_LIST_SHARER";
            break;
        case eOAIRole::RESOURCE_CONVERSION_TAGS_READER:
            val = "RESOURCE_CONVERSION_TAGS_READER";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIRole::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIRole::eOAIRole OAIRole::getValue() const {
    return m_value;
}

void OAIRole::setValue(const OAIRole::eOAIRole& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIRole::isSet() const {
    
    return m_value_isSet;
}

bool OAIRole::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI