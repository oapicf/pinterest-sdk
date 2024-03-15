<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * If specified, you must provide all properties
 */
class CatalogsHotelGuestRatings
{
    /**
     * Your hotel&#39;s rating.
     * @DTA\Data(field="score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $score = null;

    /**
     * Total number of people who have rated this hotel.
     * @DTA\Data(field="number_of_reviewers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $number_of_reviewers = null;

    /**
     * Max value for the hotel rating score.
     * @DTA\Data(field="max_score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $max_score = null;

    /**
     * System you use for guest reviews.
     * @DTA\Data(field="rating_system", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $rating_system = null;

}
