package org.openapitools.server.model


/**
 * = RecordCounts =
 *
 * @param invalid Number of invalid records processed for example: ''null''
 * @param processed Number of records processed for example: ''null''
 * @param valid Number of valid records processed for example: ''null''
*/
final case class RecordCounts (
  invalid: Int,
  processed: Int,
  valid: Int
)

