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

#include "OAICatalogsItemValidationIssues.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsItemValidationIssues::OAICatalogsItemValidationIssues(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsItemValidationIssues::OAICatalogsItemValidationIssues() {
    this->initializeModel();
}

OAICatalogsItemValidationIssues::~OAICatalogsItemValidationIssues() {}

void OAICatalogsItemValidationIssues::initializeModel() {

    m_item_number_isSet = false;
    m_item_number_isValid = false;

    m_item_id_isSet = false;
    m_item_id_isValid = false;

    m_errors_isSet = false;
    m_errors_isValid = false;

    m_warnings_isSet = false;
    m_warnings_isValid = false;
}

void OAICatalogsItemValidationIssues::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsItemValidationIssues::fromJsonObject(QJsonObject json) {

    m_item_number_isValid = ::OpenAPI::fromJsonValue(item_number, json[QString("item_number")]);
    m_item_number_isSet = !json[QString("item_number")].isNull() && m_item_number_isValid;

    m_item_id_isValid = ::OpenAPI::fromJsonValue(item_id, json[QString("item_id")]);
    m_item_id_isSet = !json[QString("item_id")].isNull() && m_item_id_isValid;

    m_errors_isValid = ::OpenAPI::fromJsonValue(errors, json[QString("errors")]);
    m_errors_isSet = !json[QString("errors")].isNull() && m_errors_isValid;

    m_warnings_isValid = ::OpenAPI::fromJsonValue(warnings, json[QString("warnings")]);
    m_warnings_isSet = !json[QString("warnings")].isNull() && m_warnings_isValid;
}

QString OAICatalogsItemValidationIssues::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsItemValidationIssues::asJsonObject() const {
    QJsonObject obj;
    if (m_item_number_isSet) {
        obj.insert(QString("item_number"), ::OpenAPI::toJsonValue(item_number));
    }
    if (m_item_id_isSet) {
        obj.insert(QString("item_id"), ::OpenAPI::toJsonValue(item_id));
    }
    if (errors.isSet()) {
        obj.insert(QString("errors"), ::OpenAPI::toJsonValue(errors));
    }
    if (warnings.isSet()) {
        obj.insert(QString("warnings"), ::OpenAPI::toJsonValue(warnings));
    }
    return obj;
}

qint32 OAICatalogsItemValidationIssues::getItemNumber() const {
    return item_number;
}
void OAICatalogsItemValidationIssues::setItemNumber(const qint32 &item_number) {
    this->item_number = item_number;
    this->m_item_number_isSet = true;
}

bool OAICatalogsItemValidationIssues::is_item_number_Set() const{
    return m_item_number_isSet;
}

bool OAICatalogsItemValidationIssues::is_item_number_Valid() const{
    return m_item_number_isValid;
}

QString OAICatalogsItemValidationIssues::getItemId() const {
    return item_id;
}
void OAICatalogsItemValidationIssues::setItemId(const QString &item_id) {
    this->item_id = item_id;
    this->m_item_id_isSet = true;
}

bool OAICatalogsItemValidationIssues::is_item_id_Set() const{
    return m_item_id_isSet;
}

bool OAICatalogsItemValidationIssues::is_item_id_Valid() const{
    return m_item_id_isValid;
}

OAICatalogsItemValidationErrors OAICatalogsItemValidationIssues::getErrors() const {
    return errors;
}
void OAICatalogsItemValidationIssues::setErrors(const OAICatalogsItemValidationErrors &errors) {
    this->errors = errors;
    this->m_errors_isSet = true;
}

bool OAICatalogsItemValidationIssues::is_errors_Set() const{
    return m_errors_isSet;
}

bool OAICatalogsItemValidationIssues::is_errors_Valid() const{
    return m_errors_isValid;
}

OAICatalogsItemValidationWarnings OAICatalogsItemValidationIssues::getWarnings() const {
    return warnings;
}
void OAICatalogsItemValidationIssues::setWarnings(const OAICatalogsItemValidationWarnings &warnings) {
    this->warnings = warnings;
    this->m_warnings_isSet = true;
}

bool OAICatalogsItemValidationIssues::is_warnings_Set() const{
    return m_warnings_isSet;
}

bool OAICatalogsItemValidationIssues::is_warnings_Valid() const{
    return m_warnings_isValid;
}

bool OAICatalogsItemValidationIssues::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_item_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_item_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (errors.isSet()) {
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

bool OAICatalogsItemValidationIssues::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_item_number_isValid && m_item_id_isValid && m_errors_isValid && m_warnings_isValid && true;
}

} // namespace OpenAPI
