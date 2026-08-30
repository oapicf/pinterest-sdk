<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Bulk campaign delivery estimates response.
 */
class BulkCampaignDeliveryEstimatesResponse
{
    /**
     * Per-campaign delivery estimate results, in the same order as the request.
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $data = null;

}
