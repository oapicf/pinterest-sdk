<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
class BulkUpsertRequest
{
    /**
     * @DTA\Data(field="create", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkUpsertRequestCreate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkUpsertRequestCreate::class})
     * @var \App\DTO\BulkUpsertRequestCreate|null
     */
    public $create;

    /**
     * @DTA\Data(field="update", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkUpsertRequestUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkUpsertRequestUpdate::class})
     * @var \App\DTO\BulkUpsertRequestUpdate|null
     */
    public $update;

}
