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

#include "OAIOptimizationGoalMetadata_frequency_goal_metadata.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOptimizationGoalMetadata_frequency_goal_metadata::OAIOptimizationGoalMetadata_frequency_goal_metadata(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOptimizationGoalMetadata_frequency_goal_metadata::OAIOptimizationGoalMetadata_frequency_goal_metadata() {
    this->initializeModel();
}

OAIOptimizationGoalMetadata_frequency_goal_metadata::~OAIOptimizationGoalMetadata_frequency_goal_metadata() {}

void OAIOptimizationGoalMetadata_frequency_goal_metadata::initializeModel() {

    m_frequency_isSet = false;
    m_frequency_isValid = false;

    m_timerange_isSet = false;
    m_timerange_isValid = false;
}

void OAIOptimizationGoalMetadata_frequency_goal_metadata::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOptimizationGoalMetadata_frequency_goal_metadata::fromJsonObject(QJsonObject json) {

    m_frequency_isValid = ::OpenAPI::fromJsonValue(m_frequency, json[QString("frequency")]);
    m_frequency_isSet = !json[QString("frequency")].isNull() && m_frequency_isValid;

    m_timerange_isValid = ::OpenAPI::fromJsonValue(m_timerange, json[QString("timerange")]);
    m_timerange_isSet = !json[QString("timerange")].isNull() && m_timerange_isValid;
}

QString OAIOptimizationGoalMetadata_frequency_goal_metadata::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOptimizationGoalMetadata_frequency_goal_metadata::asJsonObject() const {
    QJsonObject obj;
    if (m_frequency_isSet) {
        obj.insert(QString("frequency"), ::OpenAPI::toJsonValue(m_frequency));
    }
    if (m_timerange_isSet) {
        obj.insert(QString("timerange"), ::OpenAPI::toJsonValue(m_timerange));
    }
    return obj;
}

qint32 OAIOptimizationGoalMetadata_frequency_goal_metadata::getFrequency() const {
    return m_frequency;
}
void OAIOptimizationGoalMetadata_frequency_goal_metadata::setFrequency(const qint32 &frequency) {
    m_frequency = frequency;
    m_frequency_isSet = true;
}

bool OAIOptimizationGoalMetadata_frequency_goal_metadata::is_frequency_Set() const{
    return m_frequency_isSet;
}

bool OAIOptimizationGoalMetadata_frequency_goal_metadata::is_frequency_Valid() const{
    return m_frequency_isValid;
}

QString OAIOptimizationGoalMetadata_frequency_goal_metadata::getTimerange() const {
    return m_timerange;
}
void OAIOptimizationGoalMetadata_frequency_goal_metadata::setTimerange(const QString &timerange) {
    m_timerange = timerange;
    m_timerange_isSet = true;
}

bool OAIOptimizationGoalMetadata_frequency_goal_metadata::is_timerange_Set() const{
    return m_timerange_isSet;
}

bool OAIOptimizationGoalMetadata_frequency_goal_metadata::is_timerange_Valid() const{
    return m_timerange_isValid;
}

bool OAIOptimizationGoalMetadata_frequency_goal_metadata::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_frequency_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timerange_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOptimizationGoalMetadata_frequency_goal_metadata::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
