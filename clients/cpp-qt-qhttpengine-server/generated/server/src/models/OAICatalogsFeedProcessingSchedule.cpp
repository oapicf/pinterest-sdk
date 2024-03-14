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

#include "OAICatalogsFeedProcessingSchedule.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsFeedProcessingSchedule::OAICatalogsFeedProcessingSchedule(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsFeedProcessingSchedule::OAICatalogsFeedProcessingSchedule() {
    this->initializeModel();
}

OAICatalogsFeedProcessingSchedule::~OAICatalogsFeedProcessingSchedule() {}

void OAICatalogsFeedProcessingSchedule::initializeModel() {

    m_time_isSet = false;
    m_time_isValid = false;

    m_timezone_isSet = false;
    m_timezone_isValid = false;
}

void OAICatalogsFeedProcessingSchedule::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsFeedProcessingSchedule::fromJsonObject(QJsonObject json) {

    m_time_isValid = ::OpenAPI::fromJsonValue(time, json[QString("time")]);
    m_time_isSet = !json[QString("time")].isNull() && m_time_isValid;

    m_timezone_isValid = ::OpenAPI::fromJsonValue(timezone, json[QString("timezone")]);
    m_timezone_isSet = !json[QString("timezone")].isNull() && m_timezone_isValid;
}

QString OAICatalogsFeedProcessingSchedule::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsFeedProcessingSchedule::asJsonObject() const {
    QJsonObject obj;
    if (m_time_isSet) {
        obj.insert(QString("time"), ::OpenAPI::toJsonValue(time));
    }
    if (m_timezone_isSet) {
        obj.insert(QString("timezone"), ::OpenAPI::toJsonValue(timezone));
    }
    return obj;
}

QString OAICatalogsFeedProcessingSchedule::getTime() const {
    return time;
}
void OAICatalogsFeedProcessingSchedule::setTime(const QString &time) {
    this->time = time;
    this->m_time_isSet = true;
}

bool OAICatalogsFeedProcessingSchedule::is_time_Set() const{
    return m_time_isSet;
}

bool OAICatalogsFeedProcessingSchedule::is_time_Valid() const{
    return m_time_isValid;
}

QString OAICatalogsFeedProcessingSchedule::getTimezone() const {
    return timezone;
}
void OAICatalogsFeedProcessingSchedule::setTimezone(const QString &timezone) {
    this->timezone = timezone;
    this->m_timezone_isSet = true;
}

bool OAICatalogsFeedProcessingSchedule::is_timezone_Set() const{
    return m_timezone_isSet;
}

bool OAICatalogsFeedProcessingSchedule::is_timezone_Valid() const{
    return m_timezone_isValid;
}

bool OAICatalogsFeedProcessingSchedule::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timezone_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsFeedProcessingSchedule::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_time_isValid && m_timezone_isValid && true;
}

} // namespace OpenAPI