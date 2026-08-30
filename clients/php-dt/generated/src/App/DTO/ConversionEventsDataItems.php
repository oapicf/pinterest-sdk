<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ConversionEventsDataItems
{
    /**
     * The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;
     * @DTA\Data(field="action_source")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $action_source = null;

    /**
     * The app store app ID.
     * @DTA\Data(field="app_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $app_id = null;

    /**
     * @DTA\Data(field="app_info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEventAppInfo::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEventAppInfo::class})
     */
    public ?\App\DTO\ConversionEventAppInfo $app_info = null;

    /**
     * Name of the app.
     * @DTA\Data(field="app_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $app_name = null;

    /**
     * Version of the app.
     * @DTA\Data(field="app_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $app_version = null;

    /**
     * @DTA\Data(field="custom_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEventsDataItemsCustomData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEventsDataItemsCustomData::class})
     */
    public ?\App\DTO\ConversionEventsDataItemsCustomData $custom_data = null;

    /**
     * Brand of the user device.
     * @DTA\Data(field="device_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $device_brand = null;

    /**
     * User device&#39;s mobile carrier.
     * @DTA\Data(field="device_carrier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $device_carrier = null;

    /**
     * @DTA\Data(field="device_info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEventDeviceInfo::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEventDeviceInfo::class})
     */
    public ?\App\DTO\ConversionEventDeviceInfo $device_info = null;

    /**
     * Model of the user device.
     * @DTA\Data(field="device_model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $device_model = null;

    /**
     * Type of the user device.
     * @DTA\Data(field="device_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $device_type = null;

    /**
     * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;
     * @DTA\Data(field="event_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_name = null;

    /**
     * URL of the web conversion event.
     * @DTA\Data(field="event_source_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_source_url = null;

    /**
     * The time when the event happened. Unix timestamp in seconds.
     * @DTA\Data(field="event_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $event_time = null;

    /**
     * Two-character ISO-639-1 language code indicating the user&#39;s language.
     * @DTA\Data(field="language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $language = null;

    /**
     * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
     * @DTA\Data(field="opt_out", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $opt_out = null;

    /**
     * Version of the device operating system.
     * @DTA\Data(field="os_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $os_version = null;

    /**
     * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;
     * @DTA\Data(field="partner_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_name = null;

    /**
     * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
     * @DTA\Data(field="user_data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionEventsUserDataProperties::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionEventsUserDataProperties::class})
     */
    public ?\App\DTO\ConversionEventsUserDataProperties $user_data = null;

    /**
     * Whether the event occurred when the user device was connected to wifi.
     * @DTA\Data(field="wifi", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $wifi = null;

}
