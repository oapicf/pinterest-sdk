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

#include "OAICatalogsHotelGuestRatings.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsHotelGuestRatings::OAICatalogsHotelGuestRatings(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsHotelGuestRatings::OAICatalogsHotelGuestRatings() {
    this->initializeModel();
}

OAICatalogsHotelGuestRatings::~OAICatalogsHotelGuestRatings() {}

void OAICatalogsHotelGuestRatings::initializeModel() {

    m_score_isSet = false;
    m_score_isValid = false;

    m_number_of_reviewers_isSet = false;
    m_number_of_reviewers_isValid = false;

    m_max_score_isSet = false;
    m_max_score_isValid = false;

    m_rating_system_isSet = false;
    m_rating_system_isValid = false;
}

void OAICatalogsHotelGuestRatings::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsHotelGuestRatings::fromJsonObject(QJsonObject json) {

    m_score_isValid = ::OpenAPI::fromJsonValue(m_score, json[QString("score")]);
    m_score_isSet = !json[QString("score")].isNull() && m_score_isValid;

    m_number_of_reviewers_isValid = ::OpenAPI::fromJsonValue(m_number_of_reviewers, json[QString("number_of_reviewers")]);
    m_number_of_reviewers_isSet = !json[QString("number_of_reviewers")].isNull() && m_number_of_reviewers_isValid;

    m_max_score_isValid = ::OpenAPI::fromJsonValue(m_max_score, json[QString("max_score")]);
    m_max_score_isSet = !json[QString("max_score")].isNull() && m_max_score_isValid;

    m_rating_system_isValid = ::OpenAPI::fromJsonValue(m_rating_system, json[QString("rating_system")]);
    m_rating_system_isSet = !json[QString("rating_system")].isNull() && m_rating_system_isValid;
}

QString OAICatalogsHotelGuestRatings::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsHotelGuestRatings::asJsonObject() const {
    QJsonObject obj;
    if (m_score_isSet) {
        obj.insert(QString("score"), ::OpenAPI::toJsonValue(m_score));
    }
    if (m_number_of_reviewers_isSet) {
        obj.insert(QString("number_of_reviewers"), ::OpenAPI::toJsonValue(m_number_of_reviewers));
    }
    if (m_max_score_isSet) {
        obj.insert(QString("max_score"), ::OpenAPI::toJsonValue(m_max_score));
    }
    if (m_rating_system_isSet) {
        obj.insert(QString("rating_system"), ::OpenAPI::toJsonValue(m_rating_system));
    }
    return obj;
}

double OAICatalogsHotelGuestRatings::getScore() const {
    return m_score;
}
void OAICatalogsHotelGuestRatings::setScore(const double &score) {
    m_score = score;
    m_score_isSet = true;
}

bool OAICatalogsHotelGuestRatings::is_score_Set() const{
    return m_score_isSet;
}

bool OAICatalogsHotelGuestRatings::is_score_Valid() const{
    return m_score_isValid;
}

qint32 OAICatalogsHotelGuestRatings::getNumberOfReviewers() const {
    return m_number_of_reviewers;
}
void OAICatalogsHotelGuestRatings::setNumberOfReviewers(const qint32 &number_of_reviewers) {
    m_number_of_reviewers = number_of_reviewers;
    m_number_of_reviewers_isSet = true;
}

bool OAICatalogsHotelGuestRatings::is_number_of_reviewers_Set() const{
    return m_number_of_reviewers_isSet;
}

bool OAICatalogsHotelGuestRatings::is_number_of_reviewers_Valid() const{
    return m_number_of_reviewers_isValid;
}

double OAICatalogsHotelGuestRatings::getMaxScore() const {
    return m_max_score;
}
void OAICatalogsHotelGuestRatings::setMaxScore(const double &max_score) {
    m_max_score = max_score;
    m_max_score_isSet = true;
}

bool OAICatalogsHotelGuestRatings::is_max_score_Set() const{
    return m_max_score_isSet;
}

bool OAICatalogsHotelGuestRatings::is_max_score_Valid() const{
    return m_max_score_isValid;
}

QString OAICatalogsHotelGuestRatings::getRatingSystem() const {
    return m_rating_system;
}
void OAICatalogsHotelGuestRatings::setRatingSystem(const QString &rating_system) {
    m_rating_system = rating_system;
    m_rating_system_isSet = true;
}

bool OAICatalogsHotelGuestRatings::is_rating_system_Set() const{
    return m_rating_system_isSet;
}

bool OAICatalogsHotelGuestRatings::is_rating_system_Valid() const{
    return m_rating_system_isValid;
}

bool OAICatalogsHotelGuestRatings::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_score_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_number_of_reviewers_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_max_score_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_rating_system_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsHotelGuestRatings::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
