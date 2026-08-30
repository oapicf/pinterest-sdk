<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Range audience size for an ad group.
 */
class CampaignPlanningAdGroupAudienceSize
{
    /**
     * Lower bound of the audience size estimate.
     * @DTA\Data(field="count_lower", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $count_lower;

    /**
     * Upper bound of the audience size estimate.
     * @DTA\Data(field="count_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $count_upper;

}
