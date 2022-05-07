<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for boards/delete
 */
class BoardsDeleteParameterData
{
    /**
     * Unique identifier of a board.
     * @DTA\Data(subset="path", field="board_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $board_id;

}
