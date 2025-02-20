<?php
/**
 * ConversionEventsDataInner
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the ConversionEventsDataInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ConversionEventsDataInner 
{
        /**
     * &lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;
     *
     * @var string|null
     * @SerializedName("event_name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $eventName = null;

    /**
     * &lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;
     *
     * @var string|null
     * @SerializedName("action_source")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $actionSource = null;

    /**
     * The time when the event happened. Unix timestamp in seconds.
     *
     * @var int|null
     * @SerializedName("event_time")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $eventTime = null;

    /**
     * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
     *
     * @var string|null
     * @SerializedName("event_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $eventId = null;

    /**
     * URL of the web conversion event.
     *
     * @var string|null
     * @SerializedName("event_source_url")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $eventSourceUrl = null;

    /**
     * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
     *
     * @var bool|null
     * @SerializedName("opt_out")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $optOut = null;

    /**
     * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’
     *
     * @var string|null
     * @SerializedName("partner_name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $partnerName = null;

    /**
     * @var ConversionEventsUserData|null
     * @SerializedName("user_data")
     * @Type("OpenAPI\Server\Model\ConversionEventsUserData")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\ConversionEventsUserData")]
    protected ?ConversionEventsUserData $userData = null;

    /**
     * @var ConversionEventsDataInnerCustomData|null
     * @SerializedName("custom_data")
     * @Type("OpenAPI\Server\Model\ConversionEventsDataInnerCustomData")
    */
    #[Assert\Type("OpenAPI\Server\Model\ConversionEventsDataInnerCustomData")]
    protected ?ConversionEventsDataInnerCustomData $customData = null;

    /**
     * The app store app ID.
     *
     * @var string|null
     * @SerializedName("app_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $appId = null;

    /**
     * Name of the app.
     *
     * @var string|null
     * @SerializedName("app_name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $appName = null;

    /**
     * Version of the app.
     *
     * @var string|null
     * @SerializedName("app_version")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $appVersion = null;

    /**
     * Brand of the user device.
     *
     * @var string|null
     * @SerializedName("device_brand")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $deviceBrand = null;

    /**
     * User device&#39;s mobile carrier.
     *
     * @var string|null
     * @SerializedName("device_carrier")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $deviceCarrier = null;

    /**
     * Model of the user device.
     *
     * @var string|null
     * @SerializedName("device_model")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $deviceModel = null;

    /**
     * Type of the user device.
     *
     * @var string|null
     * @SerializedName("device_type")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $deviceType = null;

    /**
     * Version of the device operating system.
     *
     * @var string|null
     * @SerializedName("os_version")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $osVersion = null;

    /**
     * Whether the event occurred when the user device was connected to wifi.
     *
     * @var bool|null
     * @SerializedName("wifi")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $wifi = null;

    /**
     * Two-character ISO-639-1 language code indicating the user&#39;s language.
     *
     * @var string|null
     * @SerializedName("language")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $language = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->eventName = array_key_exists('eventName', $data) ? $data['eventName'] : $this->eventName;
            $this->actionSource = array_key_exists('actionSource', $data) ? $data['actionSource'] : $this->actionSource;
            $this->eventTime = array_key_exists('eventTime', $data) ? $data['eventTime'] : $this->eventTime;
            $this->eventId = array_key_exists('eventId', $data) ? $data['eventId'] : $this->eventId;
            $this->eventSourceUrl = array_key_exists('eventSourceUrl', $data) ? $data['eventSourceUrl'] : $this->eventSourceUrl;
            $this->optOut = array_key_exists('optOut', $data) ? $data['optOut'] : $this->optOut;
            $this->partnerName = array_key_exists('partnerName', $data) ? $data['partnerName'] : $this->partnerName;
            $this->userData = array_key_exists('userData', $data) ? $data['userData'] : $this->userData;
            $this->customData = array_key_exists('customData', $data) ? $data['customData'] : $this->customData;
            $this->appId = array_key_exists('appId', $data) ? $data['appId'] : $this->appId;
            $this->appName = array_key_exists('appName', $data) ? $data['appName'] : $this->appName;
            $this->appVersion = array_key_exists('appVersion', $data) ? $data['appVersion'] : $this->appVersion;
            $this->deviceBrand = array_key_exists('deviceBrand', $data) ? $data['deviceBrand'] : $this->deviceBrand;
            $this->deviceCarrier = array_key_exists('deviceCarrier', $data) ? $data['deviceCarrier'] : $this->deviceCarrier;
            $this->deviceModel = array_key_exists('deviceModel', $data) ? $data['deviceModel'] : $this->deviceModel;
            $this->deviceType = array_key_exists('deviceType', $data) ? $data['deviceType'] : $this->deviceType;
            $this->osVersion = array_key_exists('osVersion', $data) ? $data['osVersion'] : $this->osVersion;
            $this->wifi = array_key_exists('wifi', $data) ? $data['wifi'] : $this->wifi;
            $this->language = array_key_exists('language', $data) ? $data['language'] : $this->language;
        }
    }

    /**
     * Gets eventName.
     *
     * @return string|null
     */
    public function getEventName(): ?string
    {
        return $this->eventName;
    }

    /**
    * Sets eventName.
    *
    * @param string|null $eventName  <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p>
    *
    * @return $this
    */
    public function setEventName(?string $eventName): self
    {
        $this->eventName = $eventName;

        return $this;
    }




    /**
     * Gets actionSource.
     *
     * @return string|null
     */
    public function getActionSource(): ?string
    {
        return $this->actionSource;
    }

    /**
    * Sets actionSource.
    *
    * @param string|null $actionSource  <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p>
    *
    * @return $this
    */
    public function setActionSource(?string $actionSource): self
    {
        $this->actionSource = $actionSource;

        return $this;
    }




    /**
     * Gets eventTime.
     *
     * @return int|null
     */
    public function getEventTime(): ?int
    {
        return $this->eventTime;
    }

    /**
    * Sets eventTime.
    *
    * @param int|null $eventTime  The time when the event happened. Unix timestamp in seconds.
    *
    * @return $this
    */
    public function setEventTime(?int $eventTime): self
    {
        $this->eventTime = $eventTime;

        return $this;
    }




    /**
     * Gets eventId.
     *
     * @return string|null
     */
    public function getEventId(): ?string
    {
        return $this->eventId;
    }

    /**
    * Sets eventId.
    *
    * @param string|null $eventId  A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
    *
    * @return $this
    */
    public function setEventId(?string $eventId): self
    {
        $this->eventId = $eventId;

        return $this;
    }




    /**
     * Gets eventSourceUrl.
     *
     * @return string|null
     */
    public function getEventSourceUrl(): ?string
    {
        return $this->eventSourceUrl;
    }

    /**
    * Sets eventSourceUrl.
    *
    * @param string|null $eventSourceUrl  URL of the web conversion event.
    *
    * @return $this
    */
    public function setEventSourceUrl(?string $eventSourceUrl = null): self
    {
        $this->eventSourceUrl = $eventSourceUrl;

        return $this;
    }




    /**
     * Gets optOut.
     *
     * @return bool|null
     */
    public function isOptOut(): ?bool
    {
        return $this->optOut;
    }

    /**
    * Sets optOut.
    *
    * @param bool|null $optOut  When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
    *
    * @return $this
    */
    public function setOptOut(?bool $optOut = null): self
    {
        $this->optOut = $optOut;

        return $this;
    }




    /**
     * Gets partnerName.
     *
     * @return string|null
     */
    public function getPartnerName(): ?string
    {
        return $this->partnerName;
    }

    /**
    * Sets partnerName.
    *
    * @param string|null $partnerName  The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
    *
    * @return $this
    */
    public function setPartnerName(?string $partnerName = null): self
    {
        $this->partnerName = $partnerName;

        return $this;
    }




    /**
     * Gets userData.
     *
     * @return ConversionEventsUserData|null
     */
    public function getUserData(): ?ConversionEventsUserData
    {
        return $this->userData;
    }

    /**
    * Sets userData.
    *
    * @param ConversionEventsUserData|null $userData
    *
    * @return $this
    */
    public function setUserData(?ConversionEventsUserData $userData): self
    {
        $this->userData = $userData;

        return $this;
    }




    /**
     * Gets customData.
     *
     * @return ConversionEventsDataInnerCustomData|null
     */
    public function getCustomData(): ?ConversionEventsDataInnerCustomData
    {
        return $this->customData;
    }

    /**
    * Sets customData.
    *
    * @param ConversionEventsDataInnerCustomData|null $customData
    *
    * @return $this
    */
    public function setCustomData(?ConversionEventsDataInnerCustomData $customData = null): self
    {
        $this->customData = $customData;

        return $this;
    }




    /**
     * Gets appId.
     *
     * @return string|null
     */
    public function getAppId(): ?string
    {
        return $this->appId;
    }

    /**
    * Sets appId.
    *
    * @param string|null $appId  The app store app ID.
    *
    * @return $this
    */
    public function setAppId(?string $appId = null): self
    {
        $this->appId = $appId;

        return $this;
    }




    /**
     * Gets appName.
     *
     * @return string|null
     */
    public function getAppName(): ?string
    {
        return $this->appName;
    }

    /**
    * Sets appName.
    *
    * @param string|null $appName  Name of the app.
    *
    * @return $this
    */
    public function setAppName(?string $appName = null): self
    {
        $this->appName = $appName;

        return $this;
    }




    /**
     * Gets appVersion.
     *
     * @return string|null
     */
    public function getAppVersion(): ?string
    {
        return $this->appVersion;
    }

    /**
    * Sets appVersion.
    *
    * @param string|null $appVersion  Version of the app.
    *
    * @return $this
    */
    public function setAppVersion(?string $appVersion = null): self
    {
        $this->appVersion = $appVersion;

        return $this;
    }




    /**
     * Gets deviceBrand.
     *
     * @return string|null
     */
    public function getDeviceBrand(): ?string
    {
        return $this->deviceBrand;
    }

    /**
    * Sets deviceBrand.
    *
    * @param string|null $deviceBrand  Brand of the user device.
    *
    * @return $this
    */
    public function setDeviceBrand(?string $deviceBrand = null): self
    {
        $this->deviceBrand = $deviceBrand;

        return $this;
    }




    /**
     * Gets deviceCarrier.
     *
     * @return string|null
     */
    public function getDeviceCarrier(): ?string
    {
        return $this->deviceCarrier;
    }

    /**
    * Sets deviceCarrier.
    *
    * @param string|null $deviceCarrier  User device's mobile carrier.
    *
    * @return $this
    */
    public function setDeviceCarrier(?string $deviceCarrier = null): self
    {
        $this->deviceCarrier = $deviceCarrier;

        return $this;
    }




    /**
     * Gets deviceModel.
     *
     * @return string|null
     */
    public function getDeviceModel(): ?string
    {
        return $this->deviceModel;
    }

    /**
    * Sets deviceModel.
    *
    * @param string|null $deviceModel  Model of the user device.
    *
    * @return $this
    */
    public function setDeviceModel(?string $deviceModel = null): self
    {
        $this->deviceModel = $deviceModel;

        return $this;
    }




    /**
     * Gets deviceType.
     *
     * @return string|null
     */
    public function getDeviceType(): ?string
    {
        return $this->deviceType;
    }

    /**
    * Sets deviceType.
    *
    * @param string|null $deviceType  Type of the user device.
    *
    * @return $this
    */
    public function setDeviceType(?string $deviceType = null): self
    {
        $this->deviceType = $deviceType;

        return $this;
    }




    /**
     * Gets osVersion.
     *
     * @return string|null
     */
    public function getOsVersion(): ?string
    {
        return $this->osVersion;
    }

    /**
    * Sets osVersion.
    *
    * @param string|null $osVersion  Version of the device operating system.
    *
    * @return $this
    */
    public function setOsVersion(?string $osVersion = null): self
    {
        $this->osVersion = $osVersion;

        return $this;
    }




    /**
     * Gets wifi.
     *
     * @return bool|null
     */
    public function isWifi(): ?bool
    {
        return $this->wifi;
    }

    /**
    * Sets wifi.
    *
    * @param bool|null $wifi  Whether the event occurred when the user device was connected to wifi.
    *
    * @return $this
    */
    public function setWifi(?bool $wifi = null): self
    {
        $this->wifi = $wifi;

        return $this;
    }




    /**
     * Gets language.
     *
     * @return string|null
     */
    public function getLanguage(): ?string
    {
        return $this->language;
    }

    /**
    * Sets language.
    *
    * @param string|null $language  Two-character ISO-639-1 language code indicating the user's language.
    *
    * @return $this
    */
    public function setLanguage(?string $language = null): self
    {
        $this->language = $language;

        return $this;
    }



}


