-module(openapi_catalogs_report_stats).

-export([encode/1]).

-export_type([openapi_catalogs_report_stats/0]).

-type openapi_catalogs_report_stats() ::
    #{ 'catalog_id' => binary(),
       'code' => integer(),
       'code_label' => binary(),
       'message' => binary(),
       'occurrences' => integer(),
       'report_type' => binary(),
       'severity' => binary(),
       'ineligible_for_ads' => boolean(),
       'ineligible_for_organic' => boolean()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'code' := Code,
          'code_label' := CodeLabel,
          'message' := Message,
          'occurrences' := Occurrences,
          'report_type' := ReportType,
          'severity' := Severity,
          'ineligible_for_ads' := IneligibleForAds,
          'ineligible_for_organic' := IneligibleForOrganic
        }) ->
    #{ 'catalog_id' => CatalogId,
       'code' => Code,
       'code_label' => CodeLabel,
       'message' => Message,
       'occurrences' => Occurrences,
       'report_type' => ReportType,
       'severity' => Severity,
       'ineligible_for_ads' => IneligibleForAds,
       'ineligible_for_organic' => IneligibleForOrganic
     }.
