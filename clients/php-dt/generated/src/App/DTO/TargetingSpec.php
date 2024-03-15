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
     */
    public ?\App\DTO\Collection17 $age_bucket = null;

    /**
     * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
     * @DTA\Data(field="APPTYPE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection18::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection18::class})
     */
    public ?\App\DTO\Collection18 $apptype = null;

    /**
     * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
     * @DTA\Data(field="AUDIENCE_EXCLUDE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection19::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection19::class})
     */
    public ?\App\DTO\Collection19 $audience_exclude = null;

    /**
     * Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
     * @DTA\Data(field="AUDIENCE_INCLUDE&#39;", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection20::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection20::class})
     */
    public ?\App\DTO\Collection20 $audience_include = null;

    /**
     * Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
     * @DTA\Data(field="GENDER", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection21::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection21::class})
     */
    public ?\App\DTO\Collection21 $gender = null;

    /**
     * Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
     * @DTA\Data(field="GEO", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     */
    public ?\App\DTO\Collection22 $geo = null;

    /**
     * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
     * @DTA\Data(field="INTEREST", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection23::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection23::class})
     */
    public ?\App\DTO\Collection23 $interest = null;

    /**
     * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
     * @DTA\Data(field="LOCALE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection24::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection24::class})
     */
    public ?\App\DTO\Collection24 $locale = null;

    /**
     * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
     * @DTA\Data(field="LOCATION", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     */
    public ?\App\DTO\Collection25 $location = null;

    /**
     * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
     * @DTA\Data(field="SHOPPING_RETARGETING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection27::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection27::class})
     */
    public ?\App\DTO\Collection27 $shopping_retargeting = null;

    /**
     * 
     * @DTA\Data(field="TARGETING_STRATEGY", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection28::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection28::class})
     */
    public ?\App\DTO\Collection28 $targeting_strategy = null;

}
