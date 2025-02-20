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

#include "OAICatalogsFeedIngestionDetails.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsFeedIngestionDetails::OAICatalogsFeedIngestionDetails(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsFeedIngestionDetails::OAICatalogsFeedIngestionDetails() {
    this->initializeModel();
}

OAICatalogsFeedIngestionDetails::~OAICatalogsFeedIngestionDetails() {}

void OAICatalogsFeedIngestionDetails::initializeModel() {

    m_errors_isSet = false;
    m_errors_isValid = false;

    m_info_isSet = false;
    m_info_isValid = false;

    m_warnings_isSet = false;
    m_warnings_isValid = false;
}

void OAICatalogsFeedIngestionDetails::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsFeedIngestionDetails::fromJsonObject(QJsonObject json) {

    m_errors_isValid = ::OpenAPI::fromJsonValue(errors, json[QString("errors")]);
    m_errors_isSet = !json[QString("errors")].isNull() && m_errors_isValid;

    m_info_isValid = ::OpenAPI::fromJsonValue(info, json[QString("info")]);
    m_info_isSet = !json[QString("info")].isNull() && m_info_isValid;

    m_warnings_isValid = ::OpenAPI::fromJsonValue(warnings, json[QString("warnings")]);
    m_warnings_isSet = !json[QString("warnings")].isNull() && m_warnings_isValid;
}

QString OAICatalogsFeedIngestionDetails::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsFeedIngestionDetails::asJsonObject() const {
    QJsonObject obj;
    if (errors.isSet()) {
        obj.insert(QString("errors"), ::OpenAPI::toJsonValue(errors));
    }
    if (info.isSet()) {
        obj.insert(QString("info"), ::OpenAPI::toJsonValue(info));
    }
    if (warnings.isSet()) {
        obj.insert(QString("warnings"), ::OpenAPI::toJsonValue(warnings));
    }
    return obj;
}

OAICatalogsFeedIngestionErrors OAICatalogsFeedIngestionDetails::getErrors() const {
    return errors;
}
void OAICatalogsFeedIngestionDetails::setErrors(const OAICatalogsFeedIngestionErrors &errors) {
    this->errors = errors;
    this->m_errors_isSet = true;
}

bool OAICatalogsFeedIngestionDetails::is_errors_Set() const{
    return m_errors_isSet;
}

bool OAICatalogsFeedIngestionDetails::is_errors_Valid() const{
    return m_errors_isValid;
}

OAICatalogsFeedIngestionInfo OAICatalogsFeedIngestionDetails::getInfo() const {
    return info;
}
void OAICatalogsFeedIngestionDetails::setInfo(const OAICatalogsFeedIngestionInfo &info) {
    this->info = info;
    this->m_info_isSet = true;
}

bool OAICatalogsFeedIngestionDetails::is_info_Set() const{
    return m_info_isSet;
}

bool OAICatalogsFeedIngestionDetails::is_info_Valid() const{
    return m_info_isValid;
}

OAICatalogsFeedIngestionWarnings OAICatalogsFeedIngestionDetails::getWarnings() const {
    return warnings;
}
void OAICatalogsFeedIngestionDetails::setWarnings(const OAICatalogsFeedIngestionWarnings &warnings) {
    this->warnings = warnings;
    this->m_warnings_isSet = true;
}

bool OAICatalogsFeedIngestionDetails::is_warnings_Set() const{
    return m_warnings_isSet;
}

bool OAICatalogsFeedIngestionDetails::is_warnings_Valid() const{
    return m_warnings_isValid;
}

bool OAICatalogsFeedIngestionDetails::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (errors.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (info.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (warnings.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsFeedIngestionDetails::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_errors_isValid && m_info_isValid && m_warnings_isValid && true;
}

} // namespace OpenAPI
