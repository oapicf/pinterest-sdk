from pinterestsdk.paths.boards_board_id.get import ApiForget
from pinterestsdk.paths.boards_board_id.delete import ApiFordelete
from pinterestsdk.paths.boards_board_id.patch import ApiForpatch


class BoardsBoardId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
