<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing the catalogs retail items batch
 */
class CatalogsRetailItemsBatch
{
    /**
     * Id of the catalogs items batch
     * @DTA\Data(field="batch_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $batch_id;

    /**
     * Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_time;

    /**
     * Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
     * @DTA\Data(field="completed_time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $completed_time;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchOperationStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchOperationStatus::class})
     * @var \App\DTO\BatchOperationStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsType::class})
     * @var \App\DTO\CatalogsType|null
     */
    public $catalog_type;

    /**
     * Array with the catalogs items processing records part of the catalogs items batch
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ItemProcessingRecord[]|null
     */
    public $items;

}
