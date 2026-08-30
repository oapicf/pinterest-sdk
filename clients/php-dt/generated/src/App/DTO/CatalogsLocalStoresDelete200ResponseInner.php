<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsLocalStoresDelete200ResponseInner
{
    /**
     * The ID of the local store.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignAdPreviewDelete200ResponseInnerStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignAdPreviewDelete200ResponseInnerStatus::class})
     */
    public ?\App\DTO\CampaignAdPreviewDelete200ResponseInnerStatus $status = null;

}
