
package org.openapitools.client.model


case class UserWebsiteVerificationCode (
    /* DNS TXT record to check against for the website to be claimed */
    _dnsTxtRecord: Option[String],
    /* A full html file to upload to the website in order for it to be claimed */
    _fileContent: Option[String],
    /* File expected to find on the website being claimed */
    _filename: Option[String],
    /* Metatag the verification process searchs for the website to be claimed */
    _metatag: Option[String],
    /* Code to check against the user claiming the website */
    _verificationCode: Option[String]
)
object UserWebsiteVerificationCode {
    def toStringBody(var_dnsTxtRecord: Object, var_fileContent: Object, var_filename: Object, var_metatag: Object, var_verificationCode: Object) =
        s"""
        | {
        | "dnsTxtRecord":$var_dnsTxtRecord,"fileContent":$var_fileContent,"filename":$var_filename,"metatag":$var_metatag,"verificationCode":$var_verificationCode
        | }
        """.stripMargin
}
