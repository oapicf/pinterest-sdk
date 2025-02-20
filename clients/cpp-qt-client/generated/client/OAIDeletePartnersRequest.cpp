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

#include "OAIDeletePartnersRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIDeletePartnersRequest::OAIDeletePartnersRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIDeletePartnersRequest::OAIDeletePartnersRequest() {
    this->initializeModel();
}

OAIDeletePartnersRequest::~OAIDeletePartnersRequest() {}

void OAIDeletePartnersRequest::initializeModel() {

    m_partner_ids_isSet = false;
    m_partner_ids_isValid = false;

    m_partner_type_isSet = false;
    m_partner_type_isValid = false;
}

void OAIDeletePartnersRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIDeletePartnersRequest::fromJsonObject(QJsonObject json) {

    m_partner_ids_isValid = ::OpenAPI::fromJsonValue(m_partner_ids, json[QString("partner_ids")]);
    m_partner_ids_isSet = !json[QString("partner_ids")].isNull() && m_partner_ids_isValid;

    m_partner_type_isValid = ::OpenAPI::fromJsonValue(m_partner_type, json[QString("partner_type")]);
    m_partner_type_isSet = !json[QString("partner_type")].isNull() && m_partner_type_isValid;
}

QString OAIDeletePartnersRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIDeletePartnersRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_partner_ids.size() > 0) {
        obj.insert(QString("partner_ids"), ::OpenAPI::toJsonValue(m_partner_ids));
    }
    if (m_partner_type_isSet) {
        obj.insert(QString("partner_type"), ::OpenAPI::toJsonValue(m_partner_type));
    }
    return obj;
}

QList<QString> OAIDeletePartnersRequest::getPartnerIds() const {
    return m_partner_ids;
}
void OAIDeletePartnersRequest::setPartnerIds(const QList<QString> &partner_ids) {
    m_partner_ids = partner_ids;
    m_partner_ids_isSet = true;
}

bool OAIDeletePartnersRequest::is_partner_ids_Set() const{
    return m_partner_ids_isSet;
}

bool OAIDeletePartnersRequest::is_partner_ids_Valid() const{
    return m_partner_ids_isValid;
}

QString OAIDeletePartnersRequest::getPartnerType() const {
    return m_partner_type;
}
void OAIDeletePartnersRequest::setPartnerType(const QString &partner_type) {
    m_partner_type = partner_type;
    m_partner_type_isSet = true;
}

bool OAIDeletePartnersRequest::is_partner_type_Set() const{
    return m_partner_type_isSet;
}

bool OAIDeletePartnersRequest::is_partner_type_Valid() const{
    return m_partner_type_isValid;
}

bool OAIDeletePartnersRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_partner_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_partner_type_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIDeletePartnersRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_partner_ids_isValid && true;
}

} // namespace OpenAPI
