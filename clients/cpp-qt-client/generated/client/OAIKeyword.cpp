/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIKeyword.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIKeyword::OAIKeyword(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIKeyword::OAIKeyword() {
    this->initializeModel();
}

OAIKeyword::~OAIKeyword() {}

void OAIKeyword::initializeModel() {

    m_archived_isSet = false;
    m_archived_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_parent_id_isSet = false;
    m_parent_id_isValid = false;

    m_parent_type_isSet = false;
    m_parent_type_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_bid_isSet = false;
    m_bid_isValid = false;

    m_match_type_isSet = false;
    m_match_type_isValid = false;

    m_value_isSet = false;
    m_value_isValid = false;
}

void OAIKeyword::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIKeyword::fromJsonObject(QJsonObject json) {

    m_archived_isValid = ::OpenAPI::fromJsonValue(m_archived, json[QString("archived")]);
    m_archived_isSet = !json[QString("archived")].isNull() && m_archived_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_parent_id_isValid = ::OpenAPI::fromJsonValue(m_parent_id, json[QString("parent_id")]);
    m_parent_id_isSet = !json[QString("parent_id")].isNull() && m_parent_id_isValid;

    m_parent_type_isValid = ::OpenAPI::fromJsonValue(m_parent_type, json[QString("parent_type")]);
    m_parent_type_isSet = !json[QString("parent_type")].isNull() && m_parent_type_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_bid_isValid = ::OpenAPI::fromJsonValue(m_bid, json[QString("bid")]);
    m_bid_isSet = !json[QString("bid")].isNull() && m_bid_isValid;

    m_match_type_isValid = ::OpenAPI::fromJsonValue(m_match_type, json[QString("match_type")]);
    m_match_type_isSet = !json[QString("match_type")].isNull() && m_match_type_isValid;

    m_value_isValid = ::OpenAPI::fromJsonValue(m_value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;
}

QString OAIKeyword::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIKeyword::asJsonObject() const {
    QJsonObject obj;
    if (m_archived_isSet) {
        obj.insert(QString("archived"), ::OpenAPI::toJsonValue(m_archived));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_parent_id_isSet) {
        obj.insert(QString("parent_id"), ::OpenAPI::toJsonValue(m_parent_id));
    }
    if (m_parent_type_isSet) {
        obj.insert(QString("parent_type"), ::OpenAPI::toJsonValue(m_parent_type));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_bid_isSet) {
        obj.insert(QString("bid"), ::OpenAPI::toJsonValue(m_bid));
    }
    if (m_match_type.isSet()) {
        obj.insert(QString("match_type"), ::OpenAPI::toJsonValue(m_match_type));
    }
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(m_value));
    }
    return obj;
}

bool OAIKeyword::isArchived() const {
    return m_archived;
}
void OAIKeyword::setArchived(const bool &archived) {
    m_archived = archived;
    m_archived_isSet = true;
}

bool OAIKeyword::is_archived_Set() const{
    return m_archived_isSet;
}

bool OAIKeyword::is_archived_Valid() const{
    return m_archived_isValid;
}

QString OAIKeyword::getId() const {
    return m_id;
}
void OAIKeyword::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIKeyword::is_id_Set() const{
    return m_id_isSet;
}

bool OAIKeyword::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIKeyword::getParentId() const {
    return m_parent_id;
}
void OAIKeyword::setParentId(const QString &parent_id) {
    m_parent_id = parent_id;
    m_parent_id_isSet = true;
}

bool OAIKeyword::is_parent_id_Set() const{
    return m_parent_id_isSet;
}

bool OAIKeyword::is_parent_id_Valid() const{
    return m_parent_id_isValid;
}

QString OAIKeyword::getParentType() const {
    return m_parent_type;
}
void OAIKeyword::setParentType(const QString &parent_type) {
    m_parent_type = parent_type;
    m_parent_type_isSet = true;
}

bool OAIKeyword::is_parent_type_Set() const{
    return m_parent_type_isSet;
}

bool OAIKeyword::is_parent_type_Valid() const{
    return m_parent_type_isValid;
}

QString OAIKeyword::getType() const {
    return m_type;
}
void OAIKeyword::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIKeyword::is_type_Set() const{
    return m_type_isSet;
}

bool OAIKeyword::is_type_Valid() const{
    return m_type_isValid;
}

qint32 OAIKeyword::getBid() const {
    return m_bid;
}
void OAIKeyword::setBid(const qint32 &bid) {
    m_bid = bid;
    m_bid_isSet = true;
}

bool OAIKeyword::is_bid_Set() const{
    return m_bid_isSet;
}

bool OAIKeyword::is_bid_Valid() const{
    return m_bid_isValid;
}

OAIMatchTypeResponse OAIKeyword::getMatchType() const {
    return m_match_type;
}
void OAIKeyword::setMatchType(const OAIMatchTypeResponse &match_type) {
    m_match_type = match_type;
    m_match_type_isSet = true;
}

bool OAIKeyword::is_match_type_Set() const{
    return m_match_type_isSet;
}

bool OAIKeyword::is_match_type_Valid() const{
    return m_match_type_isValid;
}

QString OAIKeyword::getValue() const {
    return m_value;
}
void OAIKeyword::setValue(const QString &value) {
    m_value = value;
    m_value_isSet = true;
}

bool OAIKeyword::is_value_Set() const{
    return m_value_isSet;
}

bool OAIKeyword::is_value_Valid() const{
    return m_value_isValid;
}

bool OAIKeyword::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_archived_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_parent_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_parent_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_bid_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_match_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIKeyword::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_match_type_isValid && m_value_isValid && true;
}

} // namespace OpenAPI