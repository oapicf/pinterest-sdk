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

#include "OAIQuizPinData.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIQuizPinData::OAIQuizPinData(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIQuizPinData::OAIQuizPinData() {
    this->initializeModel();
}

OAIQuizPinData::~OAIQuizPinData() {}

void OAIQuizPinData::initializeModel() {

    m_questions_isSet = false;
    m_questions_isValid = false;

    m_results_isSet = false;
    m_results_isValid = false;
}

void OAIQuizPinData::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIQuizPinData::fromJsonObject(QJsonObject json) {

    m_questions_isValid = ::OpenAPI::fromJsonValue(m_questions, json[QString("questions")]);
    m_questions_isSet = !json[QString("questions")].isNull() && m_questions_isValid;

    m_results_isValid = ::OpenAPI::fromJsonValue(m_results, json[QString("results")]);
    m_results_isSet = !json[QString("results")].isNull() && m_results_isValid;
}

QString OAIQuizPinData::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIQuizPinData::asJsonObject() const {
    QJsonObject obj;
    if (m_questions.size() > 0) {
        obj.insert(QString("questions"), ::OpenAPI::toJsonValue(m_questions));
    }
    if (m_results.size() > 0) {
        obj.insert(QString("results"), ::OpenAPI::toJsonValue(m_results));
    }
    return obj;
}

QList<OAIQuizPinQuestion> OAIQuizPinData::getQuestions() const {
    return m_questions;
}
void OAIQuizPinData::setQuestions(const QList<OAIQuizPinQuestion> &questions) {
    m_questions = questions;
    m_questions_isSet = true;
}

bool OAIQuizPinData::is_questions_Set() const{
    return m_questions_isSet;
}

bool OAIQuizPinData::is_questions_Valid() const{
    return m_questions_isValid;
}

QList<OAIQuizPinResult> OAIQuizPinData::getResults() const {
    return m_results;
}
void OAIQuizPinData::setResults(const QList<OAIQuizPinResult> &results) {
    m_results = results;
    m_results_isSet = true;
}

bool OAIQuizPinData::is_results_Set() const{
    return m_results_isSet;
}

bool OAIQuizPinData::is_results_Valid() const{
    return m_results_isValid;
}

bool OAIQuizPinData::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_questions.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_results.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIQuizPinData::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI