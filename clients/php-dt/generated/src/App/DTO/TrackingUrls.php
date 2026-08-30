<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */
class TrackingUrls
{
    /**
     * @DTA\Data(field="audience_verification", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     */
    public ?\App\DTO\Collection59 $audience_verification = null;

    /**
     * @DTA\Data(field="buyable_button", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     */
    public ?\App\DTO\Collection60 $buyable_button = null;

    /**
     * @DTA\Data(field="click", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     */
    public ?\App\DTO\Collection61 $click = null;

    /**
     * @DTA\Data(field="engagement", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     */
    public ?\App\DTO\Collection62 $engagement = null;

    /**
     * @DTA\Data(field="impression", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     */
    public ?\App\DTO\Collection63 $impression = null;

}
