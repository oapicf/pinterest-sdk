<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Metrics for a specific event type within a quality component.
 */
class QualityComponentDetails
{
    /**
     * Coverage percentage for this event type.
     * @DTA\Data(field="coverage")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $coverage = null;

    /**
     * List of issues detected for this event type, if any.
     * @DTA\Data(field="issues", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection172::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection172::class})
     */
    public ?\App\DTO\Collection172 $issues = null;

    /**
     * Overlap percentage for this event type. Only populated for external_event_id
     * @DTA\Data(field="overlap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $overlap = null;

}
