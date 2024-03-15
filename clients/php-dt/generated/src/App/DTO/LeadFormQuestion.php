<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadFormQuestion
{
    /**
     * @DTA\Data(field="question_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormQuestionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormQuestionType::class})
     */
    public ?\App\DTO\LeadFormQuestionType $question_type = null;

    /**
     * @DTA\Data(field="custom_question_field_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadFormQuestionFieldType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadFormQuestionFieldType::class})
     */
    public ?\App\DTO\LeadFormQuestionFieldType $custom_question_field_type = null;

    /**
     * Question label for a custom question.
     * @DTA\Data(field="custom_question_label", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_question_label = null;

    /**
     * Question options for a custom question.
     * @DTA\Data(field="custom_question_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_question_options = null;

}
