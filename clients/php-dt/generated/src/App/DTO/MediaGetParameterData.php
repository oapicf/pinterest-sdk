<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for mediaGet
 */
class MediaGetParameterData
{
    /**
     * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     * @DTA\Data(subset="path", field="media_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $media_id = null;

}
