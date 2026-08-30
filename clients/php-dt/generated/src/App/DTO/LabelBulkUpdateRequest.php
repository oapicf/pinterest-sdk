<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LabelBulkUpdateRequest
{
    /**
     * Label ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     * @DTA\Data(field="parent_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $parent_id = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LabelStatusBulkUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LabelStatusBulkUpdate::class})
     */
    public ?\App\DTO\LabelStatusBulkUpdate $status = null;

}
