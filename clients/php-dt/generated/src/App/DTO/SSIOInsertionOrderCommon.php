<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SSIOInsertionOrderCommon
{
    /**
     * Starting date of time period. Format: YYYY-MM-DD
     * @DTA\Data(field="start_date", nullable=true)
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
     * @DTA\Data(field="po_number", nullable=true)
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
     * @DTA\Data(field="billing_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_firstname = null;

    /**
     * The billing contact last name
     * @DTA\Data(field="billing_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_lastname = null;

    /**
     * The billing contact email
     * @DTA\Data(field="billing_contact_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $billing_contact_email = null;

    /**
     * The media contact first name
     * @DTA\Data(field="media_contact_firstname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_firstname = null;

    /**
     * The media contact last name
     * @DTA\Data(field="media_contact_lastname", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $media_contact_lastname = null;

    /**
     * The media contact email
     * @DTA\Data(field="media_contact_email", nullable=true)
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

}
