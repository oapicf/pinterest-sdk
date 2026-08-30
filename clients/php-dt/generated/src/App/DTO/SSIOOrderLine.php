<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A Salesforce SSIO order line.
 */
class SSIOOrderLine
{
    /**
     * The SFDC id for the terms
     * @DTA\Data(field="accepted_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $accepted_terms_id = null;

    /**
     * The UTC timestamp (to the nearest second) when terms were accepted.
     * @DTA\Data(field="accepted_terms_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})\.(\d{3})Z$/"})
     */
    public ?string $accepted_terms_time = null;

    /**
     * Ads manager order line id
     * @DTA\Data(field="ads_manager_order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ads_manager_order_line_id = null;

    /**
     * Agency link
     * @DTA\Data(field="agency_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $agency_link = null;

    /**
     * Bill-to company name
     * @DTA\Data(field="bill_to_company_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bill_to_company_name = null;

    /**
     * Billing contact email
     * @DTA\Data(field="billing_contact_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_email = null;

    /**
     * Billing contact first name
     * @DTA\Data(field="billing_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_firstname = null;

    /**
     * Billing contact last name
     * @DTA\Data(field="billing_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_lastname = null;

    /**
     * If budget order line, the budget amount.
     * @DTA\Data(field="budget_amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $budget_amount = null;

    /**
     * @DTA\Data(field="currency_info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency_info = null;

    /**
     * End date of the order line.
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $end_date = null;

    /**
     * If ongoing (perpetual) order line, the estimated monthly spend.
     * @DTA\Data(field="estimated_monthly_spend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $estimated_monthly_spend = null;

    /**
     * Last modified date.
     * @DTA\Data(field="last_modified_date_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})\.(\d{3})Z$/"})
     */
    public ?string $last_modified_date_time = null;

    /**
     * Billing media email
     * @DTA\Data(field="media_contact_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_email = null;

    /**
     * Billing media contact first name
     * @DTA\Data(field="media_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_firstname = null;

    /**
     * Billing media contact last name
     * @DTA\Data(field="media_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_lastname = null;

    /**
     * The order name
     * @DTA\Data(field="order_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_name = null;

    /**
     * The pin order id associated with the order line in SFDC
     * @DTA\Data(field="pin_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pin_order_id = null;

    /**
     * The Pinterest marketing partner name
     * @DTA\Data(field="pmp_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pmp_name = null;

    /**
     * The PO number
     * @DTA\Data(field="po_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $po_number = null;

    /**
     * Order line id in SFDC
     * @DTA\Data(field="salesforce_order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $salesforce_order_line_id = null;

    /**
     * Start date of the order line.
     * @DTA\Data(field="start_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $start_date = null;

}
