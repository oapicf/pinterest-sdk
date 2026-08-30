<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Error encountered while estimating delivery for a campaign.
 */
class CampaignPlanningResponseError
{
    /**
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningResponseErrorCode::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningResponseErrorCode::class})
     * @var \App\DTO\CampaignPlanningResponseErrorCode|null
     */
    public $code;

    /**
     * Human-readable error message.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
