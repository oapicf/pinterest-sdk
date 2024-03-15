<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */
class AudienceRule
{
    /**
     * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $country = null;

    /**
     * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
     * @DTA\Data(field="customer_list_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $customer_list_id = null;

    /**
     * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
     * @DTA\Data(field="engagement_domain", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     */
    public ?\App\DTO\Collection55 $engagement_domain = null;

    /**
     * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.
     * @DTA\Data(field="engagement_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $engagement_type = null;

    /**
     * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
     * @DTA\Data(field="event", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event = null;

    /**
     * @DTA\Data(field="event_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestTagEventData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestTagEventData::class})
     */
    public ?\App\DTO\PinterestTagEventData $event_data = null;

    /**
     * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
     * @DTA\Data(field="percentage", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $percentage = null;

    /**
     * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     */
    public ?\App\DTO\Collection56 $pin_id = null;

    /**
     * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
     * @DTA\Data(field="prefill", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $prefill = null;

    /**
     * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
     * @DTA\Data(field="retention_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $retention_days = null;

    /**
     * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.
     * @DTA\Data(field="seed_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     */
    public ?\App\DTO\Collection57 $seed_id = null;

    /**
     * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     */
    public ?\App\DTO\Collection58 $url = null;

    /**
     * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
     * @DTA\Data(field="visitor_source_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $visitor_source_id = null;

    /**
     * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
     * @DTA\Data(field="event_source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $event_source = null;

    /**
     * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
     * @DTA\Data(field="ingestion_source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $ingestion_source = null;

    /**
     * Optional for ENGAGEMENT. Engager type value should be 1-2.
     * @DTA\Data(field="engager_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $engager_type = null;

    /**
     * Campaign ID for engagement audience filter.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     */
    public ?\App\DTO\Collection59 $campaign_id = null;

    /**
     * Ad ID for engagement audience filter.
     * @DTA\Data(field="ad_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     */
    public ?\App\DTO\Collection60 $ad_id = null;

    /**
     * Objective for engagement audience filter.
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     */
    public ?\App\DTO\Collection61 $objective_type = null;

    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

}
