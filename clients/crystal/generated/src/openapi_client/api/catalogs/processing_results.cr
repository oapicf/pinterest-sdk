require "json"

module OpenAPIClient
  module Api
  class Catalogs::ProcessingResults
    def initialize(@conn : Connection); end

    # List item issues List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)
    def item_issues(processing_result_id : String, *, item_numbers : Array(Int32)? = nil, item_validation_issue : OpenAPIClient::CatalogsItemValidationIssue? = nil, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::ItemsIssuesList200Response)
      @conn.request(OpenAPIClient::ItemsIssuesList200Response,
        method: :GET,
        path: "/catalogs/processing_results/{processing_result_id}/item_issues".sub("{processing_result_id}", OpenAPIClient.enc(processing_result_id)),
        query: { "item_numbers" => item_numbers, "item_validation_issue" => item_validation_issue, "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
