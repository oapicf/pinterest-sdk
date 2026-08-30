<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EntityLabel
{
    /**
     * Entity ID to apply label to.
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $entity_id;

    /**
     * @DTA\Data(field="entity_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LabelParentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LabelParentType::class})
     * @var \App\DTO\LabelParentType|null
     */
    public $entity_type;

    /**
     * Label ID.
     * @DTA\Data(field="label_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $label_id;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityLabelStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityLabelStatus::class})
     * @var \App\DTO\EntityLabelStatus|null
     */
    public $status;

}
