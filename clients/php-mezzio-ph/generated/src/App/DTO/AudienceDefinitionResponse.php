<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AudienceDefinitionResponse
{
    /**
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection112::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection112::class})
     * @var \App\DTO\Collection112|null
     */
    public $items;

}
