package org.openapitools.server.model


/**
 * = Conversion MSOT Events =
 *
 * Object containing the MSOT conversion events.
 *
 * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. for example: ''[1451410040]''
 * @param adGroupId The ID of the ad group that was attributed to the conversion event. for example: ''2680060704746''
 * @param attributionModel The attribution model used to attribute the conversion event. for example: ''multi_touch''
 * @param attributionScope Ad event type. for example: ''click''
 * @param attributionScore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. for example: ''0.5''
 * @param campaignId The ID of the campaign that was attributed to the conversion event. for example: ''626736533506''
 * @param currency  for example: ''null''
 * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. for example: ''eventId0001''
 * @param eventName Type of user event. for example: ''add_to_cart''
 * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds. for example: ''1451431341''
 * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms. for example: ''2''
 * @param totalEvents Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p> for example: ''2''
 * @param value Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'. for example: ''123.45''
*/
final case class ConversionMSOTEvents (
  actionTimestamps: Option[Seq[Long]] = None,
  adGroupId: String,
  attributionModel: Option[String] = None,
  attributionScope: String,
  attributionScore: Option[Double] = None,
  campaignId: Option[String] = None,
  currency: Option[Currency] = None,
  eventId: String,
  eventName: String,
  eventTimestamp: Long,
  totalEventTouchpoints: Option[Int] = None,
  totalEvents: Option[Int] = None,
  value: Option[Double] = None
)

