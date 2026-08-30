<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Paginated response for business member assets with total count metadata.
 */
class BusinessMemberAssetsGetResponse
{
    /**
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection390::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection390::class})
     */
    public ?\App\DTO\Collection390 $items = null;

    /**
     * Total number of assets matching the query
     * @DTA\Data(field="total_data_count")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_data_count = null;

    /**
     * Breakdown of asset counts by entity status (ad accounts only)
     * @DTA\Data(field="total_data_count_by_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TotalCountByEntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TotalCountByEntityStatus::class})
     */
    public ?\App\DTO\TotalCountByEntityStatus $total_data_count_by_status = null;

}
