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

#include "OAIAdPreviewCreateFromImage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAdPreviewCreateFromImage::OAIAdPreviewCreateFromImage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAdPreviewCreateFromImage::OAIAdPreviewCreateFromImage() {
    this->initializeModel();
}

OAIAdPreviewCreateFromImage::~OAIAdPreviewCreateFromImage() {}

void OAIAdPreviewCreateFromImage::initializeModel() {

    m_image_url_isSet = false;
    m_image_url_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;
}

void OAIAdPreviewCreateFromImage::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAdPreviewCreateFromImage::fromJsonObject(QJsonObject json) {

    m_image_url_isValid = ::OpenAPI::fromJsonValue(image_url, json[QString("image_url")]);
    m_image_url_isSet = !json[QString("image_url")].isNull() && m_image_url_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;
}

QString OAIAdPreviewCreateFromImage::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAdPreviewCreateFromImage::asJsonObject() const {
    QJsonObject obj;
    if (m_image_url_isSet) {
        obj.insert(QString("image_url"), ::OpenAPI::toJsonValue(image_url));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
    return obj;
}

QString OAIAdPreviewCreateFromImage::getImageUrl() const {
    return image_url;
}
void OAIAdPreviewCreateFromImage::setImageUrl(const QString &image_url) {
    this->image_url = image_url;
    this->m_image_url_isSet = true;
}

bool OAIAdPreviewCreateFromImage::is_image_url_Set() const{
    return m_image_url_isSet;
}

bool OAIAdPreviewCreateFromImage::is_image_url_Valid() const{
    return m_image_url_isValid;
}

QString OAIAdPreviewCreateFromImage::getTitle() const {
    return title;
}
void OAIAdPreviewCreateFromImage::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

bool OAIAdPreviewCreateFromImage::is_title_Set() const{
    return m_title_isSet;
}

bool OAIAdPreviewCreateFromImage::is_title_Valid() const{
    return m_title_isValid;
}

bool OAIAdPreviewCreateFromImage::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_image_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_title_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAdPreviewCreateFromImage::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_image_url_isValid && m_title_isValid && true;
}

} // namespace OpenAPI
