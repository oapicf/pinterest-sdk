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

#include "OAIUpdateMemberResult.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateMemberResult::OAIUpdateMemberResult(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateMemberResult::OAIUpdateMemberResult() {
    this->initializeModel();
}

OAIUpdateMemberResult::~OAIUpdateMemberResult() {}

void OAIUpdateMemberResult::initializeModel() {

    m_business_role_isSet = false;
    m_business_role_isValid = false;

    m_member_id_isSet = false;
    m_member_id_isValid = false;
}

void OAIUpdateMemberResult::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateMemberResult::fromJsonObject(QJsonObject json) {

    m_business_role_isValid = ::OpenAPI::fromJsonValue(m_business_role, json[QString("business_role")]);
    m_business_role_isSet = !json[QString("business_role")].isNull() && m_business_role_isValid;

    m_member_id_isValid = ::OpenAPI::fromJsonValue(m_member_id, json[QString("member_id")]);
    m_member_id_isSet = !json[QString("member_id")].isNull() && m_member_id_isValid;
}

QString OAIUpdateMemberResult::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateMemberResult::asJsonObject() const {
    QJsonObject obj;
    if (m_business_role_isSet) {
        obj.insert(QString("business_role"), ::OpenAPI::toJsonValue(m_business_role));
    }
    if (m_member_id_isSet) {
        obj.insert(QString("member_id"), ::OpenAPI::toJsonValue(m_member_id));
    }
    return obj;
}

QString OAIUpdateMemberResult::getBusinessRole() const {
    return m_business_role;
}
void OAIUpdateMemberResult::setBusinessRole(const QString &business_role) {
    m_business_role = business_role;
    m_business_role_isSet = true;
}

bool OAIUpdateMemberResult::is_business_role_Set() const{
    return m_business_role_isSet;
}

bool OAIUpdateMemberResult::is_business_role_Valid() const{
    return m_business_role_isValid;
}

QString OAIUpdateMemberResult::getMemberId() const {
    return m_member_id;
}
void OAIUpdateMemberResult::setMemberId(const QString &member_id) {
    m_member_id = member_id;
    m_member_id_isSet = true;
}

bool OAIUpdateMemberResult::is_member_id_Set() const{
    return m_member_id_isSet;
}

bool OAIUpdateMemberResult::is_member_id_Valid() const{
    return m_member_id_isValid;
}

bool OAIUpdateMemberResult::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_business_role_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_member_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateMemberResult::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
