<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TargetingTypeFilter
{
    /**
     * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
     * @DTA\Data(field="targeting_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\AdsAnalyticsTargetingType[]|null
     */
    public $targeting_types;

}
