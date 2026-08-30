<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Breakdown of asset counts by entity status.
 */
class TotalCountByEntityStatus
{
    /**
     * Count of ACTIVE assets
     * @DTA\Data(field="ACTIVE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $active;

    /**
     * Count of ARCHIVED assets
     * @DTA\Data(field="ARCHIVED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $archived;

    /**
     * Count of PAUSED assets
     * @DTA\Data(field="PAUSED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $paused;

}
