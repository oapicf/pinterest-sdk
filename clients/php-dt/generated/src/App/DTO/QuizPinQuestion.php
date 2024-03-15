<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A specific quiz inquiry.
 */
class QuizPinQuestion
{
    /**
     * @DTA\Data(field="question_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $question_id = null;

    /**
     * @DTA\Data(field="question_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $question_text = null;

    /**
     * @DTA\Data(field="options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $options = null;

}
