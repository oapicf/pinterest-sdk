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
     * @var \App\DTO\Collection134|null
     */
    public $ad_groups;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection135::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection135::class})
     * @var \App\DTO\Collection135|null
     */
    public $ads;

    /**
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     * @var \App\DTO\Collection136|null
     */
    public $campaigns;

    /**
     * @DTA\Data(field="catalog_product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection137::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection137::class})
     * @var \App\DTO\Collection137|null
     */
    public $catalog_product_groups;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection138::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection138::class})
     * @var \App\DTO\Collection138|null
     */
    public $keywords;

    /**
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection139::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection139::class})
     * @var \App\DTO\Collection139|null
     */
    public $labels;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection141::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection141::class})
     * @var \App\DTO\Collection141|null
     */
    public $product_groups;

    /**
     * @DTA\Data(field="schedules", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection142::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection142::class})
     * @var \App\DTO\Collection142|null
     */
    public $schedules;

}
