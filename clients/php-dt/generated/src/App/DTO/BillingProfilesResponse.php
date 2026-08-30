<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BillingProfilesResponse
{
    /**
     * Advertiser ID of the billing.
     * @DTA\Data(field="advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $advertiser_id = null;

    /**
     * Billing type of the advertiser
     * @DTA\Data(field="billing_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingType::class})
     */
    public ?\App\DTO\BillingType $billing_type = null;

    /**
     * Type of the card.
     * @DTA\Data(field="card_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingProfileCardType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingProfileCardType::class})
     */
    public ?\App\DTO\BillingProfileCardType $card_type = null;

    /**
     * Billing ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Brand of the payment method.
     * @DTA\Data(field="payment_method_brand", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingProfilePaymentMethodBrand::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingProfilePaymentMethodBrand::class})
     */
    public ?\App\DTO\BillingProfilePaymentMethodBrand $payment_method_brand = null;

    /**
     * Status of the billing.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingProfileStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingProfileStatus::class})
     */
    public ?\App\DTO\BillingProfileStatus $status = null;

}
