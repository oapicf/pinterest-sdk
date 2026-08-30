<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class CustomerSegmentCreate
{
    /**
     * Audience IDs included in the customer segment.
     * @DTA\Data(field="audience_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection195::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection195::class})
     * @var \App\DTO\Collection195|null
     */
    public $audience_ids;

    /**
     * Customer segment name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

}
