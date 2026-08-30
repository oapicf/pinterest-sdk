<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */
class CatalogsFeedVideoCounts
{
    /**
     * The number of videos successfully ingested from the feed file.
     * @DTA\Data(field="ingested_videos", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $ingested_videos = null;

    /**
     * The number of videos that were not ingested from the feed file.
     * @DTA\Data(field="not_ingested_videos", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $not_ingested_videos = null;

    /**
     * The number of videos in the feed file.
     * @DTA\Data(field="total_videos", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_videos = null;

}
