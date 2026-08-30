<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This field includes all quiz data including questions, options, and results.
 */
class QuizPinData
{
    /**
     * @DTA\Data(field="questions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\QuizPinQuestion[]|null
     */
    public $questions;

    /**
     * @DTA\Data(field="results", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\QuizPinResult[]|null
     */
    public $results;

    /**
     * @DTA\Data(field="tie_breaker_custom_result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QuizPinResult::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QuizPinResult::class})
     * @var \App\DTO\QuizPinResult|null
     */
    public $tie_breaker_custom_result;

    /**
     * @DTA\Data(field="tie_breaker_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TieBreakerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TieBreakerType::class})
     * @var \App\DTO\TieBreakerType|null
     */
    public $tie_breaker_type;

}
