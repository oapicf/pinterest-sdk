-module(openapi_catalogs_report_distribution_stats).

-export([encode/1]).

-export_type([openapi_catalogs_report_distribution_stats/0]).

-type openapi_catalogs_report_distribution_stats() ::
    #{ 'report_type' => binary(),
       'catalog_id' => binary(),
       'code' => integer(),
       'code_label' => binary(),
       'message' => binary(),
       'occurrences' => integer(),
       'ineligible_for_ads' => boolean(),
       'ineligible_for_organic' => boolean()
     }.

encode(#{ 'report_type' := ReportType,
          'catalog_id' := CatalogId,
          'code' := Code,
          'code_label' := CodeLabel,
          'message' := Message,
          'occurrences' := Occurrences,
          'ineligible_for_ads' := IneligibleForAds,
          'ineligible_for_organic' := IneligibleForOrganic
        }) ->
    #{ 'report_type' => ReportType,
       'catalog_id' => CatalogId,
       'code' => Code,
       'code_label' => CodeLabel,
       'message' => Message,
       'occurrences' => Occurrences,
       'ineligible_for_ads' => IneligibleForAds,
       'ineligible_for_organic' => IneligibleForOrganic
     }.
