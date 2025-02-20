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

#include "OAICampaignId.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICampaignId::OAICampaignId(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICampaignId::OAICampaignId() {
    this->initializeModel();
}

OAICampaignId::~OAICampaignId() {}

void OAICampaignId::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;
}

void OAICampaignId::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICampaignId::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;
}

QString OAICampaignId::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICampaignId::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    return obj;
}

QString OAICampaignId::getId() const {
    return m_id;
}
void OAICampaignId::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAICampaignId::is_id_Set() const{
    return m_id_isSet;
}

bool OAICampaignId::is_id_Valid() const{
    return m_id_isValid;
}

bool OAICampaignId::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICampaignId::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
