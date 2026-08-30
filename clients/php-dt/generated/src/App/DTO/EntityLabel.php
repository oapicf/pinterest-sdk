<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EntityLabel
{
    /**
     * Entity ID to apply label to.
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entity_id = null;

    /**
     * @DTA\Data(field="entity_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LabelParentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LabelParentType::class})
     */
    public ?\App\DTO\LabelParentType $entity_type = null;

    /**
     * Label ID.
     * @DTA\Data(field="label_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $label_id = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityLabelStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityLabelStatus::class})
     */
    public ?\App\DTO\EntityLabelStatus $status = null;

}
