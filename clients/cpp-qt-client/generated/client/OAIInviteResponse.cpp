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

#include "OAIInviteResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIInviteResponse::OAIInviteResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIInviteResponse::OAIInviteResponse() {
    this->initializeModel();
}

OAIInviteResponse::~OAIInviteResponse() {}

void OAIInviteResponse::initializeModel() {

    m_assets_summary_isSet = false;
    m_assets_summary_isValid = false;

    m_business_roles_isSet = false;
    m_business_roles_isValid = false;

    m_created_by_business_isSet = false;
    m_created_by_business_isValid = false;

    m_created_by_user_isSet = false;
    m_created_by_user_isValid = false;

    m_created_time_isSet = false;
    m_created_time_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_invite_data_isSet = false;
    m_invite_data_isValid = false;

    m_is_received_invite_isSet = false;
    m_is_received_invite_isValid = false;

    m_user_isSet = false;
    m_user_isValid = false;
}

void OAIInviteResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIInviteResponse::fromJsonObject(QJsonObject json) {

    m_assets_summary_isValid = ::OpenAPI::fromJsonValue(m_assets_summary, json[QString("assets_summary")]);
    m_assets_summary_isSet = !json[QString("assets_summary")].isNull() && m_assets_summary_isValid;

    m_business_roles_isValid = ::OpenAPI::fromJsonValue(m_business_roles, json[QString("business_roles")]);
    m_business_roles_isSet = !json[QString("business_roles")].isNull() && m_business_roles_isValid;

    m_created_by_business_isValid = ::OpenAPI::fromJsonValue(m_created_by_business, json[QString("created_by_business")]);
    m_created_by_business_isSet = !json[QString("created_by_business")].isNull() && m_created_by_business_isValid;

    m_created_by_user_isValid = ::OpenAPI::fromJsonValue(m_created_by_user, json[QString("created_by_user")]);
    m_created_by_user_isSet = !json[QString("created_by_user")].isNull() && m_created_by_user_isValid;

    m_created_time_isValid = ::OpenAPI::fromJsonValue(m_created_time, json[QString("created_time")]);
    m_created_time_isSet = !json[QString("created_time")].isNull() && m_created_time_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_invite_data_isValid = ::OpenAPI::fromJsonValue(m_invite_data, json[QString("invite_data")]);
    m_invite_data_isSet = !json[QString("invite_data")].isNull() && m_invite_data_isValid;

    m_is_received_invite_isValid = ::OpenAPI::fromJsonValue(m_is_received_invite, json[QString("is_received_invite")]);
    m_is_received_invite_isSet = !json[QString("is_received_invite")].isNull() && m_is_received_invite_isValid;

    m_user_isValid = ::OpenAPI::fromJsonValue(m_user, json[QString("user")]);
    m_user_isSet = !json[QString("user")].isNull() && m_user_isValid;
}

QString OAIInviteResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIInviteResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_assets_summary.isSet()) {
        obj.insert(QString("assets_summary"), ::OpenAPI::toJsonValue(m_assets_summary));
    }
    if (m_business_roles.size() > 0) {
        obj.insert(QString("business_roles"), ::OpenAPI::toJsonValue(m_business_roles));
    }
    if (m_created_by_business.isSet()) {
        obj.insert(QString("created_by_business"), ::OpenAPI::toJsonValue(m_created_by_business));
    }
    if (m_created_by_user.isSet()) {
        obj.insert(QString("created_by_user"), ::OpenAPI::toJsonValue(m_created_by_user));
    }
    if (m_created_time_isSet) {
        obj.insert(QString("created_time"), ::OpenAPI::toJsonValue(m_created_time));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_invite_data.isSet()) {
        obj.insert(QString("invite_data"), ::OpenAPI::toJsonValue(m_invite_data));
    }
    if (m_is_received_invite_isSet) {
        obj.insert(QString("is_received_invite"), ::OpenAPI::toJsonValue(m_is_received_invite));
    }
    if (m_user.isSet()) {
        obj.insert(QString("user"), ::OpenAPI::toJsonValue(m_user));
    }
    return obj;
}

OAIInviteAssetsSummary OAIInviteResponse::getAssetsSummary() const {
    return m_assets_summary;
}
void OAIInviteResponse::setAssetsSummary(const OAIInviteAssetsSummary &assets_summary) {
    m_assets_summary = assets_summary;
    m_assets_summary_isSet = true;
}

bool OAIInviteResponse::is_assets_summary_Set() const{
    return m_assets_summary_isSet;
}

bool OAIInviteResponse::is_assets_summary_Valid() const{
    return m_assets_summary_isValid;
}

QList<QString> OAIInviteResponse::getBusinessRoles() const {
    return m_business_roles;
}
void OAIInviteResponse::setBusinessRoles(const QList<QString> &business_roles) {
    m_business_roles = business_roles;
    m_business_roles_isSet = true;
}

bool OAIInviteResponse::is_business_roles_Set() const{
    return m_business_roles_isSet;
}

bool OAIInviteResponse::is_business_roles_Valid() const{
    return m_business_roles_isValid;
}

OAIBusinessAccessUserSummary OAIInviteResponse::getCreatedByBusiness() const {
    return m_created_by_business;
}
void OAIInviteResponse::setCreatedByBusiness(const OAIBusinessAccessUserSummary &created_by_business) {
    m_created_by_business = created_by_business;
    m_created_by_business_isSet = true;
}

bool OAIInviteResponse::is_created_by_business_Set() const{
    return m_created_by_business_isSet;
}

bool OAIInviteResponse::is_created_by_business_Valid() const{
    return m_created_by_business_isValid;
}

OAIBusinessAccessUserSummary OAIInviteResponse::getCreatedByUser() const {
    return m_created_by_user;
}
void OAIInviteResponse::setCreatedByUser(const OAIBusinessAccessUserSummary &created_by_user) {
    m_created_by_user = created_by_user;
    m_created_by_user_isSet = true;
}

bool OAIInviteResponse::is_created_by_user_Set() const{
    return m_created_by_user_isSet;
}

bool OAIInviteResponse::is_created_by_user_Valid() const{
    return m_created_by_user_isValid;
}

qint32 OAIInviteResponse::getCreatedTime() const {
    return m_created_time;
}
void OAIInviteResponse::setCreatedTime(const qint32 &created_time) {
    m_created_time = created_time;
    m_created_time_isSet = true;
}

bool OAIInviteResponse::is_created_time_Set() const{
    return m_created_time_isSet;
}

bool OAIInviteResponse::is_created_time_Valid() const{
    return m_created_time_isValid;
}

QString OAIInviteResponse::getId() const {
    return m_id;
}
void OAIInviteResponse::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIInviteResponse::is_id_Set() const{
    return m_id_isSet;
}

bool OAIInviteResponse::is_id_Valid() const{
    return m_id_isValid;
}

OAIBaseInviteDataResponse_invite_data OAIInviteResponse::getInviteData() const {
    return m_invite_data;
}
void OAIInviteResponse::setInviteData(const OAIBaseInviteDataResponse_invite_data &invite_data) {
    m_invite_data = invite_data;
    m_invite_data_isSet = true;
}

bool OAIInviteResponse::is_invite_data_Set() const{
    return m_invite_data_isSet;
}

bool OAIInviteResponse::is_invite_data_Valid() const{
    return m_invite_data_isValid;
}

bool OAIInviteResponse::isIsReceivedInvite() const {
    return m_is_received_invite;
}
void OAIInviteResponse::setIsReceivedInvite(const bool &is_received_invite) {
    m_is_received_invite = is_received_invite;
    m_is_received_invite_isSet = true;
}

bool OAIInviteResponse::is_is_received_invite_Set() const{
    return m_is_received_invite_isSet;
}

bool OAIInviteResponse::is_is_received_invite_Valid() const{
    return m_is_received_invite_isValid;
}

OAIBusinessAccessUserSummary OAIInviteResponse::getUser() const {
    return m_user;
}
void OAIInviteResponse::setUser(const OAIBusinessAccessUserSummary &user) {
    m_user = user;
    m_user_isSet = true;
}

bool OAIInviteResponse::is_user_Set() const{
    return m_user_isSet;
}

bool OAIInviteResponse::is_user_Valid() const{
    return m_user_isValid;
}

bool OAIInviteResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_assets_summary.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_business_roles.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_by_business.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_by_user.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_invite_data.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_received_invite_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIInviteResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
