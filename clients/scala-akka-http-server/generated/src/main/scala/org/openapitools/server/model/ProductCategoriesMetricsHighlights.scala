package org.openapitools.server.model


/**
 * Key performance metrics highlights for this product category
 *
 * @param engagement Engagement metric value for example: ''null''
 * @param outboundClicks Number of outbound clicks for example: ''null''
 * @param pinSaves Number of pin saves for example: ''null''
*/
final case class ProductCategoriesMetricsHighlights (
  engagement: Option[InnerProductCategoriesMetricsHighlights] = None,
  outboundClicks: Option[InnerProductCategoriesMetricsHighlights] = None,
  pinSaves: Option[InnerProductCategoriesMetricsHighlights] = None
)

