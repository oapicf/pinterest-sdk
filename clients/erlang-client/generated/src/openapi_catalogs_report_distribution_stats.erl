-module(openapi_catalogs_report_distribution_stats).

-export([encode/1]).

-export_type([openapi_catalogs_report_distribution_stats/0]).

-type openapi_catalogs_report_distribution_stats() ::
    #{ 'catalog_id' => binary(),
       'code' => integer(),
       'code_label' => binary(),
       'ineligible_for_ads' => boolean(),
       'ineligible_for_organic' => boolean(),
       'message' => binary(),
       'occurrences' => integer(),
       'report_type' => binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'code' := Code,
          'code_label' := CodeLabel,
          'ineligible_for_ads' := IneligibleForAds,
          'ineligible_for_organic' := IneligibleForOrganic,
          'message' := Message,
          'occurrences' := Occurrences,
          'report_type' := ReportType
        }) ->
    #{ 'catalog_id' => CatalogId,
       'code' => Code,
       'code_label' => CodeLabel,
       'ineligible_for_ads' => IneligibleForAds,
       'ineligible_for_organic' => IneligibleForOrganic,
       'message' => Message,
       'occurrences' => Occurrences,
       'report_type' => ReportType
     }.
