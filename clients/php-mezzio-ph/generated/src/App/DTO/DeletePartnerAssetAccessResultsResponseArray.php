<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DeletePartnerAssetAccessResultsResponseArray
{
    /**
     * List of terminated partner asset accesses.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection394::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection394::class})
     * @var \App\DTO\Collection394|null
     */
    public $items;

}
