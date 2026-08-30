<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TargetingTemplate
{
    /**
     * The ID of the advertiser that this targeting template belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * Targeting template created time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Targeting template ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection307::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection307::class})
     * @var \App\DTO\Collection307|null
     */
    public $keywords;

    /**
     * targeting template name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     * @var \App\DTO\PlacementGroupType|null
     */
    public $placement_group;

    /**
     * @DTA\Data(field="sizing", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateAudienceSizing::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateAudienceSizing::class})
     * @var \App\DTO\TargetingTemplateAudienceSizing|null
     */
    public $sizing;

    /**
     * Indicate targeting template is active or Deleted
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateStatus::class})
     * @var \App\DTO\TargetingTemplateStatus|null
     */
    public $status;

    /**
     * targeting profile attributes
     * @DTA\Data(field="targeting_attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @var \App\DTO\TargetingSpecOptimal|null
     */
    public $targeting_attributes;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrackingUrls::class})
     * @var \App\DTO\TrackingUrls|null
     */
    public $tracking_urls;

    /**
     * Targeting template updated time.Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

    /**
     * Inform if the targeting template is valid (ex. would be false if has revoked audience)
     * @DTA\Data(field="valid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $valid;

}
