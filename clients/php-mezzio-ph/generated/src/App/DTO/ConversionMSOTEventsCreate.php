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
     * @var \App\DTO\Collection246|null
     */
    public $action_timestamps;

    /**
     * The ID of the ad group that was attributed to the conversion event.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * The attribution model used to attribute the conversion event.
     * @DTA\Data(field="attribution_model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AttributionModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AttributionModel::class})
     * @var \App\DTO\AttributionModel|null
     */
    public $attribution_model;

    /**
     * Ad event type.
     * @DTA\Data(field="attribution_scope", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AttributionScope::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AttributionScope::class})
     * @var \App\DTO\AttributionScope|null
     */
    public $attribution_scope;

    /**
     * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
     * @DTA\Data(field="attribution_score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $attribution_score;

    /**
     * The ID of the campaign that was attributed to the conversion event.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).
     * @DTA\Data(field="click_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $click_window;

    /**
     * Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     * @var \App\DTO\Currency|null
     */
    public $currency;

    /**
     * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":256})
     * @var string|null
     */
    public $event_id;

    /**
     * Type of user event.
     * @DTA\Data(field="event_name")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MsotEventName::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MsotEventName::class})
     * @var \App\DTO\MsotEventName|null
     */
    public $event_name;

    /**
     * The time when the event occurred. Unix timestamp in seconds.
     * @DTA\Data(field="event_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $event_timestamp;

    /**
     * Total number of ad events including other non-Pinterest ad platforms.
     * @DTA\Data(field="total_event_touchpoints", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @var int|null
     */
    public $total_event_touchpoints;

    /**
     * Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
     * @DTA\Data(field="total_events", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @var int|null
     */
    public $total_events;

    /**
     * Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
     * @DTA\Data(field="total_events_fractional", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0})
     * @var float|null
     */
    public $total_events_fractional;

    /**
     * Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $value;

    /**
     * View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).
     * @DTA\Data(field="view_window", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $view_window;

}
