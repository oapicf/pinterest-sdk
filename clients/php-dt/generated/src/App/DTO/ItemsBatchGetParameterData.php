<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for items_batch/get
 */
class ItemsBatchGetParameterData
{
    /**
     * Id of a catalogs items batch to fetch
     * @DTA\Data(subset="path", field="batch_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $batch_id;

}
