
# Table `BulkJobData`
(mapped from: BulkJobData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long NOT NULL |  | [**BulkRequestStatus**](BulkRequestStatus.md) |  |  [foreignkey]
**resultUrl** | result_url | text |  | **kotlin.String** | Presigned s3 file url for the bulk request result. |  [optional]
**workloadId** | workload_id | int |  | **kotlin.Int** | Bulk Workload Id. |  [optional]





