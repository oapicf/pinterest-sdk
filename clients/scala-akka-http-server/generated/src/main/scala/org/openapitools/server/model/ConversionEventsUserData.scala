package org.openapitools.server.model


/**
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 *
 * @param ph Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. for example: ''["45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d"]''
 * @param ge Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. for example: ''["0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf"]''
 * @param db Sha256 hashes of user's date of birthday, given as year, month, and day. for example: ''["d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739"]''
 * @param ln Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. for example: ''["7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19"]''
 * @param fn Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. for example: ''["ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2"]''
 * @param ct Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). for example: ''["4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36"]''
 * @param st Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). for example: ''["49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34"]''
 * @param zp Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). for example: ''["fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145"]''
 * @param country Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. for example: ''["9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d"]''
 * @param externalId Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. for example: ''["6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee"]''
 * @param clickId The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. for example: ''dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv''
 * @param partnerId A unique identifier of visitors' information defined by third party partners. e.g RampID for example: ''BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc''
*/
final case class ConversionEventsUserData (
  ph: Option[Seq[String]] = None,
  ge: Option[Seq[String]] = None,
  db: Option[Seq[String]] = None,
  ln: Option[Seq[String]] = None,
  fn: Option[Seq[String]] = None,
  ct: Option[Seq[String]] = None,
  st: Option[Seq[String]] = None,
  zp: Option[Seq[String]] = None,
  country: Option[Seq[String]] = None,
  externalId: Option[Seq[String]] = None,
  clickId: Option[String] = None,
  partnerId: Option[String] = None
)

