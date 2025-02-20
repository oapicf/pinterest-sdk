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

#include "OAITopPinsAnalyticsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITopPinsAnalyticsResponse::OAITopPinsAnalyticsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITopPinsAnalyticsResponse::OAITopPinsAnalyticsResponse() {
    this->initializeModel();
}

OAITopPinsAnalyticsResponse::~OAITopPinsAnalyticsResponse() {}

void OAITopPinsAnalyticsResponse::initializeModel() {

    m_date_availability_isSet = false;
    m_date_availability_isValid = false;

    m_pins_isSet = false;
    m_pins_isValid = false;

    m_sort_by_isSet = false;
    m_sort_by_isValid = false;
}

void OAITopPinsAnalyticsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAITopPinsAnalyticsResponse::fromJsonObject(QJsonObject json) {

    m_date_availability_isValid = ::OpenAPI::fromJsonValue(m_date_availability, json[QString("date_availability")]);
    m_date_availability_isSet = !json[QString("date_availability")].isNull() && m_date_availability_isValid;

    m_pins_isValid = ::OpenAPI::fromJsonValue(m_pins, json[QString("pins")]);
    m_pins_isSet = !json[QString("pins")].isNull() && m_pins_isValid;

    m_sort_by_isValid = ::OpenAPI::fromJsonValue(m_sort_by, json[QString("sort_by")]);
    m_sort_by_isSet = !json[QString("sort_by")].isNull() && m_sort_by_isValid;
}

QString OAITopPinsAnalyticsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAITopPinsAnalyticsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_date_availability.isSet()) {
        obj.insert(QString("date_availability"), ::OpenAPI::toJsonValue(m_date_availability));
    }
    if (m_pins.size() > 0) {
        obj.insert(QString("pins"), ::OpenAPI::toJsonValue(m_pins));
    }
    if (m_sort_by_isSet) {
        obj.insert(QString("sort_by"), ::OpenAPI::toJsonValue(m_sort_by));
    }
    return obj;
}

OAITopPinsAnalyticsResponse_date_availability OAITopPinsAnalyticsResponse::getDateAvailability() const {
    return m_date_availability;
}
void OAITopPinsAnalyticsResponse::setDateAvailability(const OAITopPinsAnalyticsResponse_date_availability &date_availability) {
    m_date_availability = date_availability;
    m_date_availability_isSet = true;
}

bool OAITopPinsAnalyticsResponse::is_date_availability_Set() const{
    return m_date_availability_isSet;
}

bool OAITopPinsAnalyticsResponse::is_date_availability_Valid() const{
    return m_date_availability_isValid;
}

QList<OAITopPinsAnalyticsResponse_pins_inner> OAITopPinsAnalyticsResponse::getPins() const {
    return m_pins;
}
void OAITopPinsAnalyticsResponse::setPins(const QList<OAITopPinsAnalyticsResponse_pins_inner> &pins) {
    m_pins = pins;
    m_pins_isSet = true;
}

bool OAITopPinsAnalyticsResponse::is_pins_Set() const{
    return m_pins_isSet;
}

bool OAITopPinsAnalyticsResponse::is_pins_Valid() const{
    return m_pins_isValid;
}

QString OAITopPinsAnalyticsResponse::getSortBy() const {
    return m_sort_by;
}
void OAITopPinsAnalyticsResponse::setSortBy(const QString &sort_by) {
    m_sort_by = sort_by;
    m_sort_by_isSet = true;
}

bool OAITopPinsAnalyticsResponse::is_sort_by_Set() const{
    return m_sort_by_isSet;
}

bool OAITopPinsAnalyticsResponse::is_sort_by_Valid() const{
    return m_sort_by_isValid;
}

bool OAITopPinsAnalyticsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_date_availability.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_pins.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_sort_by_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAITopPinsAnalyticsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
