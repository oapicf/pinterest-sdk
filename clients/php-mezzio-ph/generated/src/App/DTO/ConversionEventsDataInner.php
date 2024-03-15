<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionEventsDataInner
{
    /**
     * The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;
     * @DTA\Data(field="event_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_name;

    /**
     * The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;
     * @DTA\Data(field="action_source")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $action_source;

    /**
     * The time when the event happened. Unix timestamp in seconds.
     * @DTA\Data(field="event_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $event_time;

    /**
     * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * URL of the web conversion event.
     * @DTA\Data(field="event_source_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_source_url;

    /**
     * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
     * @DTA\Data(field="opt_out", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $opt_out;

    /**
     * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’
     * @DTA\Data(field="partner_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_name;

    /**
     * @DTA\Data(field="user_data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEventsUserData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEventsUserData::class})
     * @var \App\DTO\ConversionEventsUserData|null
     */
    public $user_data;

    /**
     * @DTA\Data(field="custom_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEventsDataInnerCustomData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEventsDataInnerCustomData::class})
     * @var \App\DTO\ConversionEventsDataInnerCustomData|null
     */
    public $custom_data;

    /**
     * The app store app ID.
     * @DTA\Data(field="app_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $app_id;

    /**
     * Name of the app.
     * @DTA\Data(field="app_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $app_name;

    /**
     * Version of the app.
     * @DTA\Data(field="app_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $app_version;

    /**
     * Brand of the user device.
     * @DTA\Data(field="device_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $device_brand;

    /**
     * User device&#39;s mobile carrier.
     * @DTA\Data(field="device_carrier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $device_carrier;

    /**
     * Model of the user device.
     * @DTA\Data(field="device_model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $device_model;

    /**
     * Type of the user device.
     * @DTA\Data(field="device_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $device_type;

    /**
     * Version of the device operating system.
     * @DTA\Data(field="os_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $os_version;

    /**
     * Whether the event occurred when the user device was connected to wifi.
     * @DTA\Data(field="wifi", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $wifi;

    /**
     * Two-character ISO-639-1 language code indicating the user&#39;s language.
     * @DTA\Data(field="language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $language;

}
