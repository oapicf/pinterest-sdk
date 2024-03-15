<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for search_partner_pins
 */
class SearchPartnerPinsParameterData
{
    /**
     * Two letter country code (ISO 3166-1 alpha-2)
     * @DTA\Data(subset="query", field="country_code")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $country_code = null;

    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(subset="query", field="bookmark", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * Max search result size
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":1, "max":50})
     */
    public ?int $limit = null;

    /**
     * Search term to look up pins.
     * @DTA\Data(subset="query", field="term")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $term = null;

    /**
     * Search locale.
     * @DTA\Data(subset="query", field="locale", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $locale = null;

}
