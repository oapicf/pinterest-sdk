<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Base filter keys shared across catalog filtering
 */
class CatalogsBaseFilterKeys
{
    /**
     * @DTA\Data(field="MIN_PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupPricingCriteria $min_price = null;

    /**
     * @DTA\Data(field="MAX_PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupPricingCriteria $max_price = null;

    /**
     * @DTA\Data(field="CURRENCY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupCurrencyCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupCurrencyCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupCurrencyCriteria $currency = null;

    /**
     * @DTA\Data(field="ITEM_ID")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $item_id = null;

    /**
     * @DTA\Data(field="AVAILABILITY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $availability = null;

    /**
     * @DTA\Data(field="BRAND")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $brand = null;

    /**
     * @DTA\Data(field="CONDITION")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $condition = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_0 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_1 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_2 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_3 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_4 = null;

    /**
     * @DTA\Data(field="ITEM_GROUP_ID")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $item_group_id = null;

    /**
     * @DTA\Data(field="GENDER")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleGenderCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleGenderCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleGenderCriteria $gender = null;

    /**
     * @DTA\Data(field="MEDIA_TYPE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleMediaTypesCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleMediaTypesCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleMediaTypesCriteria $media_type = null;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $product_type_4 = null;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $product_type_3 = null;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $product_type_2 = null;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $product_type_1 = null;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $product_type_0 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_6")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_6 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_5")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_5 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_4 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_3 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_2 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_1 = null;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringListCriteria $google_product_category_0 = null;

    /**
     * @DTA\Data(field="CUSTOM_NUMBER_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupUint32Criteria $custom_number_0 = null;

    /**
     * @DTA\Data(field="CUSTOM_NUMBER_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupUint32Criteria $custom_number_1 = null;

    /**
     * @DTA\Data(field="CUSTOM_NUMBER_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupUint32Criteria $custom_number_2 = null;

    /**
     * @DTA\Data(field="CUSTOM_NUMBER_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupUint32Criteria $custom_number_3 = null;

    /**
     * @DTA\Data(field="CUSTOM_NUMBER_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupUint32Criteria $custom_number_4 = null;

    /**
     * @DTA\Data(field="TITLE_KEYWORDS")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $title_keywords = null;

    /**
     * @DTA\Data(field="PINTEREST_PRODUCT_CATEGORIES")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultiplePinterestProductCategoryCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultiplePinterestProductCategoryCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultiplePinterestProductCategoryCriteria $pinterest_product_categories = null;

}
