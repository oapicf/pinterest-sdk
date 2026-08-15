//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedValidationErrors {
  /// Returns a new [CatalogsFeedValidationErrors] instance.
  CatalogsFeedValidationErrors({
    this.ADULT_INVALID,
    this.ADWORDS_FORMAT_INVALID,
    this.AVAILABILITY_INVALID,
    this.BLOCKLISTED_IMAGE_SIGNATURE,
    this.DELIMITER_ERROR,
    this.DESCRIPTION_MISSING,
    this.DUPLICATE_PRODUCTS,
    this.ENCODING_ERROR,
    this.FEED_LENGTH_TOO_LONG,
    this.FEED_TOO_SMALL,
    this.FETCH_ERROR,
    this.FETCH_INACTIVE_FEED_ERROR,
    this.IMAGE_LINK_INVALID,
    this.IMAGE_LINK_LENGTH_TOO_LONG,
    this.IMAGE_LINK_MISSING,
    this.INTERNAL_SERVICE_ERROR,
    this.INVALID_DOMAIN,
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,
    this.ITEMID_MISSING,
    this.LINK_FORMAT_INVALID,
    this.LINK_LENGTH_TOO_LONG,
    this.LIST_PRICE_INVALID,
    this.MALFORMED_XML,
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,
    this.NO_VERIFIED_DOMAIN,
    this.PARSE_LINE_ERROR,
    this.PINJOIN_CONTENT_UNSAFE,
    this.PRICE_CANNOT_BE_DETERMINED,
    this.PRICE_MISSING,
    this.PRODUCT_LINK_MISSING,
    this.PRODUCT_PRICE_INVALID,
    this.REQUIRED_COLUMNS_MISSING,
    this.TITLE_MISSING,
  });

  /// Some items have invalid adult values.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ADULT_INVALID;

  /// Some adwords links contain too many characters.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ADWORDS_FORMAT_INVALID;

  /// Some items are missing an availability value in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? AVAILABILITY_INVALID;

  /// Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? BLOCKLISTED_IMAGE_SIGNATURE;

  /// Your feed includes data with formatting errors.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? DELIMITER_ERROR;

  /// Some items are missing a description in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? DESCRIPTION_MISSING;

  /// Some products are duplicated.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? DUPLICATE_PRODUCTS;

  /// Your feed includes data with an unsupported encoding format.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ENCODING_ERROR;

  /// Your feed contains too many items, some items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? FEED_LENGTH_TOO_LONG;

  /// Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? FEED_TOO_SMALL;

  /// Pinterest couldn't download your feed.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? FETCH_ERROR;

  /// Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? FETCH_INACTIVE_FEED_ERROR;

  /// Some image links are formatted incorrectly.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_LINK_INVALID;

  /// Some items have image_link URLs that contain too many characters, so those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_LINK_LENGTH_TOO_LONG;

  /// Some items are missing an image link URL in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_LINK_MISSING;

  /// We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? INTERNAL_SERVICE_ERROR;

  /// Some of your product link values don't match the verified domain associated with this account.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? INVALID_DOMAIN;

  /// Some items' main images can't be found.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

  /// Some items are missing an item id in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ITEMID_MISSING;

  /// Some link values are formatted incorrectly.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? LINK_FORMAT_INVALID;

  /// Some product links contain too many characters, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? LINK_LENGTH_TOO_LONG;

  /// Some items have list price formatting errors in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? LIST_PRICE_INVALID;

  /// Your feed couldn't be validated because the xml file is formatted incorrectly.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? MALFORMED_XML;

  /// Some items exceed the maximum number of items per item group, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

  /// Your merchant domain needs to be claimed.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? NO_VERIFIED_DOMAIN;

  /// Your feed contains formatting errors for some items.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PARSE_LINE_ERROR;

  /// Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PINJOIN_CONTENT_UNSAFE;

  /// Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PRICE_CANNOT_BE_DETERMINED;

  /// Some products are missing a price, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PRICE_MISSING;

  /// Some items are missing a link URL in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PRODUCT_LINK_MISSING;

  /// Some items have price formatting errors in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PRODUCT_PRICE_INVALID;

  /// Your feed is missing some required column headers.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? REQUIRED_COLUMNS_MISSING;

  /// Some items are missing a title in their product metadata, those items will not be published.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? TITLE_MISSING;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedValidationErrors &&
    other.ADULT_INVALID == ADULT_INVALID &&
    other.ADWORDS_FORMAT_INVALID == ADWORDS_FORMAT_INVALID &&
    other.AVAILABILITY_INVALID == AVAILABILITY_INVALID &&
    other.BLOCKLISTED_IMAGE_SIGNATURE == BLOCKLISTED_IMAGE_SIGNATURE &&
    other.DELIMITER_ERROR == DELIMITER_ERROR &&
    other.DESCRIPTION_MISSING == DESCRIPTION_MISSING &&
    other.DUPLICATE_PRODUCTS == DUPLICATE_PRODUCTS &&
    other.ENCODING_ERROR == ENCODING_ERROR &&
    other.FEED_LENGTH_TOO_LONG == FEED_LENGTH_TOO_LONG &&
    other.FEED_TOO_SMALL == FEED_TOO_SMALL &&
    other.FETCH_ERROR == FETCH_ERROR &&
    other.FETCH_INACTIVE_FEED_ERROR == FETCH_INACTIVE_FEED_ERROR &&
    other.IMAGE_LINK_INVALID == IMAGE_LINK_INVALID &&
    other.IMAGE_LINK_LENGTH_TOO_LONG == IMAGE_LINK_LENGTH_TOO_LONG &&
    other.IMAGE_LINK_MISSING == IMAGE_LINK_MISSING &&
    other.INTERNAL_SERVICE_ERROR == INTERNAL_SERVICE_ERROR &&
    other.INVALID_DOMAIN == INVALID_DOMAIN &&
    other.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE == ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE &&
    other.ITEMID_MISSING == ITEMID_MISSING &&
    other.LINK_FORMAT_INVALID == LINK_FORMAT_INVALID &&
    other.LINK_LENGTH_TOO_LONG == LINK_LENGTH_TOO_LONG &&
    other.LIST_PRICE_INVALID == LIST_PRICE_INVALID &&
    other.MALFORMED_XML == MALFORMED_XML &&
    other.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED == MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED &&
    other.NO_VERIFIED_DOMAIN == NO_VERIFIED_DOMAIN &&
    other.PARSE_LINE_ERROR == PARSE_LINE_ERROR &&
    other.PINJOIN_CONTENT_UNSAFE == PINJOIN_CONTENT_UNSAFE &&
    other.PRICE_CANNOT_BE_DETERMINED == PRICE_CANNOT_BE_DETERMINED &&
    other.PRICE_MISSING == PRICE_MISSING &&
    other.PRODUCT_LINK_MISSING == PRODUCT_LINK_MISSING &&
    other.PRODUCT_PRICE_INVALID == PRODUCT_PRICE_INVALID &&
    other.REQUIRED_COLUMNS_MISSING == REQUIRED_COLUMNS_MISSING &&
    other.TITLE_MISSING == TITLE_MISSING;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ADULT_INVALID == null ? 0 : ADULT_INVALID!.hashCode) +
    (ADWORDS_FORMAT_INVALID == null ? 0 : ADWORDS_FORMAT_INVALID!.hashCode) +
    (AVAILABILITY_INVALID == null ? 0 : AVAILABILITY_INVALID!.hashCode) +
    (BLOCKLISTED_IMAGE_SIGNATURE == null ? 0 : BLOCKLISTED_IMAGE_SIGNATURE!.hashCode) +
    (DELIMITER_ERROR == null ? 0 : DELIMITER_ERROR!.hashCode) +
    (DESCRIPTION_MISSING == null ? 0 : DESCRIPTION_MISSING!.hashCode) +
    (DUPLICATE_PRODUCTS == null ? 0 : DUPLICATE_PRODUCTS!.hashCode) +
    (ENCODING_ERROR == null ? 0 : ENCODING_ERROR!.hashCode) +
    (FEED_LENGTH_TOO_LONG == null ? 0 : FEED_LENGTH_TOO_LONG!.hashCode) +
    (FEED_TOO_SMALL == null ? 0 : FEED_TOO_SMALL!.hashCode) +
    (FETCH_ERROR == null ? 0 : FETCH_ERROR!.hashCode) +
    (FETCH_INACTIVE_FEED_ERROR == null ? 0 : FETCH_INACTIVE_FEED_ERROR!.hashCode) +
    (IMAGE_LINK_INVALID == null ? 0 : IMAGE_LINK_INVALID!.hashCode) +
    (IMAGE_LINK_LENGTH_TOO_LONG == null ? 0 : IMAGE_LINK_LENGTH_TOO_LONG!.hashCode) +
    (IMAGE_LINK_MISSING == null ? 0 : IMAGE_LINK_MISSING!.hashCode) +
    (INTERNAL_SERVICE_ERROR == null ? 0 : INTERNAL_SERVICE_ERROR!.hashCode) +
    (INVALID_DOMAIN == null ? 0 : INVALID_DOMAIN!.hashCode) +
    (ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE == null ? 0 : ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE!.hashCode) +
    (ITEMID_MISSING == null ? 0 : ITEMID_MISSING!.hashCode) +
    (LINK_FORMAT_INVALID == null ? 0 : LINK_FORMAT_INVALID!.hashCode) +
    (LINK_LENGTH_TOO_LONG == null ? 0 : LINK_LENGTH_TOO_LONG!.hashCode) +
    (LIST_PRICE_INVALID == null ? 0 : LIST_PRICE_INVALID!.hashCode) +
    (MALFORMED_XML == null ? 0 : MALFORMED_XML!.hashCode) +
    (MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED == null ? 0 : MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED!.hashCode) +
    (NO_VERIFIED_DOMAIN == null ? 0 : NO_VERIFIED_DOMAIN!.hashCode) +
    (PARSE_LINE_ERROR == null ? 0 : PARSE_LINE_ERROR!.hashCode) +
    (PINJOIN_CONTENT_UNSAFE == null ? 0 : PINJOIN_CONTENT_UNSAFE!.hashCode) +
    (PRICE_CANNOT_BE_DETERMINED == null ? 0 : PRICE_CANNOT_BE_DETERMINED!.hashCode) +
    (PRICE_MISSING == null ? 0 : PRICE_MISSING!.hashCode) +
    (PRODUCT_LINK_MISSING == null ? 0 : PRODUCT_LINK_MISSING!.hashCode) +
    (PRODUCT_PRICE_INVALID == null ? 0 : PRODUCT_PRICE_INVALID!.hashCode) +
    (REQUIRED_COLUMNS_MISSING == null ? 0 : REQUIRED_COLUMNS_MISSING!.hashCode) +
    (TITLE_MISSING == null ? 0 : TITLE_MISSING!.hashCode);

  @override
  String toString() => 'CatalogsFeedValidationErrors[ADULT_INVALID=$ADULT_INVALID, ADWORDS_FORMAT_INVALID=$ADWORDS_FORMAT_INVALID, AVAILABILITY_INVALID=$AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE=$BLOCKLISTED_IMAGE_SIGNATURE, DELIMITER_ERROR=$DELIMITER_ERROR, DESCRIPTION_MISSING=$DESCRIPTION_MISSING, DUPLICATE_PRODUCTS=$DUPLICATE_PRODUCTS, ENCODING_ERROR=$ENCODING_ERROR, FEED_LENGTH_TOO_LONG=$FEED_LENGTH_TOO_LONG, FEED_TOO_SMALL=$FEED_TOO_SMALL, FETCH_ERROR=$FETCH_ERROR, FETCH_INACTIVE_FEED_ERROR=$FETCH_INACTIVE_FEED_ERROR, IMAGE_LINK_INVALID=$IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG=$IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING=$IMAGE_LINK_MISSING, INTERNAL_SERVICE_ERROR=$INTERNAL_SERVICE_ERROR, INVALID_DOMAIN=$INVALID_DOMAIN, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE=$ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING=$ITEMID_MISSING, LINK_FORMAT_INVALID=$LINK_FORMAT_INVALID, LINK_LENGTH_TOO_LONG=$LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID=$LIST_PRICE_INVALID, MALFORMED_XML=$MALFORMED_XML, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED=$MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, NO_VERIFIED_DOMAIN=$NO_VERIFIED_DOMAIN, PARSE_LINE_ERROR=$PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE=$PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED=$PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING=$PRICE_MISSING, PRODUCT_LINK_MISSING=$PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID=$PRODUCT_PRICE_INVALID, REQUIRED_COLUMNS_MISSING=$REQUIRED_COLUMNS_MISSING, TITLE_MISSING=$TITLE_MISSING]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ADULT_INVALID != null) {
      json[r'ADULT_INVALID'] = this.ADULT_INVALID;
    } else {
      json[r'ADULT_INVALID'] = null;
    }
    if (this.ADWORDS_FORMAT_INVALID != null) {
      json[r'ADWORDS_FORMAT_INVALID'] = this.ADWORDS_FORMAT_INVALID;
    } else {
      json[r'ADWORDS_FORMAT_INVALID'] = null;
    }
    if (this.AVAILABILITY_INVALID != null) {
      json[r'AVAILABILITY_INVALID'] = this.AVAILABILITY_INVALID;
    } else {
      json[r'AVAILABILITY_INVALID'] = null;
    }
    if (this.BLOCKLISTED_IMAGE_SIGNATURE != null) {
      json[r'BLOCKLISTED_IMAGE_SIGNATURE'] = this.BLOCKLISTED_IMAGE_SIGNATURE;
    } else {
      json[r'BLOCKLISTED_IMAGE_SIGNATURE'] = null;
    }
    if (this.DELIMITER_ERROR != null) {
      json[r'DELIMITER_ERROR'] = this.DELIMITER_ERROR;
    } else {
      json[r'DELIMITER_ERROR'] = null;
    }
    if (this.DESCRIPTION_MISSING != null) {
      json[r'DESCRIPTION_MISSING'] = this.DESCRIPTION_MISSING;
    } else {
      json[r'DESCRIPTION_MISSING'] = null;
    }
    if (this.DUPLICATE_PRODUCTS != null) {
      json[r'DUPLICATE_PRODUCTS'] = this.DUPLICATE_PRODUCTS;
    } else {
      json[r'DUPLICATE_PRODUCTS'] = null;
    }
    if (this.ENCODING_ERROR != null) {
      json[r'ENCODING_ERROR'] = this.ENCODING_ERROR;
    } else {
      json[r'ENCODING_ERROR'] = null;
    }
    if (this.FEED_LENGTH_TOO_LONG != null) {
      json[r'FEED_LENGTH_TOO_LONG'] = this.FEED_LENGTH_TOO_LONG;
    } else {
      json[r'FEED_LENGTH_TOO_LONG'] = null;
    }
    if (this.FEED_TOO_SMALL != null) {
      json[r'FEED_TOO_SMALL'] = this.FEED_TOO_SMALL;
    } else {
      json[r'FEED_TOO_SMALL'] = null;
    }
    if (this.FETCH_ERROR != null) {
      json[r'FETCH_ERROR'] = this.FETCH_ERROR;
    } else {
      json[r'FETCH_ERROR'] = null;
    }
    if (this.FETCH_INACTIVE_FEED_ERROR != null) {
      json[r'FETCH_INACTIVE_FEED_ERROR'] = this.FETCH_INACTIVE_FEED_ERROR;
    } else {
      json[r'FETCH_INACTIVE_FEED_ERROR'] = null;
    }
    if (this.IMAGE_LINK_INVALID != null) {
      json[r'IMAGE_LINK_INVALID'] = this.IMAGE_LINK_INVALID;
    } else {
      json[r'IMAGE_LINK_INVALID'] = null;
    }
    if (this.IMAGE_LINK_LENGTH_TOO_LONG != null) {
      json[r'IMAGE_LINK_LENGTH_TOO_LONG'] = this.IMAGE_LINK_LENGTH_TOO_LONG;
    } else {
      json[r'IMAGE_LINK_LENGTH_TOO_LONG'] = null;
    }
    if (this.IMAGE_LINK_MISSING != null) {
      json[r'IMAGE_LINK_MISSING'] = this.IMAGE_LINK_MISSING;
    } else {
      json[r'IMAGE_LINK_MISSING'] = null;
    }
    if (this.INTERNAL_SERVICE_ERROR != null) {
      json[r'INTERNAL_SERVICE_ERROR'] = this.INTERNAL_SERVICE_ERROR;
    } else {
      json[r'INTERNAL_SERVICE_ERROR'] = null;
    }
    if (this.INVALID_DOMAIN != null) {
      json[r'INVALID_DOMAIN'] = this.INVALID_DOMAIN;
    } else {
      json[r'INVALID_DOMAIN'] = null;
    }
    if (this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE != null) {
      json[r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE'] = this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    } else {
      json[r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE'] = null;
    }
    if (this.ITEMID_MISSING != null) {
      json[r'ITEMID_MISSING'] = this.ITEMID_MISSING;
    } else {
      json[r'ITEMID_MISSING'] = null;
    }
    if (this.LINK_FORMAT_INVALID != null) {
      json[r'LINK_FORMAT_INVALID'] = this.LINK_FORMAT_INVALID;
    } else {
      json[r'LINK_FORMAT_INVALID'] = null;
    }
    if (this.LINK_LENGTH_TOO_LONG != null) {
      json[r'LINK_LENGTH_TOO_LONG'] = this.LINK_LENGTH_TOO_LONG;
    } else {
      json[r'LINK_LENGTH_TOO_LONG'] = null;
    }
    if (this.LIST_PRICE_INVALID != null) {
      json[r'LIST_PRICE_INVALID'] = this.LIST_PRICE_INVALID;
    } else {
      json[r'LIST_PRICE_INVALID'] = null;
    }
    if (this.MALFORMED_XML != null) {
      json[r'MALFORMED_XML'] = this.MALFORMED_XML;
    } else {
      json[r'MALFORMED_XML'] = null;
    }
    if (this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED != null) {
      json[r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED'] = this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    } else {
      json[r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED'] = null;
    }
    if (this.NO_VERIFIED_DOMAIN != null) {
      json[r'NO_VERIFIED_DOMAIN'] = this.NO_VERIFIED_DOMAIN;
    } else {
      json[r'NO_VERIFIED_DOMAIN'] = null;
    }
    if (this.PARSE_LINE_ERROR != null) {
      json[r'PARSE_LINE_ERROR'] = this.PARSE_LINE_ERROR;
    } else {
      json[r'PARSE_LINE_ERROR'] = null;
    }
    if (this.PINJOIN_CONTENT_UNSAFE != null) {
      json[r'PINJOIN_CONTENT_UNSAFE'] = this.PINJOIN_CONTENT_UNSAFE;
    } else {
      json[r'PINJOIN_CONTENT_UNSAFE'] = null;
    }
    if (this.PRICE_CANNOT_BE_DETERMINED != null) {
      json[r'PRICE_CANNOT_BE_DETERMINED'] = this.PRICE_CANNOT_BE_DETERMINED;
    } else {
      json[r'PRICE_CANNOT_BE_DETERMINED'] = null;
    }
    if (this.PRICE_MISSING != null) {
      json[r'PRICE_MISSING'] = this.PRICE_MISSING;
    } else {
      json[r'PRICE_MISSING'] = null;
    }
    if (this.PRODUCT_LINK_MISSING != null) {
      json[r'PRODUCT_LINK_MISSING'] = this.PRODUCT_LINK_MISSING;
    } else {
      json[r'PRODUCT_LINK_MISSING'] = null;
    }
    if (this.PRODUCT_PRICE_INVALID != null) {
      json[r'PRODUCT_PRICE_INVALID'] = this.PRODUCT_PRICE_INVALID;
    } else {
      json[r'PRODUCT_PRICE_INVALID'] = null;
    }
    if (this.REQUIRED_COLUMNS_MISSING != null) {
      json[r'REQUIRED_COLUMNS_MISSING'] = this.REQUIRED_COLUMNS_MISSING;
    } else {
      json[r'REQUIRED_COLUMNS_MISSING'] = null;
    }
    if (this.TITLE_MISSING != null) {
      json[r'TITLE_MISSING'] = this.TITLE_MISSING;
    } else {
      json[r'TITLE_MISSING'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsFeedValidationErrors] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedValidationErrors? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsFeedValidationErrors[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsFeedValidationErrors[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsFeedValidationErrors(
        ADULT_INVALID: mapValueOfType<int>(json, r'ADULT_INVALID'),
        ADWORDS_FORMAT_INVALID: mapValueOfType<int>(json, r'ADWORDS_FORMAT_INVALID'),
        AVAILABILITY_INVALID: mapValueOfType<int>(json, r'AVAILABILITY_INVALID'),
        BLOCKLISTED_IMAGE_SIGNATURE: mapValueOfType<int>(json, r'BLOCKLISTED_IMAGE_SIGNATURE'),
        DELIMITER_ERROR: mapValueOfType<int>(json, r'DELIMITER_ERROR'),
        DESCRIPTION_MISSING: mapValueOfType<int>(json, r'DESCRIPTION_MISSING'),
        DUPLICATE_PRODUCTS: mapValueOfType<int>(json, r'DUPLICATE_PRODUCTS'),
        ENCODING_ERROR: mapValueOfType<int>(json, r'ENCODING_ERROR'),
        FEED_LENGTH_TOO_LONG: mapValueOfType<int>(json, r'FEED_LENGTH_TOO_LONG'),
        FEED_TOO_SMALL: mapValueOfType<int>(json, r'FEED_TOO_SMALL'),
        FETCH_ERROR: mapValueOfType<int>(json, r'FETCH_ERROR'),
        FETCH_INACTIVE_FEED_ERROR: mapValueOfType<int>(json, r'FETCH_INACTIVE_FEED_ERROR'),
        IMAGE_LINK_INVALID: mapValueOfType<int>(json, r'IMAGE_LINK_INVALID'),
        IMAGE_LINK_LENGTH_TOO_LONG: mapValueOfType<int>(json, r'IMAGE_LINK_LENGTH_TOO_LONG'),
        IMAGE_LINK_MISSING: mapValueOfType<int>(json, r'IMAGE_LINK_MISSING'),
        INTERNAL_SERVICE_ERROR: mapValueOfType<int>(json, r'INTERNAL_SERVICE_ERROR'),
        INVALID_DOMAIN: mapValueOfType<int>(json, r'INVALID_DOMAIN'),
        ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: mapValueOfType<int>(json, r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE'),
        ITEMID_MISSING: mapValueOfType<int>(json, r'ITEMID_MISSING'),
        LINK_FORMAT_INVALID: mapValueOfType<int>(json, r'LINK_FORMAT_INVALID'),
        LINK_LENGTH_TOO_LONG: mapValueOfType<int>(json, r'LINK_LENGTH_TOO_LONG'),
        LIST_PRICE_INVALID: mapValueOfType<int>(json, r'LIST_PRICE_INVALID'),
        MALFORMED_XML: mapValueOfType<int>(json, r'MALFORMED_XML'),
        MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: mapValueOfType<int>(json, r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED'),
        NO_VERIFIED_DOMAIN: mapValueOfType<int>(json, r'NO_VERIFIED_DOMAIN'),
        PARSE_LINE_ERROR: mapValueOfType<int>(json, r'PARSE_LINE_ERROR'),
        PINJOIN_CONTENT_UNSAFE: mapValueOfType<int>(json, r'PINJOIN_CONTENT_UNSAFE'),
        PRICE_CANNOT_BE_DETERMINED: mapValueOfType<int>(json, r'PRICE_CANNOT_BE_DETERMINED'),
        PRICE_MISSING: mapValueOfType<int>(json, r'PRICE_MISSING'),
        PRODUCT_LINK_MISSING: mapValueOfType<int>(json, r'PRODUCT_LINK_MISSING'),
        PRODUCT_PRICE_INVALID: mapValueOfType<int>(json, r'PRODUCT_PRICE_INVALID'),
        REQUIRED_COLUMNS_MISSING: mapValueOfType<int>(json, r'REQUIRED_COLUMNS_MISSING'),
        TITLE_MISSING: mapValueOfType<int>(json, r'TITLE_MISSING'),
      );
    }
    return null;
  }

  static List<CatalogsFeedValidationErrors> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedValidationErrors>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedValidationErrors.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedValidationErrors> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedValidationErrors>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedValidationErrors.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedValidationErrors-objects as value to a dart map
  static Map<String, List<CatalogsFeedValidationErrors>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedValidationErrors>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedValidationErrors.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

