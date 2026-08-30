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
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $count_lower = null;

    /**
     * Upper bound of the audience size estimate.
     * @DTA\Data(field="count_upper", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $count_upper = null;

}
