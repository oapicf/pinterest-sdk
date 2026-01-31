package org.openapitools.server.model


/**
 * @param contentType  for example: ''multipart/form-data''
 * @param key  for example: ''uploads/11/aa/22/3:video:203014033110991560:5212123920968240771''
 * @param policy  for example: ''eyJleHBpcmF0aW9uIjoiMj..==''
 * @param xAmzAlgorithm  for example: ''AWS4-HMAC-SHA256''
 * @param xAmzCredential  for example: ''ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request''
 * @param xAmzDate  for example: ''20220127T185143Z''
 * @param xAmzSecurityToken  for example: ''IQoJb3JpZ2luX2VjEJr...==''
 * @param xAmzSignature  for example: ''fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92''
*/
final case class MediaUploadParameters (
  contentType: Option[String] = None,
  key: Option[String] = None,
  policy: Option[String] = None,
  xAmzAlgorithm: Option[String] = None,
  xAmzCredential: Option[String] = None,
  xAmzDate: Option[String] = None,
  xAmzSecurityToken: Option[String] = None,
  xAmzSignature: Option[String] = None
)

