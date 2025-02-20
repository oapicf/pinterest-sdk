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

#include "OAISummaryPin.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISummaryPin::OAISummaryPin(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISummaryPin::OAISummaryPin() {
    this->initializeModel();
}

OAISummaryPin::~OAISummaryPin() {}

void OAISummaryPin::initializeModel() {

    m_media_isSet = false;
    m_media_isValid = false;

    m_alt_text_isSet = false;
    m_alt_text_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;
}

void OAISummaryPin::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISummaryPin::fromJsonObject(QJsonObject json) {

    m_media_isValid = ::OpenAPI::fromJsonValue(m_media, json[QString("media")]);
    m_media_isSet = !json[QString("media")].isNull() && m_media_isValid;

    m_alt_text_isValid = ::OpenAPI::fromJsonValue(m_alt_text, json[QString("alt_text")]);
    m_alt_text_isSet = !json[QString("alt_text")].isNull() && m_alt_text_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(m_link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(m_title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;
}

QString OAISummaryPin::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISummaryPin::asJsonObject() const {
    QJsonObject obj;
    if (m_media.isSet()) {
        obj.insert(QString("media"), ::OpenAPI::toJsonValue(m_media));
    }
    if (m_alt_text_isSet) {
        obj.insert(QString("alt_text"), ::OpenAPI::toJsonValue(m_alt_text));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(m_link));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(m_title));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    return obj;
}

OAIPinMedia OAISummaryPin::getMedia() const {
    return m_media;
}
void OAISummaryPin::setMedia(const OAIPinMedia &media) {
    m_media = media;
    m_media_isSet = true;
}

bool OAISummaryPin::is_media_Set() const{
    return m_media_isSet;
}

bool OAISummaryPin::is_media_Valid() const{
    return m_media_isValid;
}

QString OAISummaryPin::getAltText() const {
    return m_alt_text;
}
void OAISummaryPin::setAltText(const QString &alt_text) {
    m_alt_text = alt_text;
    m_alt_text_isSet = true;
}

bool OAISummaryPin::is_alt_text_Set() const{
    return m_alt_text_isSet;
}

bool OAISummaryPin::is_alt_text_Valid() const{
    return m_alt_text_isValid;
}

QString OAISummaryPin::getLink() const {
    return m_link;
}
void OAISummaryPin::setLink(const QString &link) {
    m_link = link;
    m_link_isSet = true;
}

bool OAISummaryPin::is_link_Set() const{
    return m_link_isSet;
}

bool OAISummaryPin::is_link_Valid() const{
    return m_link_isValid;
}

QString OAISummaryPin::getTitle() const {
    return m_title;
}
void OAISummaryPin::setTitle(const QString &title) {
    m_title = title;
    m_title_isSet = true;
}

bool OAISummaryPin::is_title_Set() const{
    return m_title_isSet;
}

bool OAISummaryPin::is_title_Valid() const{
    return m_title_isValid;
}

QString OAISummaryPin::getDescription() const {
    return m_description;
}
void OAISummaryPin::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAISummaryPin::is_description_Set() const{
    return m_description_isSet;
}

bool OAISummaryPin::is_description_Valid() const{
    return m_description_isValid;
}

bool OAISummaryPin::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_media.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_alt_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISummaryPin::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
