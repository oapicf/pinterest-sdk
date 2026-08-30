//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_ingestion_info.g.dart';

/// CatalogsFeedIngestionInfo
///
/// Properties:
/// * [IN_STOCK] - The number of ingested products that are in stock.
/// * [OUT_OF_STOCK] - The number of ingested products that are in out of stock.
/// * [PREORDER] - The number of ingested products that are in preorder.
@BuiltValue()
abstract class CatalogsFeedIngestionInfo implements Built<CatalogsFeedIngestionInfo, CatalogsFeedIngestionInfoBuilder> {
  /// The number of ingested products that are in stock.
  @BuiltValueField(wireName: r'IN_STOCK')
  int? get IN_STOCK;

  /// The number of ingested products that are in out of stock.
  @BuiltValueField(wireName: r'OUT_OF_STOCK')
  int? get OUT_OF_STOCK;

  /// The number of ingested products that are in preorder.
  @BuiltValueField(wireName: r'PREORDER')
  int? get PREORDER;

  CatalogsFeedIngestionInfo._();

  factory CatalogsFeedIngestionInfo([void updates(CatalogsFeedIngestionInfoBuilder b)]) = _$CatalogsFeedIngestionInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedIngestionInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedIngestionInfo> get serializer => _$CatalogsFeedIngestionInfoSerializer();
}

class _$CatalogsFeedIngestionInfoSerializer implements PrimitiveSerializer<CatalogsFeedIngestionInfo> {
  @override
  final Iterable<Type> types = const [CatalogsFeedIngestionInfo, _$CatalogsFeedIngestionInfo];

  @override
  final String wireName = r'CatalogsFeedIngestionInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedIngestionInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.IN_STOCK != null) {
      yield r'IN_STOCK';
      yield serializers.serialize(
        object.IN_STOCK,
        specifiedType: const FullType(int),
      );
    }
    if (object.OUT_OF_STOCK != null) {
      yield r'OUT_OF_STOCK';
      yield serializers.serialize(
        object.OUT_OF_STOCK,
        specifiedType: const FullType(int),
      );
    }
    if (object.PREORDER != null) {
      yield r'PREORDER';
      yield serializers.serialize(
        object.PREORDER,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedIngestionInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedIngestionInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'IN_STOCK':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.IN_STOCK = valueDes;
          break;
        case r'OUT_OF_STOCK':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.OUT_OF_STOCK = valueDes;
          break;
        case r'PREORDER':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PREORDER = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedIngestionInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedIngestionInfoBuilder();
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

