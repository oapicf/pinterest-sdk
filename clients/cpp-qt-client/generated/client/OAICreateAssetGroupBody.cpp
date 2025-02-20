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

#include "OAICreateAssetGroupBody.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateAssetGroupBody::OAICreateAssetGroupBody(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateAssetGroupBody::OAICreateAssetGroupBody() {
    this->initializeModel();
}

OAICreateAssetGroupBody::~OAICreateAssetGroupBody() {}

void OAICreateAssetGroupBody::initializeModel() {

    m_asset_group_name_isSet = false;
    m_asset_group_name_isValid = false;

    m_asset_group_description_isSet = false;
    m_asset_group_description_isValid = false;

    m_asset_group_types_isSet = false;
    m_asset_group_types_isValid = false;
}

void OAICreateAssetGroupBody::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateAssetGroupBody::fromJsonObject(QJsonObject json) {

    m_asset_group_name_isValid = ::OpenAPI::fromJsonValue(m_asset_group_name, json[QString("asset_group_name")]);
    m_asset_group_name_isSet = !json[QString("asset_group_name")].isNull() && m_asset_group_name_isValid;

    m_asset_group_description_isValid = ::OpenAPI::fromJsonValue(m_asset_group_description, json[QString("asset_group_description")]);
    m_asset_group_description_isSet = !json[QString("asset_group_description")].isNull() && m_asset_group_description_isValid;

    m_asset_group_types_isValid = ::OpenAPI::fromJsonValue(m_asset_group_types, json[QString("asset_group_types")]);
    m_asset_group_types_isSet = !json[QString("asset_group_types")].isNull() && m_asset_group_types_isValid;
}

QString OAICreateAssetGroupBody::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateAssetGroupBody::asJsonObject() const {
    QJsonObject obj;
    if (m_asset_group_name_isSet) {
        obj.insert(QString("asset_group_name"), ::OpenAPI::toJsonValue(m_asset_group_name));
    }
    if (m_asset_group_description_isSet) {
        obj.insert(QString("asset_group_description"), ::OpenAPI::toJsonValue(m_asset_group_description));
    }
    if (m_asset_group_types.size() > 0) {
        obj.insert(QString("asset_group_types"), ::OpenAPI::toJsonValue(m_asset_group_types));
    }
    return obj;
}

QString OAICreateAssetGroupBody::getAssetGroupName() const {
    return m_asset_group_name;
}
void OAICreateAssetGroupBody::setAssetGroupName(const QString &asset_group_name) {
    m_asset_group_name = asset_group_name;
    m_asset_group_name_isSet = true;
}

bool OAICreateAssetGroupBody::is_asset_group_name_Set() const{
    return m_asset_group_name_isSet;
}

bool OAICreateAssetGroupBody::is_asset_group_name_Valid() const{
    return m_asset_group_name_isValid;
}

QString OAICreateAssetGroupBody::getAssetGroupDescription() const {
    return m_asset_group_description;
}
void OAICreateAssetGroupBody::setAssetGroupDescription(const QString &asset_group_description) {
    m_asset_group_description = asset_group_description;
    m_asset_group_description_isSet = true;
}

bool OAICreateAssetGroupBody::is_asset_group_description_Set() const{
    return m_asset_group_description_isSet;
}

bool OAICreateAssetGroupBody::is_asset_group_description_Valid() const{
    return m_asset_group_description_isValid;
}

QList<OAIAssetGroupType> OAICreateAssetGroupBody::getAssetGroupTypes() const {
    return m_asset_group_types;
}
void OAICreateAssetGroupBody::setAssetGroupTypes(const QList<OAIAssetGroupType> &asset_group_types) {
    m_asset_group_types = asset_group_types;
    m_asset_group_types_isSet = true;
}

bool OAICreateAssetGroupBody::is_asset_group_types_Set() const{
    return m_asset_group_types_isSet;
}

bool OAICreateAssetGroupBody::is_asset_group_types_Valid() const{
    return m_asset_group_types_isValid;
}

bool OAICreateAssetGroupBody::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_asset_group_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_asset_group_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_asset_group_types.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateAssetGroupBody::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_asset_group_name_isValid && m_asset_group_description_isValid && m_asset_group_types_isValid && true;
}

} // namespace OpenAPI
