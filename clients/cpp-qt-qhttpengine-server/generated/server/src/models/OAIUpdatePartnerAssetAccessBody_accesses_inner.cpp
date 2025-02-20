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

#include "OAIUpdatePartnerAssetAccessBody_accesses_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdatePartnerAssetAccessBody_accesses_inner::OAIUpdatePartnerAssetAccessBody_accesses_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdatePartnerAssetAccessBody_accesses_inner::OAIUpdatePartnerAssetAccessBody_accesses_inner() {
    this->initializeModel();
}

OAIUpdatePartnerAssetAccessBody_accesses_inner::~OAIUpdatePartnerAssetAccessBody_accesses_inner() {}

void OAIUpdatePartnerAssetAccessBody_accesses_inner::initializeModel() {

    m_partner_id_isSet = false;
    m_partner_id_isValid = false;

    m_asset_id_isSet = false;
    m_asset_id_isValid = false;

    m_permissions_isSet = false;
    m_permissions_isValid = false;
}

void OAIUpdatePartnerAssetAccessBody_accesses_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdatePartnerAssetAccessBody_accesses_inner::fromJsonObject(QJsonObject json) {

    m_partner_id_isValid = ::OpenAPI::fromJsonValue(partner_id, json[QString("partner_id")]);
    m_partner_id_isSet = !json[QString("partner_id")].isNull() && m_partner_id_isValid;

    m_asset_id_isValid = ::OpenAPI::fromJsonValue(asset_id, json[QString("asset_id")]);
    m_asset_id_isSet = !json[QString("asset_id")].isNull() && m_asset_id_isValid;

    m_permissions_isValid = ::OpenAPI::fromJsonValue(permissions, json[QString("permissions")]);
    m_permissions_isSet = !json[QString("permissions")].isNull() && m_permissions_isValid;
}

QString OAIUpdatePartnerAssetAccessBody_accesses_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdatePartnerAssetAccessBody_accesses_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_partner_id_isSet) {
        obj.insert(QString("partner_id"), ::OpenAPI::toJsonValue(partner_id));
    }
    if (m_asset_id_isSet) {
        obj.insert(QString("asset_id"), ::OpenAPI::toJsonValue(asset_id));
    }
    if (permissions.size() > 0) {
        obj.insert(QString("permissions"), ::OpenAPI::toJsonValue(permissions));
    }
    return obj;
}

QString OAIUpdatePartnerAssetAccessBody_accesses_inner::getPartnerId() const {
    return partner_id;
}
void OAIUpdatePartnerAssetAccessBody_accesses_inner::setPartnerId(const QString &partner_id) {
    this->partner_id = partner_id;
    this->m_partner_id_isSet = true;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::is_partner_id_Set() const{
    return m_partner_id_isSet;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::is_partner_id_Valid() const{
    return m_partner_id_isValid;
}

QString OAIUpdatePartnerAssetAccessBody_accesses_inner::getAssetId() const {
    return asset_id;
}
void OAIUpdatePartnerAssetAccessBody_accesses_inner::setAssetId(const QString &asset_id) {
    this->asset_id = asset_id;
    this->m_asset_id_isSet = true;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::is_asset_id_Set() const{
    return m_asset_id_isSet;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::is_asset_id_Valid() const{
    return m_asset_id_isValid;
}

QList<OAIPermissions> OAIUpdatePartnerAssetAccessBody_accesses_inner::getPermissions() const {
    return permissions;
}
void OAIUpdatePartnerAssetAccessBody_accesses_inner::setPermissions(const QList<OAIPermissions> &permissions) {
    this->permissions = permissions;
    this->m_permissions_isSet = true;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::is_permissions_Set() const{
    return m_permissions_isSet;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::is_permissions_Valid() const{
    return m_permissions_isValid;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_partner_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_asset_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (permissions.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdatePartnerAssetAccessBody_accesses_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_partner_id_isValid && m_asset_id_isValid && m_permissions_isValid && true;
}

} // namespace OpenAPI
