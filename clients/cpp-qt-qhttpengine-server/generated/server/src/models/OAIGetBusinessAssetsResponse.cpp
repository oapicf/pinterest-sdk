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

#include "OAIGetBusinessAssetsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetBusinessAssetsResponse::OAIGetBusinessAssetsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetBusinessAssetsResponse::OAIGetBusinessAssetsResponse() {
    this->initializeModel();
}

OAIGetBusinessAssetsResponse::~OAIGetBusinessAssetsResponse() {}

void OAIGetBusinessAssetsResponse::initializeModel() {

    m_asset_id_isSet = false;
    m_asset_id_isValid = false;

    m_asset_type_isSet = false;
    m_asset_type_isValid = false;

    m_asset_group_info_isSet = false;
    m_asset_group_info_isValid = false;
}

void OAIGetBusinessAssetsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetBusinessAssetsResponse::fromJsonObject(QJsonObject json) {

    m_asset_id_isValid = ::OpenAPI::fromJsonValue(asset_id, json[QString("asset_id")]);
    m_asset_id_isSet = !json[QString("asset_id")].isNull() && m_asset_id_isValid;

    m_asset_type_isValid = ::OpenAPI::fromJsonValue(asset_type, json[QString("asset_type")]);
    m_asset_type_isSet = !json[QString("asset_type")].isNull() && m_asset_type_isValid;

    m_asset_group_info_isValid = ::OpenAPI::fromJsonValue(asset_group_info, json[QString("asset_group_info")]);
    m_asset_group_info_isSet = !json[QString("asset_group_info")].isNull() && m_asset_group_info_isValid;
}

QString OAIGetBusinessAssetsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetBusinessAssetsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_asset_id_isSet) {
        obj.insert(QString("asset_id"), ::OpenAPI::toJsonValue(asset_id));
    }
    if (m_asset_type_isSet) {
        obj.insert(QString("asset_type"), ::OpenAPI::toJsonValue(asset_type));
    }
    if (asset_group_info.isSet()) {
        obj.insert(QString("asset_group_info"), ::OpenAPI::toJsonValue(asset_group_info));
    }
    return obj;
}

QString OAIGetBusinessAssetsResponse::getAssetId() const {
    return asset_id;
}
void OAIGetBusinessAssetsResponse::setAssetId(const QString &asset_id) {
    this->asset_id = asset_id;
    this->m_asset_id_isSet = true;
}

bool OAIGetBusinessAssetsResponse::is_asset_id_Set() const{
    return m_asset_id_isSet;
}

bool OAIGetBusinessAssetsResponse::is_asset_id_Valid() const{
    return m_asset_id_isValid;
}

QString OAIGetBusinessAssetsResponse::getAssetType() const {
    return asset_type;
}
void OAIGetBusinessAssetsResponse::setAssetType(const QString &asset_type) {
    this->asset_type = asset_type;
    this->m_asset_type_isSet = true;
}

bool OAIGetBusinessAssetsResponse::is_asset_type_Set() const{
    return m_asset_type_isSet;
}

bool OAIGetBusinessAssetsResponse::is_asset_type_Valid() const{
    return m_asset_type_isValid;
}

OAIAssetGroupBinding OAIGetBusinessAssetsResponse::getAssetGroupInfo() const {
    return asset_group_info;
}
void OAIGetBusinessAssetsResponse::setAssetGroupInfo(const OAIAssetGroupBinding &asset_group_info) {
    this->asset_group_info = asset_group_info;
    this->m_asset_group_info_isSet = true;
}

bool OAIGetBusinessAssetsResponse::is_asset_group_info_Set() const{
    return m_asset_group_info_isSet;
}

bool OAIGetBusinessAssetsResponse::is_asset_group_info_Valid() const{
    return m_asset_group_info_isValid;
}

bool OAIGetBusinessAssetsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_asset_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_asset_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (asset_group_info.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetBusinessAssetsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
