-module(openapi_pins_save_request_create).

-export([encode/1]).

-export_type([openapi_pins_save_request_create/0]).

-type openapi_pins_save_request_create() ::
    #{ 'board_id' => binary(),
       'board_section_id' => binary()
     }.

encode(#{ 'board_id' := BoardId,
          'board_section_id' := BoardSectionId
        }) ->
    #{ 'board_id' => BoardId,
       'board_section_id' => BoardSectionId
     }.
