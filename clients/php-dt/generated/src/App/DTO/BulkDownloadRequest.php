<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad entities to get in bulk request.
 */
class BulkDownloadRequest
{
    /**
     * All entity types specified will be downloaded. Fewer types result in faster downloads.
     * @DTA\Data(field="entity_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection65::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection65::class})
     */
    public ?\App\DTO\Collection65 $entity_types = null;

    /**
     * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
     * @DTA\Data(field="entity_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection66::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection66::class})
     */
    public ?\App\DTO\Collection66 $entity_ids = null;

    /**
     * Unix UTC timestamp to retrieve all entities that have changed since this time.
     * @DTA\Data(field="updated_since", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $updated_since = null;

    /**
     * @DTA\Data(field="campaign_filter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkDownloadRequestCampaignFilter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkDownloadRequestCampaignFilter::class})
     */
    public ?\App\DTO\BulkDownloadRequestCampaignFilter $campaign_filter = null;

    /**
     * @DTA\Data(field="output_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkOutputFormat::class})
     */
    public ?\App\DTO\BulkOutputFormat $output_format = null;

}
