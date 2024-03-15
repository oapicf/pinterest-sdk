-module(openapi_lead_forms_list_200_response).

-include("openapi.hrl").

-export([openapi_lead_forms_list_200_response/0]).

-export([openapi_lead_forms_list_200_response/1]).

-export_type([openapi_lead_forms_list_200_response/0]).

-type openapi_lead_forms_list_200_response() ::
  [ {'items', list(openapi_lead_form_response:openapi_lead_form_response()) }
  | {'bookmark', binary() }
  ].


openapi_lead_forms_list_200_response() ->
    openapi_lead_forms_list_200_response([]).

openapi_lead_forms_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_lead_form_response:openapi_lead_form_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

