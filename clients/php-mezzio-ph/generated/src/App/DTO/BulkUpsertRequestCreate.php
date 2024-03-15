<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request for creation of entities in bulk.
 */
class BulkUpsertRequestCreate
{
    /**
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection69::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection69::class})
     * @var \App\DTO\Collection69|null
     */
    public $campaigns;

    /**
     * @DTA\Data(field="ad_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection70::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection70::class})
     * @var \App\DTO\Collection70|null
     */
    public $ad_groups;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection71::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection71::class})
     * @var \App\DTO\Collection71|null
     */
    public $ads;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection73::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection73::class})
     * @var \App\DTO\Collection73|null
     */
    public $product_groups;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection75::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection75::class})
     * @var \App\DTO\Collection75|null
     */
    public $keywords;

}
