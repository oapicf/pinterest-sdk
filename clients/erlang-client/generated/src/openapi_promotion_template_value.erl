-module(openapi_promotion_template_value).

-export([encode/1]).

-export_type([openapi_promotion_template_value/0]).

-type openapi_promotion_template_value() ::
    #{ 'amount' => integer(),
       'currency_code' => openapi_currency:openapi_currency(),
       'custom_text' => binary(),
       'percent' => integer()
     }.

encode(#{ 'amount' := Amount,
          'currency_code' := CurrencyCode,
          'custom_text' := CustomText,
          'percent' := Percent
        }) ->
    #{ 'amount' => Amount,
       'currency_code' => CurrencyCode,
       'custom_text' => CustomText,
       'percent' => Percent
     }.
