<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for advertiserDefinedEventsDelete
 */
class AdvertiserDefinedEventsDeleteQueryData
{
    /**
     * List of event names to delete
     * @DTA\Data(field="event_names")
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $event_names;

}
