<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class ConversionMSOTEventsCreate
{
    /**
     * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
     * @DTA\Data(field="action_timestamps", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection246::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection246::class})
     */
    public ?\App\DTO\Collection246 $action_timestamps = null;

    /**
     * The ID of the ad group that was attributed to the conversion event.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * The attribution model used to attribute the conversion event.
     * @DTA\Data(field="attribution_model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AttributionModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AttributionModel::class})
     */
    public ?\App\DTO\AttributionModel $attribution_model = null;

    /**
     * Ad event type.
     * @DTA\Data(field="attribution_scope", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AttributionScope::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AttributionScope::class})
     */
    public ?\App\DTO\AttributionScope $attribution_scope = null;

    /**
     * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
     * @DTA\Data(field="attribution_score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1, "exclude_min":true})
     */
    public ?float $attribution_score = null;

    /**
     * The ID of the campaign that was attributed to the conversion event.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $campaign_id = null;

    /**
     * Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).
     * @DTA\Data(field="click_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $click_window = null;

    /**
     * Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency = null;

    /**
     * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $event_id = null;

    /**
     * Type of user event.
     * @DTA\Data(field="event_name")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MsotEventName::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MsotEventName::class})
     */
    public ?\App\DTO\MsotEventName $event_name = null;

    /**
     * The time when the event occurred. Unix timestamp in seconds.
     * @DTA\Data(field="event_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $event_timestamp = null;

    /**
     * Total number of ad events including other non-Pinterest ad platforms.
     * @DTA\Data(field="total_event_touchpoints", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $total_event_touchpoints = null;

    /**
     * Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
     * @DTA\Data(field="total_events", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $total_events = null;

    /**
     * Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
     * @DTA\Data(field="total_events_fractional", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $total_events_fractional = null;

    /**
     * Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $value = null;

    /**
     * View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).
     * @DTA\Data(field="view_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $view_window = null;

}
