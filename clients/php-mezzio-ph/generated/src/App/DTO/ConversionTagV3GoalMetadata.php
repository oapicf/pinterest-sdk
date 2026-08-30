<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionTagV3GoalMetadata
{
    /**
     * @DTA\Data(field="attribution_windows", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AttributionWindows::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AttributionWindows::class})
     * @var \App\DTO\AttributionWindows|null
     */
    public $attribution_windows;

    /**
     * @DTA\Data(field="conversion_event", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEvent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEvent::class})
     * @var \App\DTO\ConversionEvent|null
     */
    public $conversion_event;

    /**
     * @DTA\Data(field="conversion_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $conversion_tag_id;

    /**
     * @DTA\Data(field="cpa_goal_value_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $cpa_goal_value_in_micro_currency;

    /**
     * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
     * @DTA\Data(field="is_roas_optimized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_roas_optimized;

    /**
     * Event name for custom or standard events mapped to an oCPM model
     * @DTA\Data(field="reporting_event", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $reporting_event;

}
