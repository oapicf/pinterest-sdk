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

#include "OAIProductGroupAnalyticsResponse_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIProductGroupAnalyticsResponse_inner::OAIProductGroupAnalyticsResponse_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIProductGroupAnalyticsResponse_inner::OAIProductGroupAnalyticsResponse_inner() {
    this->initializeModel();
}

OAIProductGroupAnalyticsResponse_inner::~OAIProductGroupAnalyticsResponse_inner() {}

void OAIProductGroupAnalyticsResponse_inner::initializeModel() {

    m_product_group_id_isSet = false;
    m_product_group_id_isValid = false;

    m_date_isSet = false;
    m_date_isValid = false;
}

void OAIProductGroupAnalyticsResponse_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIProductGroupAnalyticsResponse_inner::fromJsonObject(QJsonObject json) {

    m_product_group_id_isValid = ::OpenAPI::fromJsonValue(m_product_group_id, json[QString("PRODUCT_GROUP_ID")]);
    m_product_group_id_isSet = !json[QString("PRODUCT_GROUP_ID")].isNull() && m_product_group_id_isValid;

    m_date_isValid = ::OpenAPI::fromJsonValue(m_date, json[QString("DATE")]);
    m_date_isSet = !json[QString("DATE")].isNull() && m_date_isValid;
}

QString OAIProductGroupAnalyticsResponse_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIProductGroupAnalyticsResponse_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_product_group_id_isSet) {
        obj.insert(QString("PRODUCT_GROUP_ID"), ::OpenAPI::toJsonValue(m_product_group_id));
    }
    if (m_date_isSet) {
        obj.insert(QString("DATE"), ::OpenAPI::toJsonValue(m_date));
    }
    return obj;
}

QString OAIProductGroupAnalyticsResponse_inner::getProductGroupId() const {
    return m_product_group_id;
}
void OAIProductGroupAnalyticsResponse_inner::setProductGroupId(const QString &product_group_id) {
    m_product_group_id = product_group_id;
    m_product_group_id_isSet = true;
}

bool OAIProductGroupAnalyticsResponse_inner::is_product_group_id_Set() const{
    return m_product_group_id_isSet;
}

bool OAIProductGroupAnalyticsResponse_inner::is_product_group_id_Valid() const{
    return m_product_group_id_isValid;
}

QDate OAIProductGroupAnalyticsResponse_inner::getDate() const {
    return m_date;
}
void OAIProductGroupAnalyticsResponse_inner::setDate(const QDate &date) {
    m_date = date;
    m_date_isSet = true;
}

bool OAIProductGroupAnalyticsResponse_inner::is_date_Set() const{
    return m_date_isSet;
}

bool OAIProductGroupAnalyticsResponse_inner::is_date_Valid() const{
    return m_date_isValid;
}

bool OAIProductGroupAnalyticsResponse_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_product_group_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIProductGroupAnalyticsResponse_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_product_group_id_isValid && true;
}

} // namespace OpenAPI
