<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for feeds/update
 */
class FeedsUpdateParameterData
{
    /**
     * Unique identifier of a feed
     * @DTA\Data(subset="path", field="feed_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $feed_id;

}
