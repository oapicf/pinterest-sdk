<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsHotelProductGroupFilterKeys
{
    /**
     * @DTA\Data(field="PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCurrencyCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCurrencyCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupPricingCurrencyCriteria $price = null;

    /**
     * @DTA\Data(field="HOTEL_ID")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $hotel_id = null;

    /**
     * @DTA\Data(field="BRAND")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $brand = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $custom_label_0 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $custom_label_1 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $custom_label_2 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_3")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $custom_label_3 = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_4")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $custom_label_4 = null;

    /**
     * @DTA\Data(field="COUNTRY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleCountriesCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleCountriesCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleCountriesCriteria $country = null;

}
