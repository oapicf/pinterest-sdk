<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdatePartnerAssetsResultsResponseArray
{
    /**
     * List of assigned/updated partner asset access.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection397::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection397::class})
     * @var \App\DTO\Collection397|null
     */
    public $items;

}
