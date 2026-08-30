<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BillingProfilesResponse
{
    /**
     * Advertiser ID of the billing.
     * @DTA\Data(field="advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $advertiser_id;

    /**
     * Billing type of the advertiser
     * @DTA\Data(field="billing_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingType::class})
     * @var \App\DTO\BillingType|null
     */
    public $billing_type;

    /**
     * Type of the card.
     * @DTA\Data(field="card_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingProfileCardType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingProfileCardType::class})
     * @var \App\DTO\BillingProfileCardType|null
     */
    public $card_type;

    /**
     * Billing ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Brand of the payment method.
     * @DTA\Data(field="payment_method_brand", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingProfilePaymentMethodBrand::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingProfilePaymentMethodBrand::class})
     * @var \App\DTO\BillingProfilePaymentMethodBrand|null
     */
    public $payment_method_brand;

    /**
     * Status of the billing.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingProfileStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingProfileStatus::class})
     * @var \App\DTO\BillingProfileStatus|null
     */
    public $status;

}
