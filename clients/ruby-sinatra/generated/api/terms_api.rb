require 'json'


MyApp.add_route('GET', '/v5/terms/related', {
  "resourcePath" => "/Terms",
  "summary" => "List related terms",
  "nickname" => "terms_related/list",
  "responseClass" => "RelatedTerms",
  "endpoint" => "/terms/related",
  "notes" => "Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.",
  "parameters" => [
    {
      "name" => "terms",
      "description" => "List of input terms.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/terms/suggested', {
  "resourcePath" => "/Terms",
  "summary" => "List suggested terms",
  "nickname" => "terms_suggested/list",
  "responseClass" => "Array<String>",
  "endpoint" => "/terms/suggested",
  "notes" => "Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.",
  "parameters" => [
    {
      "name" => "term",
      "description" => "Input term.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Max suggested terms to return.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "4",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

