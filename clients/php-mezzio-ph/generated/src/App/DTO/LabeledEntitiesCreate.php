<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class LabeledEntitiesCreate
{
    /**
     * Entity IDs to apply label to.
     * @DTA\Data(field="entity_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection223::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection223::class})
     * @var \App\DTO\Collection223|null
     */
    public $entity_ids;

}
