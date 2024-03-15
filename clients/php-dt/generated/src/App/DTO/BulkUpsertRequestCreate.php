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
     */
    public ?\App\DTO\Collection69 $campaigns = null;

    /**
     * @DTA\Data(field="ad_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection70::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection70::class})
     */
    public ?\App\DTO\Collection70 $ad_groups = null;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection71::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection71::class})
     */
    public ?\App\DTO\Collection71 $ads = null;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection73::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection73::class})
     */
    public ?\App\DTO\Collection73 $product_groups = null;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection75::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection75::class})
     */
    public ?\App\DTO\Collection75 $keywords = null;

}
