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

#include "OAIBoard_media.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBoard_media::OAIBoard_media(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBoard_media::OAIBoard_media() {
    this->initializeModel();
}

OAIBoard_media::~OAIBoard_media() {}

void OAIBoard_media::initializeModel() {

    m_image_cover_url_isSet = false;
    m_image_cover_url_isValid = false;

    m_pin_thumbnail_urls_isSet = false;
    m_pin_thumbnail_urls_isValid = false;
}

void OAIBoard_media::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBoard_media::fromJsonObject(QJsonObject json) {

    m_image_cover_url_isValid = ::OpenAPI::fromJsonValue(m_image_cover_url, json[QString("image_cover_url")]);
    m_image_cover_url_isSet = !json[QString("image_cover_url")].isNull() && m_image_cover_url_isValid;

    m_pin_thumbnail_urls_isValid = ::OpenAPI::fromJsonValue(m_pin_thumbnail_urls, json[QString("pin_thumbnail_urls")]);
    m_pin_thumbnail_urls_isSet = !json[QString("pin_thumbnail_urls")].isNull() && m_pin_thumbnail_urls_isValid;
}

QString OAIBoard_media::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBoard_media::asJsonObject() const {
    QJsonObject obj;
    if (m_image_cover_url_isSet) {
        obj.insert(QString("image_cover_url"), ::OpenAPI::toJsonValue(m_image_cover_url));
    }
    if (m_pin_thumbnail_urls.size() > 0) {
        obj.insert(QString("pin_thumbnail_urls"), ::OpenAPI::toJsonValue(m_pin_thumbnail_urls));
    }
    return obj;
}

QString OAIBoard_media::getImageCoverUrl() const {
    return m_image_cover_url;
}
void OAIBoard_media::setImageCoverUrl(const QString &image_cover_url) {
    m_image_cover_url = image_cover_url;
    m_image_cover_url_isSet = true;
}

bool OAIBoard_media::is_image_cover_url_Set() const{
    return m_image_cover_url_isSet;
}

bool OAIBoard_media::is_image_cover_url_Valid() const{
    return m_image_cover_url_isValid;
}

QList<QString> OAIBoard_media::getPinThumbnailUrls() const {
    return m_pin_thumbnail_urls;
}
void OAIBoard_media::setPinThumbnailUrls(const QList<QString> &pin_thumbnail_urls) {
    m_pin_thumbnail_urls = pin_thumbnail_urls;
    m_pin_thumbnail_urls_isSet = true;
}

bool OAIBoard_media::is_pin_thumbnail_urls_Set() const{
    return m_pin_thumbnail_urls_isSet;
}

bool OAIBoard_media::is_pin_thumbnail_urls_Valid() const{
    return m_pin_thumbnail_urls_isValid;
}

bool OAIBoard_media::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_image_cover_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_pin_thumbnail_urls.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBoard_media::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI