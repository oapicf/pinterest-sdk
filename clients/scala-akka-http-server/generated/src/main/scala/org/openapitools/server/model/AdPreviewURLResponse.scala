package org.openapitools.server.model


/**
 * = AdPreviewURLResponse =
 *
 * @param url 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19' for example: ''https://ads.pinterest.com/ad-preview/58f1a0e9ab0bd0f99462a0e4c5dd7e8297888c8a36331e88f757abe8f0295d31/''
*/
final case class AdPreviewURLResponse (
  url: Option[String] = None
)

