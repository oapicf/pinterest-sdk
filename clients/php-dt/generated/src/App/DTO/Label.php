<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Label
{
    /**
     * Label ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="label_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableLabelType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableLabelType::class})
     */
    public ?\App\DTO\NullableLabelType $label_type = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableLabelStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableLabelStatus::class})
     */
    public ?\App\DTO\NullableLabelStatus $status = null;

    /**
     * Label name. 100-character limit.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $value = null;

}
