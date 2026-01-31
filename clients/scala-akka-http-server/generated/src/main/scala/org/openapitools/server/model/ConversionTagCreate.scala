package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param mdFrequency Metadata ingestion frequency. for example: ''0.6''
 * @param name Conversion tag name. for example: ''ACME Checkout Test Tag''
*/
final case class ConversionTagCreate (
  aemDbEnabled: Option[Boolean] = None,
  aemEnabled: Option[Boolean] = None,
  aemExternalIdEnabled: Option[Boolean] = None,
  aemFnlnEnabled: Option[Boolean] = None,
  aemGeEnabled: Option[Boolean] = None,
  aemLocEnabled: Option[Boolean] = None,
  aemPhEnabled: Option[Boolean] = None,
  mdFrequency: Option[Double] = None,
  name: String
)

