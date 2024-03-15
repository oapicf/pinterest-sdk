<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request to create test data for lead data test API.
 */
class LeadFormTestRequest
{
    /**
     * Test lead answers. Should follow the creation order.
     * @DTA\Data(field="answers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection120::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection120::class})
     */
    public ?\App\DTO\Collection120 $answers = null;

}
