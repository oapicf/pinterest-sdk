<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOEditInsertionOrderRequest
{
    /**
     * Starting date of time period. Format: YYYY-MM-DD
     * @DTA\Data(field="start_date", nullable=true)
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
     * @DTA\Data(field="po_number", nullable=true)
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
     * @DTA\Data(field="billing_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_firstname;

    /**
     * The billing contact last name
     * @DTA\Data(field="billing_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_lastname;

    /**
     * The billing contact email
     * @DTA\Data(field="billing_contact_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $billing_contact_email;

    /**
     * The media contact first name
     * @DTA\Data(field="media_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_firstname;

    /**
     * The media contact last name
     * @DTA\Data(field="media_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $media_contact_lastname;

    /**
     * The media contact email
     * @DTA\Data(field="media_contact_email", nullable=true)
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
     * LineId in the Oracle DB
     * @DTA\Data(field="oracle_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $oracle_line_id;

    /**
     * OrderId in SFDC
     * @DTA\Data(field="salesforce_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $salesforce_order_id;

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

}
