package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param containerId The container ID of the audience for example: ''null''
 * @param urlAdidSha256 The pre-signed URL for SHA256 hashed GAID/IDFA file for example: ''null''
 * @param urlEmailSha256 The pre-signed URL for SHA256 hashed email file for example: ''null''
*/
final case class AppsflyerAudienceSyncCreate (
  containerId: String,
  urlAdidSha256: Option[String] = None,
  urlEmailSha256: Option[String] = None
)

