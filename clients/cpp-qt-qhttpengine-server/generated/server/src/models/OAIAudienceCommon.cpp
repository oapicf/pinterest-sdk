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

#include "OAIAudienceCommon.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAudienceCommon::OAIAudienceCommon(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAudienceCommon::OAIAudienceCommon() {
    this->initializeModel();
}

OAIAudienceCommon::~OAIAudienceCommon() {}

void OAIAudienceCommon::initializeModel() {

    m_ad_account_id_isSet = false;
    m_ad_account_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_rule_isSet = false;
    m_rule_isValid = false;
}

void OAIAudienceCommon::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAudienceCommon::fromJsonObject(QJsonObject json) {

    m_ad_account_id_isValid = ::OpenAPI::fromJsonValue(ad_account_id, json[QString("ad_account_id")]);
    m_ad_account_id_isSet = !json[QString("ad_account_id")].isNull() && m_ad_account_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_rule_isValid = ::OpenAPI::fromJsonValue(rule, json[QString("rule")]);
    m_rule_isSet = !json[QString("rule")].isNull() && m_rule_isValid;
}

QString OAIAudienceCommon::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAudienceCommon::asJsonObject() const {
    QJsonObject obj;
    if (m_ad_account_id_isSet) {
        obj.insert(QString("ad_account_id"), ::OpenAPI::toJsonValue(ad_account_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (rule.isSet()) {
        obj.insert(QString("rule"), ::OpenAPI::toJsonValue(rule));
    }
    return obj;
}

QString OAIAudienceCommon::getAdAccountId() const {
    return ad_account_id;
}
void OAIAudienceCommon::setAdAccountId(const QString &ad_account_id) {
    this->ad_account_id = ad_account_id;
    this->m_ad_account_id_isSet = true;
}

bool OAIAudienceCommon::is_ad_account_id_Set() const{
    return m_ad_account_id_isSet;
}

bool OAIAudienceCommon::is_ad_account_id_Valid() const{
    return m_ad_account_id_isValid;
}

QString OAIAudienceCommon::getName() const {
    return name;
}
void OAIAudienceCommon::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIAudienceCommon::is_name_Set() const{
    return m_name_isSet;
}

bool OAIAudienceCommon::is_name_Valid() const{
    return m_name_isValid;
}

OAIAudienceRule OAIAudienceCommon::getRule() const {
    return rule;
}
void OAIAudienceCommon::setRule(const OAIAudienceRule &rule) {
    this->rule = rule;
    this->m_rule_isSet = true;
}

bool OAIAudienceCommon::is_rule_Set() const{
    return m_rule_isSet;
}

bool OAIAudienceCommon::is_rule_Valid() const{
    return m_rule_isValid;
}

bool OAIAudienceCommon::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_ad_account_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (rule.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAudienceCommon::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
