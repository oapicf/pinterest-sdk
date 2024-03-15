<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupFilterKeys
{
    /**
     * @DTA\Data(field="MIN_PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @var \App\DTO\CatalogsProductGroupPricingCriteria|null
     */
    public $min_price;

    /**
     * @DTA\Data(field="MAX_PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @var \App\DTO\CatalogsProductGroupPricingCriteria|null
     */
    public $max_price;

    /**
     * @DTA\Data(field="CURRENCY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupCurrencyCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupCurrencyCriteria::class})
     * @var \App\DTO\CatalogsProductGroupCurrencyCriteria|null
     */
    public $currency;

    /**
     * @DTA\Data(field="ITEM_ID")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $item_id;

    /**
     * @DTA\Data(field="AVAILABILITY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $availability;

    /**
     * @DTA\Data(field="BRAND")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $brand;

    /**
     * @DTA\Data(field="CONDITION")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $condition;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $custom_label_0;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $custom_label_1;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $custom_label_2;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $custom_label_3;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $custom_label_4;

    /**
     * @DTA\Data(field="ITEM_GROUP_ID")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $item_group_id;

    /**
     * @DTA\Data(field="GENDER")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleGenderCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleGenderCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleGenderCriteria|null
     */
    public $gender;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $product_type_4;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $product_type_3;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $product_type_2;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $product_type_1;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $product_type_0;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_6")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_6;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_5")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_5;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_4;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_3;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_2;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_1;

    /**
     * @DTA\Data(field="GOOGLE_PRODUCT_CATEGORY_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringListCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringListCriteria|null
     */
    public $google_product_category_0;

}
