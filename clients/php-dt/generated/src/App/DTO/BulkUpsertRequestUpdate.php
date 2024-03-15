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
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection76::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection76::class})
     */
    public ?\App\DTO\Collection76 $campaigns = null;

    /**
     * @DTA\Data(field="ad_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     */
    public ?\App\DTO\Collection77 $ad_groups = null;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection78::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection78::class})
     */
    public ?\App\DTO\Collection78 $ads = null;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection80::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection80::class})
     */
    public ?\App\DTO\Collection80 $product_groups = null;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection81::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection81::class})
     */
    public ?\App\DTO\Collection81 $keywords = null;

}
