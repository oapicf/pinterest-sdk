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

#include "OAICatalogsUpdatableHotelAttributes.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsUpdatableHotelAttributes::OAICatalogsUpdatableHotelAttributes(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsUpdatableHotelAttributes::OAICatalogsUpdatableHotelAttributes() {
    this->initializeModel();
}

OAICatalogsUpdatableHotelAttributes::~OAICatalogsUpdatableHotelAttributes() {}

void OAICatalogsUpdatableHotelAttributes::initializeModel() {

    m_name_isSet = false;
    m_name_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_brand_isSet = false;
    m_brand_isValid = false;

    m_latitude_isSet = false;
    m_latitude_isValid = false;

    m_longitude_isSet = false;
    m_longitude_isValid = false;

    m_neighborhood_isSet = false;
    m_neighborhood_isValid = false;

    m_address_isSet = false;
    m_address_isValid = false;

    m_custom_label_0_isSet = false;
    m_custom_label_0_isValid = false;

    m_custom_label_1_isSet = false;
    m_custom_label_1_isValid = false;

    m_custom_label_2_isSet = false;
    m_custom_label_2_isValid = false;

    m_custom_label_3_isSet = false;
    m_custom_label_3_isValid = false;

    m_custom_label_4_isSet = false;
    m_custom_label_4_isValid = false;

    m_category_isSet = false;
    m_category_isValid = false;

    m_base_price_isSet = false;
    m_base_price_isValid = false;

    m_sale_price_isSet = false;
    m_sale_price_isValid = false;

    m_guest_ratings_isSet = false;
    m_guest_ratings_isValid = false;
}

void OAICatalogsUpdatableHotelAttributes::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICatalogsUpdatableHotelAttributes::fromJsonObject(QJsonObject json) {

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_brand_isValid = ::OpenAPI::fromJsonValue(brand, json[QString("brand")]);
    m_brand_isSet = !json[QString("brand")].isNull() && m_brand_isValid;

    m_latitude_isValid = ::OpenAPI::fromJsonValue(latitude, json[QString("latitude")]);
    m_latitude_isSet = !json[QString("latitude")].isNull() && m_latitude_isValid;

    m_longitude_isValid = ::OpenAPI::fromJsonValue(longitude, json[QString("longitude")]);
    m_longitude_isSet = !json[QString("longitude")].isNull() && m_longitude_isValid;

    m_neighborhood_isValid = ::OpenAPI::fromJsonValue(neighborhood, json[QString("neighborhood")]);
    m_neighborhood_isSet = !json[QString("neighborhood")].isNull() && m_neighborhood_isValid;

    m_address_isValid = ::OpenAPI::fromJsonValue(address, json[QString("address")]);
    m_address_isSet = !json[QString("address")].isNull() && m_address_isValid;

    m_custom_label_0_isValid = ::OpenAPI::fromJsonValue(custom_label_0, json[QString("custom_label_0")]);
    m_custom_label_0_isSet = !json[QString("custom_label_0")].isNull() && m_custom_label_0_isValid;

    m_custom_label_1_isValid = ::OpenAPI::fromJsonValue(custom_label_1, json[QString("custom_label_1")]);
    m_custom_label_1_isSet = !json[QString("custom_label_1")].isNull() && m_custom_label_1_isValid;

    m_custom_label_2_isValid = ::OpenAPI::fromJsonValue(custom_label_2, json[QString("custom_label_2")]);
    m_custom_label_2_isSet = !json[QString("custom_label_2")].isNull() && m_custom_label_2_isValid;

    m_custom_label_3_isValid = ::OpenAPI::fromJsonValue(custom_label_3, json[QString("custom_label_3")]);
    m_custom_label_3_isSet = !json[QString("custom_label_3")].isNull() && m_custom_label_3_isValid;

    m_custom_label_4_isValid = ::OpenAPI::fromJsonValue(custom_label_4, json[QString("custom_label_4")]);
    m_custom_label_4_isSet = !json[QString("custom_label_4")].isNull() && m_custom_label_4_isValid;

    m_category_isValid = ::OpenAPI::fromJsonValue(category, json[QString("category")]);
    m_category_isSet = !json[QString("category")].isNull() && m_category_isValid;

    m_base_price_isValid = ::OpenAPI::fromJsonValue(base_price, json[QString("base_price")]);
    m_base_price_isSet = !json[QString("base_price")].isNull() && m_base_price_isValid;

    m_sale_price_isValid = ::OpenAPI::fromJsonValue(sale_price, json[QString("sale_price")]);
    m_sale_price_isSet = !json[QString("sale_price")].isNull() && m_sale_price_isValid;

    m_guest_ratings_isValid = ::OpenAPI::fromJsonValue(guest_ratings, json[QString("guest_ratings")]);
    m_guest_ratings_isSet = !json[QString("guest_ratings")].isNull() && m_guest_ratings_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICatalogsUpdatableHotelAttributes::asJsonObject() const {
    QJsonObject obj;
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(link));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_brand_isSet) {
        obj.insert(QString("brand"), ::OpenAPI::toJsonValue(brand));
    }
    if (m_latitude_isSet) {
        obj.insert(QString("latitude"), ::OpenAPI::toJsonValue(latitude));
    }
    if (m_longitude_isSet) {
        obj.insert(QString("longitude"), ::OpenAPI::toJsonValue(longitude));
    }
    if (neighborhood.size() > 0) {
        obj.insert(QString("neighborhood"), ::OpenAPI::toJsonValue(neighborhood));
    }
    if (address.isSet()) {
        obj.insert(QString("address"), ::OpenAPI::toJsonValue(address));
    }
    if (m_custom_label_0_isSet) {
        obj.insert(QString("custom_label_0"), ::OpenAPI::toJsonValue(custom_label_0));
    }
    if (m_custom_label_1_isSet) {
        obj.insert(QString("custom_label_1"), ::OpenAPI::toJsonValue(custom_label_1));
    }
    if (m_custom_label_2_isSet) {
        obj.insert(QString("custom_label_2"), ::OpenAPI::toJsonValue(custom_label_2));
    }
    if (m_custom_label_3_isSet) {
        obj.insert(QString("custom_label_3"), ::OpenAPI::toJsonValue(custom_label_3));
    }
    if (m_custom_label_4_isSet) {
        obj.insert(QString("custom_label_4"), ::OpenAPI::toJsonValue(custom_label_4));
    }
    if (m_category_isSet) {
        obj.insert(QString("category"), ::OpenAPI::toJsonValue(category));
    }
    if (m_base_price_isSet) {
        obj.insert(QString("base_price"), ::OpenAPI::toJsonValue(base_price));
    }
    if (m_sale_price_isSet) {
        obj.insert(QString("sale_price"), ::OpenAPI::toJsonValue(sale_price));
    }
    if (guest_ratings.isSet()) {
        obj.insert(QString("guest_ratings"), ::OpenAPI::toJsonValue(guest_ratings));
    }
    return obj;
}

QString OAICatalogsUpdatableHotelAttributes::getName() const {
    return name;
}
void OAICatalogsUpdatableHotelAttributes::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_name_Set() const{
    return m_name_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_name_Valid() const{
    return m_name_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getLink() const {
    return link;
}
void OAICatalogsUpdatableHotelAttributes::setLink(const QString &link) {
    this->link = link;
    this->m_link_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_link_Set() const{
    return m_link_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_link_Valid() const{
    return m_link_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getDescription() const {
    return description;
}
void OAICatalogsUpdatableHotelAttributes::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_description_Set() const{
    return m_description_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_description_Valid() const{
    return m_description_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getBrand() const {
    return brand;
}
void OAICatalogsUpdatableHotelAttributes::setBrand(const QString &brand) {
    this->brand = brand;
    this->m_brand_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_brand_Set() const{
    return m_brand_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_brand_Valid() const{
    return m_brand_isValid;
}

double OAICatalogsUpdatableHotelAttributes::getLatitude() const {
    return latitude;
}
void OAICatalogsUpdatableHotelAttributes::setLatitude(const double &latitude) {
    this->latitude = latitude;
    this->m_latitude_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_latitude_Set() const{
    return m_latitude_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_latitude_Valid() const{
    return m_latitude_isValid;
}

double OAICatalogsUpdatableHotelAttributes::getLongitude() const {
    return longitude;
}
void OAICatalogsUpdatableHotelAttributes::setLongitude(const double &longitude) {
    this->longitude = longitude;
    this->m_longitude_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_longitude_Set() const{
    return m_longitude_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_longitude_Valid() const{
    return m_longitude_isValid;
}

QList<QString> OAICatalogsUpdatableHotelAttributes::getNeighborhood() const {
    return neighborhood;
}
void OAICatalogsUpdatableHotelAttributes::setNeighborhood(const QList<QString> &neighborhood) {
    this->neighborhood = neighborhood;
    this->m_neighborhood_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_neighborhood_Set() const{
    return m_neighborhood_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_neighborhood_Valid() const{
    return m_neighborhood_isValid;
}

OAICatalogsHotelAddress OAICatalogsUpdatableHotelAttributes::getAddress() const {
    return address;
}
void OAICatalogsUpdatableHotelAttributes::setAddress(const OAICatalogsHotelAddress &address) {
    this->address = address;
    this->m_address_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_address_Set() const{
    return m_address_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_address_Valid() const{
    return m_address_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getCustomLabel0() const {
    return custom_label_0;
}
void OAICatalogsUpdatableHotelAttributes::setCustomLabel0(const QString &custom_label_0) {
    this->custom_label_0 = custom_label_0;
    this->m_custom_label_0_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_0_Set() const{
    return m_custom_label_0_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_0_Valid() const{
    return m_custom_label_0_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getCustomLabel1() const {
    return custom_label_1;
}
void OAICatalogsUpdatableHotelAttributes::setCustomLabel1(const QString &custom_label_1) {
    this->custom_label_1 = custom_label_1;
    this->m_custom_label_1_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_1_Set() const{
    return m_custom_label_1_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_1_Valid() const{
    return m_custom_label_1_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getCustomLabel2() const {
    return custom_label_2;
}
void OAICatalogsUpdatableHotelAttributes::setCustomLabel2(const QString &custom_label_2) {
    this->custom_label_2 = custom_label_2;
    this->m_custom_label_2_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_2_Set() const{
    return m_custom_label_2_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_2_Valid() const{
    return m_custom_label_2_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getCustomLabel3() const {
    return custom_label_3;
}
void OAICatalogsUpdatableHotelAttributes::setCustomLabel3(const QString &custom_label_3) {
    this->custom_label_3 = custom_label_3;
    this->m_custom_label_3_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_3_Set() const{
    return m_custom_label_3_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_3_Valid() const{
    return m_custom_label_3_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getCustomLabel4() const {
    return custom_label_4;
}
void OAICatalogsUpdatableHotelAttributes::setCustomLabel4(const QString &custom_label_4) {
    this->custom_label_4 = custom_label_4;
    this->m_custom_label_4_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_4_Set() const{
    return m_custom_label_4_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_custom_label_4_Valid() const{
    return m_custom_label_4_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getCategory() const {
    return category;
}
void OAICatalogsUpdatableHotelAttributes::setCategory(const QString &category) {
    this->category = category;
    this->m_category_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_category_Set() const{
    return m_category_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_category_Valid() const{
    return m_category_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getBasePrice() const {
    return base_price;
}
void OAICatalogsUpdatableHotelAttributes::setBasePrice(const QString &base_price) {
    this->base_price = base_price;
    this->m_base_price_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_base_price_Set() const{
    return m_base_price_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_base_price_Valid() const{
    return m_base_price_isValid;
}

QString OAICatalogsUpdatableHotelAttributes::getSalePrice() const {
    return sale_price;
}
void OAICatalogsUpdatableHotelAttributes::setSalePrice(const QString &sale_price) {
    this->sale_price = sale_price;
    this->m_sale_price_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_sale_price_Set() const{
    return m_sale_price_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_sale_price_Valid() const{
    return m_sale_price_isValid;
}

OAICatalogsHotelGuestRatings OAICatalogsUpdatableHotelAttributes::getGuestRatings() const {
    return guest_ratings;
}
void OAICatalogsUpdatableHotelAttributes::setGuestRatings(const OAICatalogsHotelGuestRatings &guest_ratings) {
    this->guest_ratings = guest_ratings;
    this->m_guest_ratings_isSet = true;
}

bool OAICatalogsUpdatableHotelAttributes::is_guest_ratings_Set() const{
    return m_guest_ratings_isSet;
}

bool OAICatalogsUpdatableHotelAttributes::is_guest_ratings_Valid() const{
    return m_guest_ratings_isValid;
}

bool OAICatalogsUpdatableHotelAttributes::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_brand_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_latitude_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_longitude_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (neighborhood.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (address.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_0_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_1_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_2_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_3_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_custom_label_4_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_category_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_base_price_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sale_price_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (guest_ratings.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICatalogsUpdatableHotelAttributes::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
