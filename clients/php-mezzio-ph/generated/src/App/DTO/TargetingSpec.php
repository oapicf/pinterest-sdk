<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
 */
class TargetingSpec
{
    /**
     * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
     * @DTA\Data(field="AGE_BUCKET", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     * @var \App\DTO\Collection17|null
     */
    public $age_bucket;

    /**
     * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
     * @DTA\Data(field="APPTYPE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection18::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection18::class})
     * @var \App\DTO\Collection18|null
     */
    public $apptype;

    /**
     * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
     * @DTA\Data(field="AUDIENCE_EXCLUDE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection19::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection19::class})
     * @var \App\DTO\Collection19|null
     */
    public $audience_exclude;

    /**
     * Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
     * @DTA\Data(field="AUDIENCE_INCLUDE&#39;", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection20::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection20::class})
     * @var \App\DTO\Collection20|null
     */
    public $audience_include;

    /**
     * Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
     * @DTA\Data(field="GENDER", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection21::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection21::class})
     * @var \App\DTO\Collection21|null
     */
    public $gender;

    /**
     * Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
     * @DTA\Data(field="GEO", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     * @var \App\DTO\Collection22|null
     */
    public $geo;

    /**
     * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
     * @DTA\Data(field="INTEREST", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection23::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection23::class})
     * @var \App\DTO\Collection23|null
     */
    public $interest;

    /**
     * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
     * @DTA\Data(field="LOCALE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection24::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection24::class})
     * @var \App\DTO\Collection24|null
     */
    public $locale;

    /**
     * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
     * @DTA\Data(field="LOCATION", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     * @var \App\DTO\Collection25|null
     */
    public $location;

    /**
     * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
     * @DTA\Data(field="SHOPPING_RETARGETING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection27::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection27::class})
     * @var \App\DTO\Collection27|null
     */
    public $shopping_retargeting;

    /**
     * 
     * @DTA\Data(field="TARGETING_STRATEGY", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection28::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection28::class})
     * @var \App\DTO\Collection28|null
     */
    public $targeting_strategy;

}
