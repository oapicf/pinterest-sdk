<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */
class AdGroupTrackingURLs
{
    /**
     * @DTA\Data(field="audience_verification", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection23::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection23::class})
     * @var \App\DTO\Collection23|null
     */
    public $audience_verification;

    /**
     * @DTA\Data(field="buyable_button", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection24::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection24::class})
     * @var \App\DTO\Collection24|null
     */
    public $buyable_button;

    /**
     * @DTA\Data(field="click", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     * @var \App\DTO\Collection25|null
     */
    public $click;

    /**
     * @DTA\Data(field="engagement", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection26::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection26::class})
     * @var \App\DTO\Collection26|null
     */
    public $engagement;

    /**
     * @DTA\Data(field="impression", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection27::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection27::class})
     * @var \App\DTO\Collection27|null
     */
    public $impression;

}
