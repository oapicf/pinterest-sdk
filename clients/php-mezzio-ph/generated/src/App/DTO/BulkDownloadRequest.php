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
     * @var \App\DTO\Collection65|null
     */
    public $entity_types;

    /**
     * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
     * @DTA\Data(field="entity_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection66::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection66::class})
     * @var \App\DTO\Collection66|null
     */
    public $entity_ids;

    /**
     * Unix UTC timestamp to retrieve all entities that have changed since this time.
     * @DTA\Data(field="updated_since", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $updated_since;

    /**
     * @DTA\Data(field="campaign_filter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkDownloadRequestCampaignFilter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkDownloadRequestCampaignFilter::class})
     * @var \App\DTO\BulkDownloadRequestCampaignFilter|null
     */
    public $campaign_filter;

    /**
     * @DTA\Data(field="output_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkOutputFormat::class})
     * @var \App\DTO\BulkOutputFormat|null
     */
    public $output_format;

}
