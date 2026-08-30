<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdateMemberAssetsResultsResponseArray
{
    /**
     * List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection388::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection388::class})
     * @var \App\DTO\Collection388|null
     */
    public $items;

}
