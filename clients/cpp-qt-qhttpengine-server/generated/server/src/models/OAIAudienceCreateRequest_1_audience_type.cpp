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

#include "OAIAudienceCreateRequest_1_audience_type.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAudienceCreateRequest_1_audience_type::OAIAudienceCreateRequest_1_audience_type(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAudienceCreateRequest_1_audience_type::OAIAudienceCreateRequest_1_audience_type() {
    this->initializeModel();
}

OAIAudienceCreateRequest_1_audience_type::~OAIAudienceCreateRequest_1_audience_type() {}

void OAIAudienceCreateRequest_1_audience_type::initializeModel() {

}

void OAIAudienceCreateRequest_1_audience_type::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAudienceCreateRequest_1_audience_type::fromJsonObject(QJsonObject json) {

}

QString OAIAudienceCreateRequest_1_audience_type::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAudienceCreateRequest_1_audience_type::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAIAudienceCreateRequest_1_audience_type::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAIAudienceCreateRequest_1_audience_type::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
