<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TargetingTemplate
{
    /**
     * The ID of the advertiser that this targeting template belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $auto_targeting_enabled = null;

    /**
     * Targeting template created time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Targeting template ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection307::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection307::class})
     */
    public ?\App\DTO\Collection307 $keywords = null;

    /**
     * targeting template name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     */
    public ?\App\DTO\PlacementGroupType $placement_group = null;

    /**
     * @DTA\Data(field="sizing", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateAudienceSizing::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateAudienceSizing::class})
     */
    public ?\App\DTO\TargetingTemplateAudienceSizing $sizing = null;

    /**
     * Indicate targeting template is active or Deleted
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateStatus::class})
     */
    public ?\App\DTO\TargetingTemplateStatus $status = null;

    /**
     * targeting profile attributes
     * @DTA\Data(field="targeting_attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpecOptimal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpecOptimal::class})
     */
    public ?\App\DTO\TargetingSpecOptimal $targeting_attributes = null;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrackingUrls::class})
     */
    public ?\App\DTO\TrackingUrls $tracking_urls = null;

    /**
     * Targeting template updated time.Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

    /**
     * Inform if the targeting template is valid (ex. would be false if has revoked audience)
     * @DTA\Data(field="valid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $valid = null;

}
