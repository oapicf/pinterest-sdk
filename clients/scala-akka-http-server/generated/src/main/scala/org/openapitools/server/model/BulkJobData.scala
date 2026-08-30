package org.openapitools.server.model


/**
 * Bulk request result data.
 *
 * @param resultUrl Presigned s3 file url for the bulk request result. for example: ''null''
 * @param status  for example: ''null''
 * @param workloadId Bulk Workload Id. for example: ''null''
*/
final case class BulkJobData (
  resultUrl: Option[String] = None,
  status: BulkRequestStatus,
  workloadId: Option[Int] = None
)

