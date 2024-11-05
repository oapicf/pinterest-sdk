-module(openapi_catalogs_updatable_creative_assets_attributes).

-include("openapi.hrl").

-export([openapi_catalogs_updatable_creative_assets_attributes/0]).

-export([openapi_catalogs_updatable_creative_assets_attributes/1]).

-export_type([openapi_catalogs_updatable_creative_assets_attributes/0]).

-type openapi_catalogs_updatable_creative_assets_attributes() ::
  [ {'title', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'ios_deep_link', binary() }
  | {'android_deep_link', binary() }
  | {'google_product_category', binary() }
  | {'custom_label_0', binary() }
  | {'custom_label_1', binary() }
  | {'custom_label_2', binary() }
  | {'custom_label_3', binary() }
  | {'custom_label_4', binary() }
  | {'visibility', binary() }
  ].


openapi_catalogs_updatable_creative_assets_attributes() ->
    openapi_catalogs_updatable_creative_assets_attributes([]).

openapi_catalogs_updatable_creative_assets_attributes(Fields) ->
  Default = [ {'title', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'ios_deep_link', binary() }
            , {'android_deep_link', binary() }
            , {'google_product_category', binary() }
            , {'custom_label_0', binary() }
            , {'custom_label_1', binary() }
            , {'custom_label_2', binary() }
            , {'custom_label_3', binary() }
            , {'custom_label_4', binary() }
            , {'visibility', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

