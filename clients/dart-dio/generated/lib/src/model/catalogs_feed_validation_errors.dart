//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_validation_errors.g.dart';

/// CatalogsFeedValidationErrors
///
/// Properties:
/// * [ADULT_INVALID] - Some items have invalid adult values.
/// * [ADWORDS_FORMAT_INVALID] - Some adwords links contain too many characters.
/// * [AVAILABILITY_INVALID] - Some items are missing an availability value in their product metadata, those items will not be published.
/// * [BLOCKLISTED_IMAGE_SIGNATURE] - Some items were not published because they don't meet Pinterest's Merchant Guidelines.
/// * [DELIMITER_ERROR] - Your feed includes data with formatting errors.
/// * [DESCRIPTION_MISSING] - Some items are missing a description in their product metadata, those items will not be published.
/// * [DUPLICATE_PRODUCTS] - Some products are duplicated.
/// * [ENCODING_ERROR] - Your feed includes data with an unsupported encoding format.
/// * [FEED_LENGTH_TOO_LONG] - Your feed contains too many items, some items will not be published.
/// * [FEED_TOO_SMALL] - Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
/// * [FETCH_ERROR] - Pinterest couldn't download your feed.
/// * [FETCH_INACTIVE_FEED_ERROR] - Your feed wasn't ingested because it hasn't changed in the previous 90 days.
/// * [IMAGE_LINK_INVALID] - Some image links are formatted incorrectly.
/// * [IMAGE_LINK_LENGTH_TOO_LONG] - Some items have image_link URLs that contain too many characters, so those items will not be published.
/// * [IMAGE_LINK_MISSING] - Some items are missing an image link URL in their product metadata, those items will not be published.
/// * [INTERNAL_SERVICE_ERROR] - We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
/// * [INVALID_DOMAIN] - Some of your product link values don't match the verified domain associated with this account.
/// * [ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE] - Some items' main images can't be found.
/// * [ITEMID_MISSING] - Some items are missing an item id in their product metadata, those items will not be published.
/// * [LINK_FORMAT_INVALID] - Some link values are formatted incorrectly.
/// * [LINK_LENGTH_TOO_LONG] - Some product links contain too many characters, those items will not be published.
/// * [LIST_PRICE_INVALID] - Some items have list price formatting errors in their product metadata, those items will not be published.
/// * [MALFORMED_XML] - Your feed couldn't be validated because the xml file is formatted incorrectly.
/// * [MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED] - Some items exceed the maximum number of items per item group, those items will not be published.
/// * [NO_VERIFIED_DOMAIN] - Your merchant domain needs to be claimed.
/// * [PARSE_LINE_ERROR] - Your feed contains formatting errors for some items.
/// * [PINJOIN_CONTENT_UNSAFE] - Some items were not published because they don't meet Pinterest's Merchant Guidelines.
/// * [PRICE_CANNOT_BE_DETERMINED] - Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
/// * [PRICE_MISSING] - Some products are missing a price, those items will not be published.
/// * [PRODUCT_LINK_MISSING] - Some items are missing a link URL in their product metadata, those items will not be published.
/// * [PRODUCT_PRICE_INVALID] - Some items have price formatting errors in their product metadata, those items will not be published.
/// * [REQUIRED_COLUMNS_MISSING] - Your feed is missing some required column headers.
/// * [TITLE_MISSING] - Some items are missing a title in their product metadata, those items will not be published.
@BuiltValue()
abstract class CatalogsFeedValidationErrors implements Built<CatalogsFeedValidationErrors, CatalogsFeedValidationErrorsBuilder> {
  /// Some items have invalid adult values.
  @BuiltValueField(wireName: r'ADULT_INVALID')
  int? get ADULT_INVALID;

  /// Some adwords links contain too many characters.
  @BuiltValueField(wireName: r'ADWORDS_FORMAT_INVALID')
  int? get ADWORDS_FORMAT_INVALID;

  /// Some items are missing an availability value in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'AVAILABILITY_INVALID')
  int? get AVAILABILITY_INVALID;

  /// Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  @BuiltValueField(wireName: r'BLOCKLISTED_IMAGE_SIGNATURE')
  int? get BLOCKLISTED_IMAGE_SIGNATURE;

  /// Your feed includes data with formatting errors.
  @BuiltValueField(wireName: r'DELIMITER_ERROR')
  int? get DELIMITER_ERROR;

  /// Some items are missing a description in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'DESCRIPTION_MISSING')
  int? get DESCRIPTION_MISSING;

  /// Some products are duplicated.
  @BuiltValueField(wireName: r'DUPLICATE_PRODUCTS')
  int? get DUPLICATE_PRODUCTS;

  /// Your feed includes data with an unsupported encoding format.
  @BuiltValueField(wireName: r'ENCODING_ERROR')
  int? get ENCODING_ERROR;

  /// Your feed contains too many items, some items will not be published.
  @BuiltValueField(wireName: r'FEED_LENGTH_TOO_LONG')
  int? get FEED_LENGTH_TOO_LONG;

  /// Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
  @BuiltValueField(wireName: r'FEED_TOO_SMALL')
  int? get FEED_TOO_SMALL;

  /// Pinterest couldn't download your feed.
  @BuiltValueField(wireName: r'FETCH_ERROR')
  int? get FETCH_ERROR;

  /// Your feed wasn't ingested because it hasn't changed in the previous 90 days.
  @BuiltValueField(wireName: r'FETCH_INACTIVE_FEED_ERROR')
  int? get FETCH_INACTIVE_FEED_ERROR;

  /// Some image links are formatted incorrectly.
  @BuiltValueField(wireName: r'IMAGE_LINK_INVALID')
  int? get IMAGE_LINK_INVALID;

  /// Some items have image_link URLs that contain too many characters, so those items will not be published.
  @BuiltValueField(wireName: r'IMAGE_LINK_LENGTH_TOO_LONG')
  int? get IMAGE_LINK_LENGTH_TOO_LONG;

  /// Some items are missing an image link URL in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'IMAGE_LINK_MISSING')
  int? get IMAGE_LINK_MISSING;

  /// We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  @BuiltValueField(wireName: r'INTERNAL_SERVICE_ERROR')
  int? get INTERNAL_SERVICE_ERROR;

  /// Some of your product link values don't match the verified domain associated with this account.
  @BuiltValueField(wireName: r'INVALID_DOMAIN')
  int? get INVALID_DOMAIN;

  /// Some items' main images can't be found.
  @BuiltValueField(wireName: r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE')
  int? get ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

  /// Some items are missing an item id in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'ITEMID_MISSING')
  int? get ITEMID_MISSING;

  /// Some link values are formatted incorrectly.
  @BuiltValueField(wireName: r'LINK_FORMAT_INVALID')
  int? get LINK_FORMAT_INVALID;

  /// Some product links contain too many characters, those items will not be published.
  @BuiltValueField(wireName: r'LINK_LENGTH_TOO_LONG')
  int? get LINK_LENGTH_TOO_LONG;

  /// Some items have list price formatting errors in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'LIST_PRICE_INVALID')
  int? get LIST_PRICE_INVALID;

  /// Your feed couldn't be validated because the xml file is formatted incorrectly.
  @BuiltValueField(wireName: r'MALFORMED_XML')
  int? get MALFORMED_XML;

  /// Some items exceed the maximum number of items per item group, those items will not be published.
  @BuiltValueField(wireName: r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED')
  int? get MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

  /// Your merchant domain needs to be claimed.
  @BuiltValueField(wireName: r'NO_VERIFIED_DOMAIN')
  int? get NO_VERIFIED_DOMAIN;

  /// Your feed contains formatting errors for some items.
  @BuiltValueField(wireName: r'PARSE_LINE_ERROR')
  int? get PARSE_LINE_ERROR;

  /// Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  @BuiltValueField(wireName: r'PINJOIN_CONTENT_UNSAFE')
  int? get PINJOIN_CONTENT_UNSAFE;

  /// Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  @BuiltValueField(wireName: r'PRICE_CANNOT_BE_DETERMINED')
  int? get PRICE_CANNOT_BE_DETERMINED;

  /// Some products are missing a price, those items will not be published.
  @BuiltValueField(wireName: r'PRICE_MISSING')
  int? get PRICE_MISSING;

  /// Some items are missing a link URL in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'PRODUCT_LINK_MISSING')
  int? get PRODUCT_LINK_MISSING;

  /// Some items have price formatting errors in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'PRODUCT_PRICE_INVALID')
  int? get PRODUCT_PRICE_INVALID;

  /// Your feed is missing some required column headers.
  @BuiltValueField(wireName: r'REQUIRED_COLUMNS_MISSING')
  int? get REQUIRED_COLUMNS_MISSING;

  /// Some items are missing a title in their product metadata, those items will not be published.
  @BuiltValueField(wireName: r'TITLE_MISSING')
  int? get TITLE_MISSING;

  CatalogsFeedValidationErrors._();

  factory CatalogsFeedValidationErrors([void updates(CatalogsFeedValidationErrorsBuilder b)]) = _$CatalogsFeedValidationErrors;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedValidationErrorsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedValidationErrors> get serializer => _$CatalogsFeedValidationErrorsSerializer();
}

class _$CatalogsFeedValidationErrorsSerializer implements PrimitiveSerializer<CatalogsFeedValidationErrors> {
  @override
  final Iterable<Type> types = const [CatalogsFeedValidationErrors, _$CatalogsFeedValidationErrors];

  @override
  final String wireName = r'CatalogsFeedValidationErrors';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedValidationErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ADULT_INVALID != null) {
      yield r'ADULT_INVALID';
      yield serializers.serialize(
        object.ADULT_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.ADWORDS_FORMAT_INVALID != null) {
      yield r'ADWORDS_FORMAT_INVALID';
      yield serializers.serialize(
        object.ADWORDS_FORMAT_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.AVAILABILITY_INVALID != null) {
      yield r'AVAILABILITY_INVALID';
      yield serializers.serialize(
        object.AVAILABILITY_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.BLOCKLISTED_IMAGE_SIGNATURE != null) {
      yield r'BLOCKLISTED_IMAGE_SIGNATURE';
      yield serializers.serialize(
        object.BLOCKLISTED_IMAGE_SIGNATURE,
        specifiedType: const FullType(int),
      );
    }
    if (object.DELIMITER_ERROR != null) {
      yield r'DELIMITER_ERROR';
      yield serializers.serialize(
        object.DELIMITER_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.DESCRIPTION_MISSING != null) {
      yield r'DESCRIPTION_MISSING';
      yield serializers.serialize(
        object.DESCRIPTION_MISSING,
        specifiedType: const FullType(int),
      );
    }
    if (object.DUPLICATE_PRODUCTS != null) {
      yield r'DUPLICATE_PRODUCTS';
      yield serializers.serialize(
        object.DUPLICATE_PRODUCTS,
        specifiedType: const FullType(int),
      );
    }
    if (object.ENCODING_ERROR != null) {
      yield r'ENCODING_ERROR';
      yield serializers.serialize(
        object.ENCODING_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.FEED_LENGTH_TOO_LONG != null) {
      yield r'FEED_LENGTH_TOO_LONG';
      yield serializers.serialize(
        object.FEED_LENGTH_TOO_LONG,
        specifiedType: const FullType(int),
      );
    }
    if (object.FEED_TOO_SMALL != null) {
      yield r'FEED_TOO_SMALL';
      yield serializers.serialize(
        object.FEED_TOO_SMALL,
        specifiedType: const FullType(int),
      );
    }
    if (object.FETCH_ERROR != null) {
      yield r'FETCH_ERROR';
      yield serializers.serialize(
        object.FETCH_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.FETCH_INACTIVE_FEED_ERROR != null) {
      yield r'FETCH_INACTIVE_FEED_ERROR';
      yield serializers.serialize(
        object.FETCH_INACTIVE_FEED_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_LINK_INVALID != null) {
      yield r'IMAGE_LINK_INVALID';
      yield serializers.serialize(
        object.IMAGE_LINK_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_LINK_LENGTH_TOO_LONG != null) {
      yield r'IMAGE_LINK_LENGTH_TOO_LONG';
      yield serializers.serialize(
        object.IMAGE_LINK_LENGTH_TOO_LONG,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_LINK_MISSING != null) {
      yield r'IMAGE_LINK_MISSING';
      yield serializers.serialize(
        object.IMAGE_LINK_MISSING,
        specifiedType: const FullType(int),
      );
    }
    if (object.INTERNAL_SERVICE_ERROR != null) {
      yield r'INTERNAL_SERVICE_ERROR';
      yield serializers.serialize(
        object.INTERNAL_SERVICE_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.INVALID_DOMAIN != null) {
      yield r'INVALID_DOMAIN';
      yield serializers.serialize(
        object.INVALID_DOMAIN,
        specifiedType: const FullType(int),
      );
    }
    if (object.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE != null) {
      yield r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE';
      yield serializers.serialize(
        object.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,
        specifiedType: const FullType(int),
      );
    }
    if (object.ITEMID_MISSING != null) {
      yield r'ITEMID_MISSING';
      yield serializers.serialize(
        object.ITEMID_MISSING,
        specifiedType: const FullType(int),
      );
    }
    if (object.LINK_FORMAT_INVALID != null) {
      yield r'LINK_FORMAT_INVALID';
      yield serializers.serialize(
        object.LINK_FORMAT_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.LINK_LENGTH_TOO_LONG != null) {
      yield r'LINK_LENGTH_TOO_LONG';
      yield serializers.serialize(
        object.LINK_LENGTH_TOO_LONG,
        specifiedType: const FullType(int),
      );
    }
    if (object.LIST_PRICE_INVALID != null) {
      yield r'LIST_PRICE_INVALID';
      yield serializers.serialize(
        object.LIST_PRICE_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.MALFORMED_XML != null) {
      yield r'MALFORMED_XML';
      yield serializers.serialize(
        object.MALFORMED_XML,
        specifiedType: const FullType(int),
      );
    }
    if (object.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED != null) {
      yield r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED';
      yield serializers.serialize(
        object.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,
        specifiedType: const FullType(int),
      );
    }
    if (object.NO_VERIFIED_DOMAIN != null) {
      yield r'NO_VERIFIED_DOMAIN';
      yield serializers.serialize(
        object.NO_VERIFIED_DOMAIN,
        specifiedType: const FullType(int),
      );
    }
    if (object.PARSE_LINE_ERROR != null) {
      yield r'PARSE_LINE_ERROR';
      yield serializers.serialize(
        object.PARSE_LINE_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.PINJOIN_CONTENT_UNSAFE != null) {
      yield r'PINJOIN_CONTENT_UNSAFE';
      yield serializers.serialize(
        object.PINJOIN_CONTENT_UNSAFE,
        specifiedType: const FullType(int),
      );
    }
    if (object.PRICE_CANNOT_BE_DETERMINED != null) {
      yield r'PRICE_CANNOT_BE_DETERMINED';
      yield serializers.serialize(
        object.PRICE_CANNOT_BE_DETERMINED,
        specifiedType: const FullType(int),
      );
    }
    if (object.PRICE_MISSING != null) {
      yield r'PRICE_MISSING';
      yield serializers.serialize(
        object.PRICE_MISSING,
        specifiedType: const FullType(int),
      );
    }
    if (object.PRODUCT_LINK_MISSING != null) {
      yield r'PRODUCT_LINK_MISSING';
      yield serializers.serialize(
        object.PRODUCT_LINK_MISSING,
        specifiedType: const FullType(int),
      );
    }
    if (object.PRODUCT_PRICE_INVALID != null) {
      yield r'PRODUCT_PRICE_INVALID';
      yield serializers.serialize(
        object.PRODUCT_PRICE_INVALID,
        specifiedType: const FullType(int),
      );
    }
    if (object.REQUIRED_COLUMNS_MISSING != null) {
      yield r'REQUIRED_COLUMNS_MISSING';
      yield serializers.serialize(
        object.REQUIRED_COLUMNS_MISSING,
        specifiedType: const FullType(int),
      );
    }
    if (object.TITLE_MISSING != null) {
      yield r'TITLE_MISSING';
      yield serializers.serialize(
        object.TITLE_MISSING,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedValidationErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedValidationErrorsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ADULT_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ADULT_INVALID = valueDes;
          break;
        case r'ADWORDS_FORMAT_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ADWORDS_FORMAT_INVALID = valueDes;
          break;
        case r'AVAILABILITY_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.AVAILABILITY_INVALID = valueDes;
          break;
        case r'BLOCKLISTED_IMAGE_SIGNATURE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.BLOCKLISTED_IMAGE_SIGNATURE = valueDes;
          break;
        case r'DELIMITER_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.DELIMITER_ERROR = valueDes;
          break;
        case r'DESCRIPTION_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.DESCRIPTION_MISSING = valueDes;
          break;
        case r'DUPLICATE_PRODUCTS':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.DUPLICATE_PRODUCTS = valueDes;
          break;
        case r'ENCODING_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ENCODING_ERROR = valueDes;
          break;
        case r'FEED_LENGTH_TOO_LONG':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.FEED_LENGTH_TOO_LONG = valueDes;
          break;
        case r'FEED_TOO_SMALL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.FEED_TOO_SMALL = valueDes;
          break;
        case r'FETCH_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.FETCH_ERROR = valueDes;
          break;
        case r'FETCH_INACTIVE_FEED_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.FETCH_INACTIVE_FEED_ERROR = valueDes;
          break;
        case r'IMAGE_LINK_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_LINK_INVALID = valueDes;
          break;
        case r'IMAGE_LINK_LENGTH_TOO_LONG':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_LINK_LENGTH_TOO_LONG = valueDes;
          break;
        case r'IMAGE_LINK_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_LINK_MISSING = valueDes;
          break;
        case r'INTERNAL_SERVICE_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.INTERNAL_SERVICE_ERROR = valueDes;
          break;
        case r'INVALID_DOMAIN':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.INVALID_DOMAIN = valueDes;
          break;
        case r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = valueDes;
          break;
        case r'ITEMID_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ITEMID_MISSING = valueDes;
          break;
        case r'LINK_FORMAT_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.LINK_FORMAT_INVALID = valueDes;
          break;
        case r'LINK_LENGTH_TOO_LONG':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.LINK_LENGTH_TOO_LONG = valueDes;
          break;
        case r'LIST_PRICE_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.LIST_PRICE_INVALID = valueDes;
          break;
        case r'MALFORMED_XML':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.MALFORMED_XML = valueDes;
          break;
        case r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = valueDes;
          break;
        case r'NO_VERIFIED_DOMAIN':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.NO_VERIFIED_DOMAIN = valueDes;
          break;
        case r'PARSE_LINE_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PARSE_LINE_ERROR = valueDes;
          break;
        case r'PINJOIN_CONTENT_UNSAFE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PINJOIN_CONTENT_UNSAFE = valueDes;
          break;
        case r'PRICE_CANNOT_BE_DETERMINED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PRICE_CANNOT_BE_DETERMINED = valueDes;
          break;
        case r'PRICE_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PRICE_MISSING = valueDes;
          break;
        case r'PRODUCT_LINK_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PRODUCT_LINK_MISSING = valueDes;
          break;
        case r'PRODUCT_PRICE_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PRODUCT_PRICE_INVALID = valueDes;
          break;
        case r'REQUIRED_COLUMNS_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.REQUIRED_COLUMNS_MISSING = valueDes;
          break;
        case r'TITLE_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.TITLE_MISSING = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedValidationErrors deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedValidationErrorsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

