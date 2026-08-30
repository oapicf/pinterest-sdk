<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadFormBatchUpdate
{
    /**
     * A message for people who complete the form to let them know what happens next.
     * @DTA\Data(field="completion_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $completion_message = null;

    /**
     * Additional disclosure language to be included in the lead form.
     * @DTA\Data(field="disclosure_language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $disclosure_language = null;

    /**
     * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
     * @DTA\Data(field="has_accepted_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_accepted_terms = null;

    /**
     * The ID of this lead form
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Internal name of the lead form.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * List of additional policy links to be displayed on the lead form.
     * @DTA\Data(field="policy_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection236::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection236::class})
     */
    public ?\App\DTO\Collection236 $policy_links = null;

    /**
     * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
     * @DTA\Data(field="privacy_policy_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $privacy_policy_link = null;

    /**
     * List of questions to be displayed on the lead form.
     * @DTA\Data(field="questions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection237::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection237::class})
     */
    public ?\App\DTO\Collection237 $questions = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormStatus::class})
     */
    public ?\App\DTO\LeadFormStatus $status = null;

}
