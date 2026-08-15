//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_processing_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_ingestion.g.dart';

/// CatalogsFeedIngestion
///
/// Properties:
/// * [createdAt] 
/// * [feedId] 
/// * [id] 
/// * [status] 
@BuiltValue()
abstract class CatalogsFeedIngestion implements Built<CatalogsFeedIngestion, CatalogsFeedIngestionBuilder> {
  @BuiltValueField(wireName: r'created_at')
  DateTime get createdAt;

  @BuiltValueField(wireName: r'feed_id')
  String get feedId;

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'status')
  CatalogsFeedProcessingStatus get status;
  // enum statusEnum {  COMPLETED,  FAILED,  PROCESSING,  };

  CatalogsFeedIngestion._();

  factory CatalogsFeedIngestion([void updates(CatalogsFeedIngestionBuilder b)]) = _$CatalogsFeedIngestion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedIngestionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedIngestion> get serializer => _$CatalogsFeedIngestionSerializer();
}

class _$CatalogsFeedIngestionSerializer implements PrimitiveSerializer<CatalogsFeedIngestion> {
  @override
  final Iterable<Type> types = const [CatalogsFeedIngestion, _$CatalogsFeedIngestion];

  @override
  final String wireName = r'CatalogsFeedIngestion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedIngestion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(DateTime),
    );
    yield r'feed_id';
    yield serializers.serialize(
      object.feedId,
      specifiedType: const FullType(String),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(CatalogsFeedProcessingStatus),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedIngestion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedIngestionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.createdAt = valueDes;
          break;
        case r'feed_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.feedId = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedProcessingStatus),
          ) as CatalogsFeedProcessingStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedIngestion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedIngestionBuilder();
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

