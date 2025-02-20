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

#include "OAIAudienceInsightCategoryCommon.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAudienceInsightCategoryCommon::OAIAudienceInsightCategoryCommon(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAudienceInsightCategoryCommon::OAIAudienceInsightCategoryCommon() {
    this->initializeModel();
}

OAIAudienceInsightCategoryCommon::~OAIAudienceInsightCategoryCommon() {}

void OAIAudienceInsightCategoryCommon::initializeModel() {

    m_key_isSet = false;
    m_key_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_ratio_isSet = false;
    m_ratio_isValid = false;

    m_index_isSet = false;
    m_index_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;
}

void OAIAudienceInsightCategoryCommon::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAudienceInsightCategoryCommon::fromJsonObject(QJsonObject json) {

    m_key_isValid = ::OpenAPI::fromJsonValue(key, json[QString("key")]);
    m_key_isSet = !json[QString("key")].isNull() && m_key_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_ratio_isValid = ::OpenAPI::fromJsonValue(ratio, json[QString("ratio")]);
    m_ratio_isSet = !json[QString("ratio")].isNull() && m_ratio_isValid;

    m_index_isValid = ::OpenAPI::fromJsonValue(index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;
}

QString OAIAudienceInsightCategoryCommon::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAudienceInsightCategoryCommon::asJsonObject() const {
    QJsonObject obj;
    if (m_key_isSet) {
        obj.insert(QString("key"), ::OpenAPI::toJsonValue(key));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_ratio_isSet) {
        obj.insert(QString("ratio"), ::OpenAPI::toJsonValue(ratio));
    }
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(index));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    return obj;
}

QString OAIAudienceInsightCategoryCommon::getKey() const {
    return key;
}
void OAIAudienceInsightCategoryCommon::setKey(const QString &key) {
    this->key = key;
    this->m_key_isSet = true;
}

bool OAIAudienceInsightCategoryCommon::is_key_Set() const{
    return m_key_isSet;
}

bool OAIAudienceInsightCategoryCommon::is_key_Valid() const{
    return m_key_isValid;
}

QString OAIAudienceInsightCategoryCommon::getName() const {
    return name;
}
void OAIAudienceInsightCategoryCommon::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIAudienceInsightCategoryCommon::is_name_Set() const{
    return m_name_isSet;
}

bool OAIAudienceInsightCategoryCommon::is_name_Valid() const{
    return m_name_isValid;
}

double OAIAudienceInsightCategoryCommon::getRatio() const {
    return ratio;
}
void OAIAudienceInsightCategoryCommon::setRatio(const double &ratio) {
    this->ratio = ratio;
    this->m_ratio_isSet = true;
}

bool OAIAudienceInsightCategoryCommon::is_ratio_Set() const{
    return m_ratio_isSet;
}

bool OAIAudienceInsightCategoryCommon::is_ratio_Valid() const{
    return m_ratio_isValid;
}

double OAIAudienceInsightCategoryCommon::getIndex() const {
    return index;
}
void OAIAudienceInsightCategoryCommon::setIndex(const double &index) {
    this->index = index;
    this->m_index_isSet = true;
}

bool OAIAudienceInsightCategoryCommon::is_index_Set() const{
    return m_index_isSet;
}

bool OAIAudienceInsightCategoryCommon::is_index_Valid() const{
    return m_index_isValid;
}

QString OAIAudienceInsightCategoryCommon::getId() const {
    return id;
}
void OAIAudienceInsightCategoryCommon::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIAudienceInsightCategoryCommon::is_id_Set() const{
    return m_id_isSet;
}

bool OAIAudienceInsightCategoryCommon::is_id_Valid() const{
    return m_id_isValid;
}

bool OAIAudienceInsightCategoryCommon::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_key_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ratio_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAudienceInsightCategoryCommon::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
