-module(openapi_bulk_download_request).

-export([encode/1]).

-export_type([openapi_bulk_download_request/0]).

-type openapi_bulk_download_request() ::
    #{ 'entity_types' => list(),
       'entity_ids' => list(),
       'updated_since' => binary(),
       'campaign_filter' => openapi_bulk_download_request_campaign_filter:openapi_bulk_download_request_campaign_filter(),
       'output_format' => openapi_bulk_output_format:openapi_bulk_output_format()
     }.

encode(#{ 'entity_types' := EntityTypes,
          'entity_ids' := EntityIds,
          'updated_since' := UpdatedSince,
          'campaign_filter' := CampaignFilter,
          'output_format' := OutputFormat
        }) ->
    #{ 'entity_types' => EntityTypes,
       'entity_ids' => EntityIds,
       'updated_since' => UpdatedSince,
       'campaign_filter' => CampaignFilter,
       'output_format' => OutputFormat
     }.
