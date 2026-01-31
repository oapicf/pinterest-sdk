package org.openapitools.server.model


/**
 * = RecordCounts =
 *
 * Record processing counts
 *
 * @param invalid Number of invalid records processed for example: ''50''
 * @param processed Number of records processed for example: ''1000''
 * @param valid Number of valid records processed for example: ''950''
*/
final case class RecordCounts (
  invalid: Int,
  processed: Int,
  valid: Int
)

