<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class TargetingTemplateCreate
{
    /**
     * Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $auto_targeting_enabled = null;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection309::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection309::class})
     */
    public ?\App\DTO\Collection309 $keywords = null;

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

}
