/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIPins_analytics_metric_types_parameter_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPins_analytics_metric_types_parameter_inner::OAIPins_analytics_metric_types_parameter_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPins_analytics_metric_types_parameter_inner::OAIPins_analytics_metric_types_parameter_inner() {
    this->initializeModel();
}

OAIPins_analytics_metric_types_parameter_inner::~OAIPins_analytics_metric_types_parameter_inner() {}

void OAIPins_analytics_metric_types_parameter_inner::initializeModel() {

}

void OAIPins_analytics_metric_types_parameter_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPins_analytics_metric_types_parameter_inner::fromJsonObject(QJsonObject json) {

}

QString OAIPins_analytics_metric_types_parameter_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPins_analytics_metric_types_parameter_inner::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAIPins_analytics_metric_types_parameter_inner::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAIPins_analytics_metric_types_parameter_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI