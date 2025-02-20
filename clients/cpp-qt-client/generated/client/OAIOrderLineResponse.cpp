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

#include "OAIOrderLineResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderLineResponse::OAIOrderLineResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderLineResponse::OAIOrderLineResponse() {
    this->initializeModel();
}

OAIOrderLineResponse::~OAIOrderLineResponse() {}

void OAIOrderLineResponse::initializeModel() {

    m_errors_isSet = false;
    m_errors_isValid = false;

    m_order_line_isSet = false;
    m_order_line_isValid = false;
}

void OAIOrderLineResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderLineResponse::fromJsonObject(QJsonObject json) {

    m_errors_isValid = ::OpenAPI::fromJsonValue(m_errors, json[QString("errors")]);
    m_errors_isSet = !json[QString("errors")].isNull() && m_errors_isValid;

    m_order_line_isValid = ::OpenAPI::fromJsonValue(m_order_line, json[QString("order_line")]);
    m_order_line_isSet = !json[QString("order_line")].isNull() && m_order_line_isValid;
}

QString OAIOrderLineResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderLineResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_errors.size() > 0) {
        obj.insert(QString("errors"), ::OpenAPI::toJsonValue(m_errors));
    }
    if (m_order_line.size() > 0) {
        obj.insert(QString("order_line"), ::OpenAPI::toJsonValue(m_order_line));
    }
    return obj;
}

QList<OAIOrderLineError> OAIOrderLineResponse::getErrors() const {
    return m_errors;
}
void OAIOrderLineResponse::setErrors(const QList<OAIOrderLineError> &errors) {
    m_errors = errors;
    m_errors_isSet = true;
}

bool OAIOrderLineResponse::is_errors_Set() const{
    return m_errors_isSet;
}

bool OAIOrderLineResponse::is_errors_Valid() const{
    return m_errors_isValid;
}

QList<OAIOrderLine> OAIOrderLineResponse::getOrderLine() const {
    return m_order_line;
}
void OAIOrderLineResponse::setOrderLine(const QList<OAIOrderLine> &order_line) {
    m_order_line = order_line;
    m_order_line_isSet = true;
}

bool OAIOrderLineResponse::is_order_line_Set() const{
    return m_order_line_isSet;
}

bool OAIOrderLineResponse::is_order_line_Valid() const{
    return m_order_line_isValid;
}

bool OAIOrderLineResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_errors.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_order_line.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderLineResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
