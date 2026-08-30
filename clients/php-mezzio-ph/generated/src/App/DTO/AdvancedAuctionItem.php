<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdvancedAuctionItem
{
    /**
     * @DTA\Data(field="bid_options")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdvancedAuctionBidOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdvancedAuctionBidOptions::class})
     * @var \App\DTO\AdvancedAuctionBidOptions|null
     */
    public $bid_options;

    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $country;

    /**
     * The catalog retail item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Language::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Language::class})
     * @var \App\DTO\Language|null
     */
    public $language;

}
