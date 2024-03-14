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

#include "OAIKeywordsMetricsArrayResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIKeywordsMetricsArrayResponse::OAIKeywordsMetricsArrayResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIKeywordsMetricsArrayResponse::OAIKeywordsMetricsArrayResponse() {
    this->initializeModel();
}

OAIKeywordsMetricsArrayResponse::~OAIKeywordsMetricsArrayResponse() {}

void OAIKeywordsMetricsArrayResponse::initializeModel() {

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIKeywordsMetricsArrayResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIKeywordsMetricsArrayResponse::fromJsonObject(QJsonObject json) {

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIKeywordsMetricsArrayResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIKeywordsMetricsArrayResponse::asJsonObject() const {
    QJsonObject obj;
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    return obj;
}

QList<OAIKeywordMetricsResponse> OAIKeywordsMetricsArrayResponse::getData() const {
    return data;
}
void OAIKeywordsMetricsArrayResponse::setData(const QList<OAIKeywordMetricsResponse> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIKeywordsMetricsArrayResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIKeywordsMetricsArrayResponse::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIKeywordsMetricsArrayResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (data.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIKeywordsMetricsArrayResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI