<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response model for batch campaign write operations.
 */
class CampaignBatchWriteResponseModel
{
    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection155::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection155::class})
     * @var \App\DTO\Collection155|null
     */
    public $items;

}
