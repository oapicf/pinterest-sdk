package org.openapitools.server.model


/**
 * A single row in a multi-field customer list (v2 format).
 *
 * @param email Email address (plain or hashed with SHA1, SHA256, or MD5). for example: ''null''
 * @param externalId External ID identifier (not hashed). for example: ''null''
 * @param hashedPhoneNumber Hashed phone number (hashed with SHA1, SHA256, or MD5). for example: ''null''
 * @param hashedPinnerId Hashed pinner ID (hashed with SHA1, SHA256, or MD5). for example: ''null''
 * @param ipAddress IP address (not hashed). for example: ''null''
 * @param liverampEnvelope LiveRamp envelope identifier (Base64-encoded, not hashed). for example: ''null''
 * @param maid Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). for example: ''null''
 * @param userAgent User agent string (not hashed). for example: ''null''
*/
final case class CustomerListRecordRow (
  email: Option[String] = None,
  externalId: Option[String] = None,
  hashedPhoneNumber: Option[String] = None,
  hashedPinnerId: Option[String] = None,
  ipAddress: Option[String] = None,
  liverampEnvelope: Option[String] = None,
  maid: Option[String] = None,
  userAgent: Option[String] = None
)

