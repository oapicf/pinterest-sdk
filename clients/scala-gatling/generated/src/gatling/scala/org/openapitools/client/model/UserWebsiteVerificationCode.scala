
package org.openapitools.client.model


case class UserWebsiteVerificationCode (
    /* Code to check against the user claiming the website */
    _verificationCode: Option[String],
    /* DNS TXT record to check against for the website to be claimed */
    _dnsTxtRecord: Option[String],
    /* Metatag the verification process searchs for the website to be claimed */
    _metatag: Option[String],
    /* File expected to find on the website being claimed */
    _filename: Option[String],
    /* A full html file to upload to the website in order for it to be claimed */
    _fileContent: Option[String]
)
object UserWebsiteVerificationCode {
    def toStringBody(var_verificationCode: Object, var_dnsTxtRecord: Object, var_metatag: Object, var_filename: Object, var_fileContent: Object) =
        s"""
        | {
        | "verificationCode":$var_verificationCode,"dnsTxtRecord":$var_dnsTxtRecord,"metatag":$var_metatag,"filename":$var_filename,"fileContent":$var_fileContent
        | }
        """.stripMargin
}
