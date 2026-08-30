package org.openapitools.server.model


/**
 * = catalogs_creative_assets_filter_values_map =
 *
 * A map of filter attributes to their available values.
 *
 * @param customLabel0  for example: ''null''
 * @param customLabel1  for example: ''null''
 * @param customLabel2  for example: ''null''
 * @param customLabel3  for example: ''null''
 * @param customLabel4  for example: ''null''
 * @param googleProductCategory0  for example: ''null''
 * @param googleProductCategory1  for example: ''null''
 * @param googleProductCategory2  for example: ''null''
 * @param googleProductCategory3  for example: ''null''
 * @param googleProductCategory4  for example: ''null''
 * @param googleProductCategory5  for example: ''null''
 * @param googleProductCategory6  for example: ''null''
 * @param mediaType  for example: ''null''
*/
final case class CatalogsCreativeAssetsFilterValuesMap (
  customLabel0: Option[Seq[String]] = None,
  customLabel1: Option[Seq[String]] = None,
  customLabel2: Option[Seq[String]] = None,
  customLabel3: Option[Seq[String]] = None,
  customLabel4: Option[Seq[String]] = None,
  googleProductCategory0: Option[Seq[String]] = None,
  googleProductCategory1: Option[Seq[String]] = None,
  googleProductCategory2: Option[Seq[String]] = None,
  googleProductCategory3: Option[Seq[String]] = None,
  googleProductCategory4: Option[Seq[String]] = None,
  googleProductCategory5: Option[Seq[String]] = None,
  googleProductCategory6: Option[Seq[String]] = None,
  mediaType: Option[Seq[MediaType]] = None
)

