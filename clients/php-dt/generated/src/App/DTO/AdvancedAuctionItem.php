<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdvancedAuctionItem
{
    /**
     * @DTA\Data(field="bid_options")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdvancedAuctionBidOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdvancedAuctionBidOptions::class})
     */
    public ?\App\DTO\AdvancedAuctionBidOptions $bid_options = null;

    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * The catalog retail item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Language::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Language::class})
     */
    public ?\App\DTO\Language $language = null;

}
