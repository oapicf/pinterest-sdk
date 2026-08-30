<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LabelsResponse
{
    /**
     * Labels that were not successfully applied.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection220::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection220::class})
     * @var \App\DTO\Collection220|null
     */
    public $errors;

    /**
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection221::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection221::class})
     * @var \App\DTO\Collection221|null
     */
    public $labels;

}
