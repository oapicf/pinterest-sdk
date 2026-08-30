-module(openapi_bulk_download_create).

-export([encode/1]).

-export_type([openapi_bulk_download_create/0]).

-type openapi_bulk_download_create() ::
    #{ 'campaign_filter' => openapi_bulk_download_campaign_filter:openapi_bulk_download_campaign_filter(),
       'entity_ids' => list(),
       'entity_types' => list(),
       'output_format' => openapi_bulk_output_format:openapi_bulk_output_format(),
       'updated_since' => binary()
     }.

encode(#{ 'campaign_filter' := CampaignFilter,
          'entity_ids' := EntityIds,
          'entity_types' := EntityTypes,
          'output_format' := OutputFormat,
          'updated_since' := UpdatedSince
        }) ->
    #{ 'campaign_filter' => CampaignFilter,
       'entity_ids' => EntityIds,
       'entity_types' => EntityTypes,
       'output_format' => OutputFormat,
       'updated_since' => UpdatedSince
     }.
