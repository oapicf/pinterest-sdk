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

#include "OAISharedAudienceResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISharedAudienceResponse::OAISharedAudienceResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISharedAudienceResponse::OAISharedAudienceResponse() {
    this->initializeModel();
}

OAISharedAudienceResponse::~OAISharedAudienceResponse() {}

void OAISharedAudienceResponse::initializeModel() {

    m_audience_id_isSet = false;
    m_audience_id_isValid = false;

    m_permissions_isSet = false;
    m_permissions_isValid = false;

    m_recipient_account_ids_isSet = false;
    m_recipient_account_ids_isValid = false;
}

void OAISharedAudienceResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISharedAudienceResponse::fromJsonObject(QJsonObject json) {

    m_audience_id_isValid = ::OpenAPI::fromJsonValue(audience_id, json[QString("audience_id")]);
    m_audience_id_isSet = !json[QString("audience_id")].isNull() && m_audience_id_isValid;

    m_permissions_isValid = ::OpenAPI::fromJsonValue(permissions, json[QString("permissions")]);
    m_permissions_isSet = !json[QString("permissions")].isNull() && m_permissions_isValid;

    m_recipient_account_ids_isValid = ::OpenAPI::fromJsonValue(recipient_account_ids, json[QString("recipient_account_ids")]);
    m_recipient_account_ids_isSet = !json[QString("recipient_account_ids")].isNull() && m_recipient_account_ids_isValid;
}

QString OAISharedAudienceResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISharedAudienceResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_audience_id_isSet) {
        obj.insert(QString("audience_id"), ::OpenAPI::toJsonValue(audience_id));
    }
    if (permissions.size() > 0) {
        obj.insert(QString("permissions"), ::OpenAPI::toJsonValue(permissions));
    }
    if (recipient_account_ids.size() > 0) {
        obj.insert(QString("recipient_account_ids"), ::OpenAPI::toJsonValue(recipient_account_ids));
    }
    return obj;
}

QString OAISharedAudienceResponse::getAudienceId() const {
    return audience_id;
}
void OAISharedAudienceResponse::setAudienceId(const QString &audience_id) {
    this->audience_id = audience_id;
    this->m_audience_id_isSet = true;
}

bool OAISharedAudienceResponse::is_audience_id_Set() const{
    return m_audience_id_isSet;
}

bool OAISharedAudienceResponse::is_audience_id_Valid() const{
    return m_audience_id_isValid;
}

QList<OAIRole> OAISharedAudienceResponse::getPermissions() const {
    return permissions;
}
void OAISharedAudienceResponse::setPermissions(const QList<OAIRole> &permissions) {
    this->permissions = permissions;
    this->m_permissions_isSet = true;
}

bool OAISharedAudienceResponse::is_permissions_Set() const{
    return m_permissions_isSet;
}

bool OAISharedAudienceResponse::is_permissions_Valid() const{
    return m_permissions_isValid;
}

QList<QString> OAISharedAudienceResponse::getRecipientAccountIds() const {
    return recipient_account_ids;
}
void OAISharedAudienceResponse::setRecipientAccountIds(const QList<QString> &recipient_account_ids) {
    this->recipient_account_ids = recipient_account_ids;
    this->m_recipient_account_ids_isSet = true;
}

bool OAISharedAudienceResponse::is_recipient_account_ids_Set() const{
    return m_recipient_account_ids_isSet;
}

bool OAISharedAudienceResponse::is_recipient_account_ids_Valid() const{
    return m_recipient_account_ids_isValid;
}

bool OAISharedAudienceResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_audience_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (permissions.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (recipient_account_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISharedAudienceResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
