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
     * @var bool|null
     */
    public $conversion_metrics_ready;

    /**
     * Are non-conversion metrics ready?
     * @DTA\Data(field="non_conversion_metrics_ready", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $non_conversion_metrics_ready;

}
