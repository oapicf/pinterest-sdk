<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LeadForm
{
    /**
     * The Ad Account ID that this lead form belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * A message for people who complete the form to let them know what happens next.
     * @DTA\Data(field="completion_message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $completion_message;

    /**
     * Lead form creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Additional disclosure language to be included in the lead form.
     * @DTA\Data(field="disclosure_language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $disclosure_language;

    /**
     * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
     * @DTA\Data(field="has_accepted_terms")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_accepted_terms;

    /**
     * The ID of this lead form
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Internal name of the lead form.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * List of additional policy links to be displayed on the lead form.
     * @DTA\Data(field="policy_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection227::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection227::class})
     * @var \App\DTO\Collection227|null
     */
    public $policy_links;

    /**
     * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
     * @DTA\Data(field="privacy_policy_link")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $privacy_policy_link;

    /**
     * List of questions to be displayed on the lead form.
     * @DTA\Data(field="questions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection229::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection229::class})
     * @var \App\DTO\Collection229|null
     */
    public $questions;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormStatus::class})
     * @var \App\DTO\LeadFormStatus|null
     */
    public $status;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
