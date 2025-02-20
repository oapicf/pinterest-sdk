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

#include "OAIBoard.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBoard::OAIBoard(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBoard::OAIBoard() {
    this->initializeModel();
}

OAIBoard::~OAIBoard() {}

void OAIBoard::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_board_pins_modified_at_isSet = false;
    m_board_pins_modified_at_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_collaborator_count_isSet = false;
    m_collaborator_count_isValid = false;

    m_pin_count_isSet = false;
    m_pin_count_isValid = false;

    m_follower_count_isSet = false;
    m_follower_count_isValid = false;

    m_media_isSet = false;
    m_media_isValid = false;

    m_owner_isSet = false;
    m_owner_isValid = false;

    m_privacy_isSet = false;
    m_privacy_isValid = false;
}

void OAIBoard::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBoard::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_board_pins_modified_at_isValid = ::OpenAPI::fromJsonValue(board_pins_modified_at, json[QString("board_pins_modified_at")]);
    m_board_pins_modified_at_isSet = !json[QString("board_pins_modified_at")].isNull() && m_board_pins_modified_at_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_collaborator_count_isValid = ::OpenAPI::fromJsonValue(collaborator_count, json[QString("collaborator_count")]);
    m_collaborator_count_isSet = !json[QString("collaborator_count")].isNull() && m_collaborator_count_isValid;

    m_pin_count_isValid = ::OpenAPI::fromJsonValue(pin_count, json[QString("pin_count")]);
    m_pin_count_isSet = !json[QString("pin_count")].isNull() && m_pin_count_isValid;

    m_follower_count_isValid = ::OpenAPI::fromJsonValue(follower_count, json[QString("follower_count")]);
    m_follower_count_isSet = !json[QString("follower_count")].isNull() && m_follower_count_isValid;

    m_media_isValid = ::OpenAPI::fromJsonValue(media, json[QString("media")]);
    m_media_isSet = !json[QString("media")].isNull() && m_media_isValid;

    m_owner_isValid = ::OpenAPI::fromJsonValue(owner, json[QString("owner")]);
    m_owner_isSet = !json[QString("owner")].isNull() && m_owner_isValid;

    m_privacy_isValid = ::OpenAPI::fromJsonValue(privacy, json[QString("privacy")]);
    m_privacy_isSet = !json[QString("privacy")].isNull() && m_privacy_isValid;
}

QString OAIBoard::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBoard::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(created_at));
    }
    if (m_board_pins_modified_at_isSet) {
        obj.insert(QString("board_pins_modified_at"), ::OpenAPI::toJsonValue(board_pins_modified_at));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_collaborator_count_isSet) {
        obj.insert(QString("collaborator_count"), ::OpenAPI::toJsonValue(collaborator_count));
    }
    if (m_pin_count_isSet) {
        obj.insert(QString("pin_count"), ::OpenAPI::toJsonValue(pin_count));
    }
    if (m_follower_count_isSet) {
        obj.insert(QString("follower_count"), ::OpenAPI::toJsonValue(follower_count));
    }
    if (media.isSet()) {
        obj.insert(QString("media"), ::OpenAPI::toJsonValue(media));
    }
    if (owner.isSet()) {
        obj.insert(QString("owner"), ::OpenAPI::toJsonValue(owner));
    }
    if (m_privacy_isSet) {
        obj.insert(QString("privacy"), ::OpenAPI::toJsonValue(privacy));
    }
    return obj;
}

QString OAIBoard::getId() const {
    return id;
}
void OAIBoard::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIBoard::is_id_Set() const{
    return m_id_isSet;
}

bool OAIBoard::is_id_Valid() const{
    return m_id_isValid;
}

QDateTime OAIBoard::getCreatedAt() const {
    return created_at;
}
void OAIBoard::setCreatedAt(const QDateTime &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAIBoard::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIBoard::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QDateTime OAIBoard::getBoardPinsModifiedAt() const {
    return board_pins_modified_at;
}
void OAIBoard::setBoardPinsModifiedAt(const QDateTime &board_pins_modified_at) {
    this->board_pins_modified_at = board_pins_modified_at;
    this->m_board_pins_modified_at_isSet = true;
}

bool OAIBoard::is_board_pins_modified_at_Set() const{
    return m_board_pins_modified_at_isSet;
}

bool OAIBoard::is_board_pins_modified_at_Valid() const{
    return m_board_pins_modified_at_isValid;
}

QString OAIBoard::getName() const {
    return name;
}
void OAIBoard::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIBoard::is_name_Set() const{
    return m_name_isSet;
}

bool OAIBoard::is_name_Valid() const{
    return m_name_isValid;
}

QString OAIBoard::getDescription() const {
    return description;
}
void OAIBoard::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIBoard::is_description_Set() const{
    return m_description_isSet;
}

bool OAIBoard::is_description_Valid() const{
    return m_description_isValid;
}

qint32 OAIBoard::getCollaboratorCount() const {
    return collaborator_count;
}
void OAIBoard::setCollaboratorCount(const qint32 &collaborator_count) {
    this->collaborator_count = collaborator_count;
    this->m_collaborator_count_isSet = true;
}

bool OAIBoard::is_collaborator_count_Set() const{
    return m_collaborator_count_isSet;
}

bool OAIBoard::is_collaborator_count_Valid() const{
    return m_collaborator_count_isValid;
}

qint32 OAIBoard::getPinCount() const {
    return pin_count;
}
void OAIBoard::setPinCount(const qint32 &pin_count) {
    this->pin_count = pin_count;
    this->m_pin_count_isSet = true;
}

bool OAIBoard::is_pin_count_Set() const{
    return m_pin_count_isSet;
}

bool OAIBoard::is_pin_count_Valid() const{
    return m_pin_count_isValid;
}

qint32 OAIBoard::getFollowerCount() const {
    return follower_count;
}
void OAIBoard::setFollowerCount(const qint32 &follower_count) {
    this->follower_count = follower_count;
    this->m_follower_count_isSet = true;
}

bool OAIBoard::is_follower_count_Set() const{
    return m_follower_count_isSet;
}

bool OAIBoard::is_follower_count_Valid() const{
    return m_follower_count_isValid;
}

OAIBoard_media OAIBoard::getMedia() const {
    return media;
}
void OAIBoard::setMedia(const OAIBoard_media &media) {
    this->media = media;
    this->m_media_isSet = true;
}

bool OAIBoard::is_media_Set() const{
    return m_media_isSet;
}

bool OAIBoard::is_media_Valid() const{
    return m_media_isValid;
}

OAIBoardOwner OAIBoard::getOwner() const {
    return owner;
}
void OAIBoard::setOwner(const OAIBoardOwner &owner) {
    this->owner = owner;
    this->m_owner_isSet = true;
}

bool OAIBoard::is_owner_Set() const{
    return m_owner_isSet;
}

bool OAIBoard::is_owner_Valid() const{
    return m_owner_isValid;
}

QString OAIBoard::getPrivacy() const {
    return privacy;
}
void OAIBoard::setPrivacy(const QString &privacy) {
    this->privacy = privacy;
    this->m_privacy_isSet = true;
}

bool OAIBoard::is_privacy_Set() const{
    return m_privacy_isSet;
}

bool OAIBoard::is_privacy_Valid() const{
    return m_privacy_isValid;
}

bool OAIBoard::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_board_pins_modified_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_collaborator_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_pin_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_follower_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (media.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (owner.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_privacy_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBoard::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_name_isValid && true;
}

} // namespace OpenAPI
