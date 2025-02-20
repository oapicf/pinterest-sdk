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

#include "OAICatalogsItems.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsItems::OAICatalogsItems(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsItems::OAICatalogsItems() {
    this->initializeModel();
}

OAICatalogsItems::~OAICatalogsItems() {}

void OAICatalogsItems::initializeModel() {

    m_items_isSet = false;
    m_items_isValid = false;
}

void OAICatalogsItems::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsItems::fromJsonObject(QJsonObject json) {

    m_items_isValid = ::OpenAPI::fromJsonValue(m_items, json[QString("items")]);
    m_items_isSet = !json[QString("items")].isNull() && m_items_isValid;
}

QString OAICatalogsItems::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsItems::asJsonObject() const {
    QJsonObject obj;
    if (m_items.size() > 0) {
        obj.insert(QString("items"), ::OpenAPI::toJsonValue(m_items));
    }
    return obj;
}

QList<OAIItemResponse> OAICatalogsItems::getItems() const {
    return m_items;
}
void OAICatalogsItems::setItems(const QList<OAIItemResponse> &items) {
    m_items = items;
    m_items_isSet = true;
}

bool OAICatalogsItems::is_items_Set() const{
    return m_items_isSet;
}

bool OAICatalogsItems::is_items_Valid() const{
    return m_items_isValid;
}

bool OAICatalogsItems::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_items.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsItems::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
