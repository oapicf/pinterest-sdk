# conversions_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvertiserDefinedEventsCreate**](conversions_api.md#AdvertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**AdvertiserDefinedEventsDelete**](conversions_api.md#AdvertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**AdvertiserDefinedEventsGet**](conversions_api.md#AdvertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**AdvertiserDefinedEventsUpdate**](conversions_api.md#AdvertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


<a name="AdvertiserDefinedEventsCreate"></a>
# **AdvertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.
<a name="AdvertiserDefinedEventsDelete"></a>
# **AdvertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsDelete(adAccountId, eventNames)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.
<a name="AdvertiserDefinedEventsGet"></a>
# **AdvertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response AdvertiserDefinedEventsGet(adAccountId)

Get advertiser defined events

Get advertiser defined events for the given ad account.
<a name="AdvertiserDefinedEventsUpdate"></a>
# **AdvertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.
