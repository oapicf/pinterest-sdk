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

#include "OAIIntegrationLogClientRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIIntegrationLogClientRequest::OAIIntegrationLogClientRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIIntegrationLogClientRequest::OAIIntegrationLogClientRequest() {
    this->initializeModel();
}

OAIIntegrationLogClientRequest::~OAIIntegrationLogClientRequest() {}

void OAIIntegrationLogClientRequest::initializeModel() {

    m_method_isSet = false;
    m_method_isValid = false;

    m_host_isSet = false;
    m_host_isValid = false;

    m_path_isSet = false;
    m_path_isValid = false;

    m_request_headers_isSet = false;
    m_request_headers_isValid = false;

    m_response_headers_isSet = false;
    m_response_headers_isValid = false;

    m_response_status_code_isSet = false;
    m_response_status_code_isValid = false;
}

void OAIIntegrationLogClientRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIIntegrationLogClientRequest::fromJsonObject(QJsonObject json) {

    m_method_isValid = ::OpenAPI::fromJsonValue(method, json[QString("method")]);
    m_method_isSet = !json[QString("method")].isNull() && m_method_isValid;

    m_host_isValid = ::OpenAPI::fromJsonValue(host, json[QString("host")]);
    m_host_isSet = !json[QString("host")].isNull() && m_host_isValid;

    m_path_isValid = ::OpenAPI::fromJsonValue(path, json[QString("path")]);
    m_path_isSet = !json[QString("path")].isNull() && m_path_isValid;

    m_request_headers_isValid = ::OpenAPI::fromJsonValue(request_headers, json[QString("request_headers")]);
    m_request_headers_isSet = !json[QString("request_headers")].isNull() && m_request_headers_isValid;

    m_response_headers_isValid = ::OpenAPI::fromJsonValue(response_headers, json[QString("response_headers")]);
    m_response_headers_isSet = !json[QString("response_headers")].isNull() && m_response_headers_isValid;

    m_response_status_code_isValid = ::OpenAPI::fromJsonValue(response_status_code, json[QString("response_status_code")]);
    m_response_status_code_isSet = !json[QString("response_status_code")].isNull() && m_response_status_code_isValid;
}

QString OAIIntegrationLogClientRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIIntegrationLogClientRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_method_isSet) {
        obj.insert(QString("method"), ::OpenAPI::toJsonValue(method));
    }
    if (m_host_isSet) {
        obj.insert(QString("host"), ::OpenAPI::toJsonValue(host));
    }
    if (m_path_isSet) {
        obj.insert(QString("path"), ::OpenAPI::toJsonValue(path));
    }
    if (request_headers.size() > 0) {
        obj.insert(QString("request_headers"), ::OpenAPI::toJsonValue(request_headers));
    }
    if (response_headers.size() > 0) {
        obj.insert(QString("response_headers"), ::OpenAPI::toJsonValue(response_headers));
    }
    if (m_response_status_code_isSet) {
        obj.insert(QString("response_status_code"), ::OpenAPI::toJsonValue(response_status_code));
    }
    return obj;
}

QString OAIIntegrationLogClientRequest::getMethod() const {
    return method;
}
void OAIIntegrationLogClientRequest::setMethod(const QString &method) {
    this->method = method;
    this->m_method_isSet = true;
}

bool OAIIntegrationLogClientRequest::is_method_Set() const{
    return m_method_isSet;
}

bool OAIIntegrationLogClientRequest::is_method_Valid() const{
    return m_method_isValid;
}

QString OAIIntegrationLogClientRequest::getHost() const {
    return host;
}
void OAIIntegrationLogClientRequest::setHost(const QString &host) {
    this->host = host;
    this->m_host_isSet = true;
}

bool OAIIntegrationLogClientRequest::is_host_Set() const{
    return m_host_isSet;
}

bool OAIIntegrationLogClientRequest::is_host_Valid() const{
    return m_host_isValid;
}

QString OAIIntegrationLogClientRequest::getPath() const {
    return path;
}
void OAIIntegrationLogClientRequest::setPath(const QString &path) {
    this->path = path;
    this->m_path_isSet = true;
}

bool OAIIntegrationLogClientRequest::is_path_Set() const{
    return m_path_isSet;
}

bool OAIIntegrationLogClientRequest::is_path_Valid() const{
    return m_path_isValid;
}

QMap<QString, QString> OAIIntegrationLogClientRequest::getRequestHeaders() const {
    return request_headers;
}
void OAIIntegrationLogClientRequest::setRequestHeaders(const QMap<QString, QString> &request_headers) {
    this->request_headers = request_headers;
    this->m_request_headers_isSet = true;
}

bool OAIIntegrationLogClientRequest::is_request_headers_Set() const{
    return m_request_headers_isSet;
}

bool OAIIntegrationLogClientRequest::is_request_headers_Valid() const{
    return m_request_headers_isValid;
}

QMap<QString, QString> OAIIntegrationLogClientRequest::getResponseHeaders() const {
    return response_headers;
}
void OAIIntegrationLogClientRequest::setResponseHeaders(const QMap<QString, QString> &response_headers) {
    this->response_headers = response_headers;
    this->m_response_headers_isSet = true;
}

bool OAIIntegrationLogClientRequest::is_response_headers_Set() const{
    return m_response_headers_isSet;
}

bool OAIIntegrationLogClientRequest::is_response_headers_Valid() const{
    return m_response_headers_isValid;
}

qint32 OAIIntegrationLogClientRequest::getResponseStatusCode() const {
    return response_status_code;
}
void OAIIntegrationLogClientRequest::setResponseStatusCode(const qint32 &response_status_code) {
    this->response_status_code = response_status_code;
    this->m_response_status_code_isSet = true;
}

bool OAIIntegrationLogClientRequest::is_response_status_code_Set() const{
    return m_response_status_code_isSet;
}

bool OAIIntegrationLogClientRequest::is_response_status_code_Valid() const{
    return m_response_status_code_isValid;
}

bool OAIIntegrationLogClientRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_method_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_host_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_path_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (request_headers.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (response_headers.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_response_status_code_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIIntegrationLogClientRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_method_isValid && m_host_isValid && m_path_isValid && true;
}

} // namespace OpenAPI