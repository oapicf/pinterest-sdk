<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadFormResponse
{
    /**
     * Internal name of the lead form.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
     * @DTA\Data(field="privacy_policy_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $privacy_policy_link = null;

    /**
     * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.
     * @DTA\Data(field="has_accepted_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_accepted_terms = null;

    /**
     * A message for people who complete the form to let them know what happens next.
     * @DTA\Data(field="completion_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $completion_message = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormStatus::class})
     */
    public ?\App\DTO\LeadFormStatus $status = null;

    /**
     * Additional disclosure language to be included in the lead form.
     * @DTA\Data(field="disclosure_language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $disclosure_language = null;

    /**
     * List of questions to be displayed on the lead form.
     * @DTA\Data(field="questions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $questions = null;

    /**
     * The ID of this lead form
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * The Ad Account ID that this lead form belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Lead form creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

}
