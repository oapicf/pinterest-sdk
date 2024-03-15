<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Creation fields
 */
class BookClosedResponse
{
    /**
     * Are conversion metrics ready?
     * @DTA\Data(field="conversion_metrics_ready", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $conversion_metrics_ready = null;

    /**
     * Are non-conversion metrics ready?
     * @DTA\Data(field="non_conversion_metrics_ready", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $non_conversion_metrics_ready = null;

}
