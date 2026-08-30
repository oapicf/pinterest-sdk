require "json"

module OpenAPIClient
  module Api
  class AdAccounts::ConversionTags
    def initialize(@conn : Connection); end

    # Create conversion tag Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
    def create(ad_account_id : String, conversion_tag_create : OpenAPIClient::ConversionTagCreate) : Response(OpenAPIClient::ConversionTag)
      @conn.request(OpenAPIClient::ConversionTag,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/conversion_tags".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: conversion_tag_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get conversion tag Get information about an existing conversion tag.
    def get(ad_account_id : String, conversion_tag_id : String) : Response(OpenAPIClient::ConversionTag)
      @conn.request(OpenAPIClient::ConversionTag,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{conversion_tag_id}", OpenAPIClient.enc(conversion_tag_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List conversion tags List conversion tags associated with an ad account.
    def list(ad_account_id : String, *, filter_deleted : Bool? = nil) : Response(OpenAPIClient::ConversionTagsList200Response)
      @conn.request(OpenAPIClient::ConversionTagsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_tags".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "filter_deleted" => filter_deleted },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get Ocpm eligible conversion tags Get Ocpm eligible conversion tag events for an ad account.
    def ocpm_eligible(ad_account_id : String) : Response(Hash(String, Array(OpenAPIClient::ConversionEventResponse)))
      @conn.request(Hash(String, Array(OpenAPIClient::ConversionEventResponse)),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get page visit conversion tags Get all page visit conversion tag events for an ad account.
    def page_visit(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil) : Response(OpenAPIClient::PageVisitConversionTagsGet200Response)
      @conn.request(OpenAPIClient::PageVisitConversionTagsGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_tags/page_visit".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
