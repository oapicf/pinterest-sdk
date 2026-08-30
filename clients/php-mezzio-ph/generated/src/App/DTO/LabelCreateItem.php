<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LabelCreateItem
{
    /**
     * @DTA\Data(field="label_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LabelType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LabelType::class})
     * @var \App\DTO\LabelType|null
     */
    public $label_type;

    /**
     * Label name. 100-character limit.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $value;

}
