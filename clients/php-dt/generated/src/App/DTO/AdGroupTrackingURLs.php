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
     */
    public ?\App\DTO\Collection23 $audience_verification = null;

    /**
     * @DTA\Data(field="buyable_button", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection24::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection24::class})
     */
    public ?\App\DTO\Collection24 $buyable_button = null;

    /**
     * @DTA\Data(field="click", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     */
    public ?\App\DTO\Collection25 $click = null;

    /**
     * @DTA\Data(field="engagement", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection26::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection26::class})
     */
    public ?\App\DTO\Collection26 $engagement = null;

    /**
     * @DTA\Data(field="impression", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection27::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection27::class})
     */
    public ?\App\DTO\Collection27 $impression = null;

}
