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
     */
    public ?\App\DTO\Collection123 $ad_groups = null;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection124::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection124::class})
     */
    public ?\App\DTO\Collection124 $ads = null;

    /**
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     */
    public ?\App\DTO\Collection125 $campaigns = null;

    /**
     * @DTA\Data(field="catalog_product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     */
    public ?\App\DTO\Collection126 $catalog_product_groups = null;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     */
    public ?\App\DTO\Collection128 $keywords = null;

    /**
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection130::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection130::class})
     */
    public ?\App\DTO\Collection130 $labels = null;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     */
    public ?\App\DTO\Collection132 $product_groups = null;

    /**
     * @DTA\Data(field="schedules", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     */
    public ?\App\DTO\Collection133 $schedules = null;

}
