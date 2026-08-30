<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Item in a batch campaign response.
 */
class CampaignBatchItem
{
    /**
     * Campaign data on success.
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignBatchResponseData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignBatchResponseData::class})
     */
    public ?\App\DTO\CampaignBatchResponseData $data = null;

    /**
     * Exceptions on failure.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection154::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection154::class})
     */
    public ?\App\DTO\Collection154 $exceptions = null;

}
