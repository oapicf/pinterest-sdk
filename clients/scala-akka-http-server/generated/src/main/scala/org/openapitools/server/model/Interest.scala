package org.openapitools.server.model


/**
 * = Interest =
 *
 * @param canonicalUrl  for example: ''null''
 * @param id  for example: ''903972677830''
 * @param key  for example: ''man cave''
 * @param name  for example: ''Man cave''
*/
final case class Interest (
  canonicalUrl: Option[String] = None,
  id: Option[String] = None,
  key: Option[String] = None,
  name: Option[String] = None
)

