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

#include "OAICatalogsFeedProcessingResult.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsFeedProcessingResult::OAICatalogsFeedProcessingResult(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsFeedProcessingResult::OAICatalogsFeedProcessingResult() {
    this->initializeModel();
}

OAICatalogsFeedProcessingResult::~OAICatalogsFeedProcessingResult() {}

void OAICatalogsFeedProcessingResult::initializeModel() {

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_updated_at_isSet = false;
    m_updated_at_isValid = false;

    m_ingestion_details_isSet = false;
    m_ingestion_details_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_product_counts_isSet = false;
    m_product_counts_isValid = false;

    m_validation_details_isSet = false;
    m_validation_details_isValid = false;
}

void OAICatalogsFeedProcessingResult::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsFeedProcessingResult::fromJsonObject(QJsonObject json) {

    m_created_at_isValid = ::OpenAPI::fromJsonValue(m_created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_updated_at_isValid = ::OpenAPI::fromJsonValue(m_updated_at, json[QString("updated_at")]);
    m_updated_at_isSet = !json[QString("updated_at")].isNull() && m_updated_at_isValid;

    m_ingestion_details_isValid = ::OpenAPI::fromJsonValue(m_ingestion_details, json[QString("ingestion_details")]);
    m_ingestion_details_isSet = !json[QString("ingestion_details")].isNull() && m_ingestion_details_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_product_counts_isValid = ::OpenAPI::fromJsonValue(m_product_counts, json[QString("product_counts")]);
    m_product_counts_isSet = !json[QString("product_counts")].isNull() && m_product_counts_isValid;

    m_validation_details_isValid = ::OpenAPI::fromJsonValue(m_validation_details, json[QString("validation_details")]);
    m_validation_details_isSet = !json[QString("validation_details")].isNull() && m_validation_details_isValid;
}

QString OAICatalogsFeedProcessingResult::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsFeedProcessingResult::asJsonObject() const {
    QJsonObject obj;
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(m_created_at));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_updated_at_isSet) {
        obj.insert(QString("updated_at"), ::OpenAPI::toJsonValue(m_updated_at));
    }
    if (m_ingestion_details.isSet()) {
        obj.insert(QString("ingestion_details"), ::OpenAPI::toJsonValue(m_ingestion_details));
    }
    if (m_status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_product_counts.isSet()) {
        obj.insert(QString("product_counts"), ::OpenAPI::toJsonValue(m_product_counts));
    }
    if (m_validation_details.isSet()) {
        obj.insert(QString("validation_details"), ::OpenAPI::toJsonValue(m_validation_details));
    }
    return obj;
}

QDateTime OAICatalogsFeedProcessingResult::getCreatedAt() const {
    return m_created_at;
}
void OAICatalogsFeedProcessingResult::setCreatedAt(const QDateTime &created_at) {
    m_created_at = created_at;
    m_created_at_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAICatalogsFeedProcessingResult::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAICatalogsFeedProcessingResult::getId() const {
    return m_id;
}
void OAICatalogsFeedProcessingResult::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_id_Set() const{
    return m_id_isSet;
}

bool OAICatalogsFeedProcessingResult::is_id_Valid() const{
    return m_id_isValid;
}

QDateTime OAICatalogsFeedProcessingResult::getUpdatedAt() const {
    return m_updated_at;
}
void OAICatalogsFeedProcessingResult::setUpdatedAt(const QDateTime &updated_at) {
    m_updated_at = updated_at;
    m_updated_at_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_updated_at_Set() const{
    return m_updated_at_isSet;
}

bool OAICatalogsFeedProcessingResult::is_updated_at_Valid() const{
    return m_updated_at_isValid;
}

OAICatalogsFeedIngestionDetails OAICatalogsFeedProcessingResult::getIngestionDetails() const {
    return m_ingestion_details;
}
void OAICatalogsFeedProcessingResult::setIngestionDetails(const OAICatalogsFeedIngestionDetails &ingestion_details) {
    m_ingestion_details = ingestion_details;
    m_ingestion_details_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_ingestion_details_Set() const{
    return m_ingestion_details_isSet;
}

bool OAICatalogsFeedProcessingResult::is_ingestion_details_Valid() const{
    return m_ingestion_details_isValid;
}

OAICatalogsFeedProcessingStatus OAICatalogsFeedProcessingResult::getStatus() const {
    return m_status;
}
void OAICatalogsFeedProcessingResult::setStatus(const OAICatalogsFeedProcessingStatus &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_status_Set() const{
    return m_status_isSet;
}

bool OAICatalogsFeedProcessingResult::is_status_Valid() const{
    return m_status_isValid;
}

OAICatalogsFeedProductCounts OAICatalogsFeedProcessingResult::getProductCounts() const {
    return m_product_counts;
}
void OAICatalogsFeedProcessingResult::setProductCounts(const OAICatalogsFeedProductCounts &product_counts) {
    m_product_counts = product_counts;
    m_product_counts_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_product_counts_Set() const{
    return m_product_counts_isSet;
}

bool OAICatalogsFeedProcessingResult::is_product_counts_Valid() const{
    return m_product_counts_isValid;
}

OAICatalogsFeedValidationDetails OAICatalogsFeedProcessingResult::getValidationDetails() const {
    return m_validation_details;
}
void OAICatalogsFeedProcessingResult::setValidationDetails(const OAICatalogsFeedValidationDetails &validation_details) {
    m_validation_details = validation_details;
    m_validation_details_isSet = true;
}

bool OAICatalogsFeedProcessingResult::is_validation_details_Set() const{
    return m_validation_details_isSet;
}

bool OAICatalogsFeedProcessingResult::is_validation_details_Valid() const{
    return m_validation_details_isValid;
}

bool OAICatalogsFeedProcessingResult::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_updated_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ingestion_details.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_product_counts.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_validation_details.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsFeedProcessingResult::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_created_at_isValid && m_id_isValid && m_updated_at_isValid && m_ingestion_details_isValid && m_status_isValid && m_product_counts_isValid && m_validation_details_isValid && true;
}

} // namespace OpenAPI
