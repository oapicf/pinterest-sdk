# conversion_eqs_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionEqsList**](conversion_eqs_api.md#ConversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


<a name="ConversionEqsList"></a>
# **ConversionEqsList**
> EventQualityScore ConversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
