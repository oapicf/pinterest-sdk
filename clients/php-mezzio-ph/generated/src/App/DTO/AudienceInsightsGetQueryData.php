<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for audience_insights/get
 */
class AudienceInsightsGetQueryData
{
    /**
     * Type of audience insights.
     * @DTA\Data(field="audience_insight_type")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $audience_insight_type;

}
