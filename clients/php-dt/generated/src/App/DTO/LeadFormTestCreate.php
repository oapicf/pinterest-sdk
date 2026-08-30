<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class LeadFormTestCreate
{
    /**
     * Test lead answers. Should follow the creation order.
     * @DTA\Data(field="answers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection239::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection239::class})
     */
    public ?\App\DTO\Collection239 $answers = null;

}
