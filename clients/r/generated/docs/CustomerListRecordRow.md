# openapi::CustomerListRecordRow

A single row in a multi-field customer list (v2 format).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **character** | Email address (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**external_id** | **character** | External ID identifier (not hashed). | [optional] 
**hashed_phone_number** | **character** | Hashed phone number (hashed with SHA1, SHA256, or MD5). | [optional] 
**hashed_pinner_id** | **character** | Hashed pinner ID (hashed with SHA1, SHA256, or MD5). | [optional] 
**ip_address** | **character** | IP address (not hashed). | [optional] 
**liveramp_envelope** | **character** | LiveRamp envelope identifier (Base64-encoded, not hashed). | [optional] 
**maid** | **character** | Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**user_agent** | **character** | User agent string (not hashed). | [optional] 


