<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CampaignAdPreviewCreate200ResponseInner
{
    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignAdPreviewCreate200ResponseInnerData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignAdPreviewCreate200ResponseInnerData::class})
     */
    public ?\App\DTO\CampaignAdPreviewCreate200ResponseInnerData $data = null;

}
