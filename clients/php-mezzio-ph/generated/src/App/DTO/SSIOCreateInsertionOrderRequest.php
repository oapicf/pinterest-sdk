<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOCreateInsertionOrderRequest
{
    /**
     * Starting date of time period. Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $start_date;

    /**
     * End date of time period. Format: YYYY-MM-DD
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * The po number
     * @DTA\Data(field="po_number")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $po_number;

    /**
     * If Budget order line, the budget amount.
     * @DTA\Data(field="budget_amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $budget_amount;

    /**
     * The billing contact first name
     * @DTA\Data(field="billing_contact_firstname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_firstname;

    /**
     * The billing contact last name
     * @DTA\Data(field="billing_contact_lastname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_lastname;

    /**
     * The billing contact email
     * @DTA\Data(field="billing_contact_email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_email;

    /**
     * The media contact first name
     * @DTA\Data(field="media_contact_firstname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_firstname;

    /**
     * The media contact last name
     * @DTA\Data(field="media_contact_lastname")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_lastname;

    /**
     * The media contact email
     * @DTA\Data(field="media_contact_email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_email;

    /**
     * URL link for agency
     * @DTA\Data(field="agency_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $agency_link;

    /**
     * The email of user submitting the insertion order
     * @DTA\Data(field="user_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $user_email;

    /**
     * The UTC timestamp (to the nearest sec) of when terms were accepted
     * @DTA\Data(field="accepted_terms_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $accepted_terms_time;

    /**
     * The pmp id
     * @DTA\Data(field="pmp_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pmp_id;

    /**
     * The order name
     * @DTA\Data(field="order_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $order_name;

    /**
     * Type can be Budget or Perpetual
     * @DTA\Data(field="order_line_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $order_line_type;

    /**
     * The SFDC id for the terms
     * @DTA\Data(field="accepted_terms_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $accepted_terms_id;

    /**
     * The bill-to company id
     * @DTA\Data(field="billto_company_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billto_company_id;

    /**
     * The bill-to business address id
     * @DTA\Data(field="billto_business_address_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billto_business_address_id;

    /**
     * The bill-to billing address id
     * @DTA\Data(field="billto_billing_address_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billto_billing_address_id;

    /**
     * If Ongoing (perpetual) order line, the estimated monthly spend
     * @DTA\Data(field="estimated_monthly_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $estimated_monthly_spend;

    /**
     * @DTA\Data(field="currency_info")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     * @var \App\DTO\Currency|null
     */
    public $currency_info;

}
