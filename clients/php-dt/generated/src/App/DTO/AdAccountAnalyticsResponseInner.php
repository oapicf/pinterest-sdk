<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountAnalyticsResponseInner
{
    /**
     * The ID of the advertiser that this metrics belongs to.
     * @DTA\Data(field="AD_ACCOUNT_ID")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     * @DTA\Data(field="DATE", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date = null;

}
