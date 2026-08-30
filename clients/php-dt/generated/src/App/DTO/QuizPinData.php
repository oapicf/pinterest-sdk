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
     */
    public ?array $questions = null;

    /**
     * @DTA\Data(field="results", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $results = null;

    /**
     * @DTA\Data(field="tie_breaker_custom_result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QuizPinResult::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QuizPinResult::class})
     */
    public ?\App\DTO\QuizPinResult $tie_breaker_custom_result = null;

    /**
     * @DTA\Data(field="tie_breaker_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TieBreakerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TieBreakerType::class})
     */
    public ?\App\DTO\TieBreakerType $tie_breaker_type = null;

}
