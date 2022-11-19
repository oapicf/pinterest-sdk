from pinterestsdk.paths.catalogs_feeds_feed_id.get import ApiForget
from pinterestsdk.paths.catalogs_feeds_feed_id.delete import ApiFordelete
from pinterestsdk.paths.catalogs_feeds_feed_id.patch import ApiForpatch


class CatalogsFeedsFeedId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
