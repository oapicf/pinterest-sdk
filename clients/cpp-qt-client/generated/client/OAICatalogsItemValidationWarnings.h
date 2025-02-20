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

/*
 * OAICatalogsItemValidationWarnings.h
 *
 * 
 */

#ifndef OAICatalogsItemValidationWarnings_H
#define OAICatalogsItemValidationWarnings_H

#include <QJsonObject>

#include "OAICatalogsItemValidationDetails.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICatalogsItemValidationDetails;

class OAICatalogsItemValidationWarnings : public OAIObject {
public:
    OAICatalogsItemValidationWarnings();
    OAICatalogsItemValidationWarnings(QString json);
    ~OAICatalogsItemValidationWarnings() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsItemValidationDetails getAdLinkFormatWarning() const;
    void setAdLinkFormatWarning(const OAICatalogsItemValidationDetails &ad_link_format_warning);
    bool is_ad_link_format_warning_Set() const;
    bool is_ad_link_format_warning_Valid() const;

    OAICatalogsItemValidationDetails getAdLinkSameAsLink() const;
    void setAdLinkSameAsLink(const OAICatalogsItemValidationDetails &ad_link_same_as_link);
    bool is_ad_link_same_as_link_Set() const;
    bool is_ad_link_same_as_link_Valid() const;

    OAICatalogsItemValidationDetails getAdditionalImageLinkLengthTooLong() const;
    void setAdditionalImageLinkLengthTooLong(const OAICatalogsItemValidationDetails &additional_image_link_length_too_long);
    bool is_additional_image_link_length_too_long_Set() const;
    bool is_additional_image_link_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getAdditionalImageLinkWarning() const;
    void setAdditionalImageLinkWarning(const OAICatalogsItemValidationDetails &additional_image_link_warning);
    bool is_additional_image_link_warning_Set() const;
    bool is_additional_image_link_warning_Valid() const;

    OAICatalogsItemValidationDetails getAdwordsFormatWarning() const;
    void setAdwordsFormatWarning(const OAICatalogsItemValidationDetails &adwords_format_warning);
    bool is_adwords_format_warning_Set() const;
    bool is_adwords_format_warning_Valid() const;

    OAICatalogsItemValidationDetails getAdwordsSameAsLink() const;
    void setAdwordsSameAsLink(const OAICatalogsItemValidationDetails &adwords_same_as_link);
    bool is_adwords_same_as_link_Set() const;
    bool is_adwords_same_as_link_Valid() const;

    OAICatalogsItemValidationDetails getAgeGroupInvalid() const;
    void setAgeGroupInvalid(const OAICatalogsItemValidationDetails &age_group_invalid);
    bool is_age_group_invalid_Set() const;
    bool is_age_group_invalid_Valid() const;

    OAICatalogsItemValidationDetails getSizeSystemInvalid() const;
    void setSizeSystemInvalid(const OAICatalogsItemValidationDetails &size_system_invalid);
    bool is_size_system_invalid_Set() const;
    bool is_size_system_invalid_Valid() const;

    OAICatalogsItemValidationDetails getAndroidDeepLinkInvalid() const;
    void setAndroidDeepLinkInvalid(const OAICatalogsItemValidationDetails &android_deep_link_invalid);
    bool is_android_deep_link_invalid_Set() const;
    bool is_android_deep_link_invalid_Valid() const;

    OAICatalogsItemValidationDetails getAvailabilityDateInvalid() const;
    void setAvailabilityDateInvalid(const OAICatalogsItemValidationDetails &availability_date_invalid);
    bool is_availability_date_invalid_Set() const;
    bool is_availability_date_invalid_Valid() const;

    OAICatalogsItemValidationDetails getCountryDoesNotMapToCurrency() const;
    void setCountryDoesNotMapToCurrency(const OAICatalogsItemValidationDetails &country_does_not_map_to_currency);
    bool is_country_does_not_map_to_currency_Set() const;
    bool is_country_does_not_map_to_currency_Valid() const;

    OAICatalogsItemValidationDetails getCustomLabelLengthTooLong() const;
    void setCustomLabelLengthTooLong(const OAICatalogsItemValidationDetails &custom_label_length_too_long);
    bool is_custom_label_length_too_long_Set() const;
    bool is_custom_label_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getDescriptionLengthTooLong() const;
    void setDescriptionLengthTooLong(const OAICatalogsItemValidationDetails &description_length_too_long);
    bool is_description_length_too_long_Set() const;
    bool is_description_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getExpirationDateInvalid() const;
    void setExpirationDateInvalid(const OAICatalogsItemValidationDetails &expiration_date_invalid);
    bool is_expiration_date_invalid_Set() const;
    bool is_expiration_date_invalid_Valid() const;

    OAICatalogsItemValidationDetails getGenderInvalid() const;
    void setGenderInvalid(const OAICatalogsItemValidationDetails &gender_invalid);
    bool is_gender_invalid_Set() const;
    bool is_gender_invalid_Valid() const;

    OAICatalogsItemValidationDetails getGtinInvalid() const;
    void setGtinInvalid(const OAICatalogsItemValidationDetails &gtin_invalid);
    bool is_gtin_invalid_Set() const;
    bool is_gtin_invalid_Valid() const;

    OAICatalogsItemValidationDetails getImageLinkWarning() const;
    void setImageLinkWarning(const OAICatalogsItemValidationDetails &image_link_warning);
    bool is_image_link_warning_Set() const;
    bool is_image_link_warning_Valid() const;

    OAICatalogsItemValidationDetails getIosDeepLinkInvalid() const;
    void setIosDeepLinkInvalid(const OAICatalogsItemValidationDetails &ios_deep_link_invalid);
    bool is_ios_deep_link_invalid_Set() const;
    bool is_ios_deep_link_invalid_Valid() const;

    OAICatalogsItemValidationDetails getIsBundleInvalid() const;
    void setIsBundleInvalid(const OAICatalogsItemValidationDetails &is_bundle_invalid);
    bool is_is_bundle_invalid_Set() const;
    bool is_is_bundle_invalid_Valid() const;

    OAICatalogsItemValidationDetails getItemAdditionalImageDownloadFailure() const;
    void setItemAdditionalImageDownloadFailure(const OAICatalogsItemValidationDetails &item_additional_image_download_failure);
    bool is_item_additional_image_download_failure_Set() const;
    bool is_item_additional_image_download_failure_Valid() const;

    OAICatalogsItemValidationDetails getLinkFormatWarning() const;
    void setLinkFormatWarning(const OAICatalogsItemValidationDetails &link_format_warning);
    bool is_link_format_warning_Set() const;
    bool is_link_format_warning_Valid() const;

    OAICatalogsItemValidationDetails getMinAdPriceInvalid() const;
    void setMinAdPriceInvalid(const OAICatalogsItemValidationDetails &min_ad_price_invalid);
    bool is_min_ad_price_invalid_Set() const;
    bool is_min_ad_price_invalid_Valid() const;

    OAICatalogsItemValidationDetails getMpnInvalid() const;
    void setMpnInvalid(const OAICatalogsItemValidationDetails &mpn_invalid);
    bool is_mpn_invalid_Set() const;
    bool is_mpn_invalid_Valid() const;

    OAICatalogsItemValidationDetails getMultipackInvalid() const;
    void setMultipackInvalid(const OAICatalogsItemValidationDetails &multipack_invalid);
    bool is_multipack_invalid_Set() const;
    bool is_multipack_invalid_Valid() const;

    OAICatalogsItemValidationDetails getOptionalConditionInvalid() const;
    void setOptionalConditionInvalid(const OAICatalogsItemValidationDetails &optional_condition_invalid);
    bool is_optional_condition_invalid_Set() const;
    bool is_optional_condition_invalid_Valid() const;

    OAICatalogsItemValidationDetails getOptionalConditionMissing() const;
    void setOptionalConditionMissing(const OAICatalogsItemValidationDetails &optional_condition_missing);
    bool is_optional_condition_missing_Set() const;
    bool is_optional_condition_missing_Valid() const;

    OAICatalogsItemValidationDetails getOptionalProductCategoryInvalid() const;
    void setOptionalProductCategoryInvalid(const OAICatalogsItemValidationDetails &optional_product_category_invalid);
    bool is_optional_product_category_invalid_Set() const;
    bool is_optional_product_category_invalid_Valid() const;

    OAICatalogsItemValidationDetails getOptionalProductCategoryMissing() const;
    void setOptionalProductCategoryMissing(const OAICatalogsItemValidationDetails &optional_product_category_missing);
    bool is_optional_product_category_missing_Set() const;
    bool is_optional_product_category_missing_Valid() const;

    OAICatalogsItemValidationDetails getProductCategoryDepthWarning() const;
    void setProductCategoryDepthWarning(const OAICatalogsItemValidationDetails &product_category_depth_warning);
    bool is_product_category_depth_warning_Set() const;
    bool is_product_category_depth_warning_Valid() const;

    OAICatalogsItemValidationDetails getProductTypeLengthTooLong() const;
    void setProductTypeLengthTooLong(const OAICatalogsItemValidationDetails &product_type_length_too_long);
    bool is_product_type_length_too_long_Set() const;
    bool is_product_type_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getSalesPriceInvalid() const;
    void setSalesPriceInvalid(const OAICatalogsItemValidationDetails &sales_price_invalid);
    bool is_sales_price_invalid_Set() const;
    bool is_sales_price_invalid_Valid() const;

    OAICatalogsItemValidationDetails getSalesPriceTooLow() const;
    void setSalesPriceTooLow(const OAICatalogsItemValidationDetails &sales_price_too_low);
    bool is_sales_price_too_low_Set() const;
    bool is_sales_price_too_low_Valid() const;

    OAICatalogsItemValidationDetails getSalesPriceTooHigh() const;
    void setSalesPriceTooHigh(const OAICatalogsItemValidationDetails &sales_price_too_high);
    bool is_sales_price_too_high_Set() const;
    bool is_sales_price_too_high_Valid() const;

    OAICatalogsItemValidationDetails getSaleDateInvalid() const;
    void setSaleDateInvalid(const OAICatalogsItemValidationDetails &sale_date_invalid);
    bool is_sale_date_invalid_Set() const;
    bool is_sale_date_invalid_Valid() const;

    OAICatalogsItemValidationDetails getShippingInvalid() const;
    void setShippingInvalid(const OAICatalogsItemValidationDetails &shipping_invalid);
    bool is_shipping_invalid_Set() const;
    bool is_shipping_invalid_Valid() const;

    OAICatalogsItemValidationDetails getShippingHeightInvalid() const;
    void setShippingHeightInvalid(const OAICatalogsItemValidationDetails &shipping_height_invalid);
    bool is_shipping_height_invalid_Set() const;
    bool is_shipping_height_invalid_Valid() const;

    OAICatalogsItemValidationDetails getShippingWeightInvalid() const;
    void setShippingWeightInvalid(const OAICatalogsItemValidationDetails &shipping_weight_invalid);
    bool is_shipping_weight_invalid_Set() const;
    bool is_shipping_weight_invalid_Valid() const;

    OAICatalogsItemValidationDetails getShippingWidthInvalid() const;
    void setShippingWidthInvalid(const OAICatalogsItemValidationDetails &shipping_width_invalid);
    bool is_shipping_width_invalid_Set() const;
    bool is_shipping_width_invalid_Valid() const;

    OAICatalogsItemValidationDetails getSizeTypeInvalid() const;
    void setSizeTypeInvalid(const OAICatalogsItemValidationDetails &size_type_invalid);
    bool is_size_type_invalid_Set() const;
    bool is_size_type_invalid_Valid() const;

    OAICatalogsItemValidationDetails getTaxInvalid() const;
    void setTaxInvalid(const OAICatalogsItemValidationDetails &tax_invalid);
    bool is_tax_invalid_Set() const;
    bool is_tax_invalid_Valid() const;

    OAICatalogsItemValidationDetails getTitleLengthTooLong() const;
    void setTitleLengthTooLong(const OAICatalogsItemValidationDetails &title_length_too_long);
    bool is_title_length_too_long_Set() const;
    bool is_title_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getTooManyAdditionalImageLinks() const;
    void setTooManyAdditionalImageLinks(const OAICatalogsItemValidationDetails &too_many_additional_image_links);
    bool is_too_many_additional_image_links_Set() const;
    bool is_too_many_additional_image_links_Valid() const;

    OAICatalogsItemValidationDetails getUtmSourceAutoCorrected() const;
    void setUtmSourceAutoCorrected(const OAICatalogsItemValidationDetails &utm_source_auto_corrected);
    bool is_utm_source_auto_corrected_Set() const;
    bool is_utm_source_auto_corrected_Valid() const;

    OAICatalogsItemValidationDetails getWeightUnitInvalid() const;
    void setWeightUnitInvalid(const OAICatalogsItemValidationDetails &weight_unit_invalid);
    bool is_weight_unit_invalid_Set() const;
    bool is_weight_unit_invalid_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsItemValidationDetails m_ad_link_format_warning;
    bool m_ad_link_format_warning_isSet;
    bool m_ad_link_format_warning_isValid;

    OAICatalogsItemValidationDetails m_ad_link_same_as_link;
    bool m_ad_link_same_as_link_isSet;
    bool m_ad_link_same_as_link_isValid;

    OAICatalogsItemValidationDetails m_additional_image_link_length_too_long;
    bool m_additional_image_link_length_too_long_isSet;
    bool m_additional_image_link_length_too_long_isValid;

    OAICatalogsItemValidationDetails m_additional_image_link_warning;
    bool m_additional_image_link_warning_isSet;
    bool m_additional_image_link_warning_isValid;

    OAICatalogsItemValidationDetails m_adwords_format_warning;
    bool m_adwords_format_warning_isSet;
    bool m_adwords_format_warning_isValid;

    OAICatalogsItemValidationDetails m_adwords_same_as_link;
    bool m_adwords_same_as_link_isSet;
    bool m_adwords_same_as_link_isValid;

    OAICatalogsItemValidationDetails m_age_group_invalid;
    bool m_age_group_invalid_isSet;
    bool m_age_group_invalid_isValid;

    OAICatalogsItemValidationDetails m_size_system_invalid;
    bool m_size_system_invalid_isSet;
    bool m_size_system_invalid_isValid;

    OAICatalogsItemValidationDetails m_android_deep_link_invalid;
    bool m_android_deep_link_invalid_isSet;
    bool m_android_deep_link_invalid_isValid;

    OAICatalogsItemValidationDetails m_availability_date_invalid;
    bool m_availability_date_invalid_isSet;
    bool m_availability_date_invalid_isValid;

    OAICatalogsItemValidationDetails m_country_does_not_map_to_currency;
    bool m_country_does_not_map_to_currency_isSet;
    bool m_country_does_not_map_to_currency_isValid;

    OAICatalogsItemValidationDetails m_custom_label_length_too_long;
    bool m_custom_label_length_too_long_isSet;
    bool m_custom_label_length_too_long_isValid;

    OAICatalogsItemValidationDetails m_description_length_too_long;
    bool m_description_length_too_long_isSet;
    bool m_description_length_too_long_isValid;

    OAICatalogsItemValidationDetails m_expiration_date_invalid;
    bool m_expiration_date_invalid_isSet;
    bool m_expiration_date_invalid_isValid;

    OAICatalogsItemValidationDetails m_gender_invalid;
    bool m_gender_invalid_isSet;
    bool m_gender_invalid_isValid;

    OAICatalogsItemValidationDetails m_gtin_invalid;
    bool m_gtin_invalid_isSet;
    bool m_gtin_invalid_isValid;

    OAICatalogsItemValidationDetails m_image_link_warning;
    bool m_image_link_warning_isSet;
    bool m_image_link_warning_isValid;

    OAICatalogsItemValidationDetails m_ios_deep_link_invalid;
    bool m_ios_deep_link_invalid_isSet;
    bool m_ios_deep_link_invalid_isValid;

    OAICatalogsItemValidationDetails m_is_bundle_invalid;
    bool m_is_bundle_invalid_isSet;
    bool m_is_bundle_invalid_isValid;

    OAICatalogsItemValidationDetails m_item_additional_image_download_failure;
    bool m_item_additional_image_download_failure_isSet;
    bool m_item_additional_image_download_failure_isValid;

    OAICatalogsItemValidationDetails m_link_format_warning;
    bool m_link_format_warning_isSet;
    bool m_link_format_warning_isValid;

    OAICatalogsItemValidationDetails m_min_ad_price_invalid;
    bool m_min_ad_price_invalid_isSet;
    bool m_min_ad_price_invalid_isValid;

    OAICatalogsItemValidationDetails m_mpn_invalid;
    bool m_mpn_invalid_isSet;
    bool m_mpn_invalid_isValid;

    OAICatalogsItemValidationDetails m_multipack_invalid;
    bool m_multipack_invalid_isSet;
    bool m_multipack_invalid_isValid;

    OAICatalogsItemValidationDetails m_optional_condition_invalid;
    bool m_optional_condition_invalid_isSet;
    bool m_optional_condition_invalid_isValid;

    OAICatalogsItemValidationDetails m_optional_condition_missing;
    bool m_optional_condition_missing_isSet;
    bool m_optional_condition_missing_isValid;

    OAICatalogsItemValidationDetails m_optional_product_category_invalid;
    bool m_optional_product_category_invalid_isSet;
    bool m_optional_product_category_invalid_isValid;

    OAICatalogsItemValidationDetails m_optional_product_category_missing;
    bool m_optional_product_category_missing_isSet;
    bool m_optional_product_category_missing_isValid;

    OAICatalogsItemValidationDetails m_product_category_depth_warning;
    bool m_product_category_depth_warning_isSet;
    bool m_product_category_depth_warning_isValid;

    OAICatalogsItemValidationDetails m_product_type_length_too_long;
    bool m_product_type_length_too_long_isSet;
    bool m_product_type_length_too_long_isValid;

    OAICatalogsItemValidationDetails m_sales_price_invalid;
    bool m_sales_price_invalid_isSet;
    bool m_sales_price_invalid_isValid;

    OAICatalogsItemValidationDetails m_sales_price_too_low;
    bool m_sales_price_too_low_isSet;
    bool m_sales_price_too_low_isValid;

    OAICatalogsItemValidationDetails m_sales_price_too_high;
    bool m_sales_price_too_high_isSet;
    bool m_sales_price_too_high_isValid;

    OAICatalogsItemValidationDetails m_sale_date_invalid;
    bool m_sale_date_invalid_isSet;
    bool m_sale_date_invalid_isValid;

    OAICatalogsItemValidationDetails m_shipping_invalid;
    bool m_shipping_invalid_isSet;
    bool m_shipping_invalid_isValid;

    OAICatalogsItemValidationDetails m_shipping_height_invalid;
    bool m_shipping_height_invalid_isSet;
    bool m_shipping_height_invalid_isValid;

    OAICatalogsItemValidationDetails m_shipping_weight_invalid;
    bool m_shipping_weight_invalid_isSet;
    bool m_shipping_weight_invalid_isValid;

    OAICatalogsItemValidationDetails m_shipping_width_invalid;
    bool m_shipping_width_invalid_isSet;
    bool m_shipping_width_invalid_isValid;

    OAICatalogsItemValidationDetails m_size_type_invalid;
    bool m_size_type_invalid_isSet;
    bool m_size_type_invalid_isValid;

    OAICatalogsItemValidationDetails m_tax_invalid;
    bool m_tax_invalid_isSet;
    bool m_tax_invalid_isValid;

    OAICatalogsItemValidationDetails m_title_length_too_long;
    bool m_title_length_too_long_isSet;
    bool m_title_length_too_long_isValid;

    OAICatalogsItemValidationDetails m_too_many_additional_image_links;
    bool m_too_many_additional_image_links_isSet;
    bool m_too_many_additional_image_links_isValid;

    OAICatalogsItemValidationDetails m_utm_source_auto_corrected;
    bool m_utm_source_auto_corrected_isSet;
    bool m_utm_source_auto_corrected_isValid;

    OAICatalogsItemValidationDetails m_weight_unit_invalid;
    bool m_weight_unit_invalid_isSet;
    bool m_weight_unit_invalid_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsItemValidationWarnings)

#endif // OAICatalogsItemValidationWarnings_H
