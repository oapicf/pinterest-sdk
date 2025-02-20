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

#include "OAIIntegrations_get_list_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIIntegrations_get_list_200_response::OAIIntegrations_get_list_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIIntegrations_get_list_200_response::OAIIntegrations_get_list_200_response() {
    this->initializeModel();
}

OAIIntegrations_get_list_200_response::~OAIIntegrations_get_list_200_response() {}

void OAIIntegrations_get_list_200_response::initializeModel() {

    m_items_isSet = false;
    m_items_isValid = false;

    m_bookmark_isSet = false;
    m_bookmark_isValid = false;
}

void OAIIntegrations_get_list_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIIntegrations_get_list_200_response::fromJsonObject(QJsonObject json) {

    m_items_isValid = ::OpenAPI::fromJsonValue(m_items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;

    m_bookmark_isValid = ::OpenAPI::fromJsonValue(m_bookmark, json[QString("bookmark")]);
    m_bookmark_isSet = !json[QString("bookmark")].isNull() && m_bookmark_isValid;
}

QString OAIIntegrations_get_list_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIIntegrations_get_list_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(m_items));
    }
    if (m_bookmark_isSet) {
        obj.insert(QString("bookmark"), ::OpenAPI::toJsonValue(m_bookmark));
    }
    return obj;
}

QList<OAIIntegrationRecord> OAIIntegrations_get_list_200_response::getItems() const {
    return m_items;
}
void OAIIntegrations_get_list_200_response::setItems(const QList<OAIIntegrationRecord> &items) {
    m_items = items;
    m_items_isSet = true;
}

bool OAIIntegrations_get_list_200_response::is_items_Set() const{
    return m_items_isSet;
}

bool OAIIntegrations_get_list_200_response::is_items_Valid() const{
    return m_items_isValid;
}

QString OAIIntegrations_get_list_200_response::getBookmark() const {
    return m_bookmark;
}
void OAIIntegrations_get_list_200_response::setBookmark(const QString &bookmark) {
    m_bookmark = bookmark;
    m_bookmark_isSet = true;
}

bool OAIIntegrations_get_list_200_response::is_bookmark_Set() const{
    return m_bookmark_isSet;
}

bool OAIIntegrations_get_list_200_response::is_bookmark_Valid() const{
    return m_bookmark_isValid;
}

bool OAIIntegrations_get_list_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_items.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_bookmark_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIIntegrations_get_list_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_items_isValid && true;
}

} // namespace OpenAPI
