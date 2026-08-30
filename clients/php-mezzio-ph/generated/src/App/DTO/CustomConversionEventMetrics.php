<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomConversionEventMetrics
{
    /**
     * @DTA\Data(field="custom_event_metrics_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdeColumnType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdeColumnType::class})
     * @var \App\DTO\AdeColumnType|null
     */
    public $custom_event_metrics_type;

    /**
     * Name of the advertiser-defined custom conversion event
     * @DTA\Data(field="custom_event_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_event_name;

}
