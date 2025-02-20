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

#include "OAITargetingTemplateAudienceSizing_reach_estimate.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITargetingTemplateAudienceSizing_reach_estimate::OAITargetingTemplateAudienceSizing_reach_estimate(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITargetingTemplateAudienceSizing_reach_estimate::OAITargetingTemplateAudienceSizing_reach_estimate() {
    this->initializeModel();
}

OAITargetingTemplateAudienceSizing_reach_estimate::~OAITargetingTemplateAudienceSizing_reach_estimate() {}

void OAITargetingTemplateAudienceSizing_reach_estimate::initializeModel() {

    m_estimate_isSet = false;
    m_estimate_isValid = false;

    m_lower_bound_isSet = false;
    m_lower_bound_isValid = false;

    m_upper_bound_isSet = false;
    m_upper_bound_isValid = false;
}

void OAITargetingTemplateAudienceSizing_reach_estimate::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAITargetingTemplateAudienceSizing_reach_estimate::fromJsonObject(QJsonObject json) {

    m_estimate_isValid = ::OpenAPI::fromJsonValue(m_estimate, json[QString("estimate")]);
    m_estimate_isSet = !json[QString("estimate")].isNull() && m_estimate_isValid;

    m_lower_bound_isValid = ::OpenAPI::fromJsonValue(m_lower_bound, json[QString("lower_bound")]);
    m_lower_bound_isSet = !json[QString("lower_bound")].isNull() && m_lower_bound_isValid;

    m_upper_bound_isValid = ::OpenAPI::fromJsonValue(m_upper_bound, json[QString("upper_bound")]);
    m_upper_bound_isSet = !json[QString("upper_bound")].isNull() && m_upper_bound_isValid;
}

QString OAITargetingTemplateAudienceSizing_reach_estimate::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAITargetingTemplateAudienceSizing_reach_estimate::asJsonObject() const {
    QJsonObject obj;
    if (m_estimate_isSet) {
        obj.insert(QString("estimate"), ::OpenAPI::toJsonValue(m_estimate));
    }
    if (m_lower_bound_isSet) {
        obj.insert(QString("lower_bound"), ::OpenAPI::toJsonValue(m_lower_bound));
    }
    if (m_upper_bound_isSet) {
        obj.insert(QString("upper_bound"), ::OpenAPI::toJsonValue(m_upper_bound));
    }
    return obj;
}

qint64 OAITargetingTemplateAudienceSizing_reach_estimate::getEstimate() const {
    return m_estimate;
}
void OAITargetingTemplateAudienceSizing_reach_estimate::setEstimate(const qint64 &estimate) {
    m_estimate = estimate;
    m_estimate_isSet = true;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::is_estimate_Set() const{
    return m_estimate_isSet;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::is_estimate_Valid() const{
    return m_estimate_isValid;
}

qint64 OAITargetingTemplateAudienceSizing_reach_estimate::getLowerBound() const {
    return m_lower_bound;
}
void OAITargetingTemplateAudienceSizing_reach_estimate::setLowerBound(const qint64 &lower_bound) {
    m_lower_bound = lower_bound;
    m_lower_bound_isSet = true;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::is_lower_bound_Set() const{
    return m_lower_bound_isSet;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::is_lower_bound_Valid() const{
    return m_lower_bound_isValid;
}

qint64 OAITargetingTemplateAudienceSizing_reach_estimate::getUpperBound() const {
    return m_upper_bound;
}
void OAITargetingTemplateAudienceSizing_reach_estimate::setUpperBound(const qint64 &upper_bound) {
    m_upper_bound = upper_bound;
    m_upper_bound_isSet = true;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::is_upper_bound_Set() const{
    return m_upper_bound_isSet;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::is_upper_bound_Valid() const{
    return m_upper_bound_isValid;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_estimate_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_lower_bound_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_upper_bound_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAITargetingTemplateAudienceSizing_reach_estimate::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
