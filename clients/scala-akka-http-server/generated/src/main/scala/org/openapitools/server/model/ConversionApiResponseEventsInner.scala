package org.openapitools.server.model


/**
 * @param errorMessage Error message containing more information about why the event failed to be processed. for example: ''null''
 * @param status Whether the event was processed successfully. for example: ''processed''
 * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing. for example: ''null''
*/
final case class ConversionApiResponseEventsInner (
  errorMessage: Option[String] = None,
  status: String,
  warningMessage: Option[String] = None
)

