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
     * @var \App\DTO\Collection76|null
     */
    public $campaigns;

    /**
     * @DTA\Data(field="ad_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     * @var \App\DTO\Collection77|null
     */
    public $ad_groups;

    /**
     * @DTA\Data(field="ads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection78::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection78::class})
     * @var \App\DTO\Collection78|null
     */
    public $ads;

    /**
     * @DTA\Data(field="product_groups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection80::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection80::class})
     * @var \App\DTO\Collection80|null
     */
    public $product_groups;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection81::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection81::class})
     * @var \App\DTO\Collection81|null
     */
    public $keywords;

}
