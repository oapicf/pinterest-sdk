package org.openapitools.server.model


/**
 * @param existingFilename If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. for example: ''aid-549755814107/ad_group-1099511703602/validated_approvals.csv''
 * @param requestId Unique identifier for this upload session. Must be passed to the process endpoint. for example: ''549755814107-1099511703602-1714300000-abc123''
 * @param uploadUrl Pre-signed S3 PUT URL to upload the reviewed CSV file. for example: ''https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId=...''
*/
final case class DynamicTitlesUploadURL (
  existingFilename: Option[String] = None,
  requestId: String,
  uploadUrl: String
)

