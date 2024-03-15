<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOOrderLine
{
    /**
     * OrderLineId in SFDC
     * @DTA\Data(field="salesforce_order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $salesforce_order_line_id;

    /**
     * Ads manager OrderLineId
     * @DTA\Data(field="ads_manager_order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ads_manager_order_line_id;

    /**
     * The pin order id associated with the order line in SFDC
     * @DTA\Data(field="pin_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_order_id;

    /**
     * Last modified date.
     * @DTA\Data(field="last_modified_date_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$/"})
     * @var string|null
     */
    public $last_modified_date_time;

    /**
     * Start date of the order line.
     * @DTA\Data(field="start_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $start_date;

    /**
     * End date of the order line.
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $end_date;

    /**
     * Bill To Company name
     * @DTA\Data(field="bill_to_company_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $bill_to_company_name;

    /**
     * Billing contact first name
     * @DTA\Data(field="billing_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_firstname;

    /**
     * Billing contact last name
     * @DTA\Data(field="billing_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_lastname;

    /**
     * Billing contact email
     * @DTA\Data(field="billing_contact_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_email;

    /**
     * Billing media email
     * @DTA\Data(field="media_contact_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_email;

    /**
     * Billing contact first name
     * @DTA\Data(field="media_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_firstname;

    /**
     * Billing contact first name
     * @DTA\Data(field="media_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_lastname;

    /**
     * @DTA\Data(field="currency_info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     * @var \App\DTO\Currency|null
     */
    public $currency_info;

    /**
     * Agency link
     * @DTA\Data(field="agency_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $agency_link;

    /**
     * The po number
     * @DTA\Data(field="po_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $po_number;

    /**
     * The order name
     * @DTA\Data(field="order_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $order_name;

    /**
     * The Pinterest marketing partner name
     * @DTA\Data(field="pmp_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pmp_name;

    /**
     * The SFDC id for the terms
     * @DTA\Data(field="accepted_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $accepted_terms_id;

    /**
     * The UTC timestamp (to the nearest sec) of when terms were accepted
     * @DTA\Data(field="accepted_terms_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$/"})
     * @var string|null
     */
    public $accepted_terms_time;

    /**
     * If Budget order line, the budget amount.
     * @DTA\Data(field="budget_amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $budget_amount;

    /**
     * If Ongoing (perpetual) order line, the estimated monthly spend
     * @DTA\Data(field="estimated_monthly_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $estimated_monthly_spend;

}
