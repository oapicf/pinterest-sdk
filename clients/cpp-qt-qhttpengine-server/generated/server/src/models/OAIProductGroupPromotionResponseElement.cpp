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

#include "OAIProductGroupPromotionResponseElement.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIProductGroupPromotionResponseElement::OAIProductGroupPromotionResponseElement(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIProductGroupPromotionResponseElement::OAIProductGroupPromotionResponseElement() {
    this->initializeModel();
}

OAIProductGroupPromotionResponseElement::~OAIProductGroupPromotionResponseElement() {}

void OAIProductGroupPromotionResponseElement::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_ad_group_id_isSet = false;
    m_ad_group_id_isValid = false;

    m_bid_in_micro_currency_isSet = false;
    m_bid_in_micro_currency_isValid = false;

    m_included_isSet = false;
    m_included_isValid = false;

    m_definition_isSet = false;
    m_definition_isValid = false;

    m_relative_definition_isSet = false;
    m_relative_definition_isValid = false;

    m_parent_id_isSet = false;
    m_parent_id_isValid = false;

    m_slideshow_collections_title_isSet = false;
    m_slideshow_collections_title_isValid = false;

    m_slideshow_collections_description_isSet = false;
    m_slideshow_collections_description_isValid = false;

    m_is_mdl_isSet = false;
    m_is_mdl_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_tracking_url_isSet = false;
    m_tracking_url_isValid = false;

    m_catalog_product_group_id_isSet = false;
    m_catalog_product_group_id_isValid = false;

    m_catalog_product_group_name_isSet = false;
    m_catalog_product_group_name_isValid = false;

    m_collections_hero_pin_id_isSet = false;
    m_collections_hero_pin_id_isValid = false;

    m_collections_hero_destination_url_isSet = false;
    m_collections_hero_destination_url_isValid = false;

    m_grid_click_type_isSet = false;
    m_grid_click_type_isValid = false;

    m_creative_type_isSet = false;
    m_creative_type_isValid = false;
}

void OAIProductGroupPromotionResponseElement::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIProductGroupPromotionResponseElement::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_ad_group_id_isValid = ::OpenAPI::fromJsonValue(ad_group_id, json[QString("ad_group_id")]);
    m_ad_group_id_isSet = !json[QString("ad_group_id")].isNull() && m_ad_group_id_isValid;

    m_bid_in_micro_currency_isValid = ::OpenAPI::fromJsonValue(bid_in_micro_currency, json[QString("bid_in_micro_currency")]);
    m_bid_in_micro_currency_isSet = !json[QString("bid_in_micro_currency")].isNull() && m_bid_in_micro_currency_isValid;

    m_included_isValid = ::OpenAPI::fromJsonValue(included, json[QString("included")]);
    m_included_isSet = !json[QString("included")].isNull() && m_included_isValid;

    m_definition_isValid = ::OpenAPI::fromJsonValue(definition, json[QString("definition")]);
    m_definition_isSet = !json[QString("definition")].isNull() && m_definition_isValid;

    m_relative_definition_isValid = ::OpenAPI::fromJsonValue(relative_definition, json[QString("relative_definition")]);
    m_relative_definition_isSet = !json[QString("relative_definition")].isNull() && m_relative_definition_isValid;

    m_parent_id_isValid = ::OpenAPI::fromJsonValue(parent_id, json[QString("parent_id")]);
    m_parent_id_isSet = !json[QString("parent_id")].isNull() && m_parent_id_isValid;

    m_slideshow_collections_title_isValid = ::OpenAPI::fromJsonValue(slideshow_collections_title, json[QString("slideshow_collections_title")]);
    m_slideshow_collections_title_isSet = !json[QString("slideshow_collections_title")].isNull() && m_slideshow_collections_title_isValid;

    m_slideshow_collections_description_isValid = ::OpenAPI::fromJsonValue(slideshow_collections_description, json[QString("slideshow_collections_description")]);
    m_slideshow_collections_description_isSet = !json[QString("slideshow_collections_description")].isNull() && m_slideshow_collections_description_isValid;

    m_is_mdl_isValid = ::OpenAPI::fromJsonValue(is_mdl, json[QString("is_mdl")]);
    m_is_mdl_isSet = !json[QString("is_mdl")].isNull() && m_is_mdl_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_tracking_url_isValid = ::OpenAPI::fromJsonValue(tracking_url, json[QString("tracking_url")]);
    m_tracking_url_isSet = !json[QString("tracking_url")].isNull() && m_tracking_url_isValid;

    m_catalog_product_group_id_isValid = ::OpenAPI::fromJsonValue(catalog_product_group_id, json[QString("catalog_product_group_id")]);
    m_catalog_product_group_id_isSet = !json[QString("catalog_product_group_id")].isNull() && m_catalog_product_group_id_isValid;

    m_catalog_product_group_name_isValid = ::OpenAPI::fromJsonValue(catalog_product_group_name, json[QString("catalog_product_group_name")]);
    m_catalog_product_group_name_isSet = !json[QString("catalog_product_group_name")].isNull() && m_catalog_product_group_name_isValid;

    m_collections_hero_pin_id_isValid = ::OpenAPI::fromJsonValue(collections_hero_pin_id, json[QString("collections_hero_pin_id")]);
    m_collections_hero_pin_id_isSet = !json[QString("collections_hero_pin_id")].isNull() && m_collections_hero_pin_id_isValid;

    m_collections_hero_destination_url_isValid = ::OpenAPI::fromJsonValue(collections_hero_destination_url, json[QString("collections_hero_destination_url")]);
    m_collections_hero_destination_url_isSet = !json[QString("collections_hero_destination_url")].isNull() && m_collections_hero_destination_url_isValid;

    m_grid_click_type_isValid = ::OpenAPI::fromJsonValue(grid_click_type, json[QString("grid_click_type")]);
    m_grid_click_type_isSet = !json[QString("grid_click_type")].isNull() && m_grid_click_type_isValid;

    m_creative_type_isValid = ::OpenAPI::fromJsonValue(creative_type, json[QString("creative_type")]);
    m_creative_type_isSet = !json[QString("creative_type")].isNull() && m_creative_type_isValid;
}

QString OAIProductGroupPromotionResponseElement::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIProductGroupPromotionResponseElement::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_ad_group_id_isSet) {
        obj.insert(QString("ad_group_id"), ::OpenAPI::toJsonValue(ad_group_id));
    }
    if (m_bid_in_micro_currency_isSet) {
        obj.insert(QString("bid_in_micro_currency"), ::OpenAPI::toJsonValue(bid_in_micro_currency));
    }
    if (m_included_isSet) {
        obj.insert(QString("included"), ::OpenAPI::toJsonValue(included));
    }
    if (m_definition_isSet) {
        obj.insert(QString("definition"), ::OpenAPI::toJsonValue(definition));
    }
    if (m_relative_definition_isSet) {
        obj.insert(QString("relative_definition"), ::OpenAPI::toJsonValue(relative_definition));
    }
    if (m_parent_id_isSet) {
        obj.insert(QString("parent_id"), ::OpenAPI::toJsonValue(parent_id));
    }
    if (m_slideshow_collections_title_isSet) {
        obj.insert(QString("slideshow_collections_title"), ::OpenAPI::toJsonValue(slideshow_collections_title));
    }
    if (m_slideshow_collections_description_isSet) {
        obj.insert(QString("slideshow_collections_description"), ::OpenAPI::toJsonValue(slideshow_collections_description));
    }
    if (m_is_mdl_isSet) {
        obj.insert(QString("is_mdl"), ::OpenAPI::toJsonValue(is_mdl));
    }
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_tracking_url_isSet) {
        obj.insert(QString("tracking_url"), ::OpenAPI::toJsonValue(tracking_url));
    }
    if (m_catalog_product_group_id_isSet) {
        obj.insert(QString("catalog_product_group_id"), ::OpenAPI::toJsonValue(catalog_product_group_id));
    }
    if (m_catalog_product_group_name_isSet) {
        obj.insert(QString("catalog_product_group_name"), ::OpenAPI::toJsonValue(catalog_product_group_name));
    }
    if (m_collections_hero_pin_id_isSet) {
        obj.insert(QString("collections_hero_pin_id"), ::OpenAPI::toJsonValue(collections_hero_pin_id));
    }
    if (m_collections_hero_destination_url_isSet) {
        obj.insert(QString("collections_hero_destination_url"), ::OpenAPI::toJsonValue(collections_hero_destination_url));
    }
    if (grid_click_type.isSet()) {
        obj.insert(QString("grid_click_type"), ::OpenAPI::toJsonValue(grid_click_type));
    }
    if (creative_type.isSet()) {
        obj.insert(QString("creative_type"), ::OpenAPI::toJsonValue(creative_type));
    }
    return obj;
}

QString OAIProductGroupPromotionResponseElement::getId() const {
    return id;
}
void OAIProductGroupPromotionResponseElement::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_id_Set() const{
    return m_id_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIProductGroupPromotionResponseElement::getAdGroupId() const {
    return ad_group_id;
}
void OAIProductGroupPromotionResponseElement::setAdGroupId(const QString &ad_group_id) {
    this->ad_group_id = ad_group_id;
    this->m_ad_group_id_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_ad_group_id_Set() const{
    return m_ad_group_id_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_ad_group_id_Valid() const{
    return m_ad_group_id_isValid;
}

qint32 OAIProductGroupPromotionResponseElement::getBidInMicroCurrency() const {
    return bid_in_micro_currency;
}
void OAIProductGroupPromotionResponseElement::setBidInMicroCurrency(const qint32 &bid_in_micro_currency) {
    this->bid_in_micro_currency = bid_in_micro_currency;
    this->m_bid_in_micro_currency_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_bid_in_micro_currency_Set() const{
    return m_bid_in_micro_currency_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_bid_in_micro_currency_Valid() const{
    return m_bid_in_micro_currency_isValid;
}

bool OAIProductGroupPromotionResponseElement::isIncluded() const {
    return included;
}
void OAIProductGroupPromotionResponseElement::setIncluded(const bool &included) {
    this->included = included;
    this->m_included_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_included_Set() const{
    return m_included_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_included_Valid() const{
    return m_included_isValid;
}

QString OAIProductGroupPromotionResponseElement::getDefinition() const {
    return definition;
}
void OAIProductGroupPromotionResponseElement::setDefinition(const QString &definition) {
    this->definition = definition;
    this->m_definition_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_definition_Set() const{
    return m_definition_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_definition_Valid() const{
    return m_definition_isValid;
}

QString OAIProductGroupPromotionResponseElement::getRelativeDefinition() const {
    return relative_definition;
}
void OAIProductGroupPromotionResponseElement::setRelativeDefinition(const QString &relative_definition) {
    this->relative_definition = relative_definition;
    this->m_relative_definition_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_relative_definition_Set() const{
    return m_relative_definition_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_relative_definition_Valid() const{
    return m_relative_definition_isValid;
}

QString OAIProductGroupPromotionResponseElement::getParentId() const {
    return parent_id;
}
void OAIProductGroupPromotionResponseElement::setParentId(const QString &parent_id) {
    this->parent_id = parent_id;
    this->m_parent_id_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_parent_id_Set() const{
    return m_parent_id_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_parent_id_Valid() const{
    return m_parent_id_isValid;
}

QString OAIProductGroupPromotionResponseElement::getSlideshowCollectionsTitle() const {
    return slideshow_collections_title;
}
void OAIProductGroupPromotionResponseElement::setSlideshowCollectionsTitle(const QString &slideshow_collections_title) {
    this->slideshow_collections_title = slideshow_collections_title;
    this->m_slideshow_collections_title_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_slideshow_collections_title_Set() const{
    return m_slideshow_collections_title_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_slideshow_collections_title_Valid() const{
    return m_slideshow_collections_title_isValid;
}

QString OAIProductGroupPromotionResponseElement::getSlideshowCollectionsDescription() const {
    return slideshow_collections_description;
}
void OAIProductGroupPromotionResponseElement::setSlideshowCollectionsDescription(const QString &slideshow_collections_description) {
    this->slideshow_collections_description = slideshow_collections_description;
    this->m_slideshow_collections_description_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_slideshow_collections_description_Set() const{
    return m_slideshow_collections_description_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_slideshow_collections_description_Valid() const{
    return m_slideshow_collections_description_isValid;
}

bool OAIProductGroupPromotionResponseElement::isIsMdl() const {
    return is_mdl;
}
void OAIProductGroupPromotionResponseElement::setIsMdl(const bool &is_mdl) {
    this->is_mdl = is_mdl;
    this->m_is_mdl_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_is_mdl_Set() const{
    return m_is_mdl_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_is_mdl_Valid() const{
    return m_is_mdl_isValid;
}

OAIEntityStatus OAIProductGroupPromotionResponseElement::getStatus() const {
    return status;
}
void OAIProductGroupPromotionResponseElement::setStatus(const OAIEntityStatus &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_status_Set() const{
    return m_status_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_status_Valid() const{
    return m_status_isValid;
}

QString OAIProductGroupPromotionResponseElement::getTrackingUrl() const {
    return tracking_url;
}
void OAIProductGroupPromotionResponseElement::setTrackingUrl(const QString &tracking_url) {
    this->tracking_url = tracking_url;
    this->m_tracking_url_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_tracking_url_Set() const{
    return m_tracking_url_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_tracking_url_Valid() const{
    return m_tracking_url_isValid;
}

QString OAIProductGroupPromotionResponseElement::getCatalogProductGroupId() const {
    return catalog_product_group_id;
}
void OAIProductGroupPromotionResponseElement::setCatalogProductGroupId(const QString &catalog_product_group_id) {
    this->catalog_product_group_id = catalog_product_group_id;
    this->m_catalog_product_group_id_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_catalog_product_group_id_Set() const{
    return m_catalog_product_group_id_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_catalog_product_group_id_Valid() const{
    return m_catalog_product_group_id_isValid;
}

QString OAIProductGroupPromotionResponseElement::getCatalogProductGroupName() const {
    return catalog_product_group_name;
}
void OAIProductGroupPromotionResponseElement::setCatalogProductGroupName(const QString &catalog_product_group_name) {
    this->catalog_product_group_name = catalog_product_group_name;
    this->m_catalog_product_group_name_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_catalog_product_group_name_Set() const{
    return m_catalog_product_group_name_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_catalog_product_group_name_Valid() const{
    return m_catalog_product_group_name_isValid;
}

QString OAIProductGroupPromotionResponseElement::getCollectionsHeroPinId() const {
    return collections_hero_pin_id;
}
void OAIProductGroupPromotionResponseElement::setCollectionsHeroPinId(const QString &collections_hero_pin_id) {
    this->collections_hero_pin_id = collections_hero_pin_id;
    this->m_collections_hero_pin_id_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_collections_hero_pin_id_Set() const{
    return m_collections_hero_pin_id_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_collections_hero_pin_id_Valid() const{
    return m_collections_hero_pin_id_isValid;
}

QString OAIProductGroupPromotionResponseElement::getCollectionsHeroDestinationUrl() const {
    return collections_hero_destination_url;
}
void OAIProductGroupPromotionResponseElement::setCollectionsHeroDestinationUrl(const QString &collections_hero_destination_url) {
    this->collections_hero_destination_url = collections_hero_destination_url;
    this->m_collections_hero_destination_url_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_collections_hero_destination_url_Set() const{
    return m_collections_hero_destination_url_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_collections_hero_destination_url_Valid() const{
    return m_collections_hero_destination_url_isValid;
}

OAIGridClickType OAIProductGroupPromotionResponseElement::getGridClickType() const {
    return grid_click_type;
}
void OAIProductGroupPromotionResponseElement::setGridClickType(const OAIGridClickType &grid_click_type) {
    this->grid_click_type = grid_click_type;
    this->m_grid_click_type_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_grid_click_type_Set() const{
    return m_grid_click_type_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_grid_click_type_Valid() const{
    return m_grid_click_type_isValid;
}

OAICreativeType OAIProductGroupPromotionResponseElement::getCreativeType() const {
    return creative_type;
}
void OAIProductGroupPromotionResponseElement::setCreativeType(const OAICreativeType &creative_type) {
    this->creative_type = creative_type;
    this->m_creative_type_isSet = true;
}

bool OAIProductGroupPromotionResponseElement::is_creative_type_Set() const{
    return m_creative_type_isSet;
}

bool OAIProductGroupPromotionResponseElement::is_creative_type_Valid() const{
    return m_creative_type_isValid;
}

bool OAIProductGroupPromotionResponseElement::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ad_group_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_bid_in_micro_currency_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_included_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_definition_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_relative_definition_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_parent_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_slideshow_collections_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_slideshow_collections_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_mdl_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_tracking_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_catalog_product_group_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_catalog_product_group_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_collections_hero_pin_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_collections_hero_destination_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (grid_click_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (creative_type.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIProductGroupPromotionResponseElement::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
