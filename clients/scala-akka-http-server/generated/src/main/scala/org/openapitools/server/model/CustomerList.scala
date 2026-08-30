package org.openapitools.server.model


/**
 * @param adAccountId Associated ad account ID. for example: ''549756359984''
 * @param createdTime Creation time. Unix timestamp in seconds. for example: ''1452208622''
 * @param exceptions Customer list errors. for example: ''null''
 * @param id Customer list ID. for example: ''643''
 * @param isNca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. for example: ''null''
 * @param name Customer list name. for example: ''The Glengarry Glen Ross leads''
 * @param numBatches Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. for example: ''2''
 * @param numRemovedUserRecords Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. for example: ''0''
 * @param numUploadedUserRecords Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. for example: ''11''
 * @param status Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. for example: ''PROCESSING''
 * @param `type` Always `customerlist`. for example: ''customerlist''
 * @param updatedTime Last update time. Unix timestamp in seconds. for example: ''1461269616''
*/
final case class CustomerList (
  adAccountId: Option[String] = None,
  createdTime: Option[Double] = None,
  exceptions: Option[Any] = None,
  id: String,
  isNca: Option[Boolean] = None,
  name: String,
  numBatches: Option[Double] = None,
  numRemovedUserRecords: Option[Double] = None,
  numUploadedUserRecords: Option[Double] = None,
  status: Option[CustomerListStatus] = None,
  `type`: Option[String] = None,
  updatedTime: Option[Double] = None
)

