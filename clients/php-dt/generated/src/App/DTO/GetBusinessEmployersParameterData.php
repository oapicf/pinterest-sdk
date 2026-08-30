<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getBusinessEmployers
 */
class GetBusinessEmployersParameterData
{
    /**
     * Cursor used to fetch the next page of items
     * @DTA\Data(subset="query", field="bookmark", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
     * @DTA\Data(subset="query", field="assets_summary", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $assets_summary = null;

    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * @DTA\Data(subset="query", field="page_size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="Range", options={"min":1, "max":250})
     */
    public ?int $page_size = null;

}
