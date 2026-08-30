package org.openapitools.server.model


/**
 * = OrderLine =
 *
 * @param adAccountId Ad account ID. for example: ''null''
 * @param budget Order line budget in micro currency. for example: ''null''
 * @param campaignIds Associated List of campaign IDs. for example: ''["626735565838"]''
 * @param endTime End time. Unix timestamp. for example: ''null''
 * @param id Order line ID. for example: ''null''
 * @param name Order line name. for example: ''null''
 * @param paidBudget Order line paid budget in micro currency. for example: ''null''
 * @param paidType Order line paid type. for example: ''null''
 * @param purchaseOrderId Purchase order ID. for example: ''null''
 * @param startTime Start time. Unix timestamp. for example: ''null''
 * @param status Order line status. for example: ''null''
 * @param `type` Always \"orderline\". for example: ''null''
*/
final case class OrderLine (
  adAccountId: String,
  budget: Option[Double] = None,
  campaignIds: Seq[String],
  endTime: Option[Double] = None,
  id: String,
  name: Option[String] = None,
  paidBudget: Option[Double] = None,
  paidType: Option[OrderLinePaidType] = None,
  purchaseOrderId: Option[String] = None,
  startTime: Option[Double] = None,
  status: OrderLineStatus,
  `type`: String
)

