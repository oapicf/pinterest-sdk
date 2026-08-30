package org.openapitools.server.model


/**
 * Salesforce account item with billing and terms information.
 *
 * @param addresses Address information that is associated with this account. for example: ''null''
 * @param id Salesforce id for billto_info for example: ''0011N00001LW8kAQAT''
 * @param ioTerms Salesforce text for IO Terms and Conditions for example: ''The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.''
 * @param ioTermsId Salesforce id for IO Terms and Conditions for example: ''a2S1N000000bKHgUAM''
 * @param ioType Insertion Order Type - Pinterest Paper or Agency Paper for example: ''Pinterest Paper''
 * @param rowTerms Salesforce text for Rest of the World Terms and Conditions for example: ''  The IO is governed by the terms available at

https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement''
 * @param rowTermsId Salesforce id for Rest of the World Terms and Conditions for example: ''a2S1N000000bKHhUAM''
 * @param usTerms Salesforce text for US Terms and Conditions for example: ''This Insertion Order ("IO") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.''
 * @param usTermsId Salesforce id for US Terms and Conditions for example: ''a2S1N000000bKIOUA2''
*/
final case class SSIOAccountItem (
  addresses: Option[Seq[SSIOAccountAddress]] = None,
  id: Option[String] = None,
  ioTerms: Option[String] = None,
  ioTermsId: Option[String] = None,
  ioType: Option[String] = None,
  rowTerms: Option[String] = None,
  rowTermsId: Option[String] = None,
  usTerms: Option[String] = None,
  usTermsId: Option[String] = None
)

