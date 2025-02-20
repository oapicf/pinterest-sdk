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

#include "OAIMetricsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMetricsResponse::OAIMetricsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMetricsResponse::OAIMetricsResponse() {
    this->initializeModel();
}

OAIMetricsResponse::~OAIMetricsResponse() {}

void OAIMetricsResponse::initializeModel() {

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIMetricsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMetricsResponse::fromJsonObject(QJsonObject json) {

    m_data_isValid = ::OpenAPI::fromJsonValue(m_data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIMetricsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMetricsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(m_data));
    }
    return obj;
}

QList<OAIObject> OAIMetricsResponse::getData() const {
    return m_data;
}
void OAIMetricsResponse::setData(const QList<OAIObject> &data) {
    m_data = data;
    m_data_isSet = true;
}

bool OAIMetricsResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIMetricsResponse::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIMetricsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_data.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMetricsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
