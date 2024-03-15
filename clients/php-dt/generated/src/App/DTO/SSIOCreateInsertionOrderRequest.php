<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SSIOCreateInsertionOrderRequest
{
    /**
     * Starting date of time period. Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})$/"})
     */
    public ?string $start_date = null;

    /**
     * End date of time period. Format: YYYY-MM-DD
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})$/"})
     */
    public ?string $end_date = null;

    /**
     * The po number
     * @DTA\Data(field="po_number")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $po_number = null;

    /**
     * If Budget order line, the budget amount.
     * @DTA\Data(field="budget_amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $budget_amount = null;

    /**
     * The billing contact first name
     * @DTA\Data(field="billing_contact_firstname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_firstname = null;

    /**
     * The billing contact last name
     * @DTA\Data(field="billing_contact_lastname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_lastname = null;

    /**
     * The billing contact email
     * @DTA\Data(field="billing_contact_email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_email = null;

    /**
     * The media contact first name
     * @DTA\Data(field="media_contact_firstname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_firstname = null;

    /**
     * The media contact last name
     * @DTA\Data(field="media_contact_lastname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_lastname = null;

    /**
     * The media contact email
     * @DTA\Data(field="media_contact_email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_email = null;

    /**
     * URL link for agency
     * @DTA\Data(field="agency_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $agency_link = null;

    /**
     * The email of user submitting the insertion order
     * @DTA\Data(field="user_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user_email = null;

    /**
     * The UTC timestamp (to the nearest sec) of when terms were accepted
     * @DTA\Data(field="accepted_terms_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $accepted_terms_time = null;

    /**
     * The pmp id
     * @DTA\Data(field="pmp_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pmp_id = null;

    /**
     * The order name
     * @DTA\Data(field="order_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_name = null;

    /**
     * Type can be Budget or Perpetual
     * @DTA\Data(field="order_line_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_line_type = null;

    /**
     * The SFDC id for the terms
     * @DTA\Data(field="accepted_terms_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $accepted_terms_id = null;

    /**
     * The bill-to company id
     * @DTA\Data(field="billto_company_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billto_company_id = null;

    /**
     * The bill-to business address id
     * @DTA\Data(field="billto_business_address_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billto_business_address_id = null;

    /**
     * The bill-to billing address id
     * @DTA\Data(field="billto_billing_address_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billto_billing_address_id = null;

    /**
     * If Ongoing (perpetual) order line, the estimated monthly spend
     * @DTA\Data(field="estimated_monthly_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $estimated_monthly_spend = null;

    /**
     * @DTA\Data(field="currency_info")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency_info = null;

}
