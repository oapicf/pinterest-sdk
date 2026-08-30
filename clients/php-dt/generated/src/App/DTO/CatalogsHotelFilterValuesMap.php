<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A map of filter attributes to their available values.
 */
class CatalogsHotelFilterValuesMap
{
    /**
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $brand = null;

    /**
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_label_0 = null;

    /**
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_label_1 = null;

    /**
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_label_2 = null;

    /**
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_label_3 = null;

    /**
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_label_4 = null;

}
