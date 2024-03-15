package org.openapitools.server.model


/**
 * @param status Whether the event was processed successfully. for example: ''processed''
 * @param errorMessage Error message containing more information about why the event failed to be processed. for example: ''null''
 * @param warningMessage Warning messages about any fields in the event which are not standard. These are not critical to event processing. for example: ''null''
*/
final case class ConversionApiResponseEventsInner (
  status: String,
  errorMessage: Option[String] = None,
  warningMessage: Option[String] = None
)

