package org.openapitools.server.model


/**
 * = ConversionTagConfigs =
 *
 * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. for example: ''true''
 * @param mdFrequency Metadata ingestion frequency. for example: ''0.6''
 * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. for example: ''true''
 * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. for example: ''true''
 * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. for example: ''true''
 * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. for example: ''true''
 * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. for example: ''true''
*/
final case class ConversionTagConfigs (
  aemEnabled: Option[Boolean] = None,
  mdFrequency: Option[Double] = None,
  aemFnlnEnabled: Option[Boolean] = None,
  aemPhEnabled: Option[Boolean] = None,
  aemGeEnabled: Option[Boolean] = None,
  aemDbEnabled: Option[Boolean] = None,
  aemLocEnabled: Option[Boolean] = None
)

