<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for conversionEqsList
 */
class ConversionEqsListQueryData
{
    /**
     * Source platform of event.
     * @DTA\Data(field="source_platform", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $source_platform;

    /**
     * Ingestion source of event.
     * @DTA\Data(field="ingestion_source", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $ingestion_source;

    /**
     * Lookback window (number of days).
     * @DTA\Data(field="lookback_period")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $lookback_period;

}
