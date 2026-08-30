<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LabelBulkUpdateRequest
{
    /**
     * Label ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     * @DTA\Data(field="parent_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $parent_id;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LabelStatusBulkUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LabelStatusBulkUpdate::class})
     * @var \App\DTO\LabelStatusBulkUpdate|null
     */
    public $status;

}
