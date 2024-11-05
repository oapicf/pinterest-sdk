# integrations_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IntegrationsCommerceDel**](integrations_api.md#IntegrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**IntegrationsCommerceGet**](integrations_api.md#IntegrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**IntegrationsCommercePatch**](integrations_api.md#IntegrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**IntegrationsCommercePost**](integrations_api.md#IntegrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**IntegrationsGetById**](integrations_api.md#IntegrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**IntegrationsGetList**](integrations_api.md#IntegrationsGetList) | **GET** /integrations | Get integration metadata list
[**IntegrationsLogsPost**](integrations_api.md#IntegrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.


<a name="IntegrationsCommerceDel"></a>
# **IntegrationsCommerceDel**
> IntegrationsCommerceDel(externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
<a name="IntegrationsCommerceGet"></a>
# **IntegrationsCommerceGet**
> IntegrationMetadata IntegrationsCommerceGet(externalBusinessId)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
<a name="IntegrationsCommercePatch"></a>
# **IntegrationsCommercePatch**
> IntegrationMetadata IntegrationsCommercePatch(externalBusinessId, integrationRequestPatch)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
<a name="IntegrationsCommercePost"></a>
# **IntegrationsCommercePost**
> IntegrationMetadata IntegrationsCommercePost(integrationRequest)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
<a name="IntegrationsGetById"></a>
# **IntegrationsGetById**
> IntegrationRecord IntegrationsGetById(Id_)

Get integration metadata

Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
<a name="IntegrationsGetList"></a>
# **IntegrationsGetList**
> IntegrationsGetList200Response IntegrationsGetList(bookmark, pageSize)

Get integration metadata list

Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
<a name="IntegrationsLogsPost"></a>
# **IntegrationsLogsPost**
> IntegrationLogsSuccessResponse IntegrationsLogsPost(integrationLogsRequest)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
