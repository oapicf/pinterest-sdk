//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_ingestion_errors.dart';
import 'package:openapi/src/model/catalogs_feed_ingestion_info.dart';
import 'package:openapi/src/model/catalogs_feed_ingestion_warnings.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_ingestion_details.g.dart';

/// CatalogsFeedIngestionDetails
///
/// Properties:
/// * [errors] 
/// * [info] 
/// * [warnings] 
@BuiltValue()
abstract class CatalogsFeedIngestionDetails implements Built<CatalogsFeedIngestionDetails, CatalogsFeedIngestionDetailsBuilder> {
  @BuiltValueField(wireName: r'errors')
  CatalogsFeedIngestionErrors get errors;

  @BuiltValueField(wireName: r'info')
  CatalogsFeedIngestionInfo get info;

  @BuiltValueField(wireName: r'warnings')
  CatalogsFeedIngestionWarnings get warnings;

  CatalogsFeedIngestionDetails._();

  factory CatalogsFeedIngestionDetails([void updates(CatalogsFeedIngestionDetailsBuilder b)]) = _$CatalogsFeedIngestionDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedIngestionDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedIngestionDetails> get serializer => _$CatalogsFeedIngestionDetailsSerializer();
}

class _$CatalogsFeedIngestionDetailsSerializer implements PrimitiveSerializer<CatalogsFeedIngestionDetails> {
  @override
  final Iterable<Type> types = const [CatalogsFeedIngestionDetails, _$CatalogsFeedIngestionDetails];

  @override
  final String wireName = r'CatalogsFeedIngestionDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedIngestionDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(CatalogsFeedIngestionErrors),
    );
    yield r'info';
    yield serializers.serialize(
      object.info,
      specifiedType: const FullType(CatalogsFeedIngestionInfo),
    );
    yield r'warnings';
    yield serializers.serialize(
      object.warnings,
      specifiedType: const FullType(CatalogsFeedIngestionWarnings),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedIngestionDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedIngestionDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedIngestionErrors),
          ) as CatalogsFeedIngestionErrors;
          result.errors.replace(valueDes);
          break;
        case r'info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedIngestionInfo),
          ) as CatalogsFeedIngestionInfo;
          result.info.replace(valueDes);
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedIngestionWarnings),
          ) as CatalogsFeedIngestionWarnings;
          result.warnings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedIngestionDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedIngestionDetailsBuilder();
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

