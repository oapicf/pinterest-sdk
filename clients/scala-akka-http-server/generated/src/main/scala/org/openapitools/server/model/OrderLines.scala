package org.openapitools.server.model


/**
 * = OrderLines =
 *
 * Order Line
 *
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param budget Order line budget in micro currency. for example: ''5000000''
 * @param endTime End time. Unix timestamp. for example: ''1461269616''
 * @param id Order line ID. for example: ''2680059592705''
 * @param name Order line name. for example: ''Order Line Name 1''
 * @param paidBudget Order line paid budget in micro currency. for example: ''5000000''
 * @param paidType Order line paid type. for example: ''null''
 * @param purchaseOrderId Purchase order ID. for example: ''PO12345''
 * @param startTime Start time. Unix timestamp. for example: ''1452208622''
 * @param status Order line status. for example: ''null''
 * @param `type` Always \"orderline\". for example: ''orderline''
*/
final case class OrderLines (
  adAccountId: Option[String] = None,
  budget: Option[Double] = None,
  endTime: Option[Double] = None,
  id: Option[String] = None,
  name: Option[String] = None,
  paidBudget: Option[Double] = None,
  paidType: Option[OrderLinePaidType] = None,
  purchaseOrderId: Option[String] = None,
  startTime: Option[Double] = None,
  status: Option[OrderLineStatus] = None,
  `type`: Option[String] = None
)

