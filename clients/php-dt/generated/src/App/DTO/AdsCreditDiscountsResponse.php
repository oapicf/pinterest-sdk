<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdsCreditDiscountsResponse
{
    /**
     * True if the offer code is currently active.
     * @DTA\Data(field="active", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $active = null;

    /**
     * Advertiser ID the offer was applied to.
     * @DTA\Data(field="advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $advertiser_id = null;

    /**
     * The type of discount of this credit
     * @DTA\Data(field="discountType", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $discount_type = null;

    /**
     * The discount applied in the offer’s currency value.
     * @DTA\Data(field="discountInMicroCurrency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $discount_in_micro_currency = null;

    /**
     * Currency value for the discount.
     * @DTA\Data(field="discountCurrency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $discount_currency = null;

    /**
     * Human readable title of the offer code.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * The credits left to spend.
     * @DTA\Data(field="remainingDiscountInMicroCurrency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $remaining_discount_in_micro_currency = null;

}
