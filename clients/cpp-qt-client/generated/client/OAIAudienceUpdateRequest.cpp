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

#include "OAIAudienceUpdateRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAudienceUpdateRequest::OAIAudienceUpdateRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAudienceUpdateRequest::OAIAudienceUpdateRequest() {
    this->initializeModel();
}

OAIAudienceUpdateRequest::~OAIAudienceUpdateRequest() {}

void OAIAudienceUpdateRequest::initializeModel() {

    m_ad_account_id_isSet = false;
    m_ad_account_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_rule_isSet = false;
    m_rule_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_operation_type_isSet = false;
    m_operation_type_isValid = false;
}

void OAIAudienceUpdateRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAudienceUpdateRequest::fromJsonObject(QJsonObject json) {

    m_ad_account_id_isValid = ::OpenAPI::fromJsonValue(m_ad_account_id, json[QString("ad_account_id")]);
    m_ad_account_id_isSet = !json[QString("ad_account_id")].isNull() && m_ad_account_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_rule_isValid = ::OpenAPI::fromJsonValue(m_rule, json[QString("rule")]);
    m_rule_isSet = !json[QString("rule")].isNull() && m_rule_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_operation_type_isValid = ::OpenAPI::fromJsonValue(m_operation_type, json[QString("operation_type")]);
    m_operation_type_isSet = !json[QString("operation_type")].isNull() && m_operation_type_isValid;
}

QString OAIAudienceUpdateRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAudienceUpdateRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_ad_account_id_isSet) {
        obj.insert(QString("ad_account_id"), ::OpenAPI::toJsonValue(m_ad_account_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_rule.isSet()) {
        obj.insert(QString("rule"), ::OpenAPI::toJsonValue(m_rule));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    if (m_operation_type.isSet()) {
        obj.insert(QString("operation_type"), ::OpenAPI::toJsonValue(m_operation_type));
    }
    return obj;
}

QString OAIAudienceUpdateRequest::getAdAccountId() const {
    return m_ad_account_id;
}
void OAIAudienceUpdateRequest::setAdAccountId(const QString &ad_account_id) {
    m_ad_account_id = ad_account_id;
    m_ad_account_id_isSet = true;
}

bool OAIAudienceUpdateRequest::is_ad_account_id_Set() const{
    return m_ad_account_id_isSet;
}

bool OAIAudienceUpdateRequest::is_ad_account_id_Valid() const{
    return m_ad_account_id_isValid;
}

QString OAIAudienceUpdateRequest::getName() const {
    return m_name;
}
void OAIAudienceUpdateRequest::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIAudienceUpdateRequest::is_name_Set() const{
    return m_name_isSet;
}

bool OAIAudienceUpdateRequest::is_name_Valid() const{
    return m_name_isValid;
}

OAIAudienceRule OAIAudienceUpdateRequest::getRule() const {
    return m_rule;
}
void OAIAudienceUpdateRequest::setRule(const OAIAudienceRule &rule) {
    m_rule = rule;
    m_rule_isSet = true;
}

bool OAIAudienceUpdateRequest::is_rule_Set() const{
    return m_rule_isSet;
}

bool OAIAudienceUpdateRequest::is_rule_Valid() const{
    return m_rule_isValid;
}

QString OAIAudienceUpdateRequest::getDescription() const {
    return m_description;
}
void OAIAudienceUpdateRequest::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAIAudienceUpdateRequest::is_description_Set() const{
    return m_description_isSet;
}

bool OAIAudienceUpdateRequest::is_description_Valid() const{
    return m_description_isValid;
}

OAIAudienceUpdateOperationType OAIAudienceUpdateRequest::getOperationType() const {
    return m_operation_type;
}
void OAIAudienceUpdateRequest::setOperationType(const OAIAudienceUpdateOperationType &operation_type) {
    m_operation_type = operation_type;
    m_operation_type_isSet = true;
}

bool OAIAudienceUpdateRequest::is_operation_type_Set() const{
    return m_operation_type_isSet;
}

bool OAIAudienceUpdateRequest::is_operation_type_Valid() const{
    return m_operation_type_isValid;
}

bool OAIAudienceUpdateRequest::isSet() const {
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

        if (m_rule.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_operation_type.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAudienceUpdateRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
