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

#include "OAIDeletePartnersResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIDeletePartnersResponse::OAIDeletePartnersResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIDeletePartnersResponse::OAIDeletePartnersResponse() {
    this->initializeModel();
}

OAIDeletePartnersResponse::~OAIDeletePartnersResponse() {}

void OAIDeletePartnersResponse::initializeModel() {

    m_deleted_partners_isSet = false;
    m_deleted_partners_isValid = false;
}

void OAIDeletePartnersResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIDeletePartnersResponse::fromJsonObject(QJsonObject json) {

    m_deleted_partners_isValid = ::OpenAPI::fromJsonValue(m_deleted_partners, json[QString("deleted_partners")]);
    m_deleted_partners_isSet = !json[QString("deleted_partners")].isNull() && m_deleted_partners_isValid;
}

QString OAIDeletePartnersResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIDeletePartnersResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_deleted_partners.size() > 0) {
        obj.insert(QString("deleted_partners"), ::OpenAPI::toJsonValue(m_deleted_partners));
    }
    return obj;
}

QList<QString> OAIDeletePartnersResponse::getDeletedPartners() const {
    return m_deleted_partners;
}
void OAIDeletePartnersResponse::setDeletedPartners(const QList<QString> &deleted_partners) {
    m_deleted_partners = deleted_partners;
    m_deleted_partners_isSet = true;
}

bool OAIDeletePartnersResponse::is_deleted_partners_Set() const{
    return m_deleted_partners_isSet;
}

bool OAIDeletePartnersResponse::is_deleted_partners_Valid() const{
    return m_deleted_partners_isValid;
}

bool OAIDeletePartnersResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_deleted_partners.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIDeletePartnersResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
