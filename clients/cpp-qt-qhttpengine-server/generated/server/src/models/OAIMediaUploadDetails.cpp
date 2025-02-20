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

#include "OAIMediaUploadDetails.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMediaUploadDetails::OAIMediaUploadDetails(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMediaUploadDetails::OAIMediaUploadDetails() {
    this->initializeModel();
}

OAIMediaUploadDetails::~OAIMediaUploadDetails() {}

void OAIMediaUploadDetails::initializeModel() {

    m_media_id_isSet = false;
    m_media_id_isValid = false;

    m_media_type_isSet = false;
    m_media_type_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;
}

void OAIMediaUploadDetails::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMediaUploadDetails::fromJsonObject(QJsonObject json) {

    m_media_id_isValid = ::OpenAPI::fromJsonValue(media_id, json[QString("media_id")]);
    m_media_id_isSet = !json[QString("media_id")].isNull() && m_media_id_isValid;

    m_media_type_isValid = ::OpenAPI::fromJsonValue(media_type, json[QString("media_type")]);
    m_media_type_isSet = !json[QString("media_type")].isNull() && m_media_type_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;
}

QString OAIMediaUploadDetails::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMediaUploadDetails::asJsonObject() const {
    QJsonObject obj;
    if (m_media_id_isSet) {
        obj.insert(QString("media_id"), ::OpenAPI::toJsonValue(media_id));
    }
    if (media_type.isSet()) {
        obj.insert(QString("media_type"), ::OpenAPI::toJsonValue(media_type));
    }
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    return obj;
}

QString OAIMediaUploadDetails::getMediaId() const {
    return media_id;
}
void OAIMediaUploadDetails::setMediaId(const QString &media_id) {
    this->media_id = media_id;
    this->m_media_id_isSet = true;
}

bool OAIMediaUploadDetails::is_media_id_Set() const{
    return m_media_id_isSet;
}

bool OAIMediaUploadDetails::is_media_id_Valid() const{
    return m_media_id_isValid;
}

OAIMediaUploadType OAIMediaUploadDetails::getMediaType() const {
    return media_type;
}
void OAIMediaUploadDetails::setMediaType(const OAIMediaUploadType &media_type) {
    this->media_type = media_type;
    this->m_media_type_isSet = true;
}

bool OAIMediaUploadDetails::is_media_type_Set() const{
    return m_media_type_isSet;
}

bool OAIMediaUploadDetails::is_media_type_Valid() const{
    return m_media_type_isValid;
}

OAIMediaUploadStatus OAIMediaUploadDetails::getStatus() const {
    return status;
}
void OAIMediaUploadDetails::setStatus(const OAIMediaUploadStatus &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIMediaUploadDetails::is_status_Set() const{
    return m_status_isSet;
}

bool OAIMediaUploadDetails::is_status_Valid() const{
    return m_status_isValid;
}

bool OAIMediaUploadDetails::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_media_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (media_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (status.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMediaUploadDetails::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
