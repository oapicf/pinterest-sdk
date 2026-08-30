<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TargetingSpecShoppingRetargeting
{
    /**
     * Number of days ago to stop lookback timeframe for dynamic retargeting
     * @DTA\Data(field="exclusion_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $exclusion_window;

    /**
     * Number of days ago to start lookback timeframe for dynamic retargeting
     * @DTA\Data(field="lookback_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lookback_window;

    /**
     * Event types to target for dynamic retargeting
     * @DTA\Data(field="tag_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection19::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection19::class})
     * @var \App\DTO\Collection19|null
     */
    public $tag_types;

}
