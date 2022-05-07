<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response object of catalogs items
 */
class CatalogsItems
{
    /**
     * Array with catalogs items
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection41::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection41::class})
     * @var \App\DTO\Collection41|null
     */
    public $items;

}
