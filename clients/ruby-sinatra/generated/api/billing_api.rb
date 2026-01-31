require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/ads_credit/redeem', {
  "resourcePath" => "/Billing",
  "summary" => "Redeem ad credits",
  "nickname" => "ads_credit/redeem",
  "responseClass" => "AdsCreditRedeemResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/ads_credit/redeem",
  "notes" => "Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Redeem ad credits request.",
      "dataType" => "AdsCreditRedeemRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ads_credit/discounts', {
  "resourcePath" => "/Billing",
  "summary" => "Get ads credit discounts",
  "nickname" => "ads_credits_discounts/get",
  "responseClass" => "ads_credits_discounts_get_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/ads_credit/discounts",
  "notes" => "Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download', {
  "resourcePath" => "/Billing",
  "summary" => "Get download url for a billing invoice",
  "nickname" => "billing_invoice_download/get",
  "responseClass" => "BillingInvoiceDownloadResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download",
  "notes" => "Get download url for a billing invoice.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "billing_invoice_id",
      "description" => "Unique identifier of a billing invoice.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/billing_invoices', {
  "resourcePath" => "/Billing",
  "summary" => "Get billing invoices",
  "nickname" => "billing_invoices/get",
  "responseClass" => "billing_invoices_get_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/billing_invoices",
  "notes" => "Get billing invoices in the advertiser account.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "sort",
      "description" => "Field of which to sort billing invoices",
      "dataType" => "String",
      "allowableValues" => "[DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER]",
      "defaultValue" => "'DUE_DATE'",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "Status of billing invoices to filter by",
      "dataType" => "String",
      "allowableValues" => "[OPEN, CLOSED]",
      "paramType" => "query",
    },
    {
      "name" => "document_type",
      "description" => "Document type of billing invoices to filter by",
      "dataType" => "String",
      "allowableValues" => "[INVOICE, CREDIT_MEMO]",
      "paramType" => "query",
    },
    {
      "name" => "start_due_date",
      "description" => "Starting point for due dates when searching for invoices. Format: YYYY-MM-DD",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_due_date",
      "description" => "Ending point for due dates when searching for invoices. Format: YYYY-MM-DD",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/billing_profiles', {
  "resourcePath" => "/Billing",
  "summary" => "Get billing profiles",
  "nickname" => "billing_profiles/get",
  "responseClass" => "billing_profiles_get_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/billing_profiles",
  "notes" => "Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "is_active",
      "description" => "Return active billing profiles, if false return all billing profiles.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ssio/accounts', {
  "resourcePath" => "/Billing",
  "summary" => "Get Salesforce account details including bill-to information.",
  "nickname" => "ssio_accounts/get",
  "responseClass" => "SSIOAccountResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/ssio/accounts",
  "notes" => "Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders', {
  "resourcePath" => "/Billing",
  "summary" => "Create insertion order through SSIO.",
  "nickname" => "ssio_insertion_order/create",
  "responseClass" => "SSIOCreateInsertionOrderResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/ssio/insertion_orders",
  "notes" => "Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Order line to create.",
      "dataType" => "SSIOCreateInsertionOrderRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders', {
  "resourcePath" => "/Billing",
  "summary" => "Edit insertion order through SSIO.",
  "nickname" => "ssio_insertion_order/edit",
  "responseClass" => "SSIOEditInsertionOrderResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/ssio/insertion_orders",
  "notes" => "Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Order line to create.",
      "dataType" => "SSIOEditInsertionOrderRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status', {
  "resourcePath" => "/Billing",
  "summary" => "Get insertion order status by ad account id.",
  "nickname" => "ssio_insertion_orders_status/get_by_ad_account",
  "responseClass" => "ssio_insertion_orders_status_get_by_ad_account_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status",
  "notes" => "Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status', {
  "resourcePath" => "/Billing",
  "summary" => "Get insertion order status by pin order id.",
  "nickname" => "ssio_insertion_orders_status/get_by_pin_order_id",
  "responseClass" => "SSIOInsertionOrderStatusResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status",
  "notes" => "Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pin_order_id",
      "description" => "The pin order id associated with the ssio insertion order",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ssio/order_lines', {
  "resourcePath" => "/Billing",
  "summary" => "Get Salesforce order lines by ad account id.",
  "nickname" => "ssio_order_lines/get_by_ad_account",
  "responseClass" => "ssio_order_lines_get_by_ad_account_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/ssio/order_lines",
  "notes" => "Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "pin_order_id",
      "description" => "The pin order id associated with the ssio insertino order",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

