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

#include "OAIPin.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPin::OAIPin(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPin::OAIPin() {
    this->initializeModel();
}

OAIPin::~OAIPin() {}

void OAIPin::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_dominant_color_isSet = false;
    m_dominant_color_isValid = false;

    m_alt_text_isSet = false;
    m_alt_text_isValid = false;

    m_creative_type_isSet = false;
    m_creative_type_isValid = false;

    m_board_id_isSet = false;
    m_board_id_isValid = false;

    m_board_section_id_isSet = false;
    m_board_section_id_isValid = false;

    m_board_owner_isSet = false;
    m_board_owner_isValid = false;

    m_is_owner_isSet = false;
    m_is_owner_isValid = false;

    m_media_isSet = false;
    m_media_isValid = false;

    m_media_source_isSet = false;
    m_media_source_isValid = false;

    m_parent_pin_id_isSet = false;
    m_parent_pin_id_isValid = false;

    m_is_standard_isSet = false;
    m_is_standard_isValid = false;

    m_has_been_promoted_isSet = false;
    m_has_been_promoted_isValid = false;

    m_note_isSet = false;
    m_note_isValid = false;

    m_pin_metrics_isSet = false;
    m_pin_metrics_isValid = false;
}

void OAIPin::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPin::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_dominant_color_isValid = ::OpenAPI::fromJsonValue(dominant_color, json[QString("dominant_color")]);
    m_dominant_color_isSet = !json[QString("dominant_color")].isNull() && m_dominant_color_isValid;

    m_alt_text_isValid = ::OpenAPI::fromJsonValue(alt_text, json[QString("alt_text")]);
    m_alt_text_isSet = !json[QString("alt_text")].isNull() && m_alt_text_isValid;

    m_creative_type_isValid = ::OpenAPI::fromJsonValue(creative_type, json[QString("creative_type")]);
    m_creative_type_isSet = !json[QString("creative_type")].isNull() && m_creative_type_isValid;

    m_board_id_isValid = ::OpenAPI::fromJsonValue(board_id, json[QString("board_id")]);
    m_board_id_isSet = !json[QString("board_id")].isNull() && m_board_id_isValid;

    m_board_section_id_isValid = ::OpenAPI::fromJsonValue(board_section_id, json[QString("board_section_id")]);
    m_board_section_id_isSet = !json[QString("board_section_id")].isNull() && m_board_section_id_isValid;

    m_board_owner_isValid = ::OpenAPI::fromJsonValue(board_owner, json[QString("board_owner")]);
    m_board_owner_isSet = !json[QString("board_owner")].isNull() && m_board_owner_isValid;

    m_is_owner_isValid = ::OpenAPI::fromJsonValue(is_owner, json[QString("is_owner")]);
    m_is_owner_isSet = !json[QString("is_owner")].isNull() && m_is_owner_isValid;

    m_media_isValid = ::OpenAPI::fromJsonValue(media, json[QString("media")]);
    m_media_isSet = !json[QString("media")].isNull() && m_media_isValid;

    m_media_source_isValid = ::OpenAPI::fromJsonValue(media_source, json[QString("media_source")]);
    m_media_source_isSet = !json[QString("media_source")].isNull() && m_media_source_isValid;

    m_parent_pin_id_isValid = ::OpenAPI::fromJsonValue(parent_pin_id, json[QString("parent_pin_id")]);
    m_parent_pin_id_isSet = !json[QString("parent_pin_id")].isNull() && m_parent_pin_id_isValid;

    m_is_standard_isValid = ::OpenAPI::fromJsonValue(is_standard, json[QString("is_standard")]);
    m_is_standard_isSet = !json[QString("is_standard")].isNull() && m_is_standard_isValid;

    m_has_been_promoted_isValid = ::OpenAPI::fromJsonValue(has_been_promoted, json[QString("has_been_promoted")]);
    m_has_been_promoted_isSet = !json[QString("has_been_promoted")].isNull() && m_has_been_promoted_isValid;

    m_note_isValid = ::OpenAPI::fromJsonValue(note, json[QString("note")]);
    m_note_isSet = !json[QString("note")].isNull() && m_note_isValid;

    m_pin_metrics_isValid = ::OpenAPI::fromJsonValue(pin_metrics, json[QString("pin_metrics")]);
    m_pin_metrics_isSet = !json[QString("pin_metrics")].isNull() && m_pin_metrics_isValid;
}

QString OAIPin::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPin::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(created_at));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(link));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_dominant_color_isSet) {
        obj.insert(QString("dominant_color"), ::OpenAPI::toJsonValue(dominant_color));
    }
    if (m_alt_text_isSet) {
        obj.insert(QString("alt_text"), ::OpenAPI::toJsonValue(alt_text));
    }
    if (creative_type.isSet()) {
        obj.insert(QString("creative_type"), ::OpenAPI::toJsonValue(creative_type));
    }
    if (m_board_id_isSet) {
        obj.insert(QString("board_id"), ::OpenAPI::toJsonValue(board_id));
    }
    if (m_board_section_id_isSet) {
        obj.insert(QString("board_section_id"), ::OpenAPI::toJsonValue(board_section_id));
    }
    if (board_owner.isSet()) {
        obj.insert(QString("board_owner"), ::OpenAPI::toJsonValue(board_owner));
    }
    if (m_is_owner_isSet) {
        obj.insert(QString("is_owner"), ::OpenAPI::toJsonValue(is_owner));
    }
    if (media.isSet()) {
        obj.insert(QString("media"), ::OpenAPI::toJsonValue(media));
    }
    if (media_source.isSet()) {
        obj.insert(QString("media_source"), ::OpenAPI::toJsonValue(media_source));
    }
    if (m_parent_pin_id_isSet) {
        obj.insert(QString("parent_pin_id"), ::OpenAPI::toJsonValue(parent_pin_id));
    }
    if (m_is_standard_isSet) {
        obj.insert(QString("is_standard"), ::OpenAPI::toJsonValue(is_standard));
    }
    if (m_has_been_promoted_isSet) {
        obj.insert(QString("has_been_promoted"), ::OpenAPI::toJsonValue(has_been_promoted));
    }
    if (m_note_isSet) {
        obj.insert(QString("note"), ::OpenAPI::toJsonValue(note));
    }
    if (m_pin_metrics_isSet) {
        obj.insert(QString("pin_metrics"), ::OpenAPI::toJsonValue(pin_metrics));
    }
    return obj;
}

QString OAIPin::getId() const {
    return id;
}
void OAIPin::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIPin::is_id_Set() const{
    return m_id_isSet;
}

bool OAIPin::is_id_Valid() const{
    return m_id_isValid;
}

QDateTime OAIPin::getCreatedAt() const {
    return created_at;
}
void OAIPin::setCreatedAt(const QDateTime &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAIPin::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIPin::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIPin::getLink() const {
    return link;
}
void OAIPin::setLink(const QString &link) {
    this->link = link;
    this->m_link_isSet = true;
}

bool OAIPin::is_link_Set() const{
    return m_link_isSet;
}

bool OAIPin::is_link_Valid() const{
    return m_link_isValid;
}

QString OAIPin::getTitle() const {
    return title;
}
void OAIPin::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

bool OAIPin::is_title_Set() const{
    return m_title_isSet;
}

bool OAIPin::is_title_Valid() const{
    return m_title_isValid;
}

QString OAIPin::getDescription() const {
    return description;
}
void OAIPin::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIPin::is_description_Set() const{
    return m_description_isSet;
}

bool OAIPin::is_description_Valid() const{
    return m_description_isValid;
}

QString OAIPin::getDominantColor() const {
    return dominant_color;
}
void OAIPin::setDominantColor(const QString &dominant_color) {
    this->dominant_color = dominant_color;
    this->m_dominant_color_isSet = true;
}

bool OAIPin::is_dominant_color_Set() const{
    return m_dominant_color_isSet;
}

bool OAIPin::is_dominant_color_Valid() const{
    return m_dominant_color_isValid;
}

QString OAIPin::getAltText() const {
    return alt_text;
}
void OAIPin::setAltText(const QString &alt_text) {
    this->alt_text = alt_text;
    this->m_alt_text_isSet = true;
}

bool OAIPin::is_alt_text_Set() const{
    return m_alt_text_isSet;
}

bool OAIPin::is_alt_text_Valid() const{
    return m_alt_text_isValid;
}

OAICreativeType OAIPin::getCreativeType() const {
    return creative_type;
}
void OAIPin::setCreativeType(const OAICreativeType &creative_type) {
    this->creative_type = creative_type;
    this->m_creative_type_isSet = true;
}

bool OAIPin::is_creative_type_Set() const{
    return m_creative_type_isSet;
}

bool OAIPin::is_creative_type_Valid() const{
    return m_creative_type_isValid;
}

QString OAIPin::getBoardId() const {
    return board_id;
}
void OAIPin::setBoardId(const QString &board_id) {
    this->board_id = board_id;
    this->m_board_id_isSet = true;
}

bool OAIPin::is_board_id_Set() const{
    return m_board_id_isSet;
}

bool OAIPin::is_board_id_Valid() const{
    return m_board_id_isValid;
}

QString OAIPin::getBoardSectionId() const {
    return board_section_id;
}
void OAIPin::setBoardSectionId(const QString &board_section_id) {
    this->board_section_id = board_section_id;
    this->m_board_section_id_isSet = true;
}

bool OAIPin::is_board_section_id_Set() const{
    return m_board_section_id_isSet;
}

bool OAIPin::is_board_section_id_Valid() const{
    return m_board_section_id_isValid;
}

OAIBoardOwner OAIPin::getBoardOwner() const {
    return board_owner;
}
void OAIPin::setBoardOwner(const OAIBoardOwner &board_owner) {
    this->board_owner = board_owner;
    this->m_board_owner_isSet = true;
}

bool OAIPin::is_board_owner_Set() const{
    return m_board_owner_isSet;
}

bool OAIPin::is_board_owner_Valid() const{
    return m_board_owner_isValid;
}

bool OAIPin::isIsOwner() const {
    return is_owner;
}
void OAIPin::setIsOwner(const bool &is_owner) {
    this->is_owner = is_owner;
    this->m_is_owner_isSet = true;
}

bool OAIPin::is_is_owner_Set() const{
    return m_is_owner_isSet;
}

bool OAIPin::is_is_owner_Valid() const{
    return m_is_owner_isValid;
}

OAIPinMedia OAIPin::getMedia() const {
    return media;
}
void OAIPin::setMedia(const OAIPinMedia &media) {
    this->media = media;
    this->m_media_isSet = true;
}

bool OAIPin::is_media_Set() const{
    return m_media_isSet;
}

bool OAIPin::is_media_Valid() const{
    return m_media_isValid;
}

OAIPinMediaSource OAIPin::getMediaSource() const {
    return media_source;
}
void OAIPin::setMediaSource(const OAIPinMediaSource &media_source) {
    this->media_source = media_source;
    this->m_media_source_isSet = true;
}

bool OAIPin::is_media_source_Set() const{
    return m_media_source_isSet;
}

bool OAIPin::is_media_source_Valid() const{
    return m_media_source_isValid;
}

QString OAIPin::getParentPinId() const {
    return parent_pin_id;
}
void OAIPin::setParentPinId(const QString &parent_pin_id) {
    this->parent_pin_id = parent_pin_id;
    this->m_parent_pin_id_isSet = true;
}

bool OAIPin::is_parent_pin_id_Set() const{
    return m_parent_pin_id_isSet;
}

bool OAIPin::is_parent_pin_id_Valid() const{
    return m_parent_pin_id_isValid;
}

bool OAIPin::isIsStandard() const {
    return is_standard;
}
void OAIPin::setIsStandard(const bool &is_standard) {
    this->is_standard = is_standard;
    this->m_is_standard_isSet = true;
}

bool OAIPin::is_is_standard_Set() const{
    return m_is_standard_isSet;
}

bool OAIPin::is_is_standard_Valid() const{
    return m_is_standard_isValid;
}

bool OAIPin::isHasBeenPromoted() const {
    return has_been_promoted;
}
void OAIPin::setHasBeenPromoted(const bool &has_been_promoted) {
    this->has_been_promoted = has_been_promoted;
    this->m_has_been_promoted_isSet = true;
}

bool OAIPin::is_has_been_promoted_Set() const{
    return m_has_been_promoted_isSet;
}

bool OAIPin::is_has_been_promoted_Valid() const{
    return m_has_been_promoted_isValid;
}

QString OAIPin::getNote() const {
    return note;
}
void OAIPin::setNote(const QString &note) {
    this->note = note;
    this->m_note_isSet = true;
}

bool OAIPin::is_note_Set() const{
    return m_note_isSet;
}

bool OAIPin::is_note_Valid() const{
    return m_note_isValid;
}

OAIObject OAIPin::getPinMetrics() const {
    return pin_metrics;
}
void OAIPin::setPinMetrics(const OAIObject &pin_metrics) {
    this->pin_metrics = pin_metrics;
    this->m_pin_metrics_isSet = true;
}

bool OAIPin::is_pin_metrics_Set() const{
    return m_pin_metrics_isSet;
}

bool OAIPin::is_pin_metrics_Valid() const{
    return m_pin_metrics_isValid;
}

bool OAIPin::isSet() const {
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

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_dominant_color_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_alt_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (creative_type.isSet()) {
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

        if (board_owner.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_owner_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (media.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (media_source.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_parent_pin_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_standard_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_has_been_promoted_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_note_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_pin_metrics_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPin::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
