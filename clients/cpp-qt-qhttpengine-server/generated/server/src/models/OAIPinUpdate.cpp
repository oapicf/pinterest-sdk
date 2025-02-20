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

#include "OAIPinUpdate.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPinUpdate::OAIPinUpdate(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPinUpdate::OAIPinUpdate() {
    this->initializeModel();
}

OAIPinUpdate::~OAIPinUpdate() {}

void OAIPinUpdate::initializeModel() {

    m_alt_text_isSet = false;
    m_alt_text_isValid = false;

    m_board_id_isSet = false;
    m_board_id_isValid = false;

    m_board_section_id_isSet = false;
    m_board_section_id_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;

    m_carousel_slots_isSet = false;
    m_carousel_slots_isValid = false;

    m_note_isSet = false;
    m_note_isValid = false;
}

void OAIPinUpdate::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPinUpdate::fromJsonObject(QJsonObject json) {

    m_alt_text_isValid = ::OpenAPI::fromJsonValue(alt_text, json[QString("alt_text")]);
    m_alt_text_isSet = !json[QString("alt_text")].isNull() && m_alt_text_isValid;

    m_board_id_isValid = ::OpenAPI::fromJsonValue(board_id, json[QString("board_id")]);
    m_board_id_isSet = !json[QString("board_id")].isNull() && m_board_id_isValid;

    m_board_section_id_isValid = ::OpenAPI::fromJsonValue(board_section_id, json[QString("board_section_id")]);
    m_board_section_id_isSet = !json[QString("board_section_id")].isNull() && m_board_section_id_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_carousel_slots_isValid = ::OpenAPI::fromJsonValue(carousel_slots, json[QString("carousel_slots")]);
    m_carousel_slots_isSet = !json[QString("carousel_slots")].isNull() && m_carousel_slots_isValid;

    m_note_isValid = ::OpenAPI::fromJsonValue(note, json[QString("note")]);
    m_note_isSet = !json[QString("note")].isNull() && m_note_isValid;
}

QString OAIPinUpdate::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPinUpdate::asJsonObject() const {
    QJsonObject obj;
    if (m_alt_text_isSet) {
        obj.insert(QString("alt_text"), ::OpenAPI::toJsonValue(alt_text));
    }
    if (m_board_id_isSet) {
        obj.insert(QString("board_id"), ::OpenAPI::toJsonValue(board_id));
    }
    if (m_board_section_id_isSet) {
        obj.insert(QString("board_section_id"), ::OpenAPI::toJsonValue(board_section_id));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(link));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
    if (carousel_slots.size() > 0) {
        obj.insert(QString("carousel_slots"), ::OpenAPI::toJsonValue(carousel_slots));
    }
    if (m_note_isSet) {
        obj.insert(QString("note"), ::OpenAPI::toJsonValue(note));
    }
    return obj;
}

QString OAIPinUpdate::getAltText() const {
    return alt_text;
}
void OAIPinUpdate::setAltText(const QString &alt_text) {
    this->alt_text = alt_text;
    this->m_alt_text_isSet = true;
}

bool OAIPinUpdate::is_alt_text_Set() const{
    return m_alt_text_isSet;
}

bool OAIPinUpdate::is_alt_text_Valid() const{
    return m_alt_text_isValid;
}

QString OAIPinUpdate::getBoardId() const {
    return board_id;
}
void OAIPinUpdate::setBoardId(const QString &board_id) {
    this->board_id = board_id;
    this->m_board_id_isSet = true;
}

bool OAIPinUpdate::is_board_id_Set() const{
    return m_board_id_isSet;
}

bool OAIPinUpdate::is_board_id_Valid() const{
    return m_board_id_isValid;
}

QString OAIPinUpdate::getBoardSectionId() const {
    return board_section_id;
}
void OAIPinUpdate::setBoardSectionId(const QString &board_section_id) {
    this->board_section_id = board_section_id;
    this->m_board_section_id_isSet = true;
}

bool OAIPinUpdate::is_board_section_id_Set() const{
    return m_board_section_id_isSet;
}

bool OAIPinUpdate::is_board_section_id_Valid() const{
    return m_board_section_id_isValid;
}

QString OAIPinUpdate::getDescription() const {
    return description;
}
void OAIPinUpdate::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIPinUpdate::is_description_Set() const{
    return m_description_isSet;
}

bool OAIPinUpdate::is_description_Valid() const{
    return m_description_isValid;
}

QString OAIPinUpdate::getLink() const {
    return link;
}
void OAIPinUpdate::setLink(const QString &link) {
    this->link = link;
    this->m_link_isSet = true;
}

bool OAIPinUpdate::is_link_Set() const{
    return m_link_isSet;
}

bool OAIPinUpdate::is_link_Valid() const{
    return m_link_isValid;
}

QString OAIPinUpdate::getTitle() const {
    return title;
}
void OAIPinUpdate::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

bool OAIPinUpdate::is_title_Set() const{
    return m_title_isSet;
}

bool OAIPinUpdate::is_title_Valid() const{
    return m_title_isValid;
}

QList<OAIPinUpdate_carousel_slots_inner> OAIPinUpdate::getCarouselSlots() const {
    return carousel_slots;
}
void OAIPinUpdate::setCarouselSlots(const QList<OAIPinUpdate_carousel_slots_inner> &carousel_slots) {
    this->carousel_slots = carousel_slots;
    this->m_carousel_slots_isSet = true;
}

bool OAIPinUpdate::is_carousel_slots_Set() const{
    return m_carousel_slots_isSet;
}

bool OAIPinUpdate::is_carousel_slots_Valid() const{
    return m_carousel_slots_isValid;
}

QString OAIPinUpdate::getNote() const {
    return note;
}
void OAIPinUpdate::setNote(const QString &note) {
    this->note = note;
    this->m_note_isSet = true;
}

bool OAIPinUpdate::is_note_Set() const{
    return m_note_isSet;
}

bool OAIPinUpdate::is_note_Valid() const{
    return m_note_isValid;
}

bool OAIPinUpdate::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_alt_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_board_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_board_section_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (carousel_slots.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_note_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPinUpdate::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
