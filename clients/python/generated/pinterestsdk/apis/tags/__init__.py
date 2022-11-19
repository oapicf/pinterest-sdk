# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from pinterestsdk.apis.tag_to_api import tag_to_api

import enum


class TagValues(str, enum.Enum):
    AD_ACCOUNTS = "ad_accounts"
    AD_GROUPS = "ad_groups"
    ADS = "ads"
    AUDIENCES = "audiences"
    AUDIENCE_INSIGHTS = "audience_insights"
    BOARDS = "boards"
    BULK = "bulk"
    CAMPAIGNS = "campaigns"
    CATALOGS = "catalogs"
    CONVERSION_EVENTS = "conversion_events"
    CONVERSION_TAGS = "conversion_tags"
    CUSTOMER_LISTS = "customer_lists"
    KEYWORDS = "keywords"
    MEDIA = "media"
    OAUTH = "oauth"
    ORDER_LINES = "order_lines"
    PINS = "pins"
    PRODUCT_GROUP_PROMOTIONS = "product_group_promotions"
    RESOURCES = "resources"
    TERMS = "terms"
    TERMS_OF_SERVICE = "terms_of_service"
    USER_ACCOUNT = "user_account"
