<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Schema for GET Conversion EQS response.
 */
class EventQualityScore
{
    /**
     * @DTA\Data(field="ingestion_source")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IngestionSourceOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IngestionSourceOptions::class})
     * @var \App\DTO\IngestionSourceOptions|null
     */
    public $ingestion_source;

    /**
     * @DTA\Data(field="lookback_period")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LookbackPeriodOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LookbackPeriodOptions::class})
     * @var \App\DTO\LookbackPeriodOptions|null
     */
    public $lookback_period;

    /**
     * @DTA\Data(field="overall_status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OverallStatusOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OverallStatusOptions::class})
     * @var \App\DTO\OverallStatusOptions|null
     */
    public $overall_status;

    /**
     * @DTA\Data(field="quality_components")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QualityComponents::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QualityComponents::class})
     * @var \App\DTO\QualityComponents|null
     */
    public $quality_components;

    /**
     * @DTA\Data(field="source_platform")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SourcePlatformOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SourcePlatformOptions::class})
     * @var \App\DTO\SourcePlatformOptions|null
     */
    public $source_platform;

}
