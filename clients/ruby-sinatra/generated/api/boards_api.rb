require 'json'


MyApp.add_route('POST', '/v5/boards/{board_id}/sections', {
  "resourcePath" => "/Boards",
  "summary" => "Create board section",
  "nickname" => "board_sections/create",
  "responseClass" => "BoardSection",
  "endpoint" => "/boards/{board_id}/sections",
  "notes" => "Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Create a board section.",
      "dataType" => "BoardSection",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/boards/{board_id}/sections/{section_id}', {
  "resourcePath" => "/Boards",
  "summary" => "Delete board section",
  "nickname" => "board_sections/delete",
  "responseClass" => "void",
  "endpoint" => "/boards/{board_id}/sections/{section_id}",
  "notes" => "Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "section_id",
      "description" => "Unique identifier of a board section.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/boards/{board_id}/sections', {
  "resourcePath" => "/Boards",
  "summary" => "List board sections",
  "nickname" => "board_sections/list",
  "responseClass" => "Paginated",
  "endpoint" => "/boards/{board_id}/sections",
  "notes" => "Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/boards/{board_id}/sections/{section_id}/pins', {
  "resourcePath" => "/Boards",
  "summary" => "List Pins on board section",
  "nickname" => "board_sections/list_pins",
  "responseClass" => "Paginated",
  "endpoint" => "/boards/{board_id}/sections/{section_id}/pins",
  "notes" => "Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "section_id",
      "description" => "Unique identifier of a board section.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/boards/{board_id}/sections/{section_id}', {
  "resourcePath" => "/Boards",
  "summary" => "Update board section",
  "nickname" => "board_sections/update",
  "responseClass" => "BoardSection",
  "endpoint" => "/boards/{board_id}/sections/{section_id}",
  "notes" => "Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "section_id",
      "description" => "Unique identifier of a board section.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Update a board section.",
      "dataType" => "BoardSection",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/boards', {
  "resourcePath" => "/Boards",
  "summary" => "Create board",
  "nickname" => "boards/create",
  "responseClass" => "Board",
  "endpoint" => "/boards",
  "notes" => "Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Create a board using a single board json object.",
      "dataType" => "Board",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/boards/{board_id}', {
  "resourcePath" => "/Boards",
  "summary" => "Delete board",
  "nickname" => "boards/delete",
  "responseClass" => "void",
  "endpoint" => "/boards/{board_id}",
  "notes" => "Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/boards/{board_id}', {
  "resourcePath" => "/Boards",
  "summary" => "Get board",
  "nickname" => "boards/get",
  "responseClass" => "Board",
  "endpoint" => "/boards/{board_id}",
  "notes" => "Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/boards', {
  "resourcePath" => "/Boards",
  "summary" => "List boards",
  "nickname" => "boards/list",
  "responseClass" => "Paginated",
  "endpoint" => "/boards",
  "notes" => "Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "privacy",
      "description" => "Privacy setting for a board.",
      "dataType" => "String",
      "allowableValues" => "[PUBLIC, PROTECTED, SECRET]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/boards/{board_id}/pins', {
  "resourcePath" => "/Boards",
  "summary" => "List Pins on board",
  "nickname" => "boards/list_pins",
  "responseClass" => "Paginated",
  "endpoint" => "/boards/{board_id}/pins",
  "notes" => "Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/boards/{board_id}', {
  "resourcePath" => "/Boards",
  "summary" => "Update board",
  "nickname" => "boards/update",
  "responseClass" => "Board",
  "endpoint" => "/boards/{board_id}",
  "notes" => "Update a board owned by the \"operating user_account\".",
  "parameters" => [
    {
      "name" => "board_id",
      "description" => "Unique identifier of a board.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Update a board.",
      "dataType" => "BoardUpdate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

