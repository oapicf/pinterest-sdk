//
// CatalogsItemValidationWarnings.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CatalogsItemValidationWarnings: Codable, JSONEncodable, Hashable {

    public var AD_LINK_FORMAT_WARNING: CatalogsItemValidationDetails?
    public var AD_LINK_SAME_AS_LINK: CatalogsItemValidationDetails?
    public var ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails?
    public var ADDITIONAL_IMAGE_LINK_WARNING: CatalogsItemValidationDetails?
    public var ADWORDS_FORMAT_WARNING: CatalogsItemValidationDetails?
    public var ADWORDS_SAME_AS_LINK: CatalogsItemValidationDetails?
    public var AGE_GROUP_INVALID: CatalogsItemValidationDetails?
    public var SIZE_SYSTEM_INVALID: CatalogsItemValidationDetails?
    public var ANDROID_DEEP_LINK_INVALID: CatalogsItemValidationDetails?
    public var AVAILABILITY_DATE_INVALID: CatalogsItemValidationDetails?
    public var COUNTRY_DOES_NOT_MAP_TO_CURRENCY: CatalogsItemValidationDetails?
    public var CUSTOM_LABEL_LENGTH_TOO_LONG: CatalogsItemValidationDetails?
    public var DESCRIPTION_LENGTH_TOO_LONG: CatalogsItemValidationDetails?
    public var EXPIRATION_DATE_INVALID: CatalogsItemValidationDetails?
    public var GENDER_INVALID: CatalogsItemValidationDetails?
    public var GTIN_INVALID: CatalogsItemValidationDetails?
    public var IMAGE_LINK_WARNING: CatalogsItemValidationDetails?
    public var IOS_DEEP_LINK_INVALID: CatalogsItemValidationDetails?
    public var IS_BUNDLE_INVALID: CatalogsItemValidationDetails?
    public var ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails?
    public var LINK_FORMAT_WARNING: CatalogsItemValidationDetails?
    public var MIN_AD_PRICE_INVALID: CatalogsItemValidationDetails?
    public var MPN_INVALID: CatalogsItemValidationDetails?
    public var MULTIPACK_INVALID: CatalogsItemValidationDetails?
    public var OPTIONAL_CONDITION_INVALID: CatalogsItemValidationDetails?
    public var OPTIONAL_CONDITION_MISSING: CatalogsItemValidationDetails?
    public var OPTIONAL_PRODUCT_CATEGORY_INVALID: CatalogsItemValidationDetails?
    public var OPTIONAL_PRODUCT_CATEGORY_MISSING: CatalogsItemValidationDetails?
    public var PRODUCT_CATEGORY_DEPTH_WARNING: CatalogsItemValidationDetails?
    public var PRODUCT_TYPE_LENGTH_TOO_LONG: CatalogsItemValidationDetails?
    public var SALES_PRICE_INVALID: CatalogsItemValidationDetails?
    public var SALES_PRICE_TOO_LOW: CatalogsItemValidationDetails?
    public var SALES_PRICE_TOO_HIGH: CatalogsItemValidationDetails?
    public var SALE_DATE_INVALID: CatalogsItemValidationDetails?
    public var SHIPPING_INVALID: CatalogsItemValidationDetails?
    public var SHIPPING_HEIGHT_INVALID: CatalogsItemValidationDetails?
    public var SHIPPING_WEIGHT_INVALID: CatalogsItemValidationDetails?
    public var SHIPPING_WIDTH_INVALID: CatalogsItemValidationDetails?
    public var SIZE_TYPE_INVALID: CatalogsItemValidationDetails?
    public var TAX_INVALID: CatalogsItemValidationDetails?
    public var TITLE_LENGTH_TOO_LONG: CatalogsItemValidationDetails?
    public var TOO_MANY_ADDITIONAL_IMAGE_LINKS: CatalogsItemValidationDetails?
    public var UTM_SOURCE_AUTO_CORRECTED: CatalogsItemValidationDetails?
    public var WEIGHT_UNIT_INVALID: CatalogsItemValidationDetails?

    public init(AD_LINK_FORMAT_WARNING: CatalogsItemValidationDetails? = nil, AD_LINK_SAME_AS_LINK: CatalogsItemValidationDetails? = nil, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = nil, ADDITIONAL_IMAGE_LINK_WARNING: CatalogsItemValidationDetails? = nil, ADWORDS_FORMAT_WARNING: CatalogsItemValidationDetails? = nil, ADWORDS_SAME_AS_LINK: CatalogsItemValidationDetails? = nil, AGE_GROUP_INVALID: CatalogsItemValidationDetails? = nil, SIZE_SYSTEM_INVALID: CatalogsItemValidationDetails? = nil, ANDROID_DEEP_LINK_INVALID: CatalogsItemValidationDetails? = nil, AVAILABILITY_DATE_INVALID: CatalogsItemValidationDetails? = nil, COUNTRY_DOES_NOT_MAP_TO_CURRENCY: CatalogsItemValidationDetails? = nil, CUSTOM_LABEL_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = nil, DESCRIPTION_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = nil, EXPIRATION_DATE_INVALID: CatalogsItemValidationDetails? = nil, GENDER_INVALID: CatalogsItemValidationDetails? = nil, GTIN_INVALID: CatalogsItemValidationDetails? = nil, IMAGE_LINK_WARNING: CatalogsItemValidationDetails? = nil, IOS_DEEP_LINK_INVALID: CatalogsItemValidationDetails? = nil, IS_BUNDLE_INVALID: CatalogsItemValidationDetails? = nil, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails? = nil, LINK_FORMAT_WARNING: CatalogsItemValidationDetails? = nil, MIN_AD_PRICE_INVALID: CatalogsItemValidationDetails? = nil, MPN_INVALID: CatalogsItemValidationDetails? = nil, MULTIPACK_INVALID: CatalogsItemValidationDetails? = nil, OPTIONAL_CONDITION_INVALID: CatalogsItemValidationDetails? = nil, OPTIONAL_CONDITION_MISSING: CatalogsItemValidationDetails? = nil, OPTIONAL_PRODUCT_CATEGORY_INVALID: CatalogsItemValidationDetails? = nil, OPTIONAL_PRODUCT_CATEGORY_MISSING: CatalogsItemValidationDetails? = nil, PRODUCT_CATEGORY_DEPTH_WARNING: CatalogsItemValidationDetails? = nil, PRODUCT_TYPE_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = nil, SALES_PRICE_INVALID: CatalogsItemValidationDetails? = nil, SALES_PRICE_TOO_LOW: CatalogsItemValidationDetails? = nil, SALES_PRICE_TOO_HIGH: CatalogsItemValidationDetails? = nil, SALE_DATE_INVALID: CatalogsItemValidationDetails? = nil, SHIPPING_INVALID: CatalogsItemValidationDetails? = nil, SHIPPING_HEIGHT_INVALID: CatalogsItemValidationDetails? = nil, SHIPPING_WEIGHT_INVALID: CatalogsItemValidationDetails? = nil, SHIPPING_WIDTH_INVALID: CatalogsItemValidationDetails? = nil, SIZE_TYPE_INVALID: CatalogsItemValidationDetails? = nil, TAX_INVALID: CatalogsItemValidationDetails? = nil, TITLE_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = nil, TOO_MANY_ADDITIONAL_IMAGE_LINKS: CatalogsItemValidationDetails? = nil, UTM_SOURCE_AUTO_CORRECTED: CatalogsItemValidationDetails? = nil, WEIGHT_UNIT_INVALID: CatalogsItemValidationDetails? = nil) {
        self.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING
        self.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK
        self.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
        self.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING
        self.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING
        self.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK
        self.AGE_GROUP_INVALID = AGE_GROUP_INVALID
        self.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID
        self.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID
        self.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID
        self.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY
        self.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG
        self.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG
        self.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID
        self.GENDER_INVALID = GENDER_INVALID
        self.GTIN_INVALID = GTIN_INVALID
        self.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING
        self.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID
        self.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID
        self.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
        self.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING
        self.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID
        self.MPN_INVALID = MPN_INVALID
        self.MULTIPACK_INVALID = MULTIPACK_INVALID
        self.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID
        self.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING
        self.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID
        self.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING
        self.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING
        self.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG
        self.SALES_PRICE_INVALID = SALES_PRICE_INVALID
        self.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW
        self.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH
        self.SALE_DATE_INVALID = SALE_DATE_INVALID
        self.SHIPPING_INVALID = SHIPPING_INVALID
        self.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID
        self.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID
        self.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID
        self.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID
        self.TAX_INVALID = TAX_INVALID
        self.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG
        self.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS
        self.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED
        self.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case AD_LINK_FORMAT_WARNING
        case AD_LINK_SAME_AS_LINK
        case ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
        case ADDITIONAL_IMAGE_LINK_WARNING
        case ADWORDS_FORMAT_WARNING
        case ADWORDS_SAME_AS_LINK
        case AGE_GROUP_INVALID
        case SIZE_SYSTEM_INVALID
        case ANDROID_DEEP_LINK_INVALID
        case AVAILABILITY_DATE_INVALID
        case COUNTRY_DOES_NOT_MAP_TO_CURRENCY
        case CUSTOM_LABEL_LENGTH_TOO_LONG
        case DESCRIPTION_LENGTH_TOO_LONG
        case EXPIRATION_DATE_INVALID
        case GENDER_INVALID
        case GTIN_INVALID
        case IMAGE_LINK_WARNING
        case IOS_DEEP_LINK_INVALID
        case IS_BUNDLE_INVALID
        case ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
        case LINK_FORMAT_WARNING
        case MIN_AD_PRICE_INVALID
        case MPN_INVALID
        case MULTIPACK_INVALID
        case OPTIONAL_CONDITION_INVALID
        case OPTIONAL_CONDITION_MISSING
        case OPTIONAL_PRODUCT_CATEGORY_INVALID
        case OPTIONAL_PRODUCT_CATEGORY_MISSING
        case PRODUCT_CATEGORY_DEPTH_WARNING
        case PRODUCT_TYPE_LENGTH_TOO_LONG
        case SALES_PRICE_INVALID
        case SALES_PRICE_TOO_LOW
        case SALES_PRICE_TOO_HIGH
        case SALE_DATE_INVALID
        case SHIPPING_INVALID
        case SHIPPING_HEIGHT_INVALID
        case SHIPPING_WEIGHT_INVALID
        case SHIPPING_WIDTH_INVALID
        case SIZE_TYPE_INVALID
        case TAX_INVALID
        case TITLE_LENGTH_TOO_LONG
        case TOO_MANY_ADDITIONAL_IMAGE_LINKS
        case UTM_SOURCE_AUTO_CORRECTED
        case WEIGHT_UNIT_INVALID
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(AD_LINK_FORMAT_WARNING, forKey: .AD_LINK_FORMAT_WARNING)
        try container.encodeIfPresent(AD_LINK_SAME_AS_LINK, forKey: .AD_LINK_SAME_AS_LINK)
        try container.encodeIfPresent(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, forKey: .ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)
        try container.encodeIfPresent(ADDITIONAL_IMAGE_LINK_WARNING, forKey: .ADDITIONAL_IMAGE_LINK_WARNING)
        try container.encodeIfPresent(ADWORDS_FORMAT_WARNING, forKey: .ADWORDS_FORMAT_WARNING)
        try container.encodeIfPresent(ADWORDS_SAME_AS_LINK, forKey: .ADWORDS_SAME_AS_LINK)
        try container.encodeIfPresent(AGE_GROUP_INVALID, forKey: .AGE_GROUP_INVALID)
        try container.encodeIfPresent(SIZE_SYSTEM_INVALID, forKey: .SIZE_SYSTEM_INVALID)
        try container.encodeIfPresent(ANDROID_DEEP_LINK_INVALID, forKey: .ANDROID_DEEP_LINK_INVALID)
        try container.encodeIfPresent(AVAILABILITY_DATE_INVALID, forKey: .AVAILABILITY_DATE_INVALID)
        try container.encodeIfPresent(COUNTRY_DOES_NOT_MAP_TO_CURRENCY, forKey: .COUNTRY_DOES_NOT_MAP_TO_CURRENCY)
        try container.encodeIfPresent(CUSTOM_LABEL_LENGTH_TOO_LONG, forKey: .CUSTOM_LABEL_LENGTH_TOO_LONG)
        try container.encodeIfPresent(DESCRIPTION_LENGTH_TOO_LONG, forKey: .DESCRIPTION_LENGTH_TOO_LONG)
        try container.encodeIfPresent(EXPIRATION_DATE_INVALID, forKey: .EXPIRATION_DATE_INVALID)
        try container.encodeIfPresent(GENDER_INVALID, forKey: .GENDER_INVALID)
        try container.encodeIfPresent(GTIN_INVALID, forKey: .GTIN_INVALID)
        try container.encodeIfPresent(IMAGE_LINK_WARNING, forKey: .IMAGE_LINK_WARNING)
        try container.encodeIfPresent(IOS_DEEP_LINK_INVALID, forKey: .IOS_DEEP_LINK_INVALID)
        try container.encodeIfPresent(IS_BUNDLE_INVALID, forKey: .IS_BUNDLE_INVALID)
        try container.encodeIfPresent(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, forKey: .ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)
        try container.encodeIfPresent(LINK_FORMAT_WARNING, forKey: .LINK_FORMAT_WARNING)
        try container.encodeIfPresent(MIN_AD_PRICE_INVALID, forKey: .MIN_AD_PRICE_INVALID)
        try container.encodeIfPresent(MPN_INVALID, forKey: .MPN_INVALID)
        try container.encodeIfPresent(MULTIPACK_INVALID, forKey: .MULTIPACK_INVALID)
        try container.encodeIfPresent(OPTIONAL_CONDITION_INVALID, forKey: .OPTIONAL_CONDITION_INVALID)
        try container.encodeIfPresent(OPTIONAL_CONDITION_MISSING, forKey: .OPTIONAL_CONDITION_MISSING)
        try container.encodeIfPresent(OPTIONAL_PRODUCT_CATEGORY_INVALID, forKey: .OPTIONAL_PRODUCT_CATEGORY_INVALID)
        try container.encodeIfPresent(OPTIONAL_PRODUCT_CATEGORY_MISSING, forKey: .OPTIONAL_PRODUCT_CATEGORY_MISSING)
        try container.encodeIfPresent(PRODUCT_CATEGORY_DEPTH_WARNING, forKey: .PRODUCT_CATEGORY_DEPTH_WARNING)
        try container.encodeIfPresent(PRODUCT_TYPE_LENGTH_TOO_LONG, forKey: .PRODUCT_TYPE_LENGTH_TOO_LONG)
        try container.encodeIfPresent(SALES_PRICE_INVALID, forKey: .SALES_PRICE_INVALID)
        try container.encodeIfPresent(SALES_PRICE_TOO_LOW, forKey: .SALES_PRICE_TOO_LOW)
        try container.encodeIfPresent(SALES_PRICE_TOO_HIGH, forKey: .SALES_PRICE_TOO_HIGH)
        try container.encodeIfPresent(SALE_DATE_INVALID, forKey: .SALE_DATE_INVALID)
        try container.encodeIfPresent(SHIPPING_INVALID, forKey: .SHIPPING_INVALID)
        try container.encodeIfPresent(SHIPPING_HEIGHT_INVALID, forKey: .SHIPPING_HEIGHT_INVALID)
        try container.encodeIfPresent(SHIPPING_WEIGHT_INVALID, forKey: .SHIPPING_WEIGHT_INVALID)
        try container.encodeIfPresent(SHIPPING_WIDTH_INVALID, forKey: .SHIPPING_WIDTH_INVALID)
        try container.encodeIfPresent(SIZE_TYPE_INVALID, forKey: .SIZE_TYPE_INVALID)
        try container.encodeIfPresent(TAX_INVALID, forKey: .TAX_INVALID)
        try container.encodeIfPresent(TITLE_LENGTH_TOO_LONG, forKey: .TITLE_LENGTH_TOO_LONG)
        try container.encodeIfPresent(TOO_MANY_ADDITIONAL_IMAGE_LINKS, forKey: .TOO_MANY_ADDITIONAL_IMAGE_LINKS)
        try container.encodeIfPresent(UTM_SOURCE_AUTO_CORRECTED, forKey: .UTM_SOURCE_AUTO_CORRECTED)
        try container.encodeIfPresent(WEIGHT_UNIT_INVALID, forKey: .WEIGHT_UNIT_INVALID)
    }
}

