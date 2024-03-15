<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for country_keywords_metrics/get
 */
class CountryKeywordsMetricsGetQueryData
{
    /**
     * Two letter country code (ISO 3166-1 alpha-2)
     * @DTA\Data(field="country_code")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $country_code;

    /**
     * Comma-separated keywords
     * @DTA\Data(field="keywords")
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv", "min_items":1, "max_items":2000})
     * @var string[]|null
     */
    public $keywords;

}
