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

#include "OAIUserWebsiteSummary.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUserWebsiteSummary::OAIUserWebsiteSummary(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUserWebsiteSummary::OAIUserWebsiteSummary() {
    this->initializeModel();
}

OAIUserWebsiteSummary::~OAIUserWebsiteSummary() {}

void OAIUserWebsiteSummary::initializeModel() {

    m_website_isSet = false;
    m_website_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_verified_at_isSet = false;
    m_verified_at_isValid = false;
}

void OAIUserWebsiteSummary::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUserWebsiteSummary::fromJsonObject(QJsonObject json) {

    m_website_isValid = ::OpenAPI::fromJsonValue(website, json[QString("website")]);
    m_website_isSet = !json[QString("website")].isNull() && m_website_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_verified_at_isValid = ::OpenAPI::fromJsonValue(verified_at, json[QString("verified_at")]);
    m_verified_at_isSet = !json[QString("verified_at")].isNull() && m_verified_at_isValid;
}

QString OAIUserWebsiteSummary::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUserWebsiteSummary::asJsonObject() const {
    QJsonObject obj;
    if (m_website_isSet) {
        obj.insert(QString("website"), ::OpenAPI::toJsonValue(website));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_verified_at_isSet) {
        obj.insert(QString("verified_at"), ::OpenAPI::toJsonValue(verified_at));
    }
    return obj;
}

QString OAIUserWebsiteSummary::getWebsite() const {
    return website;
}
void OAIUserWebsiteSummary::setWebsite(const QString &website) {
    this->website = website;
    this->m_website_isSet = true;
}

bool OAIUserWebsiteSummary::is_website_Set() const{
    return m_website_isSet;
}

bool OAIUserWebsiteSummary::is_website_Valid() const{
    return m_website_isValid;
}

QString OAIUserWebsiteSummary::getStatus() const {
    return status;
}
void OAIUserWebsiteSummary::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIUserWebsiteSummary::is_status_Set() const{
    return m_status_isSet;
}

bool OAIUserWebsiteSummary::is_status_Valid() const{
    return m_status_isValid;
}

QString OAIUserWebsiteSummary::getVerifiedAt() const {
    return verified_at;
}
void OAIUserWebsiteSummary::setVerifiedAt(const QString &verified_at) {
    this->verified_at = verified_at;
    this->m_verified_at_isSet = true;
}

bool OAIUserWebsiteSummary::is_verified_at_Set() const{
    return m_verified_at_isSet;
}

bool OAIUserWebsiteSummary::is_verified_at_Valid() const{
    return m_verified_at_isValid;
}

bool OAIUserWebsiteSummary::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_website_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_verified_at_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUserWebsiteSummary::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI