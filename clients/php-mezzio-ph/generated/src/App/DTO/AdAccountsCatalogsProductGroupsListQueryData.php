<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for ad_accounts_catalogs_product_groups/list
 */
class AdAccountsCatalogsProductGroupsListQueryData
{
    /**
     * The feed profile id whose catalog product groups we want to return.
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $feed_profile_id;

}
