package org.openapitools.server.model


/**
 * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. for example: ''null''
 * @param mdFrequency Metadata ingestion frequency. for example: ''0.6''
 * @param noCodeCapiDomains List of advertiser subdomains configured for NoCodeCAPI calls. for example: ''["https://sub.exampledomain.com"]''
*/
final case class ConversionTagConfigs (
  aemDbEnabled: Option[Boolean] = None,
  aemEnabled: Option[Boolean] = None,
  aemExternalIdEnabled: Option[Boolean] = None,
  aemFnlnEnabled: Option[Boolean] = None,
  aemGeEnabled: Option[Boolean] = None,
  aemLocEnabled: Option[Boolean] = None,
  aemPhEnabled: Option[Boolean] = None,
  mdFrequency: Option[Double] = None,
  noCodeCapiDomains: Option[Seq[String]] = None
)

