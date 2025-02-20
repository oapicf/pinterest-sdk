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

#include "OAICatalogsUpdatableCreativeAssetsAttributes.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsUpdatableCreativeAssetsAttributes::OAICatalogsUpdatableCreativeAssetsAttributes(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsUpdatableCreativeAssetsAttributes::OAICatalogsUpdatableCreativeAssetsAttributes() {
    this->initializeModel();
}

OAICatalogsUpdatableCreativeAssetsAttributes::~OAICatalogsUpdatableCreativeAssetsAttributes() {}

void OAICatalogsUpdatableCreativeAssetsAttributes::initializeModel() {

    m_title_isSet = false;
    m_title_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_ios_deep_link_isSet = false;
    m_ios_deep_link_isValid = false;

    m_android_deep_link_isSet = false;
    m_android_deep_link_isValid = false;

    m_google_product_category_isSet = false;
    m_google_product_category_isValid = false;

    m_custom_label_0_isSet = false;
    m_custom_label_0_isValid = false;

    m_custom_label_1_isSet = false;
    m_custom_label_1_isValid = false;

    m_custom_label_2_isSet = false;
    m_custom_label_2_isValid = false;

    m_custom_label_3_isSet = false;
    m_custom_label_3_isValid = false;

    m_custom_label_4_isSet = false;
    m_custom_label_4_isValid = false;

    m_visibility_isSet = false;
    m_visibility_isValid = false;
}

void OAICatalogsUpdatableCreativeAssetsAttributes::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsUpdatableCreativeAssetsAttributes::fromJsonObject(QJsonObject json) {

    m_title_isValid = ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_ios_deep_link_isValid = ::OpenAPI::fromJsonValue(ios_deep_link, json[QString("ios_deep_link")]);
    m_ios_deep_link_isSet = !json[QString("ios_deep_link")].isNull() && m_ios_deep_link_isValid;

    m_android_deep_link_isValid = ::OpenAPI::fromJsonValue(android_deep_link, json[QString("android_deep_link")]);
    m_android_deep_link_isSet = !json[QString("android_deep_link")].isNull() && m_android_deep_link_isValid;

    m_google_product_category_isValid = ::OpenAPI::fromJsonValue(google_product_category, json[QString("google_product_category")]);
    m_google_product_category_isSet = !json[QString("google_product_category")].isNull() && m_google_product_category_isValid;

    m_custom_label_0_isValid = ::OpenAPI::fromJsonValue(custom_label_0, json[QString("custom_label_0")]);
    m_custom_label_0_isSet = !json[QString("custom_label_0")].isNull() && m_custom_label_0_isValid;

    m_custom_label_1_isValid = ::OpenAPI::fromJsonValue(custom_label_1, json[QString("custom_label_1")]);
    m_custom_label_1_isSet = !json[QString("custom_label_1")].isNull() && m_custom_label_1_isValid;

    m_custom_label_2_isValid = ::OpenAPI::fromJsonValue(custom_label_2, json[QString("custom_label_2")]);
    m_custom_label_2_isSet = !json[QString("custom_label_2")].isNull() && m_custom_label_2_isValid;

    m_custom_label_3_isValid = ::OpenAPI::fromJsonValue(custom_label_3, json[QString("custom_label_3")]);
    m_custom_label_3_isSet = !json[QString("custom_label_3")].isNull() && m_custom_label_3_isValid;

    m_custom_label_4_isValid = ::OpenAPI::fromJsonValue(custom_label_4, json[QString("custom_label_4")]);
    m_custom_label_4_isSet = !json[QString("custom_label_4")].isNull() && m_custom_label_4_isValid;

    m_visibility_isValid = ::OpenAPI::fromJsonValue(visibility, json[QString("visibility")]);
    m_visibility_isSet = !json[QString("visibility")].isNull() && m_visibility_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsUpdatableCreativeAssetsAttributes::asJsonObject() const {
    QJsonObject obj;
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(link));
    }
    if (m_ios_deep_link_isSet) {
        obj.insert(QString("ios_deep_link"), ::OpenAPI::toJsonValue(ios_deep_link));
    }
    if (m_android_deep_link_isSet) {
        obj.insert(QString("android_deep_link"), ::OpenAPI::toJsonValue(android_deep_link));
    }
    if (m_google_product_category_isSet) {
        obj.insert(QString("google_product_category"), ::OpenAPI::toJsonValue(google_product_category));
    }
    if (m_custom_label_0_isSet) {
        obj.insert(QString("custom_label_0"), ::OpenAPI::toJsonValue(custom_label_0));
    }
    if (m_custom_label_1_isSet) {
        obj.insert(QString("custom_label_1"), ::OpenAPI::toJsonValue(custom_label_1));
    }
    if (m_custom_label_2_isSet) {
        obj.insert(QString("custom_label_2"), ::OpenAPI::toJsonValue(custom_label_2));
    }
    if (m_custom_label_3_isSet) {
        obj.insert(QString("custom_label_3"), ::OpenAPI::toJsonValue(custom_label_3));
    }
    if (m_custom_label_4_isSet) {
        obj.insert(QString("custom_label_4"), ::OpenAPI::toJsonValue(custom_label_4));
    }
    if (m_visibility_isSet) {
        obj.insert(QString("visibility"), ::OpenAPI::toJsonValue(visibility));
    }
    return obj;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getTitle() const {
    return title;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_title_Set() const{
    return m_title_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_title_Valid() const{
    return m_title_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getDescription() const {
    return description;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_description_Set() const{
    return m_description_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_description_Valid() const{
    return m_description_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getLink() const {
    return link;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setLink(const QString &link) {
    this->link = link;
    this->m_link_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_link_Set() const{
    return m_link_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_link_Valid() const{
    return m_link_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getIosDeepLink() const {
    return ios_deep_link;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setIosDeepLink(const QString &ios_deep_link) {
    this->ios_deep_link = ios_deep_link;
    this->m_ios_deep_link_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_ios_deep_link_Set() const{
    return m_ios_deep_link_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_ios_deep_link_Valid() const{
    return m_ios_deep_link_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getAndroidDeepLink() const {
    return android_deep_link;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setAndroidDeepLink(const QString &android_deep_link) {
    this->android_deep_link = android_deep_link;
    this->m_android_deep_link_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_android_deep_link_Set() const{
    return m_android_deep_link_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_android_deep_link_Valid() const{
    return m_android_deep_link_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getGoogleProductCategory() const {
    return google_product_category;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setGoogleProductCategory(const QString &google_product_category) {
    this->google_product_category = google_product_category;
    this->m_google_product_category_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_google_product_category_Set() const{
    return m_google_product_category_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_google_product_category_Valid() const{
    return m_google_product_category_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getCustomLabel0() const {
    return custom_label_0;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setCustomLabel0(const QString &custom_label_0) {
    this->custom_label_0 = custom_label_0;
    this->m_custom_label_0_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_0_Set() const{
    return m_custom_label_0_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_0_Valid() const{
    return m_custom_label_0_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getCustomLabel1() const {
    return custom_label_1;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setCustomLabel1(const QString &custom_label_1) {
    this->custom_label_1 = custom_label_1;
    this->m_custom_label_1_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_1_Set() const{
    return m_custom_label_1_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_1_Valid() const{
    return m_custom_label_1_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getCustomLabel2() const {
    return custom_label_2;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setCustomLabel2(const QString &custom_label_2) {
    this->custom_label_2 = custom_label_2;
    this->m_custom_label_2_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_2_Set() const{
    return m_custom_label_2_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_2_Valid() const{
    return m_custom_label_2_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getCustomLabel3() const {
    return custom_label_3;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setCustomLabel3(const QString &custom_label_3) {
    this->custom_label_3 = custom_label_3;
    this->m_custom_label_3_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_3_Set() const{
    return m_custom_label_3_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_3_Valid() const{
    return m_custom_label_3_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getCustomLabel4() const {
    return custom_label_4;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setCustomLabel4(const QString &custom_label_4) {
    this->custom_label_4 = custom_label_4;
    this->m_custom_label_4_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_4_Set() const{
    return m_custom_label_4_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_custom_label_4_Valid() const{
    return m_custom_label_4_isValid;
}

QString OAICatalogsUpdatableCreativeAssetsAttributes::getVisibility() const {
    return visibility;
}
void OAICatalogsUpdatableCreativeAssetsAttributes::setVisibility(const QString &visibility) {
    this->visibility = visibility;
    this->m_visibility_isSet = true;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_visibility_Set() const{
    return m_visibility_isSet;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::is_visibility_Valid() const{
    return m_visibility_isValid;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::isSet() const {
    bool isObjectUpdated = false;
    do {
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

        if (m_ios_deep_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_android_deep_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_google_product_category_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_0_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_1_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_2_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_3_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_4_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_visibility_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsUpdatableCreativeAssetsAttributes::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
