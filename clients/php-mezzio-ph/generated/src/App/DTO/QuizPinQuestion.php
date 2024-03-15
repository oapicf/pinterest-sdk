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
     * @var float|null
     */
    public $question_id;

    /**
     * @DTA\Data(field="question_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $question_text;

    /**
     * @DTA\Data(field="options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\QuizPinOption[]|null
     */
    public $options;

}
