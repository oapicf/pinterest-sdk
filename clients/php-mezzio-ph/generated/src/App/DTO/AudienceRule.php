<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */
class AudienceRule
{
    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Ad ID for engagement audience filter.
     * @DTA\Data(field="ad_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection353::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection353::class})
     * @var \App\DTO\Collection353|null
     */
    public $ad_id;

    /**
     * Campaign ID for engagement audience filter.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection354::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection354::class})
     * @var \App\DTO\Collection354|null
     */
    public $campaign_id;

    /**
     * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $country;

    /**
     * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
     * @DTA\Data(field="customer_list_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $customer_list_id;

    /**
     * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
     * @DTA\Data(field="engagement_domain", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection355::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection355::class})
     * @var \App\DTO\Collection355|null
     */
    public $engagement_domain;

    /**
     * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.
     * @DTA\Data(field="engagement_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $engagement_type;

    /**
     * Optional for ENGAGEMENT. Engager type value should be 1-2.
     * @DTA\Data(field="engager_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $engager_type;

    /**
     * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
     * @DTA\Data(field="event", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event;

    /**
     * @DTA\Data(field="event_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EventData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EventData::class})
     * @var \App\DTO\EventData|null
     */
    public $event_data;

    /**
     * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
     * @DTA\Data(field="event_source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $event_source;

    /**
     * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
     * @DTA\Data(field="ingestion_source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $ingestion_source;

    /**
     * Objective for engagement audience filter.
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection356::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection356::class})
     * @var \App\DTO\Collection356|null
     */
    public $objective_type;

    /**
     * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
     * @DTA\Data(field="percentage", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $percentage;

    /**
     * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection357::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection357::class})
     * @var \App\DTO\Collection357|null
     */
    public $pin_id;

    /**
     * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
     * @DTA\Data(field="prefill", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $prefill;

    /**
     * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
     * @DTA\Data(field="retention_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $retention_days;

    /**
     * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.
     * @DTA\Data(field="seed_id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection358::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection358::class})
     * @var \App\DTO\Collection358|null
     */
    public $seed_id;

    /**
     * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection359::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection359::class})
     * @var \App\DTO\Collection359|null
     */
    public $url;

    /**
     * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
     * @DTA\Data(field="visitor_source_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $visitor_source_id;

}
