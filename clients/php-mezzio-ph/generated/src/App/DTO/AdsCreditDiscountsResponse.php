<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdsCreditDiscountsResponse
{
    /**
     * True if the offer code is currently active.
     * @DTA\Data(field="active", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $active;

    /**
     * Advertiser ID the offer was applied to.
     * @DTA\Data(field="advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $advertiser_id;

    /**
     * The type of discount of this credit
     * @DTA\Data(field="discountType", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $discount_type;

    /**
     * The discount applied in the offer’s currency value.
     * @DTA\Data(field="discountInMicroCurrency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $discount_in_micro_currency;

    /**
     * Currency value for the discount.
     * @DTA\Data(field="discountCurrency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $discount_currency;

    /**
     * Human readable title of the offer code.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * The credits left to spend.
     * @DTA\Data(field="remainingDiscountInMicroCurrency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $remaining_discount_in_micro_currency;

}
