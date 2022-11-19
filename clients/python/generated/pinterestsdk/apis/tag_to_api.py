import typing_extensions

from pinterestsdk.apis.tags import TagValues
from pinterestsdk.apis.tags.ad_accounts_api import AdAccountsApi
from pinterestsdk.apis.tags.ad_groups_api import AdGroupsApi
from pinterestsdk.apis.tags.ads_api import AdsApi
from pinterestsdk.apis.tags.audiences_api import AudiencesApi
from pinterestsdk.apis.tags.audience_insights_api import AudienceInsightsApi
from pinterestsdk.apis.tags.boards_api import BoardsApi
from pinterestsdk.apis.tags.bulk_api import BulkApi
from pinterestsdk.apis.tags.campaigns_api import CampaignsApi
from pinterestsdk.apis.tags.catalogs_api import CatalogsApi
from pinterestsdk.apis.tags.conversion_events_api import ConversionEventsApi
from pinterestsdk.apis.tags.conversion_tags_api import ConversionTagsApi
from pinterestsdk.apis.tags.customer_lists_api import CustomerListsApi
from pinterestsdk.apis.tags.keywords_api import KeywordsApi
from pinterestsdk.apis.tags.media_api import MediaApi
from pinterestsdk.apis.tags.oauth_api import OauthApi
from pinterestsdk.apis.tags.order_lines_api import OrderLinesApi
from pinterestsdk.apis.tags.pins_api import PinsApi
from pinterestsdk.apis.tags.product_group_promotions_api import ProductGroupPromotionsApi
from pinterestsdk.apis.tags.resources_api import ResourcesApi
from pinterestsdk.apis.tags.terms_api import TermsApi
from pinterestsdk.apis.tags.terms_of_service_api import TermsOfServiceApi
from pinterestsdk.apis.tags.user_account_api import UserAccountApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.AD_ACCOUNTS: AdAccountsApi,
        TagValues.AD_GROUPS: AdGroupsApi,
        TagValues.ADS: AdsApi,
        TagValues.AUDIENCES: AudiencesApi,
        TagValues.AUDIENCE_INSIGHTS: AudienceInsightsApi,
        TagValues.BOARDS: BoardsApi,
        TagValues.BULK: BulkApi,
        TagValues.CAMPAIGNS: CampaignsApi,
        TagValues.CATALOGS: CatalogsApi,
        TagValues.CONVERSION_EVENTS: ConversionEventsApi,
        TagValues.CONVERSION_TAGS: ConversionTagsApi,
        TagValues.CUSTOMER_LISTS: CustomerListsApi,
        TagValues.KEYWORDS: KeywordsApi,
        TagValues.MEDIA: MediaApi,
        TagValues.OAUTH: OauthApi,
        TagValues.ORDER_LINES: OrderLinesApi,
        TagValues.PINS: PinsApi,
        TagValues.PRODUCT_GROUP_PROMOTIONS: ProductGroupPromotionsApi,
        TagValues.RESOURCES: ResourcesApi,
        TagValues.TERMS: TermsApi,
        TagValues.TERMS_OF_SERVICE: TermsOfServiceApi,
        TagValues.USER_ACCOUNT: UserAccountApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.AD_ACCOUNTS: AdAccountsApi,
        TagValues.AD_GROUPS: AdGroupsApi,
        TagValues.ADS: AdsApi,
        TagValues.AUDIENCES: AudiencesApi,
        TagValues.AUDIENCE_INSIGHTS: AudienceInsightsApi,
        TagValues.BOARDS: BoardsApi,
        TagValues.BULK: BulkApi,
        TagValues.CAMPAIGNS: CampaignsApi,
        TagValues.CATALOGS: CatalogsApi,
        TagValues.CONVERSION_EVENTS: ConversionEventsApi,
        TagValues.CONVERSION_TAGS: ConversionTagsApi,
        TagValues.CUSTOMER_LISTS: CustomerListsApi,
        TagValues.KEYWORDS: KeywordsApi,
        TagValues.MEDIA: MediaApi,
        TagValues.OAUTH: OauthApi,
        TagValues.ORDER_LINES: OrderLinesApi,
        TagValues.PINS: PinsApi,
        TagValues.PRODUCT_GROUP_PROMOTIONS: ProductGroupPromotionsApi,
        TagValues.RESOURCES: ResourcesApi,
        TagValues.TERMS: TermsApi,
        TagValues.TERMS_OF_SERVICE: TermsOfServiceApi,
        TagValues.USER_ACCOUNT: UserAccountApi,
    }
)
