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

#include "OAICreateMMMReportRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateMMMReportRequest::OAICreateMMMReportRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateMMMReportRequest::OAICreateMMMReportRequest() {
    this->initializeModel();
}

OAICreateMMMReportRequest::~OAICreateMMMReportRequest() {}

void OAICreateMMMReportRequest::initializeModel() {

    m_report_name_isSet = false;
    m_report_name_isValid = false;

    m_start_date_isSet = false;
    m_start_date_isValid = false;

    m_end_date_isSet = false;
    m_end_date_isValid = false;

    m_granularity_isSet = false;
    m_granularity_isValid = false;

    m_level_isSet = false;
    m_level_isValid = false;

    m_targeting_types_isSet = false;
    m_targeting_types_isValid = false;

    m_columns_isSet = false;
    m_columns_isValid = false;

    m_countries_isSet = false;
    m_countries_isValid = false;
}

void OAICreateMMMReportRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateMMMReportRequest::fromJsonObject(QJsonObject json) {

    m_report_name_isValid = ::OpenAPI::fromJsonValue(m_report_name, json[QString("report_name")]);
    m_report_name_isSet = !json[QString("report_name")].isNull() && m_report_name_isValid;

    m_start_date_isValid = ::OpenAPI::fromJsonValue(m_start_date, json[QString("start_date")]);
    m_start_date_isSet = !json[QString("start_date")].isNull() && m_start_date_isValid;

    m_end_date_isValid = ::OpenAPI::fromJsonValue(m_end_date, json[QString("end_date")]);
    m_end_date_isSet = !json[QString("end_date")].isNull() && m_end_date_isValid;

    m_granularity_isValid = ::OpenAPI::fromJsonValue(m_granularity, json[QString("granularity")]);
    m_granularity_isSet = !json[QString("granularity")].isNull() && m_granularity_isValid;

    m_level_isValid = ::OpenAPI::fromJsonValue(m_level, json[QString("level")]);
    m_level_isSet = !json[QString("level")].isNull() && m_level_isValid;

    m_targeting_types_isValid = ::OpenAPI::fromJsonValue(m_targeting_types, json[QString("targeting_types")]);
    m_targeting_types_isSet = !json[QString("targeting_types")].isNull() && m_targeting_types_isValid;

    m_columns_isValid = ::OpenAPI::fromJsonValue(m_columns, json[QString("columns")]);
    m_columns_isSet = !json[QString("columns")].isNull() && m_columns_isValid;

    m_countries_isValid = ::OpenAPI::fromJsonValue(m_countries, json[QString("countries")]);
    m_countries_isSet = !json[QString("countries")].isNull() && m_countries_isValid;
}

QString OAICreateMMMReportRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateMMMReportRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_report_name_isSet) {
        obj.insert(QString("report_name"), ::OpenAPI::toJsonValue(m_report_name));
    }
    if (m_start_date_isSet) {
        obj.insert(QString("start_date"), ::OpenAPI::toJsonValue(m_start_date));
    }
    if (m_end_date_isSet) {
        obj.insert(QString("end_date"), ::OpenAPI::toJsonValue(m_end_date));
    }
    if (m_granularity_isSet) {
        obj.insert(QString("granularity"), ::OpenAPI::toJsonValue(m_granularity));
    }
    if (m_level_isSet) {
        obj.insert(QString("level"), ::OpenAPI::toJsonValue(m_level));
    }
    if (m_targeting_types.size() > 0) {
        obj.insert(QString("targeting_types"), ::OpenAPI::toJsonValue(m_targeting_types));
    }
    if (m_columns.size() > 0) {
        obj.insert(QString("columns"), ::OpenAPI::toJsonValue(m_columns));
    }
    if (m_countries.size() > 0) {
        obj.insert(QString("countries"), ::OpenAPI::toJsonValue(m_countries));
    }
    return obj;
}

QString OAICreateMMMReportRequest::getReportName() const {
    return m_report_name;
}
void OAICreateMMMReportRequest::setReportName(const QString &report_name) {
    m_report_name = report_name;
    m_report_name_isSet = true;
}

bool OAICreateMMMReportRequest::is_report_name_Set() const{
    return m_report_name_isSet;
}

bool OAICreateMMMReportRequest::is_report_name_Valid() const{
    return m_report_name_isValid;
}

QString OAICreateMMMReportRequest::getStartDate() const {
    return m_start_date;
}
void OAICreateMMMReportRequest::setStartDate(const QString &start_date) {
    m_start_date = start_date;
    m_start_date_isSet = true;
}

bool OAICreateMMMReportRequest::is_start_date_Set() const{
    return m_start_date_isSet;
}

bool OAICreateMMMReportRequest::is_start_date_Valid() const{
    return m_start_date_isValid;
}

QString OAICreateMMMReportRequest::getEndDate() const {
    return m_end_date;
}
void OAICreateMMMReportRequest::setEndDate(const QString &end_date) {
    m_end_date = end_date;
    m_end_date_isSet = true;
}

bool OAICreateMMMReportRequest::is_end_date_Set() const{
    return m_end_date_isSet;
}

bool OAICreateMMMReportRequest::is_end_date_Valid() const{
    return m_end_date_isValid;
}

QString OAICreateMMMReportRequest::getGranularity() const {
    return m_granularity;
}
void OAICreateMMMReportRequest::setGranularity(const QString &granularity) {
    m_granularity = granularity;
    m_granularity_isSet = true;
}

bool OAICreateMMMReportRequest::is_granularity_Set() const{
    return m_granularity_isSet;
}

bool OAICreateMMMReportRequest::is_granularity_Valid() const{
    return m_granularity_isValid;
}

QString OAICreateMMMReportRequest::getLevel() const {
    return m_level;
}
void OAICreateMMMReportRequest::setLevel(const QString &level) {
    m_level = level;
    m_level_isSet = true;
}

bool OAICreateMMMReportRequest::is_level_Set() const{
    return m_level_isSet;
}

bool OAICreateMMMReportRequest::is_level_Valid() const{
    return m_level_isValid;
}

QList<OAIMMMReportingTargetingType> OAICreateMMMReportRequest::getTargetingTypes() const {
    return m_targeting_types;
}
void OAICreateMMMReportRequest::setTargetingTypes(const QList<OAIMMMReportingTargetingType> &targeting_types) {
    m_targeting_types = targeting_types;
    m_targeting_types_isSet = true;
}

bool OAICreateMMMReportRequest::is_targeting_types_Set() const{
    return m_targeting_types_isSet;
}

bool OAICreateMMMReportRequest::is_targeting_types_Valid() const{
    return m_targeting_types_isValid;
}

QList<OAIMMMReportingColumn> OAICreateMMMReportRequest::getColumns() const {
    return m_columns;
}
void OAICreateMMMReportRequest::setColumns(const QList<OAIMMMReportingColumn> &columns) {
    m_columns = columns;
    m_columns_isSet = true;
}

bool OAICreateMMMReportRequest::is_columns_Set() const{
    return m_columns_isSet;
}

bool OAICreateMMMReportRequest::is_columns_Valid() const{
    return m_columns_isValid;
}

QList<OAITargetingAdvertiserCountry> OAICreateMMMReportRequest::getCountries() const {
    return m_countries;
}
void OAICreateMMMReportRequest::setCountries(const QList<OAITargetingAdvertiserCountry> &countries) {
    m_countries = countries;
    m_countries_isSet = true;
}

bool OAICreateMMMReportRequest::is_countries_Set() const{
    return m_countries_isSet;
}

bool OAICreateMMMReportRequest::is_countries_Valid() const{
    return m_countries_isValid;
}

bool OAICreateMMMReportRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_report_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_start_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_end_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_granularity_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_level_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_targeting_types.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_columns.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_countries.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateMMMReportRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_report_name_isValid && m_start_date_isValid && m_end_date_isValid && m_granularity_isValid && m_level_isValid && m_targeting_types_isValid && m_columns_isValid && true;
}

} // namespace OpenAPI