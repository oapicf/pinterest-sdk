<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ConversionTag
{
    /**
     * Tag code snippet.
     * @DTA\Data(field="code_snippet", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code_snippet = null;

    /**
     * @DTA\Data(field="configs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionTagConfigs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionTagConfigs::class})
     */
    public ?\App\DTO\ConversionTagConfigs $configs = null;

    /**
     * The enhanced match status of the tag
     * @DTA\Data(field="enhanced_match_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EnhancedMatchStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EnhancedMatchStatusType::class})
     */
    public ?\App\DTO\EnhancedMatchStatusType $enhanced_match_status = null;

    /**
     * Tag ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Time for the last event fired.
     * @DTA\Data(field="last_fired_time_ms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $last_fired_time_ms = null;

    /**
     * Conversion tag name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Version number.
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $version = null;

    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ad_account_id = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

}
