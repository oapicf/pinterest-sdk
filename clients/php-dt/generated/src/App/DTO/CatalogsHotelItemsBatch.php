<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing the catalogs hotel items batch
 */
class CatalogsHotelItemsBatch
{
    /**
     * Id of the catalogs items batch
     * @DTA\Data(field="batch_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $batch_id = null;

    /**
     * Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_time = null;

    /**
     * Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
     * @DTA\Data(field="completed_time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $completed_time = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchOperationStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchOperationStatus::class})
     */
    public ?\App\DTO\BatchOperationStatus $status = null;

    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsType::class})
     */
    public ?\App\DTO\CatalogsType $catalog_type = null;

    /**
     * Array with the catalogs items processing records part of the catalogs items batch
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $items = null;

}
