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

#include "OAICatalogsItemValidationIssue.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICatalogsItemValidationIssue::OAICatalogsItemValidationIssue(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICatalogsItemValidationIssue::OAICatalogsItemValidationIssue() {
    this->initializeModel();
}

OAICatalogsItemValidationIssue::~OAICatalogsItemValidationIssue() {}

void OAICatalogsItemValidationIssue::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAICatalogsItemValidationIssue::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAICatalogsItemValidationIssue::fromJson(QString jsonString) {
    
    if ( jsonString.compare("AD_LINK_FORMAT_WARNING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::AD_LINK_FORMAT_WARNING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AD_LINK_SAME_AS_LINK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::AD_LINK_SAME_AS_LINK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADDITIONAL_IMAGE_LINK_WARNING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ADDITIONAL_IMAGE_LINK_WARNING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADULT_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ADULT_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADWORDS_FORMAT_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ADWORDS_FORMAT_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADWORDS_FORMAT_WARNING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ADWORDS_FORMAT_WARNING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ADWORDS_SAME_AS_LINK", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ADWORDS_SAME_AS_LINK;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AGE_GROUP_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::AGE_GROUP_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ANDROID_DEEP_LINK_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ANDROID_DEEP_LINK_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AVAILABILITY_DATE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::AVAILABILITY_DATE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("AVAILABILITY_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::AVAILABILITY_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("BLOCKLISTED_IMAGE_SIGNATURE", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::BLOCKLISTED_IMAGE_SIGNATURE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("COUNTRY_DOES_NOT_MAP_TO_CURRENCY", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("CUSTOM_LABEL_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::CUSTOM_LABEL_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DESCRIPTION_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::DESCRIPTION_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DESCRIPTION_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::DESCRIPTION_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("DUPLICATE_PRODUCTS", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::DUPLICATE_PRODUCTS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("EXPIRATION_DATE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::EXPIRATION_DATE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("GENDER_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::GENDER_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("GTIN_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::GTIN_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IMAGE_LINK_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::IMAGE_LINK_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IMAGE_LINK_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::IMAGE_LINK_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IMAGE_LINK_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::IMAGE_LINK_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IMAGE_LINK_WARNING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::IMAGE_LINK_WARNING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("INVALID_DOMAIN", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::INVALID_DOMAIN;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IOS_DEEP_LINK_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::IOS_DEEP_LINK_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("IS_BUNDLE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::IS_BUNDLE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("ITEMID_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::ITEMID_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LINK_FORMAT_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::LINK_FORMAT_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LINK_FORMAT_WARNING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::LINK_FORMAT_WARNING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LINK_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::LINK_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("LIST_PRICE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::LIST_PRICE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MIN_AD_PRICE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::MIN_AD_PRICE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MPN_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::MPN_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("MULTIPACK_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::MULTIPACK_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("OPTIONAL_CONDITION_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::OPTIONAL_CONDITION_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("OPTIONAL_CONDITION_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::OPTIONAL_CONDITION_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("OPTIONAL_PRODUCT_CATEGORY_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::OPTIONAL_PRODUCT_CATEGORY_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("OPTIONAL_PRODUCT_CATEGORY_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::OPTIONAL_PRODUCT_CATEGORY_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PARSE_LINE_ERROR", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PARSE_LINE_ERROR;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PINJOIN_CONTENT_UNSAFE", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PINJOIN_CONTENT_UNSAFE;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PRICE_CANNOT_BE_DETERMINED", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PRICE_CANNOT_BE_DETERMINED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PRICE_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PRICE_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PRODUCT_CATEGORY_DEPTH_WARNING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PRODUCT_CATEGORY_DEPTH_WARNING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PRODUCT_LINK_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PRODUCT_LINK_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PRODUCT_PRICE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PRODUCT_PRICE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("PRODUCT_TYPE_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::PRODUCT_TYPE_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SALE_DATE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SALE_DATE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SALES_PRICE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SALES_PRICE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SALES_PRICE_TOO_HIGH", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SALES_PRICE_TOO_HIGH;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SALES_PRICE_TOO_LOW", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SALES_PRICE_TOO_LOW;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SHIPPING_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SHIPPING_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SHIPPING_HEIGHT_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SHIPPING_HEIGHT_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SHIPPING_WEIGHT_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SHIPPING_WEIGHT_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SHIPPING_WIDTH_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SHIPPING_WIDTH_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SIZE_SYSTEM_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SIZE_SYSTEM_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("SIZE_TYPE_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::SIZE_TYPE_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TAX_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::TAX_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TITLE_LENGTH_TOO_LONG", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::TITLE_LENGTH_TOO_LONG;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TITLE_MISSING", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::TITLE_MISSING;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("TOO_MANY_ADDITIONAL_IMAGE_LINKS", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::TOO_MANY_ADDITIONAL_IMAGE_LINKS;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("UTM_SOURCE_AUTO_CORRECTED", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::UTM_SOURCE_AUTO_CORRECTED;
        m_value_isSet = m_value_isValid = true;
    }
    else if ( jsonString.compare("WEIGHT_UNIT_INVALID", Qt::CaseInsensitive) == 0) {
        m_value = eOAICatalogsItemValidationIssue::WEIGHT_UNIT_INVALID;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAICatalogsItemValidationIssue::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAICatalogsItemValidationIssue::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAICatalogsItemValidationIssue::AD_LINK_FORMAT_WARNING:
            val = "AD_LINK_FORMAT_WARNING";
            break;
        case eOAICatalogsItemValidationIssue::AD_LINK_SAME_AS_LINK:
            val = "AD_LINK_SAME_AS_LINK";
            break;
        case eOAICatalogsItemValidationIssue::ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG:
            val = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::ADDITIONAL_IMAGE_LINK_WARNING:
            val = "ADDITIONAL_IMAGE_LINK_WARNING";
            break;
        case eOAICatalogsItemValidationIssue::ADULT_INVALID:
            val = "ADULT_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::ADWORDS_FORMAT_INVALID:
            val = "ADWORDS_FORMAT_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::ADWORDS_FORMAT_WARNING:
            val = "ADWORDS_FORMAT_WARNING";
            break;
        case eOAICatalogsItemValidationIssue::ADWORDS_SAME_AS_LINK:
            val = "ADWORDS_SAME_AS_LINK";
            break;
        case eOAICatalogsItemValidationIssue::AGE_GROUP_INVALID:
            val = "AGE_GROUP_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::ANDROID_DEEP_LINK_INVALID:
            val = "ANDROID_DEEP_LINK_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::AVAILABILITY_DATE_INVALID:
            val = "AVAILABILITY_DATE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::AVAILABILITY_INVALID:
            val = "AVAILABILITY_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::BLOCKLISTED_IMAGE_SIGNATURE:
            val = "BLOCKLISTED_IMAGE_SIGNATURE";
            break;
        case eOAICatalogsItemValidationIssue::COUNTRY_DOES_NOT_MAP_TO_CURRENCY:
            val = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY";
            break;
        case eOAICatalogsItemValidationIssue::CUSTOM_LABEL_LENGTH_TOO_LONG:
            val = "CUSTOM_LABEL_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::DESCRIPTION_LENGTH_TOO_LONG:
            val = "DESCRIPTION_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::DESCRIPTION_MISSING:
            val = "DESCRIPTION_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::DUPLICATE_PRODUCTS:
            val = "DUPLICATE_PRODUCTS";
            break;
        case eOAICatalogsItemValidationIssue::EXPIRATION_DATE_INVALID:
            val = "EXPIRATION_DATE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::GENDER_INVALID:
            val = "GENDER_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::GTIN_INVALID:
            val = "GTIN_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::IMAGE_LINK_INVALID:
            val = "IMAGE_LINK_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::IMAGE_LINK_LENGTH_TOO_LONG:
            val = "IMAGE_LINK_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::IMAGE_LINK_MISSING:
            val = "IMAGE_LINK_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::IMAGE_LINK_WARNING:
            val = "IMAGE_LINK_WARNING";
            break;
        case eOAICatalogsItemValidationIssue::INVALID_DOMAIN:
            val = "INVALID_DOMAIN";
            break;
        case eOAICatalogsItemValidationIssue::IOS_DEEP_LINK_INVALID:
            val = "IOS_DEEP_LINK_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::IS_BUNDLE_INVALID:
            val = "IS_BUNDLE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE:
            val = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE";
            break;
        case eOAICatalogsItemValidationIssue::ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE:
            val = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";
            break;
        case eOAICatalogsItemValidationIssue::ITEMID_MISSING:
            val = "ITEMID_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::LINK_FORMAT_INVALID:
            val = "LINK_FORMAT_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::LINK_FORMAT_WARNING:
            val = "LINK_FORMAT_WARNING";
            break;
        case eOAICatalogsItemValidationIssue::LINK_LENGTH_TOO_LONG:
            val = "LINK_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::LIST_PRICE_INVALID:
            val = "LIST_PRICE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED:
            val = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";
            break;
        case eOAICatalogsItemValidationIssue::MIN_AD_PRICE_INVALID:
            val = "MIN_AD_PRICE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::MPN_INVALID:
            val = "MPN_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::MULTIPACK_INVALID:
            val = "MULTIPACK_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::OPTIONAL_CONDITION_INVALID:
            val = "OPTIONAL_CONDITION_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::OPTIONAL_CONDITION_MISSING:
            val = "OPTIONAL_CONDITION_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::OPTIONAL_PRODUCT_CATEGORY_INVALID:
            val = "OPTIONAL_PRODUCT_CATEGORY_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::OPTIONAL_PRODUCT_CATEGORY_MISSING:
            val = "OPTIONAL_PRODUCT_CATEGORY_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::PARSE_LINE_ERROR:
            val = "PARSE_LINE_ERROR";
            break;
        case eOAICatalogsItemValidationIssue::PINJOIN_CONTENT_UNSAFE:
            val = "PINJOIN_CONTENT_UNSAFE";
            break;
        case eOAICatalogsItemValidationIssue::PRICE_CANNOT_BE_DETERMINED:
            val = "PRICE_CANNOT_BE_DETERMINED";
            break;
        case eOAICatalogsItemValidationIssue::PRICE_MISSING:
            val = "PRICE_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::PRODUCT_CATEGORY_DEPTH_WARNING:
            val = "PRODUCT_CATEGORY_DEPTH_WARNING";
            break;
        case eOAICatalogsItemValidationIssue::PRODUCT_LINK_MISSING:
            val = "PRODUCT_LINK_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::PRODUCT_PRICE_INVALID:
            val = "PRODUCT_PRICE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::PRODUCT_TYPE_LENGTH_TOO_LONG:
            val = "PRODUCT_TYPE_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::SALE_DATE_INVALID:
            val = "SALE_DATE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SALES_PRICE_INVALID:
            val = "SALES_PRICE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SALES_PRICE_TOO_HIGH:
            val = "SALES_PRICE_TOO_HIGH";
            break;
        case eOAICatalogsItemValidationIssue::SALES_PRICE_TOO_LOW:
            val = "SALES_PRICE_TOO_LOW";
            break;
        case eOAICatalogsItemValidationIssue::SHIPPING_INVALID:
            val = "SHIPPING_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SHIPPING_HEIGHT_INVALID:
            val = "SHIPPING_HEIGHT_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SHIPPING_WEIGHT_INVALID:
            val = "SHIPPING_WEIGHT_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SHIPPING_WIDTH_INVALID:
            val = "SHIPPING_WIDTH_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SIZE_SYSTEM_INVALID:
            val = "SIZE_SYSTEM_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::SIZE_TYPE_INVALID:
            val = "SIZE_TYPE_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::TAX_INVALID:
            val = "TAX_INVALID";
            break;
        case eOAICatalogsItemValidationIssue::TITLE_LENGTH_TOO_LONG:
            val = "TITLE_LENGTH_TOO_LONG";
            break;
        case eOAICatalogsItemValidationIssue::TITLE_MISSING:
            val = "TITLE_MISSING";
            break;
        case eOAICatalogsItemValidationIssue::TOO_MANY_ADDITIONAL_IMAGE_LINKS:
            val = "TOO_MANY_ADDITIONAL_IMAGE_LINKS";
            break;
        case eOAICatalogsItemValidationIssue::UTM_SOURCE_AUTO_CORRECTED:
            val = "UTM_SOURCE_AUTO_CORRECTED";
            break;
        case eOAICatalogsItemValidationIssue::WEIGHT_UNIT_INVALID:
            val = "WEIGHT_UNIT_INVALID";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAICatalogsItemValidationIssue::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAICatalogsItemValidationIssue::eOAICatalogsItemValidationIssue OAICatalogsItemValidationIssue::getValue() const {
    return m_value;
}

void OAICatalogsItemValidationIssue::setValue(const OAICatalogsItemValidationIssue::eOAICatalogsItemValidationIssue& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAICatalogsItemValidationIssue::isSet() const {
    
    return m_value_isSet;
}

bool OAICatalogsItemValidationIssue::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
