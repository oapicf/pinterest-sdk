<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsHotelProductGroupFilterKeys
{
    /**
     * @DTA\Data(field="PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceFilterPrice::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceFilterPrice::class})
     * @var \App\DTO\PriceFilterPrice|null
     */
    public $price;

    /**
     * @DTA\Data(field="HOTEL_ID")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $hotel_id;

    /**
     * @DTA\Data(field="BRAND")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $brand;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @var \App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria|null
     */
    public $custom_label_0;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @var \App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria|null
     */
    public $custom_label_1;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @var \App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria|null
     */
    public $custom_label_2;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @var \App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria|null
     */
    public $custom_label_3;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @var \App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria|null
     */
    public $custom_label_4;

    /**
     * @DTA\Data(field="COUNTRY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleCountriesCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleCountriesCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleCountriesCriteria|null
     */
    public $country;

    /**
     * @DTA\Data(field="TITLE_KEYWORDS")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $title_keywords;

}
