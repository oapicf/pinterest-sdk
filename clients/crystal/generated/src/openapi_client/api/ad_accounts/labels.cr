require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Labels
    def initialize(@conn : Connection); end

    # Apply label to entity   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
    def apply(ad_account_id : String, label_id : String, labeled_entities_create : OpenAPIClient::LabeledEntitiesCreate) : Response(OpenAPIClient::LabeledEntities)
      @conn.request(OpenAPIClient::LabeledEntities,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/labels/{label_id}/apply".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{label_id}", OpenAPIClient.enc(label_id)),
        body: labeled_entities_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update labels [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
    def bulk_partial_update(ad_account_id : String, label_update_request : OpenAPIClient::LabelUpdateRequest) : Response(OpenAPIClient::LabelsResponse)
      @conn.request(OpenAPIClient::LabelsResponse,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/labels".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: label_update_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create labels [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
    def create(ad_account_id : String, label_create_request : OpenAPIClient::LabelCreateRequest) : Response(OpenAPIClient::LabelsResponse)
      @conn.request(OpenAPIClient::LabelsResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/labels".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: label_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List labels [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
    def list(ad_account_id : String, *, campaign_ids : Array(String)? = nil, label_ids : Array(String)? = nil, entity_statuses : Array(OpenAPIClient::QueryLabelEntityStatusesItems)? = nil, label_types : Array(OpenAPIClient::QueryLabelTypesItems)? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::LabelsList200Response)
      @conn.request(OpenAPIClient::LabelsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/labels".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "campaign_ids" => campaign_ids, "label_ids" => label_ids, "entity_statuses" => entity_statuses, "label_types" => label_types, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Remove label from entities   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
    def remove(ad_account_id : String, label_id : String, labeled_entities_create : OpenAPIClient::LabeledEntitiesCreate) : Response(OpenAPIClient::LabeledEntities)
      @conn.request(OpenAPIClient::LabeledEntities,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/labels/{label_id}/remove".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{label_id}", OpenAPIClient.enc(label_id)),
        body: labeled_entities_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
