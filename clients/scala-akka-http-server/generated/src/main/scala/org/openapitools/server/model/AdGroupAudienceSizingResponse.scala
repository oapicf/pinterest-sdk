package org.openapitools.server.model


/**
 * @param audienceSizeLowerBound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. for example: ''100000''
 * @param audienceSizeUpperBound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. for example: ''150000''
*/
final case class AdGroupAudienceSizingResponse (
  audienceSizeLowerBound: Option[Double] = None,
  audienceSizeUpperBound: Option[Double] = None
)

