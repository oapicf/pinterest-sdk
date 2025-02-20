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

#include "OAICatalogsReportDistributionStats.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsReportDistributionStats::OAICatalogsReportDistributionStats(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsReportDistributionStats::OAICatalogsReportDistributionStats() {
    this->initializeModel();
}

OAICatalogsReportDistributionStats::~OAICatalogsReportDistributionStats() {}

void OAICatalogsReportDistributionStats::initializeModel() {

    m_report_type_isSet = false;
    m_report_type_isValid = false;

    m_catalog_id_isSet = false;
    m_catalog_id_isValid = false;

    m_code_isSet = false;
    m_code_isValid = false;

    m_code_label_isSet = false;
    m_code_label_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;

    m_occurrences_isSet = false;
    m_occurrences_isValid = false;

    m_ineligible_for_ads_isSet = false;
    m_ineligible_for_ads_isValid = false;

    m_ineligible_for_organic_isSet = false;
    m_ineligible_for_organic_isValid = false;
}

void OAICatalogsReportDistributionStats::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsReportDistributionStats::fromJsonObject(QJsonObject json) {

    m_report_type_isValid = ::OpenAPI::fromJsonValue(m_report_type, json[QString("report_type")]);
    m_report_type_isSet = !json[QString("report_type")].isNull() && m_report_type_isValid;

    m_catalog_id_isValid = ::OpenAPI::fromJsonValue(m_catalog_id, json[QString("catalog_id")]);
    m_catalog_id_isSet = !json[QString("catalog_id")].isNull() && m_catalog_id_isValid;

    m_code_isValid = ::OpenAPI::fromJsonValue(m_code, json[QString("code")]);
    m_code_isSet = !json[QString("code")].isNull() && m_code_isValid;

    m_code_label_isValid = ::OpenAPI::fromJsonValue(m_code_label, json[QString("code_label")]);
    m_code_label_isSet = !json[QString("code_label")].isNull() && m_code_label_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(m_message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;

    m_occurrences_isValid = ::OpenAPI::fromJsonValue(m_occurrences, json[QString("occurrences")]);
    m_occurrences_isSet = !json[QString("occurrences")].isNull() && m_occurrences_isValid;

    m_ineligible_for_ads_isValid = ::OpenAPI::fromJsonValue(m_ineligible_for_ads, json[QString("ineligible_for_ads")]);
    m_ineligible_for_ads_isSet = !json[QString("ineligible_for_ads")].isNull() && m_ineligible_for_ads_isValid;

    m_ineligible_for_organic_isValid = ::OpenAPI::fromJsonValue(m_ineligible_for_organic, json[QString("ineligible_for_organic")]);
    m_ineligible_for_organic_isSet = !json[QString("ineligible_for_organic")].isNull() && m_ineligible_for_organic_isValid;
}

QString OAICatalogsReportDistributionStats::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsReportDistributionStats::asJsonObject() const {
    QJsonObject obj;
    if (m_report_type_isSet) {
        obj.insert(QString("report_type"), ::OpenAPI::toJsonValue(m_report_type));
    }
    if (m_catalog_id_isSet) {
        obj.insert(QString("catalog_id"), ::OpenAPI::toJsonValue(m_catalog_id));
    }
    if (m_code_isSet) {
        obj.insert(QString("code"), ::OpenAPI::toJsonValue(m_code));
    }
    if (m_code_label_isSet) {
        obj.insert(QString("code_label"), ::OpenAPI::toJsonValue(m_code_label));
    }
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(m_message));
    }
    if (m_occurrences_isSet) {
        obj.insert(QString("occurrences"), ::OpenAPI::toJsonValue(m_occurrences));
    }
    if (m_ineligible_for_ads_isSet) {
        obj.insert(QString("ineligible_for_ads"), ::OpenAPI::toJsonValue(m_ineligible_for_ads));
    }
    if (m_ineligible_for_organic_isSet) {
        obj.insert(QString("ineligible_for_organic"), ::OpenAPI::toJsonValue(m_ineligible_for_organic));
    }
    return obj;
}

QString OAICatalogsReportDistributionStats::getReportType() const {
    return m_report_type;
}
void OAICatalogsReportDistributionStats::setReportType(const QString &report_type) {
    m_report_type = report_type;
    m_report_type_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_report_type_Set() const{
    return m_report_type_isSet;
}

bool OAICatalogsReportDistributionStats::is_report_type_Valid() const{
    return m_report_type_isValid;
}

QString OAICatalogsReportDistributionStats::getCatalogId() const {
    return m_catalog_id;
}
void OAICatalogsReportDistributionStats::setCatalogId(const QString &catalog_id) {
    m_catalog_id = catalog_id;
    m_catalog_id_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_catalog_id_Set() const{
    return m_catalog_id_isSet;
}

bool OAICatalogsReportDistributionStats::is_catalog_id_Valid() const{
    return m_catalog_id_isValid;
}

qint32 OAICatalogsReportDistributionStats::getCode() const {
    return m_code;
}
void OAICatalogsReportDistributionStats::setCode(const qint32 &code) {
    m_code = code;
    m_code_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_code_Set() const{
    return m_code_isSet;
}

bool OAICatalogsReportDistributionStats::is_code_Valid() const{
    return m_code_isValid;
}

QString OAICatalogsReportDistributionStats::getCodeLabel() const {
    return m_code_label;
}
void OAICatalogsReportDistributionStats::setCodeLabel(const QString &code_label) {
    m_code_label = code_label;
    m_code_label_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_code_label_Set() const{
    return m_code_label_isSet;
}

bool OAICatalogsReportDistributionStats::is_code_label_Valid() const{
    return m_code_label_isValid;
}

QString OAICatalogsReportDistributionStats::getMessage() const {
    return m_message;
}
void OAICatalogsReportDistributionStats::setMessage(const QString &message) {
    m_message = message;
    m_message_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_message_Set() const{
    return m_message_isSet;
}

bool OAICatalogsReportDistributionStats::is_message_Valid() const{
    return m_message_isValid;
}

qint32 OAICatalogsReportDistributionStats::getOccurrences() const {
    return m_occurrences;
}
void OAICatalogsReportDistributionStats::setOccurrences(const qint32 &occurrences) {
    m_occurrences = occurrences;
    m_occurrences_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_occurrences_Set() const{
    return m_occurrences_isSet;
}

bool OAICatalogsReportDistributionStats::is_occurrences_Valid() const{
    return m_occurrences_isValid;
}

bool OAICatalogsReportDistributionStats::isIneligibleForAds() const {
    return m_ineligible_for_ads;
}
void OAICatalogsReportDistributionStats::setIneligibleForAds(const bool &ineligible_for_ads) {
    m_ineligible_for_ads = ineligible_for_ads;
    m_ineligible_for_ads_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_ineligible_for_ads_Set() const{
    return m_ineligible_for_ads_isSet;
}

bool OAICatalogsReportDistributionStats::is_ineligible_for_ads_Valid() const{
    return m_ineligible_for_ads_isValid;
}

bool OAICatalogsReportDistributionStats::isIneligibleForOrganic() const {
    return m_ineligible_for_organic;
}
void OAICatalogsReportDistributionStats::setIneligibleForOrganic(const bool &ineligible_for_organic) {
    m_ineligible_for_organic = ineligible_for_organic;
    m_ineligible_for_organic_isSet = true;
}

bool OAICatalogsReportDistributionStats::is_ineligible_for_organic_Set() const{
    return m_ineligible_for_organic_isSet;
}

bool OAICatalogsReportDistributionStats::is_ineligible_for_organic_Valid() const{
    return m_ineligible_for_organic_isValid;
}

bool OAICatalogsReportDistributionStats::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_report_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_catalog_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_code_label_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_occurrences_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ineligible_for_ads_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ineligible_for_organic_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsReportDistributionStats::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
