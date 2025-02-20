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

#include "OAIItemDeleteBatchRecord.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIItemDeleteBatchRecord::OAIItemDeleteBatchRecord(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIItemDeleteBatchRecord::OAIItemDeleteBatchRecord() {
    this->initializeModel();
}

OAIItemDeleteBatchRecord::~OAIItemDeleteBatchRecord() {}

void OAIItemDeleteBatchRecord::initializeModel() {

    m_item_id_isSet = false;
    m_item_id_isValid = false;
}

void OAIItemDeleteBatchRecord::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIItemDeleteBatchRecord::fromJsonObject(QJsonObject json) {

    m_item_id_isValid = ::OpenAPI::fromJsonValue(m_item_id, json[QString("item_id")]);
    m_item_id_isSet = !json[QString("item_id")].isNull() && m_item_id_isValid;
}

QString OAIItemDeleteBatchRecord::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIItemDeleteBatchRecord::asJsonObject() const {
    QJsonObject obj;
    if (m_item_id_isSet) {
        obj.insert(QString("item_id"), ::OpenAPI::toJsonValue(m_item_id));
    }
    return obj;
}

QString OAIItemDeleteBatchRecord::getItemId() const {
    return m_item_id;
}
void OAIItemDeleteBatchRecord::setItemId(const QString &item_id) {
    m_item_id = item_id;
    m_item_id_isSet = true;
}

bool OAIItemDeleteBatchRecord::is_item_id_Set() const{
    return m_item_id_isSet;
}

bool OAIItemDeleteBatchRecord::is_item_id_Valid() const{
    return m_item_id_isValid;
}

bool OAIItemDeleteBatchRecord::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_item_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIItemDeleteBatchRecord::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
