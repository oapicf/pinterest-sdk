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
     * @DTA\Data(field="ad_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection123::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection123::class})
     * @var \App\DTO\Collection123|null
     */
    public $ad_groups;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection124::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection124::class})
     * @var \App\DTO\Collection124|null
     */
    public $ads;

    /**
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     * @var \App\DTO\Collection125|null
     */
    public $campaigns;

    /**
     * @DTA\Data(field="catalog_product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     * @var \App\DTO\Collection126|null
     */
    public $catalog_product_groups;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     * @var \App\DTO\Collection128|null
     */
    public $keywords;

    /**
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection130::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection130::class})
     * @var \App\DTO\Collection130|null
     */
    public $labels;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     * @var \App\DTO\Collection132|null
     */
    public $product_groups;

    /**
     * @DTA\Data(field="schedules", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     * @var \App\DTO\Collection133|null
     */
    public $schedules;

}
