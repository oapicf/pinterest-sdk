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
     */
    public ?\App\DTO\BulkUpsertRequestCreate $create = null;

    /**
     * @DTA\Data(field="update", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkUpsertRequestUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkUpsertRequestUpdate::class})
     */
    public ?\App\DTO\BulkUpsertRequestUpdate $update = null;

}
