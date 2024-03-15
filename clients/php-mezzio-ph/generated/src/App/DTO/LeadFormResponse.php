<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LeadFormResponse
{
    /**
     * Internal name of the lead form.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
     * @DTA\Data(field="privacy_policy_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $privacy_policy_link;

    /**
     * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.
     * @DTA\Data(field="has_accepted_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_accepted_terms;

    /**
     * A message for people who complete the form to let them know what happens next.
     * @DTA\Data(field="completion_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $completion_message;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormStatus::class})
     * @var \App\DTO\LeadFormStatus|null
     */
    public $status;

    /**
     * Additional disclosure language to be included in the lead form.
     * @DTA\Data(field="disclosure_language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $disclosure_language;

    /**
     * List of questions to be displayed on the lead form.
     * @DTA\Data(field="questions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\LeadFormQuestion[]|null
     */
    public $questions;

    /**
     * The ID of this lead form
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * The Ad Account ID that this lead form belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Lead form creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
