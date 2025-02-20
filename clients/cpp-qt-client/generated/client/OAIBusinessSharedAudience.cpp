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

#include "OAIBusinessSharedAudience.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBusinessSharedAudience::OAIBusinessSharedAudience(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBusinessSharedAudience::OAIBusinessSharedAudience() {
    this->initializeModel();
}

OAIBusinessSharedAudience::~OAIBusinessSharedAudience() {}

void OAIBusinessSharedAudience::initializeModel() {

    m_audience_id_isSet = false;
    m_audience_id_isValid = false;

    m_operation_type_isSet = false;
    m_operation_type_isValid = false;

    m_recipient_business_ids_isSet = false;
    m_recipient_business_ids_isValid = false;
}

void OAIBusinessSharedAudience::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBusinessSharedAudience::fromJsonObject(QJsonObject json) {

    m_audience_id_isValid = ::OpenAPI::fromJsonValue(m_audience_id, json[QString("audience_id")]);
    m_audience_id_isSet = !json[QString("audience_id")].isNull() && m_audience_id_isValid;

    m_operation_type_isValid = ::OpenAPI::fromJsonValue(m_operation_type, json[QString("operation_type")]);
    m_operation_type_isSet = !json[QString("operation_type")].isNull() && m_operation_type_isValid;

    m_recipient_business_ids_isValid = ::OpenAPI::fromJsonValue(m_recipient_business_ids, json[QString("recipient_business_ids")]);
    m_recipient_business_ids_isSet = !json[QString("recipient_business_ids")].isNull() && m_recipient_business_ids_isValid;
}

QString OAIBusinessSharedAudience::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBusinessSharedAudience::asJsonObject() const {
    QJsonObject obj;
    if (m_audience_id_isSet) {
        obj.insert(QString("audience_id"), ::OpenAPI::toJsonValue(m_audience_id));
    }
    if (m_operation_type.isSet()) {
        obj.insert(QString("operation_type"), ::OpenAPI::toJsonValue(m_operation_type));
    }
    if (m_recipient_business_ids.size() > 0) {
        obj.insert(QString("recipient_business_ids"), ::OpenAPI::toJsonValue(m_recipient_business_ids));
    }
    return obj;
}

QString OAIBusinessSharedAudience::getAudienceId() const {
    return m_audience_id;
}
void OAIBusinessSharedAudience::setAudienceId(const QString &audience_id) {
    m_audience_id = audience_id;
    m_audience_id_isSet = true;
}

bool OAIBusinessSharedAudience::is_audience_id_Set() const{
    return m_audience_id_isSet;
}

bool OAIBusinessSharedAudience::is_audience_id_Valid() const{
    return m_audience_id_isValid;
}

OAIOperationType OAIBusinessSharedAudience::getOperationType() const {
    return m_operation_type;
}
void OAIBusinessSharedAudience::setOperationType(const OAIOperationType &operation_type) {
    m_operation_type = operation_type;
    m_operation_type_isSet = true;
}

bool OAIBusinessSharedAudience::is_operation_type_Set() const{
    return m_operation_type_isSet;
}

bool OAIBusinessSharedAudience::is_operation_type_Valid() const{
    return m_operation_type_isValid;
}

QList<QString> OAIBusinessSharedAudience::getRecipientBusinessIds() const {
    return m_recipient_business_ids;
}
void OAIBusinessSharedAudience::setRecipientBusinessIds(const QList<QString> &recipient_business_ids) {
    m_recipient_business_ids = recipient_business_ids;
    m_recipient_business_ids_isSet = true;
}

bool OAIBusinessSharedAudience::is_recipient_business_ids_Set() const{
    return m_recipient_business_ids_isSet;
}

bool OAIBusinessSharedAudience::is_recipient_business_ids_Valid() const{
    return m_recipient_business_ids_isValid;
}

bool OAIBusinessSharedAudience::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_audience_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_operation_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_recipient_business_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBusinessSharedAudience::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_audience_id_isValid && m_operation_type_isValid && m_recipient_business_ids_isValid && true;
}

} // namespace OpenAPI
