# resources_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountCountriesGet**](resources_api.md#AdAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**DeliveryMetricsGet**](resources_api.md#DeliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**InterestTargetingOptionsGet**](resources_api.md#InterestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**LeadFormQuestionsGet**](resources_api.md#LeadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
[**MetricsReadyStateGet**](resources_api.md#MetricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**TargetingOptionsGet**](resources_api.md#TargetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options


<a name="AdAccountCountriesGet"></a>
# **AdAccountCountriesGet**
> AdAccountCountriesGet200Response AdAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries
<a name="DeliveryMetricsGet"></a>
# **DeliveryMetricsGet**
> DeliveryMetricsGet200Response DeliveryMetricsGet(reportType)

Get available metrics&#39; definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
<a name="InterestTargetingOptionsGet"></a>
# **InterestTargetingOptionsGet**
> SingleInterestTargetingOption InterestTargetingOptionsGet(interestId)

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
<a name="LeadFormQuestionsGet"></a>
# **LeadFormQuestionsGet**
> LeadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
<a name="MetricsReadyStateGet"></a>
# **MetricsReadyStateGet**
> BookClosed MetricsReadyStateGet(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.
<a name="TargetingOptionsGet"></a>
# **TargetingOptionsGet**
> TodoObjectMapping TargetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp)

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;
