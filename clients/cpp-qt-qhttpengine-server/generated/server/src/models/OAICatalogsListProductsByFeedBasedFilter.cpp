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

#include "OAICatalogsListProductsByFeedBasedFilter.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsListProductsByFeedBasedFilter::OAICatalogsListProductsByFeedBasedFilter(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsListProductsByFeedBasedFilter::OAICatalogsListProductsByFeedBasedFilter() {
    this->initializeModel();
}

OAICatalogsListProductsByFeedBasedFilter::~OAICatalogsListProductsByFeedBasedFilter() {}

void OAICatalogsListProductsByFeedBasedFilter::initializeModel() {

    m_feed_id_isSet = false;
    m_feed_id_isValid = false;

    m_filters_isSet = false;
    m_filters_isValid = false;
}

void OAICatalogsListProductsByFeedBasedFilter::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsListProductsByFeedBasedFilter::fromJsonObject(QJsonObject json) {

    m_feed_id_isValid = ::OpenAPI::fromJsonValue(feed_id, json[QString("feed_id")]);
    m_feed_id_isSet = !json[QString("feed_id")].isNull() && m_feed_id_isValid;

    m_filters_isValid = ::OpenAPI::fromJsonValue(filters, json[QString("filters")]);
    m_filters_isSet = !json[QString("filters")].isNull() && m_filters_isValid;
}

QString OAICatalogsListProductsByFeedBasedFilter::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsListProductsByFeedBasedFilter::asJsonObject() const {
    QJsonObject obj;
    if (m_feed_id_isSet) {
        obj.insert(QString("feed_id"), ::OpenAPI::toJsonValue(feed_id));
    }
    if (filters.isSet()) {
        obj.insert(QString("filters"), ::OpenAPI::toJsonValue(filters));
    }
    return obj;
}

QString OAICatalogsListProductsByFeedBasedFilter::getFeedId() const {
    return feed_id;
}
void OAICatalogsListProductsByFeedBasedFilter::setFeedId(const QString &feed_id) {
    this->feed_id = feed_id;
    this->m_feed_id_isSet = true;
}

bool OAICatalogsListProductsByFeedBasedFilter::is_feed_id_Set() const{
    return m_feed_id_isSet;
}

bool OAICatalogsListProductsByFeedBasedFilter::is_feed_id_Valid() const{
    return m_feed_id_isValid;
}

OAICatalogsProductGroupFilters OAICatalogsListProductsByFeedBasedFilter::getFilters() const {
    return filters;
}
void OAICatalogsListProductsByFeedBasedFilter::setFilters(const OAICatalogsProductGroupFilters &filters) {
    this->filters = filters;
    this->m_filters_isSet = true;
}

bool OAICatalogsListProductsByFeedBasedFilter::is_filters_Set() const{
    return m_filters_isSet;
}

bool OAICatalogsListProductsByFeedBasedFilter::is_filters_Valid() const{
    return m_filters_isValid;
}

bool OAICatalogsListProductsByFeedBasedFilter::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_feed_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (filters.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsListProductsByFeedBasedFilter::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_feed_id_isValid && m_filters_isValid && true;
}

} // namespace OpenAPI
