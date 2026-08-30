require "json"

module OpenAPIClient
  module Api
  class AdAccounts::LeadForms
    def initialize(@conn : Connection); end

    # Update lead forms **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    def bulk_partial_update(ad_account_id : String, lead_form_batch_update : Array(OpenAPIClient::LeadFormBatchUpdate)) : Response(OpenAPIClient::LeadFormsCreate200Response)
      @conn.request(OpenAPIClient::LeadFormsCreate200Response,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/lead_forms".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: lead_form_batch_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create lead forms **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    def create(ad_account_id : String, lead_form_create : Array(OpenAPIClient::LeadFormCreate)) : Response(OpenAPIClient::LeadFormsCreate200Response)
      @conn.request(OpenAPIClient::LeadFormsCreate200Response,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/lead_forms".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: lead_form_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get lead form by id **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    def get(lead_form_id : String, ad_account_id : String) : Response(OpenAPIClient::LeadForm)
      @conn.request(OpenAPIClient::LeadForm,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".sub("{lead_form_id}", OpenAPIClient.enc(lead_form_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List lead forms **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil) : Response(OpenAPIClient::LeadFormsList200Response)
      @conn.request(OpenAPIClient::LeadFormsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/lead_forms".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create lead form test data Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
    def test(ad_account_id : String, lead_form_id : String, lead_form_test_create : OpenAPIClient::LeadFormTestCreate) : Response(OpenAPIClient::LeadFormTest)
      @conn.request(OpenAPIClient::LeadFormTest,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{lead_form_id}", OpenAPIClient.enc(lead_form_id)),
        body: lead_form_test_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
