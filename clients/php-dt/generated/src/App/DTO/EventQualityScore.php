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
     */
    public ?\App\DTO\IngestionSourceOptions $ingestion_source = null;

    /**
     * @DTA\Data(field="lookback_period")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LookbackPeriodOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LookbackPeriodOptions::class})
     */
    public ?\App\DTO\LookbackPeriodOptions $lookback_period = null;

    /**
     * @DTA\Data(field="overall_status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OverallStatusOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OverallStatusOptions::class})
     */
    public ?\App\DTO\OverallStatusOptions $overall_status = null;

    /**
     * @DTA\Data(field="quality_components")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QualityComponents::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QualityComponents::class})
     */
    public ?\App\DTO\QualityComponents $quality_components = null;

    /**
     * @DTA\Data(field="source_platform")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SourcePlatformOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SourcePlatformOptions::class})
     */
    public ?\App\DTO\SourcePlatformOptions $source_platform = null;

}
