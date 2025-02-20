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

#include "OAICustomLabel3Filter.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICustomLabel3Filter::OAICustomLabel3Filter(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICustomLabel3Filter::OAICustomLabel3Filter() {
    this->initializeModel();
}

OAICustomLabel3Filter::~OAICustomLabel3Filter() {}

void OAICustomLabel3Filter::initializeModel() {

    m_custom_label_3_isSet = false;
    m_custom_label_3_isValid = false;
}

void OAICustomLabel3Filter::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICustomLabel3Filter::fromJsonObject(QJsonObject json) {

    m_custom_label_3_isValid = ::OpenAPI::fromJsonValue(custom_label_3, json[QString("CUSTOM_LABEL_3")]);
    m_custom_label_3_isSet = !json[QString("CUSTOM_LABEL_3")].isNull() && m_custom_label_3_isValid;
}

QString OAICustomLabel3Filter::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICustomLabel3Filter::asJsonObject() const {
    QJsonObject obj;
    if (m_custom_label_3_isSet) {
        obj.insert(QString("CUSTOM_LABEL_3"), ::OpenAPI::toJsonValue(custom_label_3));
    }
    return obj;
}

OAICatalogsProductGroupMultipleStringCriteria OAICustomLabel3Filter::getCustomLabel3() const {
    return custom_label_3;
}
void OAICustomLabel3Filter::setCustomLabel3(const OAICatalogsProductGroupMultipleStringCriteria &custom_label_3) {
    this->custom_label_3 = custom_label_3;
    this->m_custom_label_3_isSet = true;
}

bool OAICustomLabel3Filter::is_custom_label_3_Set() const{
    return m_custom_label_3_isSet;
}

bool OAICustomLabel3Filter::is_custom_label_3_Valid() const{
    return m_custom_label_3_isValid;
}

bool OAICustomLabel3Filter::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_custom_label_3_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICustomLabel3Filter::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_custom_label_3_isValid && true;
}

} // namespace OpenAPI
