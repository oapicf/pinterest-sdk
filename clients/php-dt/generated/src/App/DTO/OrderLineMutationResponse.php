<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrderLineMutationResponse
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLineMutationResult::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLineMutationResult::class})
     */
    public ?\App\DTO\OrderLineMutationResult $data = null;

}
