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

#include "OAIBoardSection.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBoardSection::OAIBoardSection(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBoardSection::OAIBoardSection() {
    this->initializeModel();
}

OAIBoardSection::~OAIBoardSection() {}

void OAIBoardSection::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIBoardSection::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBoardSection::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIBoardSection::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBoardSection::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    return obj;
}

QString OAIBoardSection::getId() const {
    return id;
}
void OAIBoardSection::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIBoardSection::is_id_Set() const{
    return m_id_isSet;
}

bool OAIBoardSection::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIBoardSection::getName() const {
    return name;
}
void OAIBoardSection::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIBoardSection::is_name_Set() const{
    return m_name_isSet;
}

bool OAIBoardSection::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIBoardSection::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBoardSection::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_name_isValid && true;
}

} // namespace OpenAPI
