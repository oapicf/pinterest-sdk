<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */
class AdvancedAuctionBidOptions
{
    /**
     * @DTA\Data(field="app_type_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AppTypeMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AppTypeMultipliers::class})
     * @var \App\DTO\AppTypeMultipliers|null
     */
    public $app_type_multipliers;

    /**
     * Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bid_in_micro_currency;

    /**
     * @DTA\Data(field="placement_multipliers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementMultipliers::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementMultipliers::class})
     * @var \App\DTO\PlacementMultipliers|null
     */
    public $placement_multipliers;

}
