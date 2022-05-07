# Pinterest REST API

Pinterest's REST API


    ## API

          ### AdAccounts

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AdAccountsController`|akka-http API controller|
          |`org.openapitools.server.api.AdAccountsApi`|Representing trait|
              |`org.openapitools.server.api.AdAccountsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/analytics?startDate=[value]&endDate=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get ad account analytics
                * `GET /v5/ad_accounts?bookmark=[value]&pageSize=[value]&includeSharedAccounts=[value]` - List ad accounts
                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups/analytics?startDate=[value]&endDate=[value]&adGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get ad group analytics
                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups?campaignIds=[value]&adGroupIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]&translateInterestsToNames=[value]` - List ad groups
                * `GET /v5/ad_accounts/{ad_account_id}/ads/analytics?startDate=[value]&endDate=[value]&adIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get ad analytics
                * `GET /v5/ad_accounts/{ad_account_id}/ads?campaignIds=[value]&adGroupIds=[value]&adIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]` - List ads
                * `POST /v5/ad_accounts/{ad_account_id}/reports` - Create async request for an account analytics report
                * `GET /v5/ad_accounts/{ad_account_id}/reports?token=[value]` - Get the account analytics report created by the async call
                * `GET /v5/ad_accounts/{ad_account_id}/campaigns/analytics?startDate=[value]&endDate=[value]&campaignIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get campaign analytics
                * `GET /v5/ad_accounts/{ad_account_id}/campaigns?campaignIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]` - List campaigns
                * `GET /v5/ad_accounts/{ad_account_id}/product_groups/analytics?startDate=[value]&endDate=[value]&productGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get product group analytics

          ### Boards

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.BoardsController`|akka-http API controller|
          |`org.openapitools.server.api.BoardsApi`|Representing trait|
              |`org.openapitools.server.api.BoardsApiImpl`|Default implementation|

                * `POST /v5/boards/{board_id}/sections` - Create board section
                * `DELETE /v5/boards/{board_id}/sections/{section_id}` - Delete board section
                * `GET /v5/boards/{board_id}/sections?bookmark=[value]&pageSize=[value]` - List board sections
                * `GET /v5/boards/{board_id}/sections/{section_id}/pins?bookmark=[value]&pageSize=[value]` - List Pins on board section
                * `PATCH /v5/boards/{board_id}/sections/{section_id}` - Update board section
                * `POST /v5/boards` - Create board
                * `DELETE /v5/boards/{board_id}` - Delete board
                * `GET /v5/boards/{board_id}` - Get board
                * `GET /v5/boards?bookmark=[value]&pageSize=[value]&privacy=[value]` - List boards
                * `GET /v5/boards/{board_id}/pins?bookmark=[value]&pageSize=[value]` - List Pins on board
                * `PATCH /v5/boards/{board_id}` - Update board

          ### Catalogs

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.CatalogsController`|akka-http API controller|
          |`org.openapitools.server.api.CatalogsApi`|Representing trait|
              |`org.openapitools.server.api.CatalogsApiImpl`|Default implementation|

                * `POST /v5/catalogs/product_groups` - Create product group
                * `DELETE /v5/catalogs/product_groups/{product_group_id}` - Delete product group
                * `GET /v5/catalogs/product_groups?feedId=[value]&bookmark=[value]&pageSize=[value]` - Get product groups list
                * `PATCH /v5/catalogs/product_groups/{product_group_id}` - Update product group
                * `GET /v5/catalogs/feeds/{feed_id}/processing_results?bookmark=[value]&pageSize=[value]` - List processing results for a given feed
                * `POST /v5/catalogs/feeds` - Create feed
                * `DELETE /v5/catalogs/feeds/{feed_id}` - Delete feed
                * `GET /v5/catalogs/feeds/{feed_id}` - Get feed
                * `GET /v5/catalogs/feeds?bookmark=[value]&pageSize=[value]` - List feeds
                * `PATCH /v5/catalogs/feeds/{feed_id}` - Update feed
                * `GET /v5/catalogs/items/batch/{batch_id}` - Get catalogs items batch
                * `POST /v5/catalogs/items/batch` - Perform an operation on an item batch
                * `GET /v5/catalogs/items?country=[value]&itemIds=[value]&language=[value]` - Get catalogs items

          ### Media

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.MediaController`|akka-http API controller|
          |`org.openapitools.server.api.MediaApi`|Representing trait|
              |`org.openapitools.server.api.MediaApiImpl`|Default implementation|

                * `POST /v5/media` - Register media upload
                * `GET /v5/media/{media_id}` - Get media upload details
                * `GET /v5/media?bookmark=[value]&pageSize=[value]` - List media uploads

          ### Oauth

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.OauthController`|akka-http API controller|
          |`org.openapitools.server.api.OauthApi`|Representing trait|
              |`org.openapitools.server.api.OauthApiImpl`|Default implementation|

                * `POST /v5/oauth/token` - Generate OAuth access token

          ### Pins

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.PinsController`|akka-http API controller|
          |`org.openapitools.server.api.PinsApi`|Representing trait|
              |`org.openapitools.server.api.PinsApiImpl`|Default implementation|

                * `GET /v5/pins/{pin_id}/analytics?startDate=[value]&endDate=[value]&appTypes=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]` - Get Pin analytics
                * `POST /v5/pins` - Create Pin
                * `DELETE /v5/pins/{pin_id}` - Delete Pin
                * `GET /v5/pins/{pin_id}?adAccountId=[value]` - Get Pin

          ### UserAccount

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.UserAccountController`|akka-http API controller|
          |`org.openapitools.server.api.UserAccountApi`|Representing trait|
              |`org.openapitools.server.api.UserAccountApiImpl`|Default implementation|

                * `GET /v5/user_account/analytics?startDate=[value]&endDate=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]` - Get user account analytics
                * `GET /v5/user_account?adAccountId=[value]` - Get user account

