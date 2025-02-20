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

#include "OAIPinMediaMetadata.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPinMediaMetadata::OAIPinMediaMetadata(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPinMediaMetadata::OAIPinMediaMetadata() {
    this->initializeModel();
}

OAIPinMediaMetadata::~OAIPinMediaMetadata() {}

void OAIPinMediaMetadata::initializeModel() {

    m_item_type_isSet = false;
    m_item_type_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_images_isSet = false;
    m_images_isValid = false;

    m_cover_image_url_isSet = false;
    m_cover_image_url_isValid = false;

    m_video_url_isSet = false;
    m_video_url_isValid = false;

    m_duration_isSet = false;
    m_duration_isValid = false;

    m_height_isSet = false;
    m_height_isValid = false;

    m_width_isSet = false;
    m_width_isValid = false;
}

void OAIPinMediaMetadata::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPinMediaMetadata::fromJsonObject(QJsonObject json) {

    m_item_type_isValid = ::OpenAPI::fromJsonValue(m_item_type, json[QString("item_type")]);
    m_item_type_isSet = !json[QString("item_type")].isNull() && m_item_type_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(m_title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(m_link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_images_isValid = ::OpenAPI::fromJsonValue(m_images, json[QString("images")]);
    m_images_isSet = !json[QString("images")].isNull() && m_images_isValid;

    m_cover_image_url_isValid = ::OpenAPI::fromJsonValue(m_cover_image_url, json[QString("cover_image_url")]);
    m_cover_image_url_isSet = !json[QString("cover_image_url")].isNull() && m_cover_image_url_isValid;

    m_video_url_isValid = ::OpenAPI::fromJsonValue(m_video_url, json[QString("video_url")]);
    m_video_url_isSet = !json[QString("video_url")].isNull() && m_video_url_isValid;

    m_duration_isValid = ::OpenAPI::fromJsonValue(m_duration, json[QString("duration")]);
    m_duration_isSet = !json[QString("duration")].isNull() && m_duration_isValid;

    m_height_isValid = ::OpenAPI::fromJsonValue(m_height, json[QString("height")]);
    m_height_isSet = !json[QString("height")].isNull() && m_height_isValid;

    m_width_isValid = ::OpenAPI::fromJsonValue(m_width, json[QString("width")]);
    m_width_isSet = !json[QString("width")].isNull() && m_width_isValid;
}

QString OAIPinMediaMetadata::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPinMediaMetadata::asJsonObject() const {
    QJsonObject obj;
    if (m_item_type_isSet) {
        obj.insert(QString("item_type"), ::OpenAPI::toJsonValue(m_item_type));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(m_title));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(m_link));
    }
    if (m_images.isSet()) {
        obj.insert(QString("images"), ::OpenAPI::toJsonValue(m_images));
    }
    if (m_cover_image_url_isSet) {
        obj.insert(QString("cover_image_url"), ::OpenAPI::toJsonValue(m_cover_image_url));
    }
    if (m_video_url_isSet) {
        obj.insert(QString("video_url"), ::OpenAPI::toJsonValue(m_video_url));
    }
    if (m_duration_isSet) {
        obj.insert(QString("duration"), ::OpenAPI::toJsonValue(m_duration));
    }
    if (m_height_isSet) {
        obj.insert(QString("height"), ::OpenAPI::toJsonValue(m_height));
    }
    if (m_width_isSet) {
        obj.insert(QString("width"), ::OpenAPI::toJsonValue(m_width));
    }
    return obj;
}

QString OAIPinMediaMetadata::getItemType() const {
    return m_item_type;
}
void OAIPinMediaMetadata::setItemType(const QString &item_type) {
    m_item_type = item_type;
    m_item_type_isSet = true;
}

bool OAIPinMediaMetadata::is_item_type_Set() const{
    return m_item_type_isSet;
}

bool OAIPinMediaMetadata::is_item_type_Valid() const{
    return m_item_type_isValid;
}

QString OAIPinMediaMetadata::getTitle() const {
    return m_title;
}
void OAIPinMediaMetadata::setTitle(const QString &title) {
    m_title = title;
    m_title_isSet = true;
}

bool OAIPinMediaMetadata::is_title_Set() const{
    return m_title_isSet;
}

bool OAIPinMediaMetadata::is_title_Valid() const{
    return m_title_isValid;
}

QString OAIPinMediaMetadata::getDescription() const {
    return m_description;
}
void OAIPinMediaMetadata::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAIPinMediaMetadata::is_description_Set() const{
    return m_description_isSet;
}

bool OAIPinMediaMetadata::is_description_Valid() const{
    return m_description_isValid;
}

QString OAIPinMediaMetadata::getLink() const {
    return m_link;
}
void OAIPinMediaMetadata::setLink(const QString &link) {
    m_link = link;
    m_link_isSet = true;
}

bool OAIPinMediaMetadata::is_link_Set() const{
    return m_link_isSet;
}

bool OAIPinMediaMetadata::is_link_Valid() const{
    return m_link_isValid;
}

OAIImageMetadata_images OAIPinMediaMetadata::getImages() const {
    return m_images;
}
void OAIPinMediaMetadata::setImages(const OAIImageMetadata_images &images) {
    m_images = images;
    m_images_isSet = true;
}

bool OAIPinMediaMetadata::is_images_Set() const{
    return m_images_isSet;
}

bool OAIPinMediaMetadata::is_images_Valid() const{
    return m_images_isValid;
}

QString OAIPinMediaMetadata::getCoverImageUrl() const {
    return m_cover_image_url;
}
void OAIPinMediaMetadata::setCoverImageUrl(const QString &cover_image_url) {
    m_cover_image_url = cover_image_url;
    m_cover_image_url_isSet = true;
}

bool OAIPinMediaMetadata::is_cover_image_url_Set() const{
    return m_cover_image_url_isSet;
}

bool OAIPinMediaMetadata::is_cover_image_url_Valid() const{
    return m_cover_image_url_isValid;
}

QString OAIPinMediaMetadata::getVideoUrl() const {
    return m_video_url;
}
void OAIPinMediaMetadata::setVideoUrl(const QString &video_url) {
    m_video_url = video_url;
    m_video_url_isSet = true;
}

bool OAIPinMediaMetadata::is_video_url_Set() const{
    return m_video_url_isSet;
}

bool OAIPinMediaMetadata::is_video_url_Valid() const{
    return m_video_url_isValid;
}

double OAIPinMediaMetadata::getDuration() const {
    return m_duration;
}
void OAIPinMediaMetadata::setDuration(const double &duration) {
    m_duration = duration;
    m_duration_isSet = true;
}

bool OAIPinMediaMetadata::is_duration_Set() const{
    return m_duration_isSet;
}

bool OAIPinMediaMetadata::is_duration_Valid() const{
    return m_duration_isValid;
}

qint32 OAIPinMediaMetadata::getHeight() const {
    return m_height;
}
void OAIPinMediaMetadata::setHeight(const qint32 &height) {
    m_height = height;
    m_height_isSet = true;
}

bool OAIPinMediaMetadata::is_height_Set() const{
    return m_height_isSet;
}

bool OAIPinMediaMetadata::is_height_Valid() const{
    return m_height_isValid;
}

qint32 OAIPinMediaMetadata::getWidth() const {
    return m_width;
}
void OAIPinMediaMetadata::setWidth(const qint32 &width) {
    m_width = width;
    m_width_isSet = true;
}

bool OAIPinMediaMetadata::is_width_Set() const{
    return m_width_isSet;
}

bool OAIPinMediaMetadata::is_width_Valid() const{
    return m_width_isValid;
}

bool OAIPinMediaMetadata::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_item_type_isSet) {
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

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_images.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_cover_image_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_video_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_duration_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_height_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_width_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPinMediaMetadata::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
