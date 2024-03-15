<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LeadFormQuestion
{
    /**
     * @DTA\Data(field="question_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormQuestionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormQuestionType::class})
     * @var \App\DTO\LeadFormQuestionType|null
     */
    public $question_type;

    /**
     * @DTA\Data(field="custom_question_field_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormQuestionFieldType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormQuestionFieldType::class})
     * @var \App\DTO\LeadFormQuestionFieldType|null
     */
    public $custom_question_field_type;

    /**
     * Question label for a custom question.
     * @DTA\Data(field="custom_question_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_question_label;

    /**
     * Question options for a custom question.
     * @DTA\Data(field="custom_question_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $custom_question_options;

}
