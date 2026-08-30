<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LabelErrorData
{
    /**
     * Label ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="label_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableLabelType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableLabelType::class})
     * @var \App\DTO\NullableLabelType|null
     */
    public $label_type;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableLabelStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableLabelStatus::class})
     * @var \App\DTO\NullableLabelStatus|null
     */
    public $status;

    /**
     * Label name. 100-character limit.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $value;

}
