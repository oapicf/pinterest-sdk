
package org.openapitools.client.model


case class BidFloor (
    /* A list of bid floors in micro currency. For example, [100000, 200000] */
    _bidFloors: Option[List[Integer]],
    /* Always the string 'bidfloor' */
    _type: Option[String]
)
object BidFloor {
    def toStringBody(var_bidFloors: Object, var_type: Object) =
        s"""
        | {
        | "bidFloors":$var_bidFloors,"type":$var_type
        | }
        """.stripMargin
}
