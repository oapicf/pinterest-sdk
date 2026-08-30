//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_ingestion_errors.g.dart';

/// CatalogsFeedIngestionErrors
///
/// Properties:
/// * [ACCOUNT_FLAGGED] - We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
/// * [FETCH_GOOGLE_SHEET_NOT_SHARED] - Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
/// * [IMAGE_FILE_NOT_ACCESSIBLE] - Image files are unreadable. Please upload new files to continue.
/// * [IMAGE_FILE_NOT_FOUND] - Image files are unreadable. Please upload new files to continue.
/// * [IMAGE_INVALID_FILE] - Image files are unreadable. Please upload new files to continue.
/// * [IMAGE_LEVEL_INTERNAL_ERROR] - We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
/// * [IMAGE_MALFORMED_URL] - Image files are unreadable. Please check your link and upload new files to continue.
/// * [LARGE_PRODUCT_COUNT_DECREASE] - The product count has decreased by more than 99% compared to the last successful ingestion.
/// * [LINE_LEVEL_INTERNAL_ERROR] - We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
@BuiltValue()
abstract class CatalogsFeedIngestionErrors implements Built<CatalogsFeedIngestionErrors, CatalogsFeedIngestionErrorsBuilder> {
  /// We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
  @BuiltValueField(wireName: r'ACCOUNT_FLAGGED')
  int? get ACCOUNT_FLAGGED;

  /// Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
  @BuiltValueField(wireName: r'FETCH_GOOGLE_SHEET_NOT_SHARED')
  int? get FETCH_GOOGLE_SHEET_NOT_SHARED;

  /// Image files are unreadable. Please upload new files to continue.
  @BuiltValueField(wireName: r'IMAGE_FILE_NOT_ACCESSIBLE')
  int? get IMAGE_FILE_NOT_ACCESSIBLE;

  /// Image files are unreadable. Please upload new files to continue.
  @BuiltValueField(wireName: r'IMAGE_FILE_NOT_FOUND')
  int? get IMAGE_FILE_NOT_FOUND;

  /// Image files are unreadable. Please upload new files to continue.
  @BuiltValueField(wireName: r'IMAGE_INVALID_FILE')
  int? get IMAGE_INVALID_FILE;

  /// We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
  @BuiltValueField(wireName: r'IMAGE_LEVEL_INTERNAL_ERROR')
  int? get IMAGE_LEVEL_INTERNAL_ERROR;

  /// Image files are unreadable. Please check your link and upload new files to continue.
  @BuiltValueField(wireName: r'IMAGE_MALFORMED_URL')
  int? get IMAGE_MALFORMED_URL;

  /// The product count has decreased by more than 99% compared to the last successful ingestion.
  @BuiltValueField(wireName: r'LARGE_PRODUCT_COUNT_DECREASE')
  int? get LARGE_PRODUCT_COUNT_DECREASE;

  /// We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
  @BuiltValueField(wireName: r'LINE_LEVEL_INTERNAL_ERROR')
  int? get LINE_LEVEL_INTERNAL_ERROR;

  CatalogsFeedIngestionErrors._();

  factory CatalogsFeedIngestionErrors([void updates(CatalogsFeedIngestionErrorsBuilder b)]) = _$CatalogsFeedIngestionErrors;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedIngestionErrorsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedIngestionErrors> get serializer => _$CatalogsFeedIngestionErrorsSerializer();
}

class _$CatalogsFeedIngestionErrorsSerializer implements PrimitiveSerializer<CatalogsFeedIngestionErrors> {
  @override
  final Iterable<Type> types = const [CatalogsFeedIngestionErrors, _$CatalogsFeedIngestionErrors];

  @override
  final String wireName = r'CatalogsFeedIngestionErrors';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedIngestionErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ACCOUNT_FLAGGED != null) {
      yield r'ACCOUNT_FLAGGED';
      yield serializers.serialize(
        object.ACCOUNT_FLAGGED,
        specifiedType: const FullType(int),
      );
    }
    if (object.FETCH_GOOGLE_SHEET_NOT_SHARED != null) {
      yield r'FETCH_GOOGLE_SHEET_NOT_SHARED';
      yield serializers.serialize(
        object.FETCH_GOOGLE_SHEET_NOT_SHARED,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_FILE_NOT_ACCESSIBLE != null) {
      yield r'IMAGE_FILE_NOT_ACCESSIBLE';
      yield serializers.serialize(
        object.IMAGE_FILE_NOT_ACCESSIBLE,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_FILE_NOT_FOUND != null) {
      yield r'IMAGE_FILE_NOT_FOUND';
      yield serializers.serialize(
        object.IMAGE_FILE_NOT_FOUND,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_INVALID_FILE != null) {
      yield r'IMAGE_INVALID_FILE';
      yield serializers.serialize(
        object.IMAGE_INVALID_FILE,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_LEVEL_INTERNAL_ERROR != null) {
      yield r'IMAGE_LEVEL_INTERNAL_ERROR';
      yield serializers.serialize(
        object.IMAGE_LEVEL_INTERNAL_ERROR,
        specifiedType: const FullType(int),
      );
    }
    if (object.IMAGE_MALFORMED_URL != null) {
      yield r'IMAGE_MALFORMED_URL';
      yield serializers.serialize(
        object.IMAGE_MALFORMED_URL,
        specifiedType: const FullType(int),
      );
    }
    if (object.LARGE_PRODUCT_COUNT_DECREASE != null) {
      yield r'LARGE_PRODUCT_COUNT_DECREASE';
      yield serializers.serialize(
        object.LARGE_PRODUCT_COUNT_DECREASE,
        specifiedType: const FullType(int),
      );
    }
    if (object.LINE_LEVEL_INTERNAL_ERROR != null) {
      yield r'LINE_LEVEL_INTERNAL_ERROR';
      yield serializers.serialize(
        object.LINE_LEVEL_INTERNAL_ERROR,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedIngestionErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedIngestionErrorsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ACCOUNT_FLAGGED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ACCOUNT_FLAGGED = valueDes;
          break;
        case r'FETCH_GOOGLE_SHEET_NOT_SHARED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.FETCH_GOOGLE_SHEET_NOT_SHARED = valueDes;
          break;
        case r'IMAGE_FILE_NOT_ACCESSIBLE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_FILE_NOT_ACCESSIBLE = valueDes;
          break;
        case r'IMAGE_FILE_NOT_FOUND':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_FILE_NOT_FOUND = valueDes;
          break;
        case r'IMAGE_INVALID_FILE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_INVALID_FILE = valueDes;
          break;
        case r'IMAGE_LEVEL_INTERNAL_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_LEVEL_INTERNAL_ERROR = valueDes;
          break;
        case r'IMAGE_MALFORMED_URL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IMAGE_MALFORMED_URL = valueDes;
          break;
        case r'LARGE_PRODUCT_COUNT_DECREASE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.LARGE_PRODUCT_COUNT_DECREASE = valueDes;
          break;
        case r'LINE_LEVEL_INTERNAL_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.LINE_LEVEL_INTERNAL_ERROR = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedIngestionErrors deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedIngestionErrorsBuilder();
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

