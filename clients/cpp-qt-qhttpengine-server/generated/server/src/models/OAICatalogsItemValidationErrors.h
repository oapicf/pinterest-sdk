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
 * OAICatalogsItemValidationErrors.h
 *
 * 
 */

#ifndef OAICatalogsItemValidationErrors_H
#define OAICatalogsItemValidationErrors_H

#include <QJsonObject>

#include "OAICatalogsItemValidationDetails.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsItemValidationErrors : public OAIObject {
public:
    OAICatalogsItemValidationErrors();
    OAICatalogsItemValidationErrors(QString json);
    ~OAICatalogsItemValidationErrors() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsItemValidationDetails getAdultInvalid() const;
    void setAdultInvalid(const OAICatalogsItemValidationDetails &adult_invalid);
    bool is_adult_invalid_Set() const;
    bool is_adult_invalid_Valid() const;

    OAICatalogsItemValidationDetails getAdwordsFormatInvalid() const;
    void setAdwordsFormatInvalid(const OAICatalogsItemValidationDetails &adwords_format_invalid);
    bool is_adwords_format_invalid_Set() const;
    bool is_adwords_format_invalid_Valid() const;

    OAICatalogsItemValidationDetails getAvailabilityInvalid() const;
    void setAvailabilityInvalid(const OAICatalogsItemValidationDetails &availability_invalid);
    bool is_availability_invalid_Set() const;
    bool is_availability_invalid_Valid() const;

    OAICatalogsItemValidationDetails getBlocklistedImageSignature() const;
    void setBlocklistedImageSignature(const OAICatalogsItemValidationDetails &blocklisted_image_signature);
    bool is_blocklisted_image_signature_Set() const;
    bool is_blocklisted_image_signature_Valid() const;

    OAICatalogsItemValidationDetails getDescriptionMissing() const;
    void setDescriptionMissing(const OAICatalogsItemValidationDetails &description_missing);
    bool is_description_missing_Set() const;
    bool is_description_missing_Valid() const;

    OAICatalogsItemValidationDetails getDuplicateProducts() const;
    void setDuplicateProducts(const OAICatalogsItemValidationDetails &duplicate_products);
    bool is_duplicate_products_Set() const;
    bool is_duplicate_products_Valid() const;

    OAICatalogsItemValidationDetails getImageLinkInvalid() const;
    void setImageLinkInvalid(const OAICatalogsItemValidationDetails &image_link_invalid);
    bool is_image_link_invalid_Set() const;
    bool is_image_link_invalid_Valid() const;

    OAICatalogsItemValidationDetails getImageLinkLengthTooLong() const;
    void setImageLinkLengthTooLong(const OAICatalogsItemValidationDetails &image_link_length_too_long);
    bool is_image_link_length_too_long_Set() const;
    bool is_image_link_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getImageLinkMissing() const;
    void setImageLinkMissing(const OAICatalogsItemValidationDetails &image_link_missing);
    bool is_image_link_missing_Set() const;
    bool is_image_link_missing_Valid() const;

    OAICatalogsItemValidationDetails getInvalidDomain() const;
    void setInvalidDomain(const OAICatalogsItemValidationDetails &invalid_domain);
    bool is_invalid_domain_Set() const;
    bool is_invalid_domain_Valid() const;

    OAICatalogsItemValidationDetails getItemidMissing() const;
    void setItemidMissing(const OAICatalogsItemValidationDetails &itemid_missing);
    bool is_itemid_missing_Set() const;
    bool is_itemid_missing_Valid() const;

    OAICatalogsItemValidationDetails getItemMainImageDownloadFailure() const;
    void setItemMainImageDownloadFailure(const OAICatalogsItemValidationDetails &item_main_image_download_failure);
    bool is_item_main_image_download_failure_Set() const;
    bool is_item_main_image_download_failure_Valid() const;

    OAICatalogsItemValidationDetails getLinkFormatInvalid() const;
    void setLinkFormatInvalid(const OAICatalogsItemValidationDetails &link_format_invalid);
    bool is_link_format_invalid_Set() const;
    bool is_link_format_invalid_Valid() const;

    OAICatalogsItemValidationDetails getLinkLengthTooLong() const;
    void setLinkLengthTooLong(const OAICatalogsItemValidationDetails &link_length_too_long);
    bool is_link_length_too_long_Set() const;
    bool is_link_length_too_long_Valid() const;

    OAICatalogsItemValidationDetails getListPriceInvalid() const;
    void setListPriceInvalid(const OAICatalogsItemValidationDetails &list_price_invalid);
    bool is_list_price_invalid_Set() const;
    bool is_list_price_invalid_Valid() const;

    OAICatalogsItemValidationDetails getMaxItemsPerItemGroupExceeded() const;
    void setMaxItemsPerItemGroupExceeded(const OAICatalogsItemValidationDetails &max_items_per_item_group_exceeded);
    bool is_max_items_per_item_group_exceeded_Set() const;
    bool is_max_items_per_item_group_exceeded_Valid() const;

    OAICatalogsItemValidationDetails getParseLineError() const;
    void setParseLineError(const OAICatalogsItemValidationDetails &parse_line_error);
    bool is_parse_line_error_Set() const;
    bool is_parse_line_error_Valid() const;

    OAICatalogsItemValidationDetails getPinjoinContentUnsafe() const;
    void setPinjoinContentUnsafe(const OAICatalogsItemValidationDetails &pinjoin_content_unsafe);
    bool is_pinjoin_content_unsafe_Set() const;
    bool is_pinjoin_content_unsafe_Valid() const;

    OAICatalogsItemValidationDetails getPriceCannotBeDetermined() const;
    void setPriceCannotBeDetermined(const OAICatalogsItemValidationDetails &price_cannot_be_determined);
    bool is_price_cannot_be_determined_Set() const;
    bool is_price_cannot_be_determined_Valid() const;

    OAICatalogsItemValidationDetails getPriceMissing() const;
    void setPriceMissing(const OAICatalogsItemValidationDetails &price_missing);
    bool is_price_missing_Set() const;
    bool is_price_missing_Valid() const;

    OAICatalogsItemValidationDetails getProductLinkMissing() const;
    void setProductLinkMissing(const OAICatalogsItemValidationDetails &product_link_missing);
    bool is_product_link_missing_Set() const;
    bool is_product_link_missing_Valid() const;

    OAICatalogsItemValidationDetails getProductPriceInvalid() const;
    void setProductPriceInvalid(const OAICatalogsItemValidationDetails &product_price_invalid);
    bool is_product_price_invalid_Set() const;
    bool is_product_price_invalid_Valid() const;

    OAICatalogsItemValidationDetails getTitleMissing() const;
    void setTitleMissing(const OAICatalogsItemValidationDetails &title_missing);
    bool is_title_missing_Set() const;
    bool is_title_missing_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsItemValidationDetails adult_invalid;
    bool m_adult_invalid_isSet;
    bool m_adult_invalid_isValid;

    OAICatalogsItemValidationDetails adwords_format_invalid;
    bool m_adwords_format_invalid_isSet;
    bool m_adwords_format_invalid_isValid;

    OAICatalogsItemValidationDetails availability_invalid;
    bool m_availability_invalid_isSet;
    bool m_availability_invalid_isValid;

    OAICatalogsItemValidationDetails blocklisted_image_signature;
    bool m_blocklisted_image_signature_isSet;
    bool m_blocklisted_image_signature_isValid;

    OAICatalogsItemValidationDetails description_missing;
    bool m_description_missing_isSet;
    bool m_description_missing_isValid;

    OAICatalogsItemValidationDetails duplicate_products;
    bool m_duplicate_products_isSet;
    bool m_duplicate_products_isValid;

    OAICatalogsItemValidationDetails image_link_invalid;
    bool m_image_link_invalid_isSet;
    bool m_image_link_invalid_isValid;

    OAICatalogsItemValidationDetails image_link_length_too_long;
    bool m_image_link_length_too_long_isSet;
    bool m_image_link_length_too_long_isValid;

    OAICatalogsItemValidationDetails image_link_missing;
    bool m_image_link_missing_isSet;
    bool m_image_link_missing_isValid;

    OAICatalogsItemValidationDetails invalid_domain;
    bool m_invalid_domain_isSet;
    bool m_invalid_domain_isValid;

    OAICatalogsItemValidationDetails itemid_missing;
    bool m_itemid_missing_isSet;
    bool m_itemid_missing_isValid;

    OAICatalogsItemValidationDetails item_main_image_download_failure;
    bool m_item_main_image_download_failure_isSet;
    bool m_item_main_image_download_failure_isValid;

    OAICatalogsItemValidationDetails link_format_invalid;
    bool m_link_format_invalid_isSet;
    bool m_link_format_invalid_isValid;

    OAICatalogsItemValidationDetails link_length_too_long;
    bool m_link_length_too_long_isSet;
    bool m_link_length_too_long_isValid;

    OAICatalogsItemValidationDetails list_price_invalid;
    bool m_list_price_invalid_isSet;
    bool m_list_price_invalid_isValid;

    OAICatalogsItemValidationDetails max_items_per_item_group_exceeded;
    bool m_max_items_per_item_group_exceeded_isSet;
    bool m_max_items_per_item_group_exceeded_isValid;

    OAICatalogsItemValidationDetails parse_line_error;
    bool m_parse_line_error_isSet;
    bool m_parse_line_error_isValid;

    OAICatalogsItemValidationDetails pinjoin_content_unsafe;
    bool m_pinjoin_content_unsafe_isSet;
    bool m_pinjoin_content_unsafe_isValid;

    OAICatalogsItemValidationDetails price_cannot_be_determined;
    bool m_price_cannot_be_determined_isSet;
    bool m_price_cannot_be_determined_isValid;

    OAICatalogsItemValidationDetails price_missing;
    bool m_price_missing_isSet;
    bool m_price_missing_isValid;

    OAICatalogsItemValidationDetails product_link_missing;
    bool m_product_link_missing_isSet;
    bool m_product_link_missing_isValid;

    OAICatalogsItemValidationDetails product_price_invalid;
    bool m_product_price_invalid_isSet;
    bool m_product_price_invalid_isValid;

    OAICatalogsItemValidationDetails title_missing;
    bool m_title_missing_isSet;
    bool m_title_missing_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsItemValidationErrors)

#endif // OAICatalogsItemValidationErrors_H
