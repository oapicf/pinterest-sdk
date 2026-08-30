<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for campaignAdPreviewDelete
 */
class CampaignAdPreviewDeleteQueryData
{
    /**
     * List of Ad group Ids to use to filter the results.
     * @DTA\Data(field="ad_group_ids")
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi", "min_items":1, "max_items":250})
     * @var string[]|null
     */
    public $ad_group_ids;

}
