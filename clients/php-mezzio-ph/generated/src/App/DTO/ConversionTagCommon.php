<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionTagCommon
{
    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Tag code snippet.
     * @DTA\Data(field="code_snippet", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code_snippet;

    /**
     * @DTA\Data(field="enhanced_match_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EnhancedMatchStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EnhancedMatchStatusType::class})
     * @var \App\DTO\EnhancedMatchStatusType|null
     */
    public $enhanced_match_status;

    /**
     * Tag ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Time for the last event fired.
     * @DTA\Data(field="last_fired_time_ms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $last_fired_time_ms;

    /**
     * Conversion tag name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * Version number.
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $version;

    /**
     * @DTA\Data(field="configs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagConfigs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagConfigs::class})
     * @var \App\DTO\ConversionTagConfigs|null
     */
    public $configs;

}
