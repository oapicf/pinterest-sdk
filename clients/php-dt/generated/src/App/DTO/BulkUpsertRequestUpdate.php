<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request for creation of entities in bulk.
 */
class BulkUpsertRequestUpdate
{
    /**
     * @DTA\Data(field="ad_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection134::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection134::class})
     */
    public ?\App\DTO\Collection134 $ad_groups = null;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection135::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection135::class})
     */
    public ?\App\DTO\Collection135 $ads = null;

    /**
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     */
    public ?\App\DTO\Collection136 $campaigns = null;

    /**
     * @DTA\Data(field="catalog_product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection137::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection137::class})
     */
    public ?\App\DTO\Collection137 $catalog_product_groups = null;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection138::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection138::class})
     */
    public ?\App\DTO\Collection138 $keywords = null;

    /**
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection139::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection139::class})
     */
    public ?\App\DTO\Collection139 $labels = null;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection141::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection141::class})
     */
    public ?\App\DTO\Collection141 $product_groups = null;

    /**
     * @DTA\Data(field="schedules", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection142::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection142::class})
     */
    public ?\App\DTO\Collection142 $schedules = null;

}
