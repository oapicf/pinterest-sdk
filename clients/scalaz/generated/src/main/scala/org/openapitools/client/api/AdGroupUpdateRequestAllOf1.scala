package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupUpdateRequestAllOf1._

case class AdGroupUpdateRequestAllOf1 (
  /* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. */
  bidMultiplier: Option[BigDecimal],
/* Ad group ID. */
  id: String,
/* <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul> */
  targetingSpecOperations: Option[List[TargetingSpecOperations]])

object AdGroupUpdateRequestAllOf1 {
  import DateTimeCodecs._

  implicit val AdGroupUpdateRequestAllOf1CodecJson: CodecJson[AdGroupUpdateRequestAllOf1] = CodecJson.derive[AdGroupUpdateRequestAllOf1]
  implicit val AdGroupUpdateRequestAllOf1Decoder: EntityDecoder[AdGroupUpdateRequestAllOf1] = jsonOf[AdGroupUpdateRequestAllOf1]
  implicit val AdGroupUpdateRequestAllOf1Encoder: EntityEncoder[AdGroupUpdateRequestAllOf1] = jsonEncoderOf[AdGroupUpdateRequestAllOf1]
}
