<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CampaignAdPreviewDelete200ResponseInner
{
    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignAdPreviewDelete200ResponseInnerStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignAdPreviewDelete200ResponseInnerStatus::class})
     */
    public ?\App\DTO\CampaignAdPreviewDelete200ResponseInnerStatus $status = null;

}
